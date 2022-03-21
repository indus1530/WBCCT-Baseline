package edu.aku.hassannaqvi.wbcct_baseline.ui.sections;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.child;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.familyMember;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.wbcct_baseline.R;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionD1Binding;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;

public class SectionD1Activity extends AppCompatActivity {

    private static final String TAG = "SectionD1Activity";
    ActivitySectionD1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d1);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);


        try {
            MainApp.child = db.getChildByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Child): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        if (!MainApp.selectedMWRA.equals("97")) {

            child.setD103(MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA)).getA201());
            child.setD104("1");
        } else {

            child.setD103(MainApp.familyList.get(Integer.parseInt(MainApp.selectedCaregiver)).getA201());
            child.setD104("2");
        }


        child.setD101(familyMember.getA202());
        child.setD102(familyMember.getA201());

        bi.setChild(child);
        setSupportActionBar(bi.toolbar);


/*        childOfSelectedMWRAList = new ArrayList<>();
        for (FamilyMembers child : MainApp.familyList) {
            Log.d(TAG, "onCreate: childmsno " + child.getA21301() + " fmsno: " + (Integer.parseInt(MainApp.selectedMWRA) + 1));

            int motherSno = Integer.parseInt(child.getA21301());
            int selectedMwraSno = Integer.parseInt(MainApp.selectedMWRA) + 1;

            // All children for EDC, Available or Not
            // Removed Condition: && child.getHl10().equals("1")
            if (motherSno == selectedMwraSno && Integer.parseInt(child.getA206y()) < 5) {
                childOfSelectedMWRAList.add(Integer.valueOf(child.getA201()));
            }
        }*/

        //child.setCs1q02(String.valueOf(childOfSelectedMWRAList.size()));

        // Mother's Name as Respondent
        /*bi.cs1q0101.setText(MainApp.mwra.getBs1resp());
        bi.cs1q0102.setText(MainApp.mwra.getBs1respline());*/
        //   child = new Child();
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
    }


    private boolean insertNewRecord() {
        if (!child.getUid().equals("") || MainApp.superuser) return true;
        child.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addChild(child);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        child.setId(String.valueOf(rowId));
        if (rowId > 0) {
            child.setUid(child.getDeviceId() + child.getId());
            db.updatesChildColumn(TableContracts.ChildTable.COLUMN_UID, child.getUid());
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
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SD1, child.sD1toString());
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
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            if (MainApp.familyMember.getAgeMon() <= 23)
                startActivity(new Intent(this, SectionD2Activity.class));
            else startActivity(new Intent(this, SectionD3Activity.class));
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