package edu.aku.hassannaqvi.wbcct_baseline.ui;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.user;
import static edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper.DATABASE_COPY;
import static edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper.DATABASE_NAME;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import net.sqlcipher.database.SQLiteException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import edu.aku.hassannaqvi.wbcct_baseline.MainActivity;
import edu.aku.hassannaqvi.wbcct_baseline.R;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.AppInfo;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivityLoginBinding;
import edu.aku.hassannaqvi.wbcct_baseline.models.EntryLog;
import edu.aku.hassannaqvi.wbcct_baseline.models.Users;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    protected static LocationManager locationManager;

    // UI references.
    private final int pos = 0;
    ActivityLoginBinding bi;
    Spinner spinnerDistrict;
    String DirectoryName;
    DatabaseHelper db;
    ArrayAdapter<String> provinceAdapter;
    int attemptCounter;
    String username = "";
    String password = "";
    private int countryCode;
    private ArrayList<String> countryNameList;
    private ArrayList<String> countryCodeList;
    //CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        attemptCounter = 0;
        initializingCountry();
        Dexter.withContext(this)
                .withPermissions(
                        Manifest.permission.ACCESS_NETWORK_STATE,
                        Manifest.permission.WAKE_LOCK,
                        Manifest.permission.INTERNET,
                        Manifest.permission.READ_PHONE_STATE,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_PHONE_STATE,
                        Manifest.permission.CAMERA
                ).withListener(new MultiplePermissionsListener() {
            @Override
            public void onPermissionsChecked(MultiplePermissionsReport report) {
                if (report.areAllPermissionsGranted()) {
                    MainApp.permissionCheck = true;
                }
            }

            @Override
            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                token.continuePermissionRequest();
            }
        }).check();

        bi = DataBindingUtil.setContentView(this, R.layout.activity_login);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.getDbHelper();
        MainApp.appInfo = new AppInfo(this);
        user = new Users();

        bi.txtinstalldate.setText(MainApp.appInfo.getAppInfo());
        dbBackup();
        //  MainApp.test(this, bi);

/*
        MainApp.recipient = new Recipient();

        bi.setRcpt(MainApp.recipient);
        String num1 = Base64.encodeToString((new StringBuilder("1234567890123").reverse()).toString().getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);
        String num2 = new StringBuilder(Base64.encodeToString("4567890123456XX".getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP)).reverse().toString();
        String num3 = Base64.encodeToString("7890123456789".getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);
        String num4 = Base64.encodeToString("00923212304303".getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);
        String num5 = Base64.encodeToString("00923212435677".getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);

        Log.d(TAG, "onCreate: "+ num1);
        Log.d(TAG, "onCreate: "+ num2);
        Log.d(TAG, "onCreate: "+ num3);
        Log.d(TAG, "onCreate: "+ num4);
        Log.d(TAG, "onCreate: "+ num5);
        Log.d(TAG, "onCreate: R "+ new StringBuilder(new String(Base64.decode(num1, Base64.NO_WRAP))).reverse());
        Log.d(TAG, "onCreate: "+ new String(Base64.decode(num1, Base64.NO_WRAP)));
        String test = new String(Base64.decode(new StringBuilder(num2).reverse().toString(), Base64.NO_WRAP));
        Log.d(TAG, "onCreate: R "+ test.substring(0,test.length()-2));
        Log.d(TAG, "onCreate: "+ new String(Base64.decode(num2, Base64.NO_WRAP)));
        Log.d(TAG, "onCreate: "+ new String(Base64.decode(num3, Base64.NO_WRAP)));
        Log.d(TAG, "onCreate: "+ new String(Base64.decode(num4, Base64.NO_WRAP)));
        Log.d(TAG, "onCreate: "+ new String(Base64.decode(num5, Base64.NO_WRAP)));*/


    }


    @Override
    protected void onResume() {
        super.onResume();
    }


    public void dbBackup() {

        if (MainApp.sharedPref.getBoolean("flag", false)) {
            String dt = MainApp.sharedPref.getString("dt", new SimpleDateFormat("dd-MM-yy").format(new Date()));
            if (!dt.equals(new SimpleDateFormat("dd-MM-yy").format(new Date()))) {
                MainApp.editor.putString("dt", new SimpleDateFormat("dd-MM-yy").format(new Date()));
                MainApp.editor.apply();
            }

            // File folder = new File(Environment.getExternalStorageDirectory() + File.separator + PROJECT_NAME);
            File folder = new File(this.getExternalFilesDir("Backups"), File.separator);
            boolean success = true;
            if (!folder.exists()) {
                success = folder.mkdirs();
            }
            if (success) {

                DirectoryName = folder.getPath() + File.separator + MainApp.sharedPref.getString("dt", "");
                folder = new File(DirectoryName);
                if (!folder.exists()) {
                    success = folder.mkdirs();
                }
                if (success) {

                    try {
                        File dbFile = new File(this.getDatabasePath(DATABASE_NAME).getPath());
                        FileInputStream fis = new FileInputStream(dbFile);
                        String outFileName = DirectoryName + File.separator + DATABASE_COPY;
                        // Open the empty db as the output stream
                        OutputStream output = new FileOutputStream(outFileName);

                        // Transfer bytes from the inputfile to the outputfile
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = fis.read(buffer)) > 0) {
                            output.write(buffer, 0, length);
                        }
                        // Close the streams
                        output.flush();
                        output.close();
                        fis.close();
                    } catch (IOException e) {
                        Log.e("dbBackup:", Objects.requireNonNull(e.getMessage()));
                    }

                }

            } else {
                Toast.makeText(this, getResources().getString(R.string.folder_not_created), Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void onShowPasswordClick(View view) {
        //TODO implement
        if (bi.password.getTransformationMethod() == null) {
            bi.password.setTransformationMethod(new PasswordTransformationMethod());
            bi.password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_close, 0, 0, 0);
        } else {
            bi.password.setTransformationMethod(null);
            bi.password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_open, 0, 0, 0);
        }
    }

    public void onSyncDataClick(View view) {
        //callUsersWorker();

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            startActivity(new Intent(this, edu.aku.hassannaqvi.wbcct_baseline.ui.SyncActivity.class).putExtra("login", true));
        } else {
            Toast.makeText(this, getResources().getString(R.string.network_conn_error), Toast.LENGTH_SHORT).show();
        }
    }

    public void attemptLogin(View view) {

        if (username.equals(bi.username.getText().toString())) {
            attemptCounter++;
        } else {
            attemptCounter = 1;
        }
        username = bi.username.getText().toString();


        // Reset errors.
        bi.username.setError(null);
        bi.password.setError(null);
        long timeNowInMillis = System.currentTimeMillis();

        Toast.makeText(this, String.valueOf(attemptCounter), Toast.LENGTH_SHORT).show();

        if (MainApp.sharedPref.contains(bi.username.getText().toString())) {
            long startTimeout = MainApp.sharedPref.getLong(bi.username.getText().toString(), timeNowInMillis);
            long timeElapsed = TimeUnit.MILLISECONDS.toMinutes(timeNowInMillis - startTimeout);
            Log.d(TAG, "attemptLogin(timeleft): " + timeElapsed);
            if (timeElapsed > 15) {
                MainApp.editor.remove(bi.username.getText().toString()).commit();
            } else {
                bi.username.setError("This user has been blocked.");
                Toast.makeText(this, "This user has been blocked. Please try again after some time.", Toast.LENGTH_LONG).show();
                return;
            }

        }
        if (attemptCounter > 5) {

            if (!MainApp.sharedPref.contains(bi.username.getText().toString())) {
                MainApp.editor.putLong(bi.username.getText().toString(), timeNowInMillis).commit();
                Toast.makeText(this, "This user has been blocked.", Toast.LENGTH_LONG).show();
                return;
            }

        } else {

            // Store values at the time of the login attempt.
            String username = bi.username.getText().toString();
            String password = bi.password.getText().toString();

            boolean cancel = false;
            View focusView = null;

            // Check for a valid password, if the user entered one.
            if (password.length() < 8) {
                bi.password.setError(getResources().getString(R.string.invalid_password));
                focusView = bi.password;
                return;
            }

            // Check for a valid username address.
            if (TextUtils.isEmpty(username)) {
                bi.username.setError(getResources().getString(R.string.username_required));
                focusView = bi.username;
                return;
            }

            //if(!Validator.emptySpinner(this, bi.countrySwitch)) return;
            /*if (bi.countrySwitch.getSelectedItemPosition() == 0) {
                bi.as1q01.setError(getString(R.string.as1q01));
                return;
            }*/
            try {

                if (db.doLogin(username, password)) {
                    MainApp.user.setUserName(username);
                    //   MainApp.admin = username.contains("@") || username.contains("test1234");
                    MainApp.superuser = MainApp.user.getDesignation().equals("Supervisor");
                    Intent iLogin = null;
                    if (MainApp.admin) {
                        recordEntry("Successful Login (Admin)");
                        iLogin = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(iLogin);
                    } else if (MainApp.user.getEnabled().equals("1")) {
                        if (!MainApp.user.getNewUser().equals("1")) { // TODO: getEnabled().equals("1")
                            recordEntry("Successful Login");
                            iLogin = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(iLogin);
                        } else if (MainApp.user.getNewUser().equals("1")) {
                            recordEntry("First Login");
                            iLogin = new Intent(LoginActivity.this, ChangePasswordActivity.class);
                            startActivity(iLogin);
                        }
                    } else {
                        recordEntry("Inactive User (Disabled)");
                        Toast.makeText(this, "This user is inactive.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    recordEntry("Failed Login: Incorrect username or password");
                    bi.password.setError(getResources().getString(R.string.incorrect_username_or_password));
                    bi.password.requestFocus();
                    //  Toast.makeText(LoginActivity.this, username + " " + password, Toast.LENGTH_SHORT).show();
                }
            } catch (InvalidKeySpecException e) {
                e.printStackTrace();
                Toast.makeText(this, "InvalidKeySpecException(UserAuth):" + e.getMessage(), Toast.LENGTH_SHORT).show();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                Toast.makeText(this, "NoSuchAlgorithmException(UserAuth):" + e.getMessage(), Toast.LENGTH_SHORT).show();

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                Toast.makeText(this, "IllegalArgumentException(UserAuth):" + e.getMessage(), Toast.LENGTH_SHORT).show();
            }

        }
    }

    private void recordEntry(String entryType) {

        EntryLog entryLog = new EntryLog();
        entryLog.setProjectName(PROJECT_NAME);
        entryLog.setUserName(username);
        entryLog.setEntryDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        entryLog.setAppver(MainApp.appInfo.getAppVersion());
        entryLog.setEntryType(entryType);
        entryLog.setDeviceId(MainApp.deviceid);
        Long rowId = null;
        try {
            rowId = db.addEntryLog(entryLog);
        } catch (SQLiteException e) {
            Toast.makeText(this, "SQLiteException(EntryLog)" + entryLog, Toast.LENGTH_SHORT).show();
        }
        if (rowId != null && rowId != -1) {
            entryLog.setId(String.valueOf(rowId));
            entryLog.setUid(entryLog.getDeviceId() + entryLog.getId());
            db.updatesEntryLogColumn(TableContracts.EntryLogTable.COLUMN_UID, entryLog.getUid(), entryLog.getId());
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();

        }

    }


    public String computeHash(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();
        byte[] byteData = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        Log.d("TAG", "computeHash: " + sb);
        return sb.toString();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }


    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }


    /*
     * Toggle Language
     * */

    private void changeLanguage(int countryCode) {
        String lang;
        String country;

        switch (countryCode) {
            case 1:
                lang = "ur";
                country = "PK";
                MainApp.editor
                        .putString("lang", "1")
                        .apply();
                break;
            case 2:
                lang = "sd";
                country = "PK";
                MainApp.editor
                        .putString("lang", "2")
                        .apply();
                break;
            default:
                lang = "en";
                country = "US";
                MainApp.editor
                        .putString("lang", "0")
                        .apply();
        }

        Locale locale = new Locale(lang, country);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.setLocale(locale);
        config.setLayoutDirection(new Locale(lang, country));
        this.getResources().updateConfiguration(config, this.getResources().getDisplayMetrics());

    }


    /*
     * Setting country code in Shared Preference
     * */
    private void initializingCountry() {
        countryCode = Integer.parseInt(MainApp.sharedPref.getString("lang", "0"));
        if (countryCode == 0) {
            MainApp.editor.putString("lang", "0").apply();
        }

        changeLanguage(Integer.parseInt(MainApp.sharedPref.getString("lang", "0")));
    }

/*    public void TakePhoto(View view) {

        Intent intent = new Intent(this, TakePhoto.class);
        intent.putExtra("picID", "picid");
        intent.putExtra("id", "id");
        if (PhotoSerial == 0) {
            intent.putExtra("picView", "Brand/logo");} else {
            intent.putExtra("picView", "Ingredients");
        }
        takePhotoLauncher.launch(intent);

    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.language_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.NO:
                return true;

            case R.id.PK:
                MainApp.selectedLanguage = 1;
                MainApp.langRTL = true;
                break;

            /*case R.id.SD:
                MainApp.selectedLanguage = 2;
                MainApp.langRTL = true;
                break;*/


            default:
                MainApp.selectedLanguage = 0;
                MainApp.langRTL = false;

        }
        changeLanguage(MainApp.selectedLanguage);
        startActivity(new Intent(LoginActivity.this, LoginActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        return true;
    }

    public void attemptUnlock() {
        bi.mainFrame.setClickable(true);
        bi.frameLayout.setVisibility(View.GONE);
        MainApp.timer.start();
    }


}

