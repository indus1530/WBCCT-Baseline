package edu.aku.hassannaqvi.wbcct_baseline.ui.sections;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.child;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.wbcct_baseline.R;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.database.DatabaseHelper;
import edu.aku.hassannaqvi.wbcct_baseline.databinding.ActivitySectionD3Binding;
import edu.aku.hassannaqvi.wbcct_baseline.ui.EndingActivity;


public class SectionD3Activity extends AppCompatActivity {

    private static final String TAG = "SectionD3Activity";
    ActivitySectionD3Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d3);
        bi.setChild(child);
        db = MainApp.appInfo.dbHelper;
        setSupportActionBar(bi.toolbar);
        setupSkips();
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
    }

    private void setupSkips() {

        bi.d304y.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.d304y.getText().toString().isEmpty()) return;
                bi.d304d.setMaxvalue(Integer.parseInt(bi.d304y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
                bi.d304m.setMaxvalue(Integer.parseInt(bi.d304y.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


        setDefault(bi.d30501d, bi.d30501m, bi.d30501y);
        setDefault(bi.d30502d, bi.d30502m, bi.d30502y);
        setDefault(bi.d30503d, bi.d30503m, bi.d30503y);
        setDefault(bi.d30504d, bi.d30504m, bi.d30504y);
        setDefault(bi.d30505d, bi.d30505m, bi.d30505y);
        setDefault(bi.d30506d, bi.d30506m, bi.d30506y);
        setDefault(bi.d30507d, bi.d30507m, bi.d30507y);
        setDefault(bi.d30508d, bi.d30508m, bi.d30508y);
        setDefault(bi.d30509d, bi.d30509m, bi.d30509y);
        setDefault(bi.d30510d, bi.d30510m, bi.d30510y);
        setDefault(bi.d30511d, bi.d30511m, bi.d30511y);
        setDefault(bi.d30512d, bi.d30512m, bi.d30512y);
        setDefault(bi.d30513d, bi.d30513m, bi.d30513y);
        setDefault(bi.d30514d, bi.d30514m, bi.d30514y);
        setDefault(bi.d30515d, bi.d30515m, bi.d30515y);
        setDefault(bi.d30516d, bi.d30516m, bi.d30516y);
    }


    private void setDefault(EditTextPicker day, EditTextPicker mon, EditTextPicker year) {
        day.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (day.getText().toString().isEmpty()) return;
                mon.setEnabled(true);
                year.setEnabled(true);
                if (Integer.parseInt(day.getText().toString()) == 44) {
                    day.setRangedefaultvalue(44f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
                if (Integer.parseInt(day.getText().toString()) == 66) {
                    day.setRangedefaultvalue(66f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
                if (Integer.parseInt(day.getText().toString()) == 88) {
                    day.setRangedefaultvalue(88f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
                if (Integer.parseInt(day.getText().toString()) == 97) {
                    day.setRangedefaultvalue(97f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        year.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (year.getText().toString().isEmpty()) return;
                day.setMaxvalue(Integer.parseInt(year.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
                mon.setMaxvalue(Integer.parseInt(year.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SD3, child.sD3toString());
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
            finish();
            startActivity(new Intent(this, SectionD4Activity.class));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean validateDatesBCG(String baseDate, String forwardDate) {
        if (baseDate.length() < 8 || forwardDate.length() < 8)
            return true;
        try {
            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done

            return forwardCal.getTimeInMillis() >= baseCal.getTimeInMillis();


        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "ParseException(setDateRanges()): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private boolean validateDates(String baseDate, String forwardDate) {
        if (baseDate.length() < 8 || forwardDate.length() < 8)
            return true;

        try {
            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done

            return forwardCal.getTimeInMillis() > baseCal.getTimeInMillis();


        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "ParseException(setDateRanges()): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {

        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;

        if (child.getD302().equals("1")) {
            // Only set once
            // IM04 - DOB
            String dobDate = child.getD304y()
                    + "-" + child.getD304m()
                    + "-" + child.getD304d();

            //D30501
            String d30501date = child.getD30501y()
                    + "-" + child.getD30501m()
                    + "-" + child.getD30501d();
            if (!validateDatesBCG(dobDate, d30501date)) {
                return Validator.emptyCustomTextBox(this, bi.d30501y, "Vaccine Date Should be Greater Than DOB");
            }

            //D30502
            String d30502date = child.getD30502y()
                    + "-" + child.getD30502m()
                    + "-" + child.getD30502d();
            if (!validateDatesBCG(dobDate, d30502date)) {
                return Validator.emptyCustomTextBox(this, bi.d30502y, "Vaccine Date Should be Greater Than DOB");
            }


            //week6
            String week6 = child.getD30501y()
                    + "-" + child.getD30501m()
                    + "-" + child.getD30501d();

            // D30503
            String d30503date = child.getD30503y()
                    + "-" + child.getD30503m()
                    + "-" + child.getD30503d();
            if (!validateDates(week6, d30503date)) {
                return Validator.emptyCustomTextBox(this, bi.d30503y, "Vaccine Date Should be Greater Than BCG");
            }

            // D30504
            String d30504date = child.getD30504y()
                    + "-" + child.getD30504m()
                    + "-" + child.getD30504d();
            if (!validateDates(week6, d30504date)) {
                return Validator.emptyCustomTextBox(this, bi.d30504y, "Vaccine Date Should be Greater Than BCG");
            }

            // D30505
            String d30505date = child.getD30505y()
                    + "-" + child.getD30505m()
                    + "-" + child.getD30505d();
            if (!validateDates(week6, d30505date)) {
                return Validator.emptyCustomTextBox(this, bi.d30505y, "Vaccine Date Should be Greater Than BCG");
            }

            // D30506
            String d30506date = child.getD30506y()
                    + "-" + child.getD30506m()
                    + "-" + child.getD30506d();
            if (!validateDates(week6, d30506date)) {
                return Validator.emptyCustomTextBox(this, bi.d30506y, "Vaccine Date Should be Greater Than BCG");
            }


            //week10
            String week10 = child.getD30506y()
                    + "-" + child.getD30506m()
                    + "-" + child.getD30506d();

            // D30507
            String d30507date = child.getD30507y()
                    + "-" + child.getD30507m()
                    + "-" + child.getD30507d();
            if (!validateDates(week10, d30507date)) {
                return Validator.emptyCustomTextBox(this, bi.d30507y, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // D30508
            String d30508date = child.getD30508y()
                    + "-" + child.getD30508m()
                    + "-" + child.getD30508d();
            if (!validateDates(week10, d30508date)) {
                return Validator.emptyCustomTextBox(this, bi.d30508y, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // D30509
            String d30509date = child.getD30509y()
                    + "-" + child.getD30509m()
                    + "-" + child.getD30509d();
            if (!validateDates(week10, d30509date)) {
                return Validator.emptyCustomTextBox(this, bi.d30509y, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // D30510
            String d30510date = child.getD30510y()
                    + "-" + child.getD30510m()
                    + "-" + child.getD30510d();
            if (!validateDates(week10, d30510date)) {
                return Validator.emptyCustomTextBox(this, bi.d30510y, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }


            //week14
            String week14 = child.getD30510y()
                    + "-" + child.getD30510m()
                    + "-" + child.getD30510d();

            // D30511
            String d30511date = child.getD30511y()
                    + "-" + child.getD30511m()
                    + "-" + child.getD30511d();
            if (!validateDates(week14, d30511date)) {
                return Validator.emptyCustomTextBox(this, bi.d30511y, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }

            // D30512
            String d30512date = child.getD30512y()
                    + "-" + child.getD30512m()
                    + "-" + child.getD30512d();
            if (!validateDates(week14, d30512date)) {
                return Validator.emptyCustomTextBox(this, bi.d30512y, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }

            // D30513
            String d30513date = child.getD30513y()
                    + "-" + child.getD30513m()
                    + "-" + child.getD30513d();
            if (!validateDates(week14, d30513date)) {
                return Validator.emptyCustomTextBox(this, bi.d30513y, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }

            // D30514
            String d30514date = child.getD30514y()
                    + "-" + child.getD30514m()
                    + "-" + child.getD30514d();
            if (!validateDates(week14, d30514date)) {
                return Validator.emptyCustomTextBox(this, bi.d30514y, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }


            //month9
            String month9 = child.getD30514y()
                    + "-" + child.getD30514m()
                    + "-" + child.getD30514d();

            // D30515
            String d30515date = child.getD30515y()
                    + "-" + child.getD30515m()
                    + "-" + child.getD30515d();
            if (!validateDates(month9, d30515date)) {
                return Validator.emptyCustomTextBox(this, bi.d30515y, "Vaccine Date Should be Greater Than 14 Week Vaccine date");
            }


            //month15
            String month15 = child.getD30515y()
                    + "-" + child.getD30515m()
                    + "-" + child.getD30515d();

            // D30516
            String d30516date = child.getD30516y()
                    + "-" + child.getD30516m()
                    + "-" + child.getD30516d();
            if (!validateDates(month15, d30516date)) {
                return Validator.emptyCustomTextBox(this, bi.d30516y, "Vaccine Date Should be Greater Than NINE MONTH Vaccine date");
            }
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