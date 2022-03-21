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
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionB1Binding;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;

public class SectionB1Activity extends AppCompatActivity {


    private static final String TAG = "SectionB1Activity";
    ActivitySectionB1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_b1);
        bi.setRcpt(recipient);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        recipient.setB101(MainApp.familyMember.getA201());
        recipient.setB102(MainApp.familyMember.getA202());

        bi.fldGrpCVb119.setVisibility(MainApp.familyMember.getA204().equals("1") || MainApp.familyMember.getA20704().equals("4") ? View.GONE : View.VISIBLE);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
    }


    private boolean insertNewRecord() {
        if (!recipient.getUid().equals("") || MainApp.superuser) return true;
        MainApp.recipient.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addRecipient(MainApp.recipient);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.recipient.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.recipient.setUid(MainApp.recipient.getDeviceId() + MainApp.recipient.getId());
            db.updatesRecipientColumn(TableContracts.RecipientTable.COLUMN_UID, recipient.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            updcount = db.updatesRecipientColumn(TableContracts.RecipientTable.COLUMN_SB1, recipient.sB1toString());
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
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            if (MainApp.familyMember.getA20704().equals("4")) {
                startActivity(new Intent(this, SectionB2Activity.class));
            } else {

                // selected familymember (Child)
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


            }
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!recipient.getB104y().isEmpty() && !recipient.getB104m().isEmpty() && !recipient.getB104w().isEmpty()) {
            if (Integer.parseInt(recipient.getB104y()) + Integer.parseInt(recipient.getB104m()) + Integer.parseInt(recipient.getB104w()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b104y, "All Values Can't be zero");
        }
        if (!recipient.getB105y().isEmpty() && !recipient.getB105m().isEmpty() && !recipient.getB105w().isEmpty()) {
            if (Integer.parseInt(recipient.getB105y()) + Integer.parseInt(recipient.getB105m()) + Integer.parseInt(recipient.getB105w()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b105y, "All Values Can't be zero");
        }
        if (!recipient.getB115h().isEmpty() && !recipient.getB115m().isEmpty()) {
            if (Integer.parseInt(recipient.getB115h()) + Integer.parseInt(recipient.getB115m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.b115h, "All Values Can't be zero");
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