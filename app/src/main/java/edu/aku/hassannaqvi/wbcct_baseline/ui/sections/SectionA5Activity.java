package edu.aku.hassannaqvi.wbcct_baseline.ui.sections;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.form;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedMWRA;
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
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionA5Binding;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;

public class SectionA5Activity extends AppCompatActivity {

    private static final String TAG = "SectionA5Activity";
    ActivitySectionA5Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a5);
        bi.setForm(form);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SA5, form.sA5toString());
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
        if (updateDB()) {
            Intent i = new Intent();
            if (!MainApp.selectedRecipient.isEmpty()) {
                i = new Intent(this, SectionB1Activity.class);
            } else {

                // selected familymember (Child)
                try {
                    // populate mother/caregiver data if already exisits
                    MainApp.mwra = db.getMWRAByFMUID(MainApp.familyMember.getUid());
                    if (!selectedMWRA.equals("97")) {
                        MainApp.familyMember = db.getSelectedMemberBYUID(MainApp.form.getUid(), "2");

                        MainApp.mwra = db.getMWRAByFMUID(MainApp.familyMember.getUid());
                        i = new Intent(this, SectionC1Activity.class);
                    } else {
                        MainApp.familyMember = db.getSelectedMemberBYUID(MainApp.form.getUid(), "1");

                        MainApp.child = db.getChildByFMUID(MainApp.familyMember.getUid());
                        i = new Intent(this, SectionD1Activity.class);
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(this, "JSONException(familymember/mwra): " + e.getMessage(), Toast.LENGTH_SHORT).show();

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