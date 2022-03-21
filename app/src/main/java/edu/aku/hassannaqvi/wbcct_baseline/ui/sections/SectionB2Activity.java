package edu.aku.hassannaqvi.wbcct_baseline.ui.sections;


import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.recipient;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedMWRA;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionB2Binding;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;


public class SectionB2Activity extends AppCompatActivity {

    private static final String TAG = "SectionB2Activity";
    ActivitySectionB2Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b2);
        bi.setRcpt(recipient);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");

    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            updcount = db.updatesRecipientColumn(TableContracts.RecipientTable.COLUMN_SB2, recipient.sB2toString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        bi.llbtn.setVisibility(View.GONE);
        new Handler().postDelayed(() -> bi.llbtn.setVisibility(View.VISIBLE), 5000);
        if (!formValidation()) return;
        if (updateDB()) {
            finish();


            try {
                // populate mother/caregiver data if already exisits
                MainApp.mwra = db.getMWRAByFMUID(MainApp.familyMember.getUid());
                if (!selectedMWRA.equals("97")) {
                    MainApp.familyMember = db.getSelectedMemberBYUID(MainApp.form.getUid(), "2");

                    MainApp.mwra = db.getMWRAByFMUID(MainApp.familyMember.getUid());
                    startActivity(new Intent(this, SectionC1Activity.class));
                } else {
                    MainApp.familyMember = db.getSelectedMemberBYUID(MainApp.form.getUid(), "1");

                    MainApp.child = db.getChildByFMUID(MainApp.familyMember.getUid());
                    startActivity(new Intent(this, SectionD1Activity.class));
                }

            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(this, "JSONException(familymember/mwra): " + e.getMessage(), Toast.LENGTH_SHORT).show();

            }

        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!recipient.getB202w().isEmpty() && !recipient.getB202m().isEmpty() && !recipient.getB202y().isEmpty()) {
            if (Integer.parseInt(recipient.getB202w()) + Integer.parseInt(recipient.getB202m()) + Integer.parseInt(recipient.getB202y()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b202w, "All Values Can't be zero");
        }
        if (!recipient.getB204w().isEmpty() && !recipient.getB204m().isEmpty()) {
            if (Integer.parseInt(recipient.getB204w()) + Integer.parseInt(recipient.getB204m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b204w, "All Values Can't be zero");
        }
        if (!recipient.getB21201().isEmpty() && !recipient.getB21202().isEmpty()) {
            if (Integer.parseInt(recipient.getB21201()) + Integer.parseInt(recipient.getB21202()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b21101, "All Values Can't be zero");
        }
        if (!recipient.getB222h().isEmpty() && !recipient.getB222m().isEmpty()) {
            if (Integer.parseInt(recipient.getB222h()) + Integer.parseInt(recipient.getB222m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b222h, "All Values Can't be zero");
        }
        return true;
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