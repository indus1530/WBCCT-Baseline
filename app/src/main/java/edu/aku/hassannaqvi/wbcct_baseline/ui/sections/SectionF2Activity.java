package edu.aku.hassannaqvi.wbcct_baseline.ui.sections;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.anthc;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.anthroWRAList;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.anthroWRAListPos;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.anthw;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.familyMember;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.wbcct_baseline.R;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionF2Binding;
import edu.aku.hassannaqvi.wbcct_baseline.models.AnthroWRA;
import edu.aku.hassannaqvi.wbcct_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;

public class SectionF2Activity extends AppCompatActivity {

    private static final String TAG = "SectionF2Activity";
    ActivitySectionF2Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> wraNames, wraSno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f2);
        anthw = new AnthroWRA();
        bi.setAnthw(anthw);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        setupSkips();
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");

        populateSpinner();

    }


    private void populateSpinner() {

        // Populate Provinces
        //Collection<Villages> provinces = db.getProvinceByCountry(String.valueOf(MainApp.selectedCountry));
        wraNames = new ArrayList<>();
        wraSno = new ArrayList<>();
        wraNames.add("...");
        wraSno.add("...");

        for (int p : anthroWRAList) {

            wraNames.add(MainApp.familyList.get(p - 1).getA202());
            wraSno.add(MainApp.familyList.get(p - 1).getA201());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionF2Activity.this, R.layout.custom_spinner, wraNames);
        bi.f201name.setAdapter(adapter);
        bi.f201name.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.f201.setText(null);
                anthroWRAListPos = -1;
                MainApp.selectedChild = "";
                anthw = new AnthroWRA();
                familyMember = new FamilyMembers();

                if (position == 0) return;


                anthroWRAListPos = position;
                MainApp.selectedMWRA = wraSno.get(anthroWRAListPos);
                familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA) - 1);
                try {
                    anthw = db.getAnthroWRAByFmUID(familyMember.getUid());

                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(SectionF2Activity.this, "JSONException (AnthroWRA): " + e.getMessage(), Toast.LENGTH_LONG).show();
                }
                anthw.setF201name(wraNames.get(anthroWRAListPos));
                anthw.setF201(MainApp.selectedMWRA);
                //anthw.setF202(familyMember.getA206y());
                bi.setAnthw(anthw);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    private void setupSkips() {
        getDiff(new EditTextPicker[]{bi.f20301, bi.f20302}, bi.llf20303, bi.llf203m);
        getDiff(new EditTextPicker[]{bi.f20401, bi.f20402}, bi.llf20403, bi.llf204m);
    }


    private void getDiff(EditTextPicker[] edxArray, LinearLayout l1, LinearLayout l2) {
        for (EditTextPicker edx : edxArray) {
            edx.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (edxArray[0].getText().toString().isEmpty() || edxArray[1].getText().toString().isEmpty())
                        return;
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.GONE);
                    if ((Float.parseFloat(edxArray[0].getText().toString()) - Float.parseFloat(edxArray[1].getText().toString()) >= 1)
                            || (Float.parseFloat(edxArray[0].getText().toString()) - Float.parseFloat(edxArray[1].getText().toString()) <= -1)) {
                        l1.setVisibility(View.VISIBLE);
                        l2.setVisibility(View.VISIBLE);
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                }
            });

        }
    }

    private boolean insertNewRecord() {

        if (!anthw.getUid().equals("") || MainApp.superuser) return true;

        anthw.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addWAnthro(anthw);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        anthw.setId(String.valueOf(rowId));
        if (rowId > 0) {
            anthw.setUid(anthw.getDeviceId() + anthw.getId());
            db.updatesWAnthroColumn(TableContracts.AnthroWRATable.COLUMN_UID, anthw.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesWAnthroColumn(TableContracts.AnthroWRATable.COLUMN_SF2, anthw.sF2toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        bi.llbtn.setVisibility(View.GONE);
        new Handler().postDelayed(() -> bi.llbtn.setVisibility(View.VISIBLE), 5000);
        if (!formValidation()) return;
        if (anthc.getUid().isEmpty()) if (!insertNewRecord()) return;
        if (updateDB()) {
            Intent i = new Intent();
            anthroWRAList.remove(anthroWRAListPos - 1);
            if (anthroWRAList.size() > 0) {
                i = new Intent(this, SectionF2Activity.class);
            } else {
                try {
                    MainApp.wedm = db.getWEDMByUUid();
                    i = new Intent(this, SectionG1Activity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(this, "JSONException(WEDM): " + e.getMessage(), Toast.LENGTH_SHORT).show();

                }
            }
            finish();
            startActivity(i);
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "SORRY! Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        MainApp.timer.cancel();
        MainApp.timer.start();
        return super.dispatchTouchEvent(event);
    }


}