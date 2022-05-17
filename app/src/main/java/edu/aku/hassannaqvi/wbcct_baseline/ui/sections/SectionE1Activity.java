package edu.aku.hassannaqvi.wbcct_baseline.ui.sections;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.familyMember;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.form;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.pregFirstList;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.pregFirstListPos;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.pregnancy;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.wbcct_baseline.R;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionE1Binding;
import edu.aku.hassannaqvi.wbcct_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.wbcct_baseline.models.Pregnancy;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;

public class SectionE1Activity extends AppCompatActivity {

    private static final String TAG = "SectionE1Activity";
    ActivitySectionE1Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> pwNames, pwSno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e1);
        pregnancy = new Pregnancy();
        bi.setPreg(pregnancy);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
    }


    @Override
    protected void onResume() {
        super.onResume();
        populateSpinner();
        MainApp.lockScreen(this);

    }


    private void populateSpinner() {

        // Populate Provinces
        //Collection<Villages> provinces = db.getProvinceByCountry(String.valueOf(MainApp.selectedCountry));
        pwNames = new ArrayList<>();
        pwSno = new ArrayList<>();
        pwNames.add("...");
        pwSno.add("...");

        for (int p : pregFirstList) {

            pwNames.add(MainApp.familyList.get(p - 1).getA202());
            pwSno.add(MainApp.familyList.get(p - 1).getA201());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionE1Activity.this, R.layout.custom_spinner, pwNames);
        bi.e101.setAdapter(adapter);
        bi.e101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.e102.setText(null);
                pregFirstListPos = -1;
                MainApp.selectedPW = "";
                pregnancy = new Pregnancy();
                familyMember = new FamilyMembers();

                if (position == 0) return;


                pregFirstListPos = position;
                MainApp.selectedPW = pwSno.get(pregFirstListPos);
                MainApp.selectedPW = pwSno.get(pregFirstListPos);
                familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedPW) - 1);
                try {
                    pregnancy = db.getPregByFmUID(familyMember.getUid());

                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(SectionE1Activity.this, "JSONException (Pregnancy): " + e.getMessage(), Toast.LENGTH_LONG).show();
                }
                pregnancy.setE101(pwNames.get(pregFirstListPos));
                pregnancy.setE102(MainApp.selectedPW);
                bi.setPreg(pregnancy);
                pregnancy.setEh101(form.getA105());
                pregnancy.setEh102(form.getA102());
                pregnancy.setEh103(form.getA106());
                pregnancy.setEh104(form.getA107());
                bi.e103.setMaxvalue(Float.parseFloat(MainApp.familyMember.getA206y()));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }


    private boolean insertNewRecord() {

        if (!pregnancy.getUid().equals("") || MainApp.superuser) return true;

        pregnancy.populateMeta();


        long rowId = 0;
        try {
            rowId = db.addPregnancy(pregnancy);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        pregnancy.setId(String.valueOf(rowId));
        if (rowId > 0) {
            pregnancy.setUid(pregnancy.getDeviceId() + pregnancy.getId());
            db.updatesPregnancyColumn(TableContracts.PregnancyTable.COLUMN_UID, pregnancy.getUid());
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
            updcount = db.updatesPregnancyColumn(TableContracts.PregnancyTable.COLUMN_SE1, pregnancy.sE1toString());
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
            startActivity(new Intent(this, SectionE2Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;
        if (!pregnancy.getE107w().isEmpty() && !pregnancy.getE107m().isEmpty()) {
            if (Integer.parseInt(pregnancy.getE107w()) + Integer.parseInt(pregnancy.getE107m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.e107w, "All Values Can't be zero");
        }
        if (!pregnancy.getE111w().isEmpty() && !pregnancy.getE111m().isEmpty()) {
            if (Integer.parseInt(pregnancy.getE111w()) + Integer.parseInt(pregnancy.getE111m()) == 0)
                return Validator.emptyCustomTextBox(this, bi.e111w, "All Values Can't be zero");
        }
        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "SORRY! Back Press Not Allowed", Toast.LENGTH_SHORT).show();
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