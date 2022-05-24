package edu.aku.hassannaqvi.wbcct_baseline.ui.lists;


import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.anthroChildList;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.anthroWRAList;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.caregiverList;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.childOfSelectedMWRAList;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.pregFirstList;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.recipientsList;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedCaregiver;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedChild;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedChildName;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedMWRA;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedRecipient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.wbcct_baseline.R;
import edu.aku.hassannaqvi.wbcct_baseline.adapters.FamilyMembersAdapter;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivityFamilyListBinding;
import edu.aku.hassannaqvi.wbcct_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionA2Activity;
import edu.aku.hassannaqvi.wbcct_baseline.ui.sections.SectionA3AActivity;


public class FamilyMembersListActivity extends AppCompatActivity {


    private static final String TAG = "FamilyMembersList";
    private final boolean selectionCheck = false;
    ActivityFamilyListBinding bi;
    DatabaseHelper db;
    private FamilyMembersAdapter familyMembersAdapter;
    ActivityResultLauncher<Intent> MemberInfoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK && !MainApp.superuser) {
                        // There are no request codes
                        //Intent data = result.getData();
                        Intent data = result.getData();
                      /*  int age = Integer.parseInt(femalemembers.getHh05y());
                        boolean isFemale = femalemembers.getHh03().equals("2");
                        boolean notMarried = femalemembers.getHh06().equals("2");
                        if (
                            // Adolescent: Male + Female - 10 to 19
                                (age >= 10 && age < 20 && notMarried)
                                        ||
                                        // MWRA: Married females between 14 to 49
                                        (age >= 14 && age < 50 && !notMarried && isFemale )

                        ) {*/
                        MainApp.familyList.add(MainApp.familyMember);
                        MainApp.hhheadSelected = MainApp.familyMember.getA203().equals("1");
                        //  memGender = MainApp.familyMember.getA204();
                        // boolean memAgeCheck = Integer.parseInt(MainApp.familyMember.getA206()) > 18;
                        if (!MainApp.familyMember.getA208().equals("") && !MainApp.familyMember.getA208().equals("5") && !MainApp.familyMember.getA208().equals("99")) {
                            switch (MainApp.familyMember.getA204()) {
                                case "1":
                                    MainApp.fatherList.add(MainApp.familyMember);
                                    //MainApp.mwraCount++;
                                    break;
                                case "2":
                                    MainApp.motherList.add(MainApp.familyMember);
                                    //MainApp.adolCount++;
                                    break;

                            }
                        }


                        /** Populate Under-2 Child
                         *  If age in months is less than 24
                         * */
                        if (MainApp.familyMember.getAgeMon() < 24)
                            childOfSelectedMWRAList.add(Integer.valueOf(MainApp.familyMember.getA201()));


                        /** Populate Recipient
                         *  If any BISP is marked
                         * */
                        if (MainApp.familyMember.getA20701().equals("1")
                                || MainApp.familyMember.getA20702().equals("2")
                                || MainApp.familyMember.getA20703().equals("3")
                                || MainApp.familyMember.getA20704().equals("4")
                                || MainApp.familyMember.getA20796().equals("96")) {
                            recipientsList.add(Integer.valueOf(MainApp.familyMember.getA201()));
                        }

                        /** Populate First Pregnant:
                         *
                         *   Is first time pregnant:    Y
                         *
                         */
                        if (MainApp.familyMember.getA210().equals("1") && MainApp.familyMember.getA214().equals("1")) {

                            pregFirstList.add(Integer.valueOf(MainApp.familyMember.getA201()));
                        }
                        /** Populate Caregiver List:
                         *
                         *   Any female 15
                         *
                         */
                        if (Integer.parseInt(MainApp.familyMember.getA206y()) > 14
                                && MainApp.familyMember.getA204().equals("2")) {
                            caregiverList.add(Integer.valueOf(MainApp.familyMember.getA201()));
                        }

                        /** Populate Anthro List:
                         *
                         *   Any female 15 - 49 (both married and unmarried)
                         *   Any Child Under 0 - 2
                         *
                         */
                        if (MainApp.familyMember.getA214().equals("1")) {
                            if ((Integer.parseInt(MainApp.familyMember.getA206y()) < 2)) {
                                anthroChildList.add(Integer.valueOf(MainApp.familyMember.getA201()));
                            }
                            if (
                                    Integer.parseInt(MainApp.familyMember.getA206y()) > 14 && Integer.parseInt(MainApp.familyMember.getA206y()) < 50 && MainApp.familyMember.getA204().equals("2")) {
                                anthroWRAList.add(Integer.valueOf(MainApp.familyMember.getA201()));
                            }
                        }

                        MainApp.memberCount++;
                        familyMembersAdapter.notifyItemInserted(MainApp.familyList.size() - 1);

                        checkCompleteFm();
                    }
                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(FamilyMembersListActivity.this, "No family member added.", Toast.LENGTH_SHORT).show();
                    }

                }
            });
    private ArrayList<String> caregiverNames, childNames, recipientNames, preg1stNames;
    private ArrayList<String> caregiverSno, motherSno, childSno, recipientSno, preg1stSno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_family_list);
        bi.setCallback(this);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
        db = MainApp.appInfo.dbHelper;
        MainApp.familyList = new ArrayList<>();
        MainApp.mwraList = new ArrayList<Integer>();
        MainApp.caregiverList = new ArrayList<Integer>();
        childOfSelectedMWRAList = new ArrayList<Integer>();
        pregFirstList = new ArrayList<Integer>();
        recipientsList = new ArrayList<Integer>();
        anthroChildList = new ArrayList<Integer>();
        anthroWRAList = new ArrayList<Integer>();
        recipientsList = new ArrayList<Integer>();
        MainApp.fatherList = new ArrayList<>();
        MainApp.motherList = new ArrayList<>();
        Log.d(TAG, "onCreate: familyList " + MainApp.familyList.size());
        try {
            MainApp.familyList = db.getMemberBYUID(MainApp.form.getUid());


        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(FamilyMembers): " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
        MainApp.selectedMWRA = "";
        selectedChild = "";
        MainApp.selectedChildName = "";
        MainApp.selectedRecipient = "";
        MainApp.selectedPreg1st = "";
        bi.hhNo.setText("Family of: " + MainApp.form.getVillageCode() + "-" + MainApp.form.getHhid());
        // Family Complete criteria: MWRA must exist
        for (FamilyMembers fm : MainApp.familyList) {
            if (!fm.getA208().equals("5") && !fm.getA208().equals("99")) {

                switch (fm.getA204()) {
                    case "1":
                        MainApp.fatherList.add(fm);
                        break;
                    case "2":
                        MainApp.motherList.add(fm);
                        break;

                }
            }


            /** Populate Under-2 Child
             *  age in months is less than 24
             * */
            if (fm.getAgeMon() < 24) childOfSelectedMWRAList.add(Integer.valueOf(fm.getA201()));


            /** Populate Recipient
             *  If any BISP is marked
             * */
            if (fm.getA20701().equals("1")
                    || fm.getA20702().equals("2")
                    || fm.getA20703().equals("3")
                    || fm.getA20704().equals("4")
                    || fm.getA20796().equals("96")) {
                recipientsList.add(Integer.valueOf(fm.getA201()));
            }


            /** Populate First Pregnant:
             *  Is first time pregnant: Y
             */
            if (fm.getA210().equals("1") && fm.getA214().equals("1")) {

                pregFirstList.add(Integer.valueOf(fm.getA201()));
            }


            /** Populate Caregiver List:
             *  Any female 15
             */
            if (Integer.parseInt(fm.getA206y()) > 14 && fm.getA204().equals("2"))
                caregiverList.add(Integer.valueOf(fm.getA201()));


            /** Populate Anthro List:
             *   Any female 15 - 49 (both married and unmarried)
             *   Any Child Under 0 - 5
             */
            if (fm.getA214().equals("1")) {
                if ((Integer.parseInt(fm.getA206y()) < 5))
                    anthroChildList.add(Integer.valueOf(fm.getA201()));
                if (Integer.parseInt(fm.getA206y()) > 14 && Integer.parseInt(fm.getA206y()) < 50 && fm.getA204().equals("2")) {
                    anthroWRAList.add(Integer.valueOf(fm.getA201()));
                }
            }
        }


        // Set Selected Members
        for (int i = 0; i < MainApp.familyList.size(); i++) {


            // Set Child
            if (MainApp.familyList.get(i).getIndexed().contains("1")) {
                selectedChild = String.valueOf(i);
                selectedChildName = MainApp.familyList.get(i).getA202();
                MainApp.ageOfIndexChild = Integer.parseInt(MainApp.familyList.get(i).getA206y());
            }

            // Set mwra
            if (MainApp.familyList.get(i).getIndexed().contains("2")) {
                selectedMWRA = String.valueOf(i);

            }


            // Set caregiver
            if (MainApp.familyList.get(i).getIndexed().contains("3")) {
                selectedCaregiver = String.valueOf(i);

            }

            // Set Recipient
            if (MainApp.familyList.get(i).getIndexed().contains("R")) {
                selectedRecipient = String.valueOf(i);
                MainApp.selectedRecipientName = MainApp.familyList.get(i).getA202();

            }


            MainApp.hhheadSelected = MainApp.familyList.get(i).getA203().equals("1");

        }

        if (!selectedChild.equals("") /*&& !selectedRecipient.equals("")*/) {
            bi.btnRand.setVisibility(View.INVISIBLE);
            //bi.btnContinue.setVisibility(View.VISIBLE);
            bi.btnContinue.setEnabled(true);
            bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_green));
        }
        //   bi.btnContinue.setEnabled(!MainApp.selectedMWRA.equals(""));
        //  bi.btnContinue.setBackground(!MainApp.selectedMWRA.equals("") ? getResources().getDrawable(R.drawable.button_shape_green) : getResources().getDrawable(R.drawable.button_shape_gray));

        //bi.btnContinue.setVisibility(!MainApp.selectedMWRA.equals("") ? View.VISIBLE : View.INVISIBLE);
        MainApp.memberCount = Math.round(MainApp.familyList.size());

        familyMembersAdapter = new FamilyMembersAdapter(this, MainApp.familyList);
        bi.rvMwra.setAdapter(familyMembersAdapter);
        bi.rvMwra.setLayoutManager(new LinearLayoutManager(this));

        bi.fab.setOnClickListener(view -> {
            if (MainApp.superuser) {
                Toast.makeText(FamilyMembersListActivity.this, "Supervisors cannot add new members.", Toast.LENGTH_LONG).show();

            } else if (MainApp.selectedMWRA.equals("")) {
                //     Toast.makeText(MwraActivity.this, "Opening Mwra Form", Toast.LENGTH_LONG).show();
                MainApp.familyMember = new FamilyMembers();
                addFemale();
            } else {
                Toast.makeText(FamilyMembersListActivity.this, "This form has been locked. You cannot add new family member to locked forms", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApp.lockScreen(this);

        Toast.makeText(this, "Activity Resumed!", Toast.LENGTH_SHORT).show();


        if (childOfSelectedMWRAList.size() > 0 /*&& recipientsList.size() > 0*/) {
            bi.familyComplete.setVisibility(View.VISIBLE);

        } else {
            bi.familyComplete.setVisibility(View.GONE);

        }

        // Disable family complete check if MWRA indexed
        if (!MainApp.selectedChild.equals("") /*&& !selectedRecipient.equals("")*/) {
            bi.familyComplete.setChecked(true);
            bi.familyComplete.setEnabled(false);
        }
        //MainApp.familyMember = new MWRA();
        //MainApp.child = new Child();
/*        if (MainApp.mwraList.size() > 0 && MainApp.selectedMWRA.equals("")) {
            //MainApp.fm.get(Integer.parseInt(String.valueOf(MainApp.selectedMWRA))).setStatus("1");
            bi.btnRand.setVisibility(View.VISIBLE);
            // bi.btnContinue.setVisibility(View.INVISIBLE);
            bi.btnContinue.setEnabled(false);
            bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_gray));

        } else {
            bi.btnRand.setVisibility(View.INVISIBLE);
            // bi.btnContinue.setVisibility(View.VISIBLE);
            bi.btnContinue.setEnabled(true);
            bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_green));

        }*/
        checkCompleteFm();


        // bi.fab.setClickable(!MainApp.form.getiStatus().equals("1"));
      /* bi.completedmember.setText(mwra.size()+ " MWRAs added");
        bi.totalmember.setText(MainApp.familyMemberTotal+ " M completed");*/

        bi.totalMember.setText("Total: " + MainApp.familyList.size());
        bi.totalMwra.setText("Children: " + childOfSelectedMWRAList.size());
        bi.totalAdol.setText("BISP Rec.: " + MainApp.recipientsList.size());
        bi.totalMale.setText("1st Preg.: " + MainApp.pregFirstList.size());
    }


    private void checkCompleteFm() {
        //     if (!MainApp.form.getIStatus().equals("1")) {
        int compCount = MainApp.familyList.size();

        MainApp.memberCountComplete = compCount;
        //   bi.btnContinue.setVisibility(compCount == memberCount && !form.getiStatus().equals("1")? View.VISIBLE : View.GONE);
     /*   bi.btnContinue.setVisibility(compCount >= memberCount ? View.VISIBLE : View.GONE);
        bi.btnContinue.setEnabled(bi.btnContinue.getVisibility()==View.VISIBLE);*/

        //  } else {
        //       Toast.makeText(this, "Form has been completed or locked", Toast.LENGTH_LONG).show();
        //   }

        /*MainApp.childOfSelectedMWRAList = new ArrayList<>();
        for (FamilyMembers fm : MainApp.familyList) {
            if (fm.getA21301().equals("2")) {
                MainApp.childOfSelectedMWRAList.add(Integer.parseInt(fm.getA201()));
            }
        }

        String kishGridChild = MainApp.kishGrid(Integer.parseInt(MainApp.form.getEcdNo()), MainApp.childOfSelectedMWRAList.size());
        int indx = MainApp.childOfSelectedMWRAList.get(Integer.parseInt(kishGridChild));
        MainApp.selectedMWRA = String.valueOf(indx - 1);
        MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA));
        db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "1");

        // Updating adapter
        MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA)).setIndexed("1");

        familyMembersAdapter.notifyItemChanged(Integer.parseInt(MainApp.selectedMWRA));

        // Select Child using KishGrid
        MainApp.childOfSelectedMWRAList = new ArrayList<>();
        for (FamilyMembers fm : MainApp.familyList) {
            if (fm.getA21301().equals(MainApp.familyMember.getA201())) {
                MainApp.childOfSelectedMWRAList.add(Integer.parseInt(fm.getA201()));
            }
        }*/
    }

    public void addFemale() {
        addMoreMember();

      /*  if (MainApp.familyList.size() >= Integer.parseInt(MainApp.form.getH220b())) {
            displayAddMoreDialog();
        } else {
            addMoreMWRA();

        }*/
    }

    public void btnContinue(View view) {

        try {
            // BISP Reipient
            MainApp.familyMember = db.getSelectedMemberBYUID(MainApp.form.getUid(), "R");
            MainApp.recipient = db.getRecipientByFMID(MainApp.familyMember.getUid());

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(FamilyMembers): " + e.getMessage(), Toast.LENGTH_LONG).show();

        }
        finish();
        startActivity(new Intent(this, MainApp.selectedChild.equals("") /*|| MainApp.selectedRecipient.equals("")*/ ? EndingActivity.class : SectionA3AActivity.class).putExtra("complete", true));

        //MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA));

    /*    MainApp.familyMember = db.getSelectedMwraBYUID(MainApp.form.getUid());
        MainApp.familyList = new ArrayList<>();
        finish();
        startActivity(new Intent(this, !MainApp.familyMember.getIndexed().equals("1") ? EndingActivity.class : ChildListActivity.class).putExtra("complete", true));
    */
        /*else if (MainApp.familyList.size() < MainApp.memberCount) {

            Snackbar snackbar = Snackbar
                    .make(bi.parentLayout, "www.journaldev.com", Snackbar.LENGTH_LONG);
            snackbar.show();
        }*/

    }

  /*  private void proceedSelect() {

        String hhno = MainApp.form.getSno().substring(MainApp.form.getSno().length() - 1);
        // Select Index Mother using KishGrid
        String kishGridMWRA = MainApp.kishGrid(Integer.parseInt(hhno), MainApp.mwraList.size());
        int sno = MainApp.mwraList.get(Integer.parseInt(kishGridMWRA));

        // Updating database to mark indexed mother
        MainApp.selectedMWRA = String.valueOf(sno - 1);
        MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA));
        db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "1");

        // Updating adapter
        MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA)).setIndexed("1");
        familyMembersAdapter.notifyItemChanged(Integer.parseInt(MainApp.selectedMWRA));


        // Select Child using KishGrid
        childOfSelectedMWRAList = new ArrayList<>();
        for (FamilyMembers fm : MainApp.familyList) {
            if (fm.getA21301().equals(MainApp.familyMember.getA201()) && fm.getA214().equals("1") && Integer.parseInt(fm.getA206y()) < 5) {
                childOfSelectedMWRAList.add(Integer.parseInt(fm.getA201()));
            }
        }

        String kishGridChild = MainApp.kishGrid(Integer.parseInt(hhno), childOfSelectedMWRAList.size());
        sno = childOfSelectedMWRAList.get(Integer.parseInt(kishGridChild));

        // Updating database to mark indexed mother
        selectedChild = String.valueOf(sno - 1);
        selectedChildName = MainApp.familyList.get(Integer.parseInt(selectedChild)).getA202();
        MainApp.ageOfIndexChild = Integer.parseInt(MainApp.familyList.get(Integer.parseInt(selectedChild)).getA206y());
        MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(selectedChild));
        db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "2");

        // Updating adapter
        MainApp.familyList.get(Integer.parseInt(selectedChild)).setIndexed("2");
        familyMembersAdapter.notifyItemChanged(Integer.parseInt(selectedChild));


        // Select AdolMale using KishGrid
        if (recipientsList.size() > 0) {
            String kishGridAdolMale = MainApp.kishGrid(Integer.parseInt(hhno), recipientsList.size());
            sno = recipientsList.get(Integer.parseInt(kishGridAdolMale));

            // Updating database to mark selected adolmale
            MainApp.selectedRecipient = String.valueOf(sno - 1);
            MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedRecipient));
            db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "3");

            // Updating adapter
            MainApp.familyList.get(Integer.parseInt(MainApp.selectedRecipient)).setIndexed("3");
            familyMembersAdapter.notifyItemChanged(Integer.parseInt(MainApp.selectedRecipient));
        }

        if (pregFirstList.size() > 0) {
            // Select AdolFemale using KishGrid
            String kishGridAdolFemale = MainApp.kishGrid(Integer.parseInt(hhno), pregFirstList.size());
            sno = pregFirstList.get(Integer.parseInt(kishGridAdolFemale));

            // Updating database to mark selected adolfemale
            MainApp.selectedPreg1st = String.valueOf(sno - 1);
            MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedPreg1st));
            db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "4");

            // Updating adapter
            MainApp.familyList.get(Integer.parseInt(MainApp.selectedPreg1st)).setIndexed("4");
            familyMembersAdapter.notifyItemChanged(Integer.parseInt(MainApp.selectedPreg1st));
        }

        bi.btnRand.setVisibility(View.INVISIBLE);
        // bi.btnContinue.setVisibility(View.VISIBLE);
        bi.btnContinue.setEnabled(true);
        bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_green));
    }*/

  /*  private void displayAddMoreDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.title_mwra_dialog)
                .setMessage(String.format(getString(R.string.message_mwra_dialog_addmore), MainApp.form.getH220b()))

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(R.string.h111a, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                        addMoreMember();
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(R.string.h111b, null)
                .setIcon(R.drawable.ic_alert_24)
                .show();

    }

    private void displayProceedDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.title_mwra_dialog)
                .setMessage(String.format(getString(R.string.message_mwra_dialog_proceeed), MainApp.familyList.size() + "", MainApp.form.getH220b()))

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(R.string.h111a, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                        proceedSelect();
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(R.string.h111b, null)
                .setIcon(R.drawable.ic_alert_24)
                .show();

    }*/

    private void addMoreMember() {
        MainApp.familyMember = new FamilyMembers();
        Intent intent = new Intent(this, SectionA2Activity.class);
        //   finish();
        MemberInfoLauncher.launch(intent);
    }

    public void btnEnd(View view) {

        finish();
        // startActivity(new Intent(this, MainActivity.class));
        /*   } else {
               Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show()
           }*/
    }

/*    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if (requestCode == 2) {
            if (resultCode == Activity.RESULT_OK) {
                //   mwra.get(selectedMWRA).setExpanded(false);
                checkCompleteFm();
                mwraAdapter.notifyItemChanged(selectedMWRA);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                // Write your code if there's no result
                Toast.makeText(this, "Child for " + MainApp.familyList.get(selectedMWRA).getH221() + " was not added.", Toast.LENGTH_SHORT).show();
            }
        }
    }*/

    public void btnRand(View view) {

        if (childOfSelectedMWRAList.size() > 0 && MainApp.selectedChild.equals("")) {

          /*  if (MainApp.entryType == 1) {
                proceedSelect();
            }*/
            if (MainApp.entryType == 2) {
                showSelect();
            }
        } else {
            bi.btnRand.setVisibility(View.VISIBLE);
        }

    }

    private void showSelect() {

        bi.selectionLists.setVisibility(View.VISIBLE);
        bi.childList.setAdapter(null);

        // Populate Childs List
        if (childOfSelectedMWRAList.size() > 0) {
            childNames = new ArrayList<>();
            childSno = new ArrayList<>();
            motherSno = new ArrayList<>();

            childNames.add("...");
            childSno.add("...");
            motherSno.add("...");

            for (Integer c : childOfSelectedMWRAList) {

                childNames.add(MainApp.familyList.get(c - 1).getA202());
                childSno.add(MainApp.familyList.get(c - 1).getA201());
                motherSno.add(MainApp.familyList.get(c - 1).getA21301());

            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(FamilyMembersListActivity.this,
                    R.layout.custom_spinner, childNames);

            bi.childList.setAdapter(adapter);
            bi.childDD.setVisibility(View.VISIBLE);

            bi.childList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                    if (position == 0) return;
                    boolean isPresent = false;
                    if (!motherSno.get(position).equals("") && !motherSno.get(position).equals("97")) {
                        MainApp.selectedMWRA = String.valueOf(Integer.parseInt(motherSno.get(position)) - 1);
                        isPresent = MainApp.familyList.get(Integer.parseInt(motherSno.get(position)) - 1).getA214().equals("1");

                    }
                    if (isPresent) {
                        String motherName = MainApp.familyList.get(Integer.parseInt(motherSno.get(position)) - 1).getA202();
                        bi.motherName.setText(motherName);
                        bi.motherDD.setVisibility(View.VISIBLE);
                        bi.caregiverDD.setVisibility(View.GONE);
                        bi.caregiverList.setAdapter(null);
                    } else {
                        MainApp.selectedMWRA = "97";
                        caregiverNames = new ArrayList<>();
                        caregiverSno = new ArrayList<>();

                        caregiverNames.add("...");
                        caregiverSno.add("...");

                        for (Integer c : childOfSelectedMWRAList) {

                            caregiverNames.add(MainApp.familyList.get(c - 1).getA202());
                            caregiverSno.add(MainApp.familyList.get(c - 1).getA201());

                        }

                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FamilyMembersListActivity.this,
                                R.layout.custom_spinner, caregiverNames);

                        bi.caregiverList.setAdapter(adapter);
                        bi.caregiverDD.setVisibility(View.VISIBLE);
                        bi.motherDD.setVisibility(View.GONE);


                    }

                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        } else {
            bi.childDD.setVisibility(View.GONE);
        }

        // Populate BISP Recipients List
        if (recipientsList.size() > 0) {

            recipientNames = new ArrayList<>();
            recipientSno = new ArrayList<>();
            recipientNames.add("...");
            recipientSno.add("...");
            for (Integer am : recipientsList) {
                recipientNames.add(MainApp.familyList.get(am - 1).getA202());
                recipientSno.add(MainApp.familyList.get(am - 1).getA201());
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(FamilyMembersListActivity.this,
                    R.layout.custom_spinner, recipientNames);
            bi.recipientList.setAdapter(adapter);
            bi.recipienDD.setVisibility(View.VISIBLE);

        } else {
            bi.recipienDD.setVisibility(View.GONE);
        }
        bi.btnRand.setVisibility(View.INVISIBLE);
        // bi.btnContinue.setVisibility(View.VISIBLE);
        bi.btnContinue.setEnabled(true);
        bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_green));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_OK)

            // A213 is line number
            familyMembersAdapter.notifyItemInserted(Integer.parseInt(MainApp.familyMember.getA21301()) - 1);

    }

    public void finalizeFamily(View view) {
        if (bi.familyComplete.isChecked()) {
            if (childOfSelectedMWRAList.size() > 0 && selectedChildName.equals("")) {
                //MainApp.fm.get(Integer.parseInt(String.valueOf(MainApp.selectedMWRA))).setStatus("1");
                bi.btnRand.setVisibility(View.VISIBLE);
                // bi.btnContinue.setVisibility(View.INVISIBLE);
                bi.btnContinue.setEnabled(false);
                bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_gray));

            } else {
                bi.btnRand.setVisibility(View.INVISIBLE);
                // bi.btnContinue.setVisibility(View.VISIBLE);
                bi.btnContinue.setEnabled(true);
                bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_green));
            }
        } else {
            bi.btnRand.setVisibility(View.INVISIBLE);
            bi.btnContinue.setEnabled(false);
            bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_gray));


            //    bi.mwraList.setAdapter(null);
            bi.childList.setAdapter(null);
            //   bi.preg1stList.setAdapter(null);
            bi.recipientList.setAdapter(null);
            bi.selectionLists.setVisibility(View.GONE);
        }
    }

    public void btnProceed(View view) {
        if (formValidation()) {


            if (MainApp.childOfSelectedMWRAList.size() > 0 && bi.childList.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "Child not selected", Toast.LENGTH_SHORT).show();
                if (caregiverList.size() > 0 && bi.caregiverList.getSelectedItemPosition() == 0 && bi.motherName.getText().equals("")) {
                    Toast.makeText(this, "Caregiver not selected", Toast.LENGTH_SHORT).show();
                    return;
                }
                return;
            }

            if (recipientsList.size() > 0 && bi.recipientList.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "BISP Recipient not Selected", Toast.LENGTH_SHORT).show();
                return;
            }

            // CHILD
            // Updating database to mark selected Child
            selectedChild = String.valueOf(Integer.parseInt(childSno.get(bi.childList.getSelectedItemPosition())) - 1);
            selectedChildName = MainApp.familyList.get(Integer.parseInt(selectedChild)).getA202();
            MainApp.ageOfIndexChild = Integer.parseInt(MainApp.familyList.get(Integer.parseInt(selectedChild)).getA206y());
            MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(selectedChild));
            db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "1");

            // Updating adapter and notify Child selection
            MainApp.familyList.get(Integer.parseInt(selectedChild)).setIndexed("1");
            familyMembersAdapter.notifyItemChanged(Integer.parseInt(selectedChild));


            // Mother
            // Updating database to mark indexed child
            // MainApp.selectedMWRA = String.valueOf(Integer.parseInt(MainApp.familyList.get(Integer.parseInt(selectedChild)).getA21301()) - 1);
            if (!MainApp.selectedMWRA.equals("97")) {

                MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA));
                db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "2");

                // Updating adapter and notify child selection
                MainApp.familyList.get(Integer.parseInt(MainApp.selectedMWRA)).setIndexed("2");
                familyMembersAdapter.notifyItemChanged(Integer.parseInt(MainApp.selectedMWRA));
            } else {

                // CAREGIVER (if Mother not present at home)
                // Updating database to mark selected caregiver
                MainApp.selectedCaregiver = String.valueOf(Integer.parseInt(caregiverSno.get(bi.caregiverList.getSelectedItemPosition())) - 1);
                MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedCaregiver));
                db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "3");

                // Updating adapter and notify Caregiver selection
                MainApp.familyList.get(Integer.parseInt(MainApp.selectedCaregiver)).setIndexed("3");
                familyMembersAdapter.notifyItemChanged(Integer.parseInt(MainApp.selectedCaregiver));
            }


            // BISP RECIPIENTS
            // Updating database to mark selected BISP Recipent
            if (recipientsList.size() > 0) {
                MainApp.selectedRecipient = String.valueOf(Integer.parseInt(recipientSno.get(bi.recipientList.getSelectedItemPosition())) - 1);
                MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedRecipient));
                String idxStatus = MainApp.familyMember.getIndexed();

                db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, idxStatus + "R");

                // Updating adapter and notify BISP Recipent selection
                MainApp.familyList.get(Integer.parseInt(MainApp.selectedRecipient)).setIndexed(idxStatus + "R");
                familyMembersAdapter.notifyItemChanged(Integer.parseInt(MainApp.selectedRecipient));
            }

/*// ADOLESCENT FEMALE
            // Updating database to mark selected adolFemale
            if (pregFirstList.size() > 0) {
                MainApp.selectedPreg1st = String.valueOf(Integer.parseInt(preg1stSno.get(bi.preg1stList.getSelectedItemPosition())) - 1);
                MainApp.familyMember = MainApp.familyList.get(Integer.parseInt(MainApp.selectedPreg1st));
                db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_INDEXED, "4");

                // Updating adapter and notify Adolescent Female selection
                MainApp.familyList.get(Integer.parseInt(MainApp.selectedPreg1st)).setIndexed("4");
                familyMembersAdapter.notifyItemChanged(Integer.parseInt(MainApp.selectedPreg1st));
            }*/
            bi.selectionLists.setVisibility(View.GONE);
            bi.familyComplete.setEnabled(false);
            bi.btnContinue.setEnabled(true);
            bi.btnRand.setVisibility(View.INVISIBLE);

            bi.btnContinue.setBackground(getResources().getDrawable(R.drawable.button_shape_green));


        }

    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.selectionLists);
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