package edu.aku.hassannaqvi.wbcct_baseline.ui.sections;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.anthc;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.anthroChildList;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.anthroChildListPos;
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
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionF1Binding;
import edu.aku.hassannaqvi.wbcct_baseline.models.AnthroChild;
import edu.aku.hassannaqvi.wbcct_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;

public class SectionF1Activity extends AppCompatActivity {

    private static final String TAG = "SectionF1Activity";
    ActivitySectionF1Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> childNames, childSno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f1);
        anthc = new AnthroChild();
        bi.setAnthc(anthc);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        setupSkips();
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");

        populateSpinner();
    }

    private void setupSkips() {
        getDiff(new EditTextPicker[]{bi.f10401, bi.f10402}, bi.llf10403, bi.llf104m);
        getDiff(new EditTextPicker[]{bi.f10501, bi.f10502}, bi.llf10503, bi.llf105m);
        getDiff(new EditTextPicker[]{bi.f10601, bi.f10602}, bi.llf10603, bi.llf106m);
    }

    private void populateSpinner() {

        // Populate Provinces
        //Collection<Villages> provinces = db.getProvinceByCountry(String.valueOf(MainApp.selectedCountry));
        childNames = new ArrayList<>();
        childSno = new ArrayList<>();
        childNames.add("...");
        childSno.add("...");

        for (int p : anthroChildList) {

            childNames.add(MainApp.familyList.get(p - 1).getA202());
            childSno.add(MainApp.familyList.get(p - 1).getA201());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionF1Activity.this, R.layout.custom_spinner, childNames);
        bi.f101name.setAdapter(adapter);
        bi.f101name.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.f101.setText(null);
                anthroChildListPos = -1;
                MainApp.selectedChild = "";
                anthc = new AnthroChild();
                familyMember = new FamilyMembers();

                if (position == 0) return;


                anthroChildListPos = position;
                MainApp.selectedChild = childSno.get(anthroChildListPos);
                familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedChild) - 1);
                try {
                    anthc = db.getAnthroChilByFmUID(familyMember.getUid());
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(SectionF1Activity.this, "JSONException (AnthroChild): " + e.getMessage(), Toast.LENGTH_LONG).show();
                }
                anthc.setF101name(childNames.get(anthroChildListPos));
                anthc.setF101(MainApp.selectedChild);
                //anthc.setF102(String.valueOf(familyMember.getAgeMon()));
                bi.setAnthc(anthc);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

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
                    if ((Float.parseFloat(edxArray[0].getText().toString()) - Float.parseFloat(edxArray[1].getText().toString()) >= 0.5)
                            || (Float.parseFloat(edxArray[0].getText().toString()) - Float.parseFloat(edxArray[1].getText().toString()) <= -0.5)) {
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

        if (!anthc.getUid().equals("") || MainApp.superuser) return true;

        anthc.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addCAnthro(anthc);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        anthc.setId(String.valueOf(rowId));
        if (rowId > 0) {
            anthc.setUid(anthc.getDeviceId() + anthc.getId());
            db.updatesCAnthroColumn(TableContracts.AnthroChildTable.COLUMN_UID, anthc.getUid());
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
            updcount = db.updatesCAnthroColumn(TableContracts.AnthroChildTable.COLUMN_SF1, anthc.sF1toString());
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
            Intent i;
            anthroChildList.remove(anthroChildListPos - 1);
            if (anthroChildList.size() > 0) {
                i = new Intent(this, SectionF1Activity.class);
            } else {
                i = new Intent(this, SectionF2Activity.class);
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