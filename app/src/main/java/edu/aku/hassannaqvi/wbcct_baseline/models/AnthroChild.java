package edu.aku.hassannaqvi.wbcct_baseline.models;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.wbcct_baseline.BR;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.AnthroChildTable;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;

public class AnthroChild extends BaseObservable implements Observable {

    private final String TAG = "AnthroChild";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
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
    private String f101name = _EMPTY_;
    private String f101 = _EMPTY_;
    private String f102m = _EMPTY_;
    private String f102d = _EMPTY_;
    private String f103 = _EMPTY_;
    private String f10401 = _EMPTY_;
    private String f10402 = _EMPTY_;
    private String f10403 = _EMPTY_;
    private String f104m = _EMPTY_;
    private String f10501 = _EMPTY_;
    private String f10502 = _EMPTY_;
    private String f10503 = _EMPTY_;
    private String f105m = _EMPTY_;
    private String f10601 = _EMPTY_;
    private String f10602 = _EMPTY_;
    private String f10603 = _EMPTY_;
    private String f106m = _EMPTY_;
    private String f107 = _EMPTY_;
    private String f108 = _EMPTY_;
    private String f109 = _EMPTY_;


    public void AnthroChild() {
    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyMember.getUid()); //// not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setpsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getpsuCode() {
        return psuCode;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
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

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }


    @Bindable
    public String getF101name() {
        return f101name;
    }

    public void setF101name(String f101name) {
        this.f101name = f101name;
        notifyPropertyChanged(BR.f101name);
    }

    @Bindable
    public String getF101() {
        return f101;
    }

    public void setF101(String f101) {
        this.f101 = f101;
        notifyPropertyChanged(BR.f101);
    }

    @Bindable
    public String getF102m() {
        return f102m;
    }

    public void setF102m(String f102m) {
        this.f102m = f102m;
        notifyPropertyChanged(BR.f102m);
    }

    @Bindable
    public String getF102d() {
        return f102d;
    }

    public void setF102d(String f102d) {
        this.f102d = f102d;
        notifyPropertyChanged(BR.f102d);
    }

    @Bindable
    public String getF103() {
        return f103;
    }

    public void setF103(String f103) {
        this.f103 = f103;
        notifyPropertyChanged(BR.f103);
    }

    @Bindable
    public String getF10401() {
        return f10401;
    }

    public void setF10401(String f10401) {
        this.f10401 = f10401;
        if (f10401.length() > 0 && this.f10402.length() > 0) {
            setF10403((Float.parseFloat(f10401) - Float.parseFloat(this.f10402) >= 0.5)
                    || (Float.parseFloat(f10401) - Float.parseFloat(this.f10402) <= -0.5) ? this.f10403 : "");
            setF104m((Float.parseFloat(f10401) - Float.parseFloat(this.f10402) >= 0.5)
                    || (Float.parseFloat(f10401) - Float.parseFloat(this.f10402) <= -0.5) ? this.f104m : "");
        }
        notifyPropertyChanged(BR.f10401);
    }

    @Bindable
    public String getF10402() {
        return f10402;
    }

    public void setF10402(String f10402) {
        this.f10402 = f10402;
        if (this.f10401.length() > 0 && f10402.length() > 0) {
            setF10403((Float.parseFloat(this.f10401) - Float.parseFloat(f10402) >= 0.5)
                    || (Float.parseFloat(this.f10401) - Float.parseFloat(f10402) <= -0.5) ? this.f10403 : "");
            setF104m((Float.parseFloat(this.f10401) - Float.parseFloat(f10402) >= 0.5)
                    || (Float.parseFloat(this.f10401) - Float.parseFloat(f10402) <= -0.5) ? this.f104m : "");
        }
        notifyPropertyChanged(BR.f10402);
    }

    @Bindable
    public String getF10403() {
        return f10403;
    }

    public void setF10403(String f10403) {
        this.f10403 = f10403;
        notifyPropertyChanged(BR.f10403);
    }

    @Bindable
    public String getF104m() {
        return f104m;
    }

    public void setF104m(String f104m) {
        this.f104m = f104m;
        notifyPropertyChanged(BR.f104m);
    }

    @Bindable
    public String getF10501() {
        return f10501;
    }

    public void setF10501(String f10501) {
        this.f10501 = f10501;
        if (f10501.length() > 0 && this.f10502.length() > 0) {
            setF10503((Float.parseFloat(f10501) - Float.parseFloat(this.f10502) >= 0.5)
                    || (Float.parseFloat(f10501) - Float.parseFloat(this.f10502) <= -0.5) ? this.f10503 : "");
            setF105m((Float.parseFloat(f10501) - Float.parseFloat(this.f10502) >= 0.5)
                    || (Float.parseFloat(f10501) - Float.parseFloat(this.f10502) <= -0.5) ? this.f105m : "");
        }
        notifyPropertyChanged(BR.f10501);
    }

    @Bindable
    public String getF10502() {
        return f10502;
    }

    public void setF10502(String f10502) {
        this.f10502 = f10502;
        if (this.f10501.length() > 0 && f10502.length() > 0) {
            setF10503((Float.parseFloat(this.f10501) - Float.parseFloat(f10502) >= 0.5)
                    || (Float.parseFloat(this.f10501) - Float.parseFloat(f10502) <= -0.5) ? this.f10503 : "");
            setF105m((Float.parseFloat(this.f10501) - Float.parseFloat(f10502) >= 0.5)
                    || (Float.parseFloat(this.f10501) - Float.parseFloat(f10502) <= -0.5) ? this.f105m : "");
        }
        notifyPropertyChanged(BR.f10502);
    }

    @Bindable
    public String getF10503() {
        return f10503;
    }

    public void setF10503(String f10503) {
        this.f10503 = f10503;
        notifyPropertyChanged(BR.f10503);
    }

    @Bindable
    public String getF105m() {
        return f105m;
    }

    public void setF105m(String f105m) {
        this.f105m = f105m;
        notifyPropertyChanged(BR.f105m);
    }

    @Bindable
    public String getF10601() {
        return f10601;
    }

    public void setF10601(String f10601) {
        this.f10601 = f10601;
        if (f10601.length() > 0 && this.f10602.length() > 0) {
            setF10603((Float.parseFloat(f10601) - Float.parseFloat(this.f10602) >= 0.5)
                    || (Float.parseFloat(f10601) - Float.parseFloat(this.f10602) <= -0.5) ? this.f10603 : "");
            setF106m((Float.parseFloat(f10601) - Float.parseFloat(this.f10602) >= 0.5)
                    || (Float.parseFloat(f10601) - Float.parseFloat(this.f10602) <= -0.5) ? this.f106m : "");
        }
        notifyPropertyChanged(BR.f10601);
    }

    @Bindable
    public String getF10602() {
        return f10602;
    }

    public void setF10602(String f10602) {
        this.f10602 = f10602;
        if (this.f10601.length() > 0 && f10602.length() > 0) {
            setF10603((Float.parseFloat(this.f10601) - Float.parseFloat(f10602) >= 0.5)
                    || (Float.parseFloat(this.f10601) - Float.parseFloat(f10602) <= -0.5) ? this.f10603 : "");
            setF106m((Float.parseFloat(this.f10601) - Float.parseFloat(f10602) >= 0.5)
                    || (Float.parseFloat(this.f10601) - Float.parseFloat(f10602) <= -0.5) ? this.f106m : "");
        }
        notifyPropertyChanged(BR.f10602);
    }

    @Bindable
    public String getF10603() {
        return f10603;
    }

    public void setF10603(String f10603) {
        this.f10603 = f10603;
        notifyPropertyChanged(BR.f10603);
    }

    @Bindable
    public String getF106m() {
        return f106m;
    }

    public void setF106m(String f106m) {
        this.f106m = f106m;
        notifyPropertyChanged(BR.f106m);
    }

    @Bindable
    public String getF107() {
        return f107;
    }

    public void setF107(String f107) {
        this.f107 = f107;
        notifyPropertyChanged(BR.f107);
    }

    @Bindable
    public String getF108() {
        return f108;
    }

    public void setF108(String f108) {
        this.f108 = f108;
        notifyPropertyChanged(BR.f108);
    }

    @Bindable
    public String getF109() {
        return f109;
    }

    public void setF109(String f109) {
        this.f109 = f109;
        notifyPropertyChanged(BR.f109);
    }


    public AnthroChild Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_FMUID));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_SYNCED_DATE));

        sF1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AnthroChildTable.COLUMN_SF1)));

        return this;
    }

    public void sF1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f101name = json.getString("f101name");
            this.f101 = json.getString("f101");
            this.f102m = json.has("f102m") ? json.getString("f102m") : "";
            this.f102d = json.has("f102d") ? json.getString("f102d") : "";
            this.f103 = json.getString("f103");
            this.f10401 = json.getString("f10401");
            this.f10402 = json.getString("f10402");
            this.f10403 = json.getString("f10403");
            this.f104m = json.getString("f104m");
            this.f10501 = json.getString("f10501");
            this.f10502 = json.getString("f10502");
            this.f10503 = json.getString("f10503");
            this.f105m = json.getString("f105m");
            this.f10601 = json.getString("f10601");
            this.f10602 = json.getString("f10602");
            this.f10603 = json.getString("f10603");
            this.f106m = json.getString("f106m");
            this.f107 = json.getString("f107");
            this.f108 = json.getString("f108");
            this.f109 = json.getString("f109");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(AnthroChildTable.COLUMN_ID, this.id);
        json.put(AnthroChildTable.COLUMN_UID, this.uid);
        json.put(AnthroChildTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(AnthroChildTable.COLUMN_HHID, this.hhid);
        json.put(AnthroChildTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(AnthroChildTable.COLUMN_UUID, this.uuid);
        json.put(AnthroChildTable.COLUMN_FMUID, this.fmuid);
        json.put(AnthroChildTable.COLUMN_SNO, this.sno);
        json.put(AnthroChildTable.COLUMN_USERNAME, this.userName);
        json.put(AnthroChildTable.COLUMN_SYSDATE, this.sysDate);
        json.put(AnthroChildTable.COLUMN_DEVICEID, this.deviceId);
        json.put(AnthroChildTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(AnthroChildTable.COLUMN_ISTATUS, this.iStatus);
        json.put(AnthroChildTable.COLUMN_SYNCED, this.synced);
        json.put(AnthroChildTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(AnthroChildTable.COLUMN_APPVERSION, this.appver);
        json.put(AnthroChildTable.COLUMN_SF1, new JSONObject(sF1toString()));

        return json;
    }

    public String sF1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
        JSONObject json = new JSONObject();
        json.put("f101name", f101name)
                .put("f101", f101)
                .put("f102m", f102m)
                .put("f102d", f102d)
                .put("f103", f103)
                .put("f10401", f10401)
                .put("f10402", f10402)
                .put("f10403", f10403)
                .put("f104m", f104m)
                .put("f10501", f10501)
                .put("f10502", f10502)
                .put("f10503", f10503)
                .put("f105m", f105m)
                .put("f10601", f10601)
                .put("f10602", f10602)
                .put("f10603", f10603)
                .put("f106m", f106m)
                .put("f107", f107)
                .put("f108", f108)
                .put("f109", f109);
        return json.toString();
    }

}
