package edu.aku.hassannaqvi.wbcct_baseline.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import com.scottyab.rootbeer.RootBeer;

import net.sqlcipher.database.SQLiteDatabase;

import org.json.JSONArray;

import java.io.File;
import java.util.List;

import edu.aku.hassannaqvi.wbcct_baseline.BuildConfig;
import edu.aku.hassannaqvi.wbcct_baseline.models.AnthroChild;
import edu.aku.hassannaqvi.wbcct_baseline.models.AnthroWRA;
import edu.aku.hassannaqvi.wbcct_baseline.models.Child;
import edu.aku.hassannaqvi.wbcct_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.wbcct_baseline.models.Form;
import edu.aku.hassannaqvi.wbcct_baseline.models.MWRA;
import edu.aku.hassannaqvi.wbcct_baseline.models.Pregnancy;
import edu.aku.hassannaqvi.wbcct_baseline.models.Recipient;
import edu.aku.hassannaqvi.wbcct_baseline.models.Users;
import edu.aku.hassannaqvi.wbcct_baseline.models.WEDM;
import edu.aku.hassannaqvi.wbcct_baseline.ui.LockActivity;


public class MainApp extends Application {

    public static final String PROJECT_NAME = "wbcct_baseline";
    public static final String DIST_ID = null;
    public static final String SYNC_LOGIN = "sync_login";
    public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    // public static final String _IP = "http://f49461:8080/prosystem";// .TEST server
    //public static final String _IP = "http://43.245.131.159:8080";// .TEST server
    //public static final String _IP = "http://cls-pae-fp51764";// .TEST server
    public static final String _HOST_URL = MainApp._IP + "/enp_wb/api/";// .TEST server;
    public static final String _SERVER_URL = "syncenc.php";
    public static final String _SERVER_GET_URL = "getDataEnc.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _UPDATE_URL = MainApp._IP + "/enp_wb/app/hhsurvey";
    public static final String _EMPTY_ = "";
    public static final String _USER_URL = "resetpassword.php";
    private static final String TAG = "MainApp";
    public static String IBAHC = "";

    //COUNTRIES
    public static int PAKISTAN = 1;
    public static int URDU = 3;

    public static File sdDir;
    public static String[] downloadData;
    public static Form form;
    public static AnthroChild anthc;
    public static AnthroWRA anthw;
    public static MWRA mwra;
    public static WEDM wedm;
    public static Pregnancy pregnancy;
    public static Child child;

    public static FamilyMembers familyMember;

    public static Recipient recipient;
    public static int preg_count = 0;
    public static int child_count = 0;

    //public static Samples samples;

    public static String DeviceURL = "devices.php";
    public static AppInfo appInfo;
    public static Users user;
    public static Boolean admin = false;
    public static List<JSONArray> uploadData;
    public static SharedPreferences.Editor editor;
    public static SharedPreferences sharedPref;
    public static String deviceid;
    public static int versionCode = BuildConfig.VERSION_CODE;
    public static String versionName = BuildConfig.VERSION_NAME;
    public static int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 2;
    public static long TWO_MINUTES = 1000 * 60 * 2;
    public static boolean permissionCheck = false;
    public static int entryType = 0;

    public static List<String> subjectNames;
    public static List<FamilyMembers> familyList;
    public static List<Integer> mwraList;
    public static List<Integer> recipientsList;
    public static List<Integer> pregFirstList;
    public static List<Integer> caregiverList;
    public static List<Integer> anthroChildList;
    public static List<Integer> anthroWRAList;
    public static List<Integer> childOfSelectedMWRAList;
    public static List<FamilyMembers> fatherList;
    public static List<FamilyMembers> motherList;
    //public static FamilyMembers familyMember;
    public static int memberCount = 0;
    public static int bCount = 0;
    public static String selectedMWRA;
    public static String selectedCaregiver;
    public static String selectedChild;
    public static String selectedRecipient;
    public static String selectedRecipientName;

    public static String selectedPreg1st;
    public static int memberCountComplete;
    public static boolean memberComplete;
    public static int ecdCount;
    //public static int mwraCount;
    /*public static RandomHH currentHousehold;
    public static List<FoodConsumption> foodConsumption;*/
    public static int foodIndex;
    public static boolean hhheadSelected = false;
    public static boolean superuser;
    public static int selectedCountry = 0;
    public static int selectedLanguage = 0;
    public static String provinceCode = "";
    public static String provinceName = "";
    public static String districtCode = "";
    public static String districtName = "";
    public static String tehsilCode = "";
    public static String tehsilName = "";
    public static String ucCode = "";
    public static String ucName = "";
    public static String villageCode = "";
    public static String villageName = "";
    public static String selectedHHID = "";
    public static boolean langRTL = false;
    public static int ageOfIndexChild;
    public static int totalPreg = 0;
    public static String selectedChildName = "";
    public static String selectedPW;
    public static int pregFirstListPos;
    public static int anthroChildListPos;
    public static int anthroWRAListPos;
    public static CountDownTimer timer;
    static ToneGenerator toneGen1;


    public static void hideSystemUI(View decorView) {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public static String getDeviceId(Context context) {
        String deviceId;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            deviceId = Settings.Secure.getString(
                    context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
        } else {
           /* final TelephonyManager mTelephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            if (mTelephony.getDeviceId() != null) {
                deviceId = mTelephony.getDeviceId();
            } else {
                deviceId = Settings.Secure.getString(
                        context.getContentResolver(),
                        Settings.Secure.ANDROID_ID);
            }*/
        }
        return "deviceId";
    }

    public static String kishGrid(int Hh_Sno, int totalMwra) {

        // GENERATE RANDOM
        // int household  = 1 + (int)(Math.random() * ((10 - 1) + 1));
        // int eligibles = 1 + (int)(Math.random() * ((8 - 1) + 1));

        int household = Math.min(Hh_Sno, 9);
        int eligibles = Math.min(totalMwra, 8);

        int[][] grid = {
                // Eligible People ===>>
                //1- 2- 3- 4- 5- 6- 7- 8
                {1, 2, 1, 2, 5, 4, 3, 2},  // 0 - Household (10th)
                {1, 1, 1, 1, 1, 1, 1, 1},  // 1 - Household (1st)
                {1, 2, 2, 2, 2, 2, 2, 2},  //         ||
                {1, 1, 3, 3, 3, 3, 3, 3},  //         ||
                {1, 2, 1, 4, 4, 4, 4, 4},  //         ||
                {1, 1, 2, 1, 5, 5, 5, 5},  //        \\//
                {1, 2, 3, 2, 1, 6, 6, 6},  //         \/
                {1, 1, 1, 3, 2, 1, 7, 7},  //
                {1, 2, 2, 4, 3, 2, 1, 8},  // 8 - Household (8th)
                {1, 1, 3, 1, 4, 3, 2, 1},  // 9 - Household (9th)
        };


        // System.out.println(household+"-"+eligibles);
        // System.out.println(grid[household-1][eligibles-1]);

        /**
         *  0 household mean 0 index
         *  1 eligibles means eligibles-1 index
         *
         *  return Index of MWRAList (SNO-1)
         */
        return String.valueOf((grid[household][eligibles - 1]) - 1);
    }

    public static void lockScreen(Context c) {

        if (timer != null) {
            timer.cancel();
        }

        //   Context mContext = c;
        Activity activity = (Activity) c;


        timer = new CountDownTimer(15 * 60 * 1000, 1000) {
            //timer = new CountDownTimer(30 * 1000, 1000) {

            public void onTick(long millisUntilFinished) {
                //Some code
                //bi.timeLeft.setText((millisUntilFinished / 1000) + " secs left");
                if ((millisUntilFinished / 1000) < 14) {
                    toneGen1.startTone(ToneGenerator.TONE_CDMA_PIP, 150);
                }

            }

            public void onFinish() {
                //Logout
                //
                //   finish();
                // lockScreen();
                Intent intent = new Intent();
                intent.setClass(c, LockActivity.class);
                c.startActivity(intent);
                timer.cancel();
                //  startActivity(new Intent(((Activity) c).getLocalClassName(), LockActivity.class));
            }
        };
        timer.start();

    }

    @Override
    public void onCreate() {
        super.onCreate();
        RootBeer rootBeer = new RootBeer(this);
/*        if (rootBeer.isRooted()) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }*/
        //Initiate DateTime
        //Initializ App info
        appInfo = new AppInfo(this);
        sharedPref = getSharedPreferences(PROJECT_NAME, MODE_PRIVATE);
        editor = sharedPref.edit();
        deviceid = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);

        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            int TRATS = bundle.getInt("YEK_TRATS");
            IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
    }

}
