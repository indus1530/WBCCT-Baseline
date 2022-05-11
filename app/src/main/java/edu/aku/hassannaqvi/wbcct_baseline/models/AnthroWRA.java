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

import java.time.LocalDate;

import edu.aku.hassannaqvi.wbcct_baseline.BR;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.AnthroWRATable;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;

public class AnthroWRA extends BaseObservable implements Observable {

    private final String TAG = "AnthroWRA";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    //Not saving in DB
    private final LocalDate localDate = null;
    private final boolean exist = false;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String cluster = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String villageCode = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    //ModuleStatusVariables
    private String fstaa = _EMPTY_;
    private String fstab = _EMPTY_;
    private String fstab96x = _EMPTY_;

    // FIELD VARIABLES
    private String f201name = _EMPTY_;
    private String f201 = _EMPTY_;
    private String f202 = _EMPTY_;
    private String f20301 = _EMPTY_;
    private String f20302 = _EMPTY_;
    private String f20303 = _EMPTY_;
    private String f203m = _EMPTY_;
    private String f20401 = _EMPTY_;
    private String f20402 = _EMPTY_;
    private String f20403 = _EMPTY_;
    private String f204m = _EMPTY_;
    private String f205 = _EMPTY_;
    private String f206 = _EMPTY_;
    private String f207 = _EMPTY_;


    // Constructor
    public void AnthroWRA() {
    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyMember.getUid()); //// not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setVillageCode(MainApp.selectedVillage);
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
/*
    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }*/

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

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
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

    public String getVillageCode() {
        return villageCode;
    }

    private void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }


    @Bindable
    public String getF201name() {
        return f201name;
    }

    public void setF201name(String f201name) {
        this.f201name = f201name;
        notifyPropertyChanged(BR.f201name);
    }

    @Bindable
    public String getF201() {
        return f201;
    }

    public void setF201(String f201) {
        this.f201 = f201;
        notifyPropertyChanged(BR.f201);
    }

    @Bindable
    public String getF202() {
        return f202;
    }

    public void setF202(String f202) {
        this.f202 = f202;
        notifyPropertyChanged(BR.f202);
    }

    @Bindable
    public String getF20301() {
        return f20301;
    }

    public void setF20301(String f20301) {
        this.f20301 = f20301;
        if (f20301.length() > 0 && this.f20302.length() > 0) {
            setF20303((Float.parseFloat(f20301) - Float.parseFloat(this.f20302) >= 1)
                    || (Float.parseFloat(f20301) - Float.parseFloat(this.f20302) <= -1) ? this.f20303 : "");
            setF203m((Float.parseFloat(f20301) - Float.parseFloat(this.f20302) >= 1)
                    || (Float.parseFloat(f20301) - Float.parseFloat(this.f20302) <= -1) ? this.f203m : "");
        }
        notifyPropertyChanged(BR.f20301);
    }

    @Bindable
    public String getF20302() {
        return f20302;
    }

    public void setF20302(String f20302) {
        this.f20302 = f20302;
        if (this.f20301.length() > 0 && f20302.length() > 0) {
            setF20303((Float.parseFloat(this.f20301) - Float.parseFloat(f20302) >= 0.5)
                    || (Float.parseFloat(this.f20301) - Float.parseFloat(f20302) <= -0.5) ? this.f20303 : "");
            setF203m((Float.parseFloat(this.f20301) - Float.parseFloat(f20302) >= 0.5)
                    || (Float.parseFloat(this.f20301) - Float.parseFloat(f20302) <= -0.5) ? this.f203m : "");
        }
        notifyPropertyChanged(BR.f20302);
    }

    @Bindable
    public String getF20303() {
        return f20303;
    }

    public void setF20303(String f20303) {
        this.f20303 = f20303;
        notifyPropertyChanged(BR.f20303);
    }

    @Bindable
    public String getF203m() {
        return f203m;
    }

    public void setF203m(String f203m) {
        this.f203m = f203m;
        notifyPropertyChanged(BR.f203m);
    }

    @Bindable
    public String getF20401() {
        return f20401;
    }

    public void setF20401(String f20401) {
        this.f20401 = f20401;
        if (f20401.length() > 0 && this.f20402.length() > 0) {
            setF20403((Float.parseFloat(f20401) - Float.parseFloat(this.f20402) >= 1)
                    || (Float.parseFloat(f20401) - Float.parseFloat(this.f20402) <= -1) ? this.f20403 : "");
            setF204m((Float.parseFloat(f20401) - Float.parseFloat(this.f20402) >= 1)
                    || (Float.parseFloat(f20401) - Float.parseFloat(this.f20402) <= -1) ? this.f204m : "");
        }
        notifyPropertyChanged(BR.f20401);
    }

    @Bindable
    public String getF20402() {
        return f20402;
    }

    public void setF20402(String f20402) {
        this.f20402 = f20402;
        if (this.f20401.length() > 0 && f20402.length() > 0) {
            setF20403((Float.parseFloat(this.f20401) - Float.parseFloat(f20402) >= 1)
                    || (Float.parseFloat(this.f20401) - Float.parseFloat(f20402) <= -1) ? this.f20403 : "");
            setF204m((Float.parseFloat(this.f20401) - Float.parseFloat(f20402) >= 1)
                    || (Float.parseFloat(this.f20401) - Float.parseFloat(f20402) <= -1) ? this.f204m : "");
        }
        notifyPropertyChanged(BR.f20402);
    }

    @Bindable
    public String getF20403() {
        return f20403;
    }

    public void setF20403(String f20403) {
        this.f20403 = f20403;
        notifyPropertyChanged(BR.f20403);
    }

    @Bindable
    public String getF204m() {
        return f204m;
    }

    public void setF204m(String f204m) {
        this.f204m = f204m;
        notifyPropertyChanged(BR.f204m);
    }

    @Bindable
    public String getF205() {
        return f205;
    }

    public void setF205(String f205) {
        this.f205 = f205;
        notifyPropertyChanged(BR.f205);
    }

    @Bindable
    public String getF206() {
        return f206;
    }

    public void setF206(String f206) {
        this.f206 = f206;
        notifyPropertyChanged(BR.f206);
    }

    @Bindable
    public String getF207() {
        return f207;
    }

    public void setF207(String f207) {
        this.f207 = f207;
        notifyPropertyChanged(BR.f207);
    }

    @Bindable
    public String getFstaa() {
        return fstaa;
    }

    public void setFstaa(String fstaa) {
        this.fstaa = fstaa;
        setFstab(fstaa.equals("2") ? this.fstab : "");
        notifyPropertyChanged(BR.fstaa);
    }

    @Bindable
    public String getFstab() {
        return fstab;
    }

    public void setFstab(String fstab) {
        this.fstab = fstab;
        setFstab96x(fstab.equals("96") ? this.fstab96x : "");
        notifyPropertyChanged(BR.fstab);
    }

    @Bindable
    public String getFstab96x() {
        return fstab96x;
    }

    public void setFstab96x(String fstab96x) {
        this.fstab96x = fstab96x;
        notifyPropertyChanged(BR.fstab96x);
    }


    public AnthroWRA Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.AnthroWRATable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_PROJECT_NAME));
        this.villageCode = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_VILLAGE_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.AnthroWRATable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.AnthroWRATable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_SYNCED_DATE));

        sF2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AnthroWRATable.COLUMN_SF2)));

        return this;
    }

    public void sF2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f201name = json.getString("f201name");
            this.f201 = json.getString("f201");
            this.f202 = json.getString("f202");
            this.f20301 = json.getString("f20301");
            this.f20302 = json.getString("f20302");
            this.f20303 = json.getString("f20303");
            this.f203m = json.getString("f203m");
            this.f20401 = json.getString("f20401");
            this.f20402 = json.getString("f20402");
            this.f20403 = json.getString("f20403");
            this.f204m = json.getString("f204m");
            this.f205 = json.getString("f205");
            this.f206 = json.getString("f206");
            this.f207 = json.getString("f207");
            this.fstaa = json.getString("fstaa");
            this.fstab = json.getString("fstab");
            this.fstab96x = json.getString("fstab96x");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.AnthroWRATable.COLUMN_ID, this.id);
        json.put(AnthroWRATable.COLUMN_UID, this.uid);
        json.put(AnthroWRATable.COLUMN_PROJECT_NAME, this.projectName);

        json.put(AnthroWRATable.COLUMN_UUID, this.uuid);
        json.put(AnthroWRATable.COLUMN_HHID, this.hhid);
        // json.put(AnthroWRATable.COLUMN_MUID, this.muid);
        json.put(TableContracts.AnthroWRATable.COLUMN_SNO, this.sno);
        json.put(TableContracts.AnthroWRATable.COLUMN_FMUID, this.fmuid);
        json.put(AnthroWRATable.COLUMN_VILLAGE_CODE, this.villageCode);
        json.put(AnthroWRATable.COLUMN_USERNAME, this.userName);
        json.put(AnthroWRATable.COLUMN_SYSDATE, this.sysDate);
        json.put(AnthroWRATable.COLUMN_DEVICEID, this.deviceId);
        json.put(AnthroWRATable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(AnthroWRATable.COLUMN_ISTATUS, this.iStatus);
        json.put(AnthroWRATable.COLUMN_SYNCED, this.synced);
        json.put(AnthroWRATable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(AnthroWRATable.COLUMN_APPVERSION, this.appver);
        json.put(AnthroWRATable.COLUMN_SF2, new JSONObject(sF2toString()));

        return json;
    }

    public String sF2toString() throws JSONException {
        Log.d(TAG, "sF2toString: ");
        JSONObject json = new JSONObject();
        json.put("f201name", f201name)
                .put("f201", f201)
                .put("f202", f202)
                .put("f20301", f20301)
                .put("f20302", f20302)
                .put("f20303", f20303)
                .put("f203m", f203m)
                .put("f20401", f20401)
                .put("f20402", f20402)
                .put("f20403", f20403)
                .put("f204m", f204m)
                .put("f205", f205)
                .put("f206", f206)
                .put("f207", f207)
                .put("fstaa", fstaa)
                .put("fstab", fstab)
                .put("fstab96x", fstab96x);
        return json.toString();
    }


}
