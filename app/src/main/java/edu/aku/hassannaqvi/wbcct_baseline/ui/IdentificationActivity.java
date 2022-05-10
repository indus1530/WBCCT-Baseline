package edu.aku.hassannaqvi.wbcct_baseline.ui;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedTehsil;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedUc;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
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
import java.util.Collection;

import edu.aku.hassannaqvi.wbcct_baseline.R;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.wbcct_baseline.models.Clusters;
import edu.aku.hassannaqvi.wbcct_baseline.models.Form;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionA1Activity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> provinceNames;
    private ArrayList<String> provinceCodes;
    private ArrayList<String> districtNames;
    private ArrayList<String> districtCodes;
    private ArrayList<String> tehsilNames;
    private ArrayList<String> tehsilCodes;
    private ArrayList<String> ucNames;
    private ArrayList<String> ucCodes;
    private ArrayList<String> villageNames;
    private ArrayList<String> villageCodes;
    private ArrayList<String> clusterNo;
    private ArrayList<String> headHH;
    private Intent openIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        db = MainApp.appInfo.dbHelper;
        populateSpinner();

        bi.btnContinue.setText(R.string.open_hh_form);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Form");
        MainApp.form = new Form();


    }

    private void populateSpinner() {

        // Populate Provinces
        //Collection<Villages> provinces = db.getProvinceByCountry(String.valueOf(MainApp.selectedCountry));
        Collection<Clusters> provinces = db.getAllProvinces();
        provinceNames = new ArrayList<>();
        provinceCodes = new ArrayList<>();
        provinceNames.add("...");
        provinceCodes.add("...");

        for (Clusters p : provinces) {
            provinceNames.add(p.getProvinceName());
            provinceCodes.add(p.getProvinceCode());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, provinceNames);
        bi.a101.setAdapter(adapter);
        bi.a101.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a102.setAdapter(null);
                bi.a103.setAdapter(null);
                bi.a104.setAdapter(null);
                bi.a105a.setAdapter(null);
                bi.a106.setText(null);

                if (position == 0) return;
                MainApp.selectedProvince = provinceCodes.get(position);
                // Populate Districts
                Collection<Clusters> districts = db.getDistrictsByProvince(MainApp.selectedProvince);
                districtNames = new ArrayList<>();
                districtCodes = new ArrayList<>();
                districtNames.add("...");
                districtCodes.add("...");

                for (Clusters d : districts) {
                    districtNames.add(d.getDistrictName());
                    districtCodes.add(d.getDistrictCode());
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, districtNames);
                bi.a102.setAdapter(adapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        bi.a102.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a103.setAdapter(null);
                bi.a104.setAdapter(null);
                bi.a105a.setAdapter(null);
                bi.a106.setText(null);
                if (position == 0) return;
                MainApp.selectedDistrict = districtCodes.get(position);
                // Populate TEHSILS
                Collection<Clusters> tehsils = db.getTehsilsByDistrict(MainApp.selectedProvince, MainApp.selectedDistrict);
                tehsilNames = new ArrayList<>();
                tehsilCodes = new ArrayList<>();
                tehsilNames.add("...");
                tehsilCodes.add("...");

                for (Clusters v : tehsils) {
                    tehsilNames.add(v.getTehsilName());
                    tehsilCodes.add(v.getTehsilCode());
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, tehsilNames);
                bi.a103.setAdapter(adapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        bi.a103.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a104.setAdapter(null);
                bi.a105a.setAdapter(null);
                bi.a106.setText(null);
                if (position == 0) return;
                MainApp.selectedTehsil = tehsilCodes.get(position);
                // Populate UCS
                Collection<Clusters> ucs = db.getUcsByTehsil(MainApp.selectedDistrict, tehsilCodes.get(position));
                ucNames = new ArrayList<>();
                ucCodes = new ArrayList<>();
                ucNames.add("...");
                ucCodes.add("...");

                for (Clusters v : ucs) {
                    ucNames.add(v.getUcName());
                    ucCodes.add(v.getUcCode());
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, ucNames);
                bi.a104.setAdapter(adapter);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bi.a104.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a105a.setAdapter(null);
                bi.a105b.setText(null);
                bi.a106.setText(null);
                if (position == 0) return;
                MainApp.selectedUc = ucCodes.get(position);
                // Populate Clusters
                Collection<Clusters> villages = db.getVillagesByUc(selectedTehsil, selectedUc);
                villageNames = new ArrayList<>();
                villageCodes = new ArrayList<>();
                clusterNo = new ArrayList<>();
                villageNames.add("...");
                villageCodes.add("...");
                clusterNo.add("...");

                for (Clusters v : villages) {
                    villageNames.add(v.getVillageName());
                    villageCodes.add(v.getVillageCode());
                    clusterNo.add(v.getClusterNo());
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, villageNames);
                bi.a105a.setAdapter(adapter);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bi.a105a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a105b.setText(null);
                bi.a106.setText(null);
                if (position == 0) return;
                MainApp.selectedVillage = villageCodes.get(position);
                MainApp.selectedCluster = clusterNo.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;

        //MainApp.selectedPSU = selectedCluster + String.format("%02d", Integer.parseInt(bi.a105b.getText().toString()));
        MainApp.selectedHHID = bi.a106.getText().toString();
        if (!hhExists()) {
            //saveDraftForm();
            finish();
            startActivity(new Intent(this, SectionA1Activity.class));
        } else if (MainApp.form.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
            startActivity(new Intent(this, SectionA1Activity.class));
        }

    }


  /*  private void saveDraftForm() {
        MainApp.form = new Form();



    }*/

   /* private void saveDraftAnthro() {
        MainApp.anthro = new Anthro();

        MainApp.anthro.setUserName(MainApp.user.getUserName());
        MainApp.anthro.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.anthro.setDeviceId(MainApp.deviceid);
        MainApp.anthro.setAppver(MainApp.versionName + "." + MainApp.versionCode);

    }

    private void saveDraftSamples() {

        MainApp.samples = new Samples();
        MainApp.samples.setUserName(MainApp.user.getUserName());
        MainApp.samples.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.samples.setDeviceId(MainApp.deviceid);
        MainApp.samples.setAppver(MainApp.versionName + "." + MainApp.versionCode);
    }*/


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkHousehold(View view) {
        /*RandomHH testRand = new RandomHH();
        testRand.setEcdNo("1");
        testRand.setpsuCode("909090909");
        testRand.setHeadhh("Test Head");
        testRand.setHhno("999-99");
        RandomHH randHH = new RandomHH();
        if (!bi.a105.getText().toString().equals("909090909")) {
            randHH = db.getHHbyEnumBlocks(bi.a105.getText().toString(), bi.a110.getText().toString());
        } else {
            randHH = testRand;
        }
        if (!randHH.getpsuCode().equals("")) {
            bi.ahhead.setError(null);
            bi.ahhead.setText(randHH.getHeadhh());
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);

            MainApp.currentHousehold = randHH;

        } else {
            bi.ahhead.setError("Not Found!");
            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
            bi.btnContinue.setEnabled(false);
        }*/
        /*ArrayList<String> households = new ArrayList<String>();
        for (RandomHH r : randHH) {
            households.add(r.getHhno());
            headHH = new ArrayList<String>();
            headHH.add(r.getHeadhh());
        }*/
    }

    private boolean hhExists() {

        MainApp.form = new Form();
        try {
            MainApp.form = db.getFormByPSUHHNo(MainApp.selectedPSU, MainApp.selectedHHID);
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.form != null;


    }

  /*  public void searchEB(View view) {
        bi.btnContinue.setEnabled(false);
        Villages testEb = new Villages();
        testEb.setEnumBlock("909090909");
        testEb.setDistrictName("Test District 9");
        testEb.setTehsilName("Test Tehsil 9");
        Villages enumBlock = new Villages();
        *//*if (!bi.a105.getText().toString().equals(testEb.getEnumBlock())) {
            enumBlock = db.getEnumBlocks(bi.a105.getText().toString());
        } else {
            enumBlock = testEb;
        }

       *//**//* psuCode = new ArrayList<>();
        districtNames = new ArrayList<>();
        villageNames = new ArrayList<>();
        for (Villages eb : enumBlocks) {
            psuCode.add(eb.getEnumBlock());
            districtNames.add(eb.getDistrictName());
            villageNames.add(eb.getTehsilName()); //
        }*//**//*
        if (!enumBlock.getEnumBlock().equals("")) {
            bi.a107.setError(null);
            bi.a108.setError(null);
            bi.a107.setText(enumBlock.getDistrictName());
            bi.a108.setText(enumBlock.getTehsilName());
            bi.fldGrpHH.setVisibility(View.VISIBLE);

        } else {
            bi.a107.setError("Not Found!");
            bi.a108.setError("Not Found!");
            bi.a110.setText(null);
            bi.ahhead.setText(null);
            bi.fldGrpHH.setVisibility(View.GONE);
        }*//*
    }*/

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);
    }

/*    @Override
    protected void onPause() {
        super.onPause();
        MainApp.timer = null;
    }*/

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
