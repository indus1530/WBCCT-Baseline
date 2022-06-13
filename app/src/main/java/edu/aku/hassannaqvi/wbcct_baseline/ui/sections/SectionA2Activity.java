package edu.aku.hassannaqvi.wbcct_baseline.ui.sections;


import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.familyMember;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.sharedPref;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
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
import java.util.Calendar;

import edu.aku.hassannaqvi.wbcct_baseline.R;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionA2Binding;
import edu.aku.hassannaqvi.wbcct_baseline.models.FamilyMembers;


public class SectionA2Activity extends AppCompatActivity {
    private static final String TAG = "SectionA2Activity";
    ActivitySectionA2Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> fatherNames;
    private ArrayList<String> fatherCodes;
    private ArrayList<String> motherNames;
    private ArrayList<String> motherCodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a2);
        bi.setFamilymember(familyMember);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        MainApp.familyMember.setA201(String.valueOf(MainApp.memberCount + 1));
        bi.a205y.setMaxvalue(Float.parseFloat(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))));
        bi.a205y.setMinvalue(Float.parseFloat(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))) - 95);

        setupListener();
        populateSpinner();
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
    }

    private void setupListener() {
        bi.a202.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                bi.hl3name.setVisibility(View.VISIBLE);
                bi.hl3name.setText("What is the relationship of " + familyMember.getA202() + " with the head of household");
            }
        });

        bi.a205y.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.a205y.getText().toString().isEmpty()) return;
                bi.a205m.setMaxvalue(Integer.parseInt(bi.a205y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
                bi.a205d.setMaxvalue(Integer.parseInt(bi.a205y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
                bi.a205m.setEnabled(true);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        bi.a205m.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.a205y.getText().toString().isEmpty() || bi.a205m.getText().toString().isEmpty())
                    return;
                bi.a205d.setMaxvalue(Integer.parseInt(bi.a205y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.a205m.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
                bi.a205d.setEnabled(true);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }

    private void populateSpinner() {

        fatherNames = new ArrayList<>();
        fatherCodes = new ArrayList<>();

        motherNames = new ArrayList<>();
        motherCodes = new ArrayList<>();

        fatherNames.add("...");
        fatherCodes.add("...");
        for (FamilyMembers fl : MainApp.fatherList) {
            fatherNames.add(fl.getA202());
            fatherCodes.add(fl.getA201());
        }
        fatherNames.add("Not Available/Died");
        fatherCodes.add("97");

        motherNames.add("...");
        motherCodes.add("...");
        for (FamilyMembers fl : MainApp.motherList) {
            motherNames.add(fl.getA202());
            motherCodes.add(fl.getA201());
        }
        motherNames.add("Not Available/Died");
        motherCodes.add("97");

        // Apply the adapter to the Father spinner
        bi.a21301.setAdapter(new ArrayAdapter<>(SectionA2Activity.this, R.layout.custom_spinner, motherNames));

        bi.a21301.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setA21301(motherCodes.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        // Apply the adapter to the Mother spinner
        bi.a21302.setAdapter(new ArrayAdapter<>(SectionA2Activity.this, R.layout.custom_spinner, fatherNames));

        bi.a21302.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setA21302(fatherCodes.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });


    }


    private boolean insertNewRecord() {
        if (!familyMember.getUid().equals("") || MainApp.superuser) return true;
        MainApp.familyMember.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addFamilyMembers(MainApp.familyMember);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.familyMember.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.familyMember.setUid(MainApp.familyMember.getDeviceId() + MainApp.familyMember.getId());
            db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_UID, MainApp.familyMember.getUid());
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
            updcount = db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_SA2, MainApp.familyMember.sA2toString());
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
        // saveDraft();

        //TODO: fix it in future
        if (Integer.parseInt(bi.a206y.getText().toString().trim()) < 13) {
            familyMember.setA208("99");
        }

        if (updateDB()) {
            setResult(RESULT_OK);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        setResult(Activity.RESULT_CANCELED);
        finish();
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