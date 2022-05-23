package edu.aku.hassannaqvi.wbcct_baseline;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.AndroidManager;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.wbcct_baseline.models.AnthroChild;
import edu.aku.hassannaqvi.wbcct_baseline.models.AnthroWRA;
import edu.aku.hassannaqvi.wbcct_baseline.models.Child;
import edu.aku.hassannaqvi.wbcct_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.wbcct_baseline.models.Form;
import edu.aku.hassannaqvi.wbcct_baseline.models.MWRA;
import edu.aku.hassannaqvi.wbcct_baseline.models.Pregnancy;
import edu.aku.hassannaqvi.wbcct_baseline.models.Recipient;
import edu.aku.hassannaqvi.wbcct_baseline.ui.ChangePasswordActivity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.IdentificationActivity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.SyncActivity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.lists.FormsReportCluster;
import edu.aku.hassannaqvi.wbcct_baseline.ui.lists.FormsReportDate;
import edu.aku.hassannaqvi.wbcct_baseline.ui.lists.FormsReportPending;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionA1Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionA2Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionA3AActivity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionA3BActivity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionA4Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionA5Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionB1Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionB2Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionC1Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionC2Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionC3Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionC4Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionC5Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionC6Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionD1Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionD2Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionD3Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionD4Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionE1Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionE2Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionF1Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionF2Activity;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);
        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");
        invalidateOptionsMenu();
    }

    public void sectionPress(View view) {


        switch (view.getId()) {
            case R.id.startInterview:
                MainApp.entryType = 1;
                break;
            case R.id.startDataEntry:
                MainApp.entryType = 2;
                break;
/*
            case R.id.updateBlood:
                MainApp.entryType = 3;
                break;

            case R.id.updateStool:
                MainApp.entryType = 4;
                break;*/
            default:
                MainApp.entryType = 0;

        }


        switch (view.getId()) {

            case R.id.startInterview:
            case R.id.startDataEntry:
            case R.id.seca:
                MainApp.form = new Form();
                startActivity(new Intent(this, IdentificationActivity.class));
                break;
            case R.id.changePassword:
                startActivity(new Intent(this, ChangePasswordActivity.class));
                break;
            case R.id.seca1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA1Activity.class));
                break;
            case R.id.seca2:
                MainApp.familyMember = new FamilyMembers();
                startActivity(new Intent(this, SectionA2Activity.class));
                break;

            case R.id.seca3a:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA3AActivity.class));
                break;

            case R.id.seca3b:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA3BActivity.class));
                break;

            case R.id.seca4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA4Activity.class));
                break;
            case R.id.seca5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA5Activity.class));
                break;
            case R.id.secb1:
                MainApp.recipient = new Recipient();
                startActivity(new Intent(this, SectionB1Activity.class));
                break;
            case R.id.secb2:
                MainApp.recipient = new Recipient();
                startActivity(new Intent(this, SectionB2Activity.class));
                break;
            case R.id.secc1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionC1Activity.class));
                break;
            case R.id.secc2:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionC2Activity.class));
                break;

            case R.id.secc3:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionC3Activity.class));
                break;

            case R.id.secc4:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionC4Activity.class));
                break;
            case R.id.secc5:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionC5Activity.class));
                break;
            case R.id.secc6:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionC6Activity.class));
                break;
            case R.id.secd1:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionD1Activity.class));
                break;
            case R.id.secd2:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionD2Activity.class));
                break;
            case R.id.secd3:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionD3Activity.class));
                break;
            case R.id.secd4:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionD4Activity.class));
                break;
            case R.id.sece1:
                MainApp.pregnancy = new Pregnancy();
                startActivity(new Intent(this, SectionE1Activity.class));
                break;

            case R.id.e2:
                MainApp.pregnancy = new Pregnancy();
                startActivity(new Intent(this, SectionE2Activity.class));
                break;
            case R.id.f1:
                MainApp.anthc = new AnthroChild();
                startActivity(new Intent(this, SectionF1Activity.class));
                break;
            case R.id.f2:
                MainApp.anthw = new AnthroWRA();
                startActivity(new Intent(this, SectionF2Activity.class));
                break;

            case R.id.dbManager:
                startActivity(new Intent(this, AndroidManager.class));
                break;


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidManager.class);
                startActivity(intent);
                break;
            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.checkPendingForms:
                intent = new Intent(MainActivity.this, FormsReportPending.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.changePassword:
                intent = new Intent(MainActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);
        action_database.setVisible(MainApp.admin);
        return true;

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