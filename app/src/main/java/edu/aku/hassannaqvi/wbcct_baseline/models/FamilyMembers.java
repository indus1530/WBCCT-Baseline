package edu.aku.hassannaqvi.wbcct_baseline.models;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Base64;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

import edu.aku.hassannaqvi.wbcct_baseline.BR;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.FamilyMembersTable;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;


public class FamilyMembers extends BaseObservable implements Observable {

    private final String TAG = "FamilyMembers";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private final String a215x = _EMPTY_;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    // FIELD VARIABLES
    private String sa2name = _EMPTY_;
    private String a201 = _EMPTY_;
    private String a202 = _EMPTY_;
    private String a203 = _EMPTY_;
    private String a20396x = _EMPTY_;
    private String a204 = _EMPTY_;
    private String a205d = _EMPTY_;
    private String a205m = _EMPTY_;
    private String a205y = _EMPTY_;
    private String a206y = _EMPTY_;
    private String a206m = _EMPTY_;
    private String a206d = _EMPTY_;
    private long ageMon = 0;
    private String a207 = _EMPTY_;
    private String a20701 = _EMPTY_;
    private String a20702 = _EMPTY_;
    private String a20703 = _EMPTY_;
    private String a20704 = _EMPTY_;
    private String a20705 = _EMPTY_;
    private String a20796 = _EMPTY_;
    private String a20796x = _EMPTY_;
    private String a208 = _EMPTY_;
    private String a209 = _EMPTY_;
    private String a210 = _EMPTY_;
    private String a211 = _EMPTY_;
    private String a212 = _EMPTY_;
    private String a21296x = _EMPTY_;
    private String a21301 = _EMPTY_;
    private String a21302 = _EMPTY_;
    private String a214 = _EMPTY_;
    private String a215 = _EMPTY_;
    private boolean expanded;
    private boolean mwra;
    private long ageInMonths;
    private String indexed = _EMPTY_;
    private String memCate = _EMPTY_;

    public FamilyMembers() {
    }


    public void populateMeta() {
        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.form.getUserName());
        setDeviceId(MainApp.form.getDeviceId());
        setUuid(MainApp.form.getUid());
        setAppver(MainApp.form.getAppver());
        setpsuCode(MainApp.form.getPsuCode());
        setHhid(MainApp.form.getHhid());
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Bindable
    public String getpsuCode() {
        return psuCode;
    }

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }


    @Bindable
    public String getSa2name() {
        return sa2name;
    }

    public void setSa2name(String sa2name) {
        this.sa2name = sa2name;
        notifyPropertyChanged(BR.sa2name);
    }

    @Bindable
    public String getA201() {
        return a201;
    }

    public void setA201(String a201) {
        this.a201 = a201;
        setA215(a201.equals("1") ? this.a215 : "");
        notifyPropertyChanged(BR.a201);
    }

    @Bindable
    public String getA202() {
        return a202;
    }

    public void setA202(String a202) {
        this.a202 = a202;
        notifyPropertyChanged(BR.a202);
    }

    @Bindable
    public String getA203() {
        return a203;
    }

    public void setA203(String a203) {
        this.a203 = a203;
        setA20396x(a203.equals("96") ? this.a20396x : "");
        notifyPropertyChanged(BR.a203);
    }

    @Bindable
    public String getA20396x() {
        return a20396x;
    }

    public void setA20396x(String a20396x) {
        this.a20396x = a20396x;
        notifyPropertyChanged(BR.a20396x);
    }

    @Bindable
    public String getA204() {
        return a204;
    }

    public void setA204(String a204) {
        this.a204 = a204;
        setA209(a204.equals("2") ? this.a209 : "");
        updateMemCategory();
        notifyPropertyChanged(BR.a204);
    }

    @Bindable
    public String getA205d() {
        return a205d;
    }

    public void setA205d(String a205d) {
        this.a205d = a205d;
        CaluculateAge();
        notifyPropertyChanged(BR.a205d);
    }

    @Bindable
    public String getA205m() {
        return a205m;
    }

    public void setA205m(String a205m) {
        this.a205m = a205m;
        if (a205m.equals("98")) {
            setA205d("98");
        }
        CaluculateAge();
        notifyPropertyChanged(BR.a205m);
    }

    @Bindable
    public String getA205y() {
        return a205y;
    }

    public void setA205y(String a205y) {
        this.a205y = a205y;
        if (a205y.equals("9998")) {
            setA205m("98");
            setA206d("");
            setA206m("");
            setA206y("");
        }
        // Calculate age
        CaluculateAge();
        notifyPropertyChanged(BR.a205y);
    }


    @Bindable
    public String getA206y() {
        return a206y;
    }

    public void setA206y(String a206y) {
        this.a206y = a206y;
        boolean b = a206y.length() > 0 && Integer.parseInt(a206y) < 11;
        setA208(b ? "" : this.a208);
        setA209(b ? "" : this.a209);
        setA210(b ? "" : this.a210);
        setA211(a206y.length() > 0 && Integer.parseInt(a206y) < 3 ? "" : this.a211);
        setA212(a206y.length() > 0 && Integer.parseInt(a206y) < 10 ? "" : this.a212);
        boolean b1 = a206y.length() > 0 && Integer.parseInt(a206y) > 4;
        setA21301(b1 ? "" : this.a21301);
        setA21302(b1 ? "" : this.a21302);
        setAgeMon();
        updateMemCategory();
        notifyPropertyChanged(BR.a206y);
    }


    @Bindable
    public String getA206m() {
        return a206m;
    }

    public void setA206m(String a206m) {
        this.a206m = a206m;
        setAgeMon();
        notifyPropertyChanged(BR.a206m);
    }


    @Bindable
    public String getA206d() {
        return a206d;
    }

    public void setA206d(String a206d) {
        this.a206d = a206d;
        //  setAgeMon();
        notifyPropertyChanged(BR.a206d);
    }


    @Bindable
    public long getAgeMon() {
        return ageMon;
    }

    public void setAgeMon() {
        this.ageMon = 0;
        if (!this.a206m.isEmpty() && !this.a206y.isEmpty()) {
            this.ageMon = Integer.parseInt(this.a206y) * 12L
                    + Integer.parseInt(this.a206m);

        }
        notifyPropertyChanged(BR.ageMon);
    }


    @Bindable
    public String getA207() {
        return a207;
    }

    public void setA207(String a207) {
        this.a207 = a207;
        notifyPropertyChanged(BR.a207);
    }

    @Bindable
    public String getA20701() {
        return a20701;
    }

    public void setA20701(String a20701) {
        if (this.a20701.equals(a20701)) return;
        this.a20701 = a20701;
        updateMemCategory();
        notifyPropertyChanged(BR.a20701);
    }

    @Bindable
    public String getA20702() {
        return a20702;
    }

    public void setA20702(String a20702) {
        if (this.a20702.equals(a20702)) return;
        this.a20702 = a20702;
        updateMemCategory();
        notifyPropertyChanged(BR.a20702);
    }

    @Bindable
    public String getA20703() {
        return a20703;
    }

    public void setA20703(String a20703) {
        if (this.a20703.equals(a20703)) return;
        this.a20703 = a20703;
        updateMemCategory();
        notifyPropertyChanged(BR.a20703);
    }

    @Bindable
    public String getA20704() {
        return a20704;
    }

    public void setA20704(String a20704) {
        if (this.a20704.equals(a20704)) return;
        this.a20704 = a20704;
        updateMemCategory();
        notifyPropertyChanged(BR.a20704);
    }

    @Bindable
    public String getA20705() {
        return a20705;
    }

    public void setA20705(String a20705) {
        if (this.a20705.equals(a20705)) return;
        this.a20705 = a20705;
        setA20701(a20705.equals("5") ? "" : this.a20701);
        setA20702(a20705.equals("5") ? "" : this.a20702);
        setA20703(a20705.equals("5") ? "" : this.a20703);
        setA20704(a20705.equals("5") ? "" : this.a20704);
        setA20796(a20705.equals("5") ? "" : this.a20796);
        updateMemCategory();
        notifyPropertyChanged(BR.a20705);
    }

    @Bindable
    public String getA20796() {
        return a20796;
    }

    public void setA20796(String a20796) {
        if (this.a20796.equals(a20796)) return;
        this.a20796 = a20796;
        setA20796x(a20796.equals("96") ? this.a20796x : "");
        updateMemCategory();
        notifyPropertyChanged(BR.a20796);
    }

    @Bindable
    public String getA20796x() {
        return a20796x;
    }

    public void setA20796x(String a20796x) {
        this.a20796x = a20796x;
        notifyPropertyChanged(BR.a20796x);
    }

    @Bindable
    public String getA208() {
        return a208;
    }

    public void setA208(String a208) {
        this.a208 = a208;
        setA209(a208.equals("5") ? "" : this.a209);
        updateMemCategory();
        notifyPropertyChanged(BR.a208);
    }

    @Bindable
    public String getA209() {
        return a209;
    }

    public void setA209(String a209) {
        this.a209 = a209;
        setA210(a209.equals("1") ? this.a210 : "");
        notifyPropertyChanged(BR.a209);
    }

    @Bindable
    public String getA210() {
        return a210;
    }

    public void setA210(String a210) {
        this.a210 = a210;
        notifyPropertyChanged(BR.a210);
    }

    @Bindable
    public String getA211() {
        return a211;
    }

    public void setA211(String a211) {
        this.a211 = a211;
        notifyPropertyChanged(BR.a211);
    }

    @Bindable
    public String getA212() {
        return a212;
    }

    public void setA212(String a212) {
        this.a212 = a212;
        setA21296x(a212.equals("96") ? this.a21296x : "");
        notifyPropertyChanged(BR.a212);
    }

    @Bindable
    public String getA21296x() {
        return a21296x;
    }

    public void setA21296x(String a21296x) {
        this.a21296x = a21296x;
        notifyPropertyChanged(BR.a21296x);
    }

    @Bindable
    public String getA21301() {
        return a21301;
    }

    public void setA21301(String a21301) {
        this.a21301 = a21301;
        notifyPropertyChanged(BR.a21301);
    }

    @Bindable
    public String getA21302() {
        return a21302;
    }

    public void setA21302(String a21302) {
        this.a21302 = a21302;
        notifyPropertyChanged(BR.a21302);
    }

    @Bindable
    public String getA214() {
        return a214;
    }

    public void setA214(String a214) {
        this.a214 = a214;
        updateMemCategory();
        notifyPropertyChanged(BR.a214);
    }

    @Bindable
    public String getA215() {
        //return a215;
        if (a215.length() > 2) {
            String xString = new String(Base64.decode(new StringBuilder(a215).reverse().toString(), Base64.NO_WRAP));
            Log.d(TAG, "getA215: " + xString);
            return xString.substring(0, xString.length() - 2);
        } else {
            return a215;
        }
    }

    public void setA215(String a215) {
        this.a215 = a215 + "" + (new Random().nextInt(99 - 10 + 1) + 10);
        this.a215 = new StringBuilder(Base64.encodeToString(this.a215.getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP)).reverse().toString();
        Log.d(TAG, "setA215: " + this.a215);
        //this.a215 = a215;
        notifyPropertyChanged(BR.a215);
    }

    /*@Bindable
    public String getA215x() {
        String xString = new String(Base64.decode(new StringBuilder(a215x).reverse().toString(), Base64.NO_WRAP));
        return this.a215 = xString.substring(0, xString.length() - 2);
    }

    public void setA215x() {
        this.a215x = a215 + "" + (new Random().nextInt(9 - 0 + 1) + 0);
        this.a215x = new StringBuilder(Base64.encodeToString((a215).getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP)).reverse().toString();
    }*/


    @Bindable
    public boolean isMwra() {
        return mwra;
    }

    public void setMwra(boolean mwra) {
        this.mwra = mwra;

        notifyPropertyChanged(BR.mwra);
    }

    public String getMemCate() {
        return memCate;
    }

    public void setMemCate(String memCate) {
        this.memCate = memCate;
        // notifyPropertyChanged(BR.memCate);
    }

    @Bindable
    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String Indexed) {
        this.indexed = Indexed;
        notifyPropertyChanged(BR.indexed);
    }

    public FamilyMembers Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_UUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SNO));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_INDEXED));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYNCED_DATE));

        sA2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SA2)));
        updateMemCategory();

        return this;
    }

    public void sA2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.sa2name = json.getString("sa2name");
            this.a201 = json.getString("a201");
            this.a202 = json.getString("a202");
            this.a203 = json.getString("a203");
            this.a20396x = json.getString("a20396x");
            this.a204 = json.getString("a204");
            this.a205d = json.getString("a205d");
            this.a205m = json.getString("a205m");
            this.a205y = json.getString("a205y");
            this.a206y = json.getString("a206y");
            this.a206m = json.getString("a206m");
            this.a206d = json.getString("a206d");
            this.ageMon = json.getLong("ageMon");
            this.a207 = json.getString("a207");
            this.a20701 = json.getString("a20701");
            this.a20702 = json.getString("a20702");
            this.a20703 = json.getString("a20703");
            this.a20704 = json.getString("a20704");
            this.a20705 = json.getString("a20705");
            this.a20796 = json.getString("a20796");
            this.a20796x = json.getString("a20796x");
            this.a208 = json.getString("a208");
            this.a209 = json.getString("a209");
            this.a210 = json.getString("a210");
            this.a211 = json.getString("a211");
            this.a212 = json.getString("a212");
            this.a21296x = json.getString("a21296x");
            this.a21301 = json.getString("a21301");
            this.a21302 = json.getString("a21302");
            this.a214 = json.getString("a214");
            this.a215 = json.has("215") ? json.getString("a215") : "";
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FamilyMembersTable.COLUMN_ID, this.id);
        json.put(FamilyMembersTable.COLUMN_UID, this.uid);
        json.put(FamilyMembersTable.COLUMN_UUID, this.uuid);
        json.put(FamilyMembersTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FamilyMembersTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(FamilyMembersTable.COLUMN_HHID, this.hhid);
        json.put(FamilyMembersTable.COLUMN_INDEXED, this.indexed);
        json.put(FamilyMembersTable.COLUMN_SNO, this.sno);
        json.put(FamilyMembersTable.COLUMN_USERNAME, this.userName);
        json.put(FamilyMembersTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FamilyMembersTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FamilyMembersTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FamilyMembersTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FamilyMembersTable.COLUMN_SYNCED, this.synced);
        json.put(FamilyMembersTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(FamilyMembersTable.COLUMN_APPVERSION, this.appver);

        json.put(FamilyMembersTable.COLUMN_SA2, new JSONObject(sA2toString()));
        return json;
    }

    public String sA2toString() throws JSONException {
        Log.d(TAG, "sA2toString: ");
        JSONObject json = new JSONObject();
        json.put("sa2name", sa2name)
                .put("a201", a201)
                .put("a202", a202)
                .put("a203", a203)
                .put("a20396x", a20396x)
                .put("a204", a204)
                .put("a205d", a205d)
                .put("a205m", a205m)
                .put("a205y", a205y)
                .put("a206y", a206y)
                .put("a206m", a206m)
                .put("a206d", a206d)
                .put("ageMon", ageMon)
                .put("a207", a207)
                .put("a20701", a20701)
                .put("a20702", a20702)
                .put("a20703", a20703)
                .put("a20704", a20704)
                .put("a20705", a20705)
                .put("a20796", a20796)
                .put("a20796x", a20796x)
                .put("a208", a208)
                .put("a209", a209)
                .put("a210", a210)
                .put("a211", a211)
                .put("a212", a212)
                .put("a21296x", a21296x)
                .put("a21301", a21301)
                .put("a21302", a21302)
                .put("a214", a214)
                .put("a215", a215);
        return json.toString();
    }

    private void CaluculateAge() {
        Log.d(TAG, "CaluculateAge: " + this.a205y + "-" + this.a205m + "-" + this.a205d);

        if (!this.a205y.equals("") && !this.a205y.equals("9998") && !this.a205m.equals("") && !this.a205d.equals("")) {

            if ((Integer.parseInt(this.a205m) > 12 && !this.a205m.equals("98")) || (Integer.parseInt(this.a205d) > 31 && !this.a205d.equals("98")) || Integer.parseInt(this.a205y) < 1920) {
                setA206y("");
                setA206m("");
                setA206d("");
                this.ageInMonths = 0;
                return;
            }


            // set current Date
            int curDay = MainApp.form != null && !MainApp.form.getA108d().isEmpty()
                    ? Integer.parseInt(MainApp.form.getA108d())
                    : Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
            int curMonth = MainApp.form != null && !MainApp.form.getA108m().isEmpty()
                    ? Integer.parseInt(MainApp.form.getA108m())
                    : Calendar.getInstance().get(Calendar.MONTH) + 1;
            int curYear = MainApp.form != null && !MainApp.form.getA108y().isEmpty()
                    ? Integer.parseInt(MainApp.form.getA108y())
                    : Calendar.getInstance().get(Calendar.YEAR);
            Calendar cur = Calendar.getInstance();


            // set Date of birth
            int day = !this.a205d.equals("98") ? Integer.parseInt(this.a205d) : 15;
            int month = !this.a205m.equals("98") ? Integer.parseInt(this.a205m) : 6;
            int year = Integer.parseInt(this.a205y);
            Calendar cal = Calendar.getInstance();

            SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);

            try {
                cal.setTime(df.parse(year + " " + month + " " + day));
                cur.setTime(df.parse(curYear + " " + curMonth + " " + curDay));

                long millis = cur.getTimeInMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

                this.ageInMonths = MILLISECONDS.toDays(millis) / 30;
                long tYear = MILLISECONDS.toDays(millis) / 365;
                long tMonth = (MILLISECONDS.toDays(millis) - (tYear * 365)) / 30;
                long tDay = MILLISECONDS.toDays(millis) - ((tYear * 365) + (tMonth * 30));

                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);

                setA206y(String.valueOf(tYear));
                setA206m(String.valueOf(tMonth));
                setA206d(String.valueOf(tDay));
                if (tYear < 0)
                    setA206y("");

            } catch (ParseException e) {
                Log.d(TAG, "CaluculateAge: " + e.getMessage());
                e.printStackTrace();

            }
        }
    }

    /**
     * Memeber Categories:
     * 1 = MWRA
     * 2 = Child
     * 3 = Adol Male // not used in this project
     * 4 = Adol Female
     */
    private void updateMemCategory() {
        if (a204.equals("") || a206y.equals("") || a208.equals("") || !a214.equals("1")) return;
        String memGender = getA204();
        String memMaritalStatus = getA208();
        boolean memBISP = !getA20705().equals("5");
        int memAge = Integer.parseInt(getA206y());

        // MWRA
        if (memGender.equals("2")                // Female
                && memAge >= 15 && memAge <= 49   // 15 to 49 year old
                && !memMaritalStatus.equals("5")
        ) {
            setMemCate("1");
        }

        // Child
        if (memAge < 5
            //TODO: Need to Check
            //&& !hl8.equals("") && !hl8.equals("97")
        ) {
            setMemCate("2");
        }

        // PW
        if (getA210().equals("1")
        ) {
            setMemCate("3");
        }
        // BISP Recipient
        if (memBISP) {
            setMemCate(getMemCate() + "R");
        }

    }
}
