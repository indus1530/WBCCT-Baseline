package edu.aku.hassannaqvi.wbcct_baseline.ui.sections;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.sharedPref;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.wedm;

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
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.WEDMTable;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionG1Binding;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;


public class SectionG1Activity extends AppCompatActivity {

    private static final String TAG = "SectionG1Activity";
    ActivitySectionG1Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_g1);
        bi.setForm(wedm);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
    }



    private boolean insertNewRecord() {
        if (!wedm.getUid().equals("") || MainApp.superuser) return true;
        wedm.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addWEDM(wedm);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        wedm.setId(String.valueOf(rowId));
        if (rowId > 0) {
            wedm.setUid(wedm.getDeviceId() + wedm.getId());
            db.updatesWEDMColumn(WEDMTable.COLUMN_UID, wedm.getUid());
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
            updcount = db.updatesWEDMColumn(WEDMTable.COLUMN_SG1, wedm.sG1toString());
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
            startActivity(new Intent(this, SectionG2Activity.class));
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