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
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.WEDMTable;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;

public class WEDM extends BaseObservable implements Observable {

    private final String TAG = "WEDM";
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
    private String villageCode = _EMPTY_;
    private String hhid = _EMPTY_;
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
    private String istga = _EMPTY_;
    private String istgb = _EMPTY_;
    private String istgb96x = _EMPTY_;

    // FIELD VARIABLES
    private String sg1a = _EMPTY_;
    private String sg1b = _EMPTY_;
    private String sg1c = _EMPTY_;
    private String sg1d = _EMPTY_;
    private String sg2a = _EMPTY_;
    private String sg2b = _EMPTY_;
    private String sg2c = _EMPTY_;
    private String sg3a = _EMPTY_;
    private String sg3b = _EMPTY_;
    private String sg3c = _EMPTY_;
    private String sg3d = _EMPTY_;
    private String sg3e = _EMPTY_;
    private String sg3f = _EMPTY_;
    private String sg3g = _EMPTY_;
    private String sg3g01x = _EMPTY_;
    private String sg3gxx = _EMPTY_;
    private String sg4a = _EMPTY_;
    private String sg4b = _EMPTY_;
    private String sg4c = _EMPTY_;
    private String sg4d = _EMPTY_;
    private String sg4e = _EMPTY_;
    private String sg4f = _EMPTY_;
    private String sg5a = _EMPTY_;
    private String sg5b = _EMPTY_;
    private String sg5c = _EMPTY_;
    private String sg6a = _EMPTY_;
    private String sg6ar = _EMPTY_;
    private String sg6b = _EMPTY_;
    private String sg6br = _EMPTY_;
    private String sg7a = _EMPTY_;
    private String sg7ar = _EMPTY_;
    private String sg7b = _EMPTY_;
    private String sg7br = _EMPTY_;
    private String sg7c = _EMPTY_;
    private String sg7cr = _EMPTY_;
    private String sg7d = _EMPTY_;
    private String sg7dr = _EMPTY_;
    private String sg7e = _EMPTY_;
    private String sg7er = _EMPTY_;
    private String sg7f = _EMPTY_;
    private String sg7fr = _EMPTY_;
    private String sg7g = _EMPTY_;
    private String sg7g01x = _EMPTY_;
    private String sg7gxx = _EMPTY_;
    private String sg7gr = _EMPTY_;
    private String sg8a = _EMPTY_;
    private String sg8an = _EMPTY_;
    private String sg8ar = _EMPTY_;
    private String sg8b = _EMPTY_;
    private String sg8bn = _EMPTY_;
    private String sg8br = _EMPTY_;
    private String sg8c = _EMPTY_;
    private String sg8cn = _EMPTY_;
    private String sg8cr = _EMPTY_;
    private String sg8d = _EMPTY_;
    private String sg8dn = _EMPTY_;
    private String sg8dr = _EMPTY_;
    private String sg8e = _EMPTY_;
    private String sg8en = _EMPTY_;
    private String sg8er = _EMPTY_;
    private String sg9a = _EMPTY_;
    private String sg9ab = _EMPTY_;
    private String sg9b = _EMPTY_;
    private String sg9bb = _EMPTY_;
    private String sg9c = _EMPTY_;
    private String sg9cb = _EMPTY_;
    private String sg9d = _EMPTY_;
    private String sg9db = _EMPTY_;
    private String sg9e = _EMPTY_;
    private String sg9eb = _EMPTY_;
    private String sg9f = _EMPTY_;
    private String sg9fb = _EMPTY_;
    private String sg9g = _EMPTY_;
    private String sg9gb = _EMPTY_;
    private String sg9h = _EMPTY_;
    private String sg9hb = _EMPTY_;
    private String sg9i = _EMPTY_;
    private String sg9ib = _EMPTY_;
    private String sg9j = _EMPTY_;
    private String sg9jb = _EMPTY_;
    private String sg9k = _EMPTY_;
    private String sg9kb = _EMPTY_;
    private String sg9l = _EMPTY_;
    private String sg9lb = _EMPTY_;
    private String sg9m = _EMPTY_;
    private String sg9mb = _EMPTY_;
    private String sg9n = _EMPTY_;
    private String sg9nb = _EMPTY_;
    private String sg9o = _EMPTY_;
    private String sg9ob = _EMPTY_;
    private String sg9p = _EMPTY_;
    private String sg9pb = _EMPTY_;
    private String sg9q = _EMPTY_;
    private String sg9qb = _EMPTY_;
    private String sg10a = _EMPTY_;
    private String sg11a = _EMPTY_;
    private String sg12a = _EMPTY_;
    private String sg12ar = _EMPTY_;
    private String sg12an = _EMPTY_;
    private String sg12b = _EMPTY_;
    private String sg12br = _EMPTY_;
    private String sg12bn = _EMPTY_;
    private String sg12c = _EMPTY_;
    private String sg12cr = _EMPTY_;
    private String sg12cn = _EMPTY_;
    private String sg12d = _EMPTY_;
    private String sg12dr = _EMPTY_;
    private String sg12dn = _EMPTY_;
    private String sg12e = _EMPTY_;
    private String sg12er = _EMPTY_;
    private String sg12en = _EMPTY_;
    private String sg13a = _EMPTY_;
    private String sg14a = _EMPTY_;
    private String sg14b = _EMPTY_;
    private String sg14c = _EMPTY_;
    private String sg15a = _EMPTY_;
    private String sg15b = _EMPTY_;
    private String sg15c = _EMPTY_;


    // Constructor
    public void WEDM() {
    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setVillageCode(MainApp.villageCode);
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


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public String getVillageCode() {
        return villageCode;
    }

    private void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }


    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
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
    public String getSg1a() {
        return sg1a;
    }

    public void setSg1a(String sg1a) {
        this.sg1a = sg1a;
        notifyPropertyChanged(BR.sg1a);
    }

    @Bindable
    public String getSg1b() {
        return sg1b;
    }

    public void setSg1b(String sg1b) {
        this.sg1b = sg1b;
        notifyPropertyChanged(BR.sg1b);
    }

    @Bindable
    public String getSg1c() {
        return sg1c;
    }

    public void setSg1c(String sg1c) {
        this.sg1c = sg1c;
        notifyPropertyChanged(BR.sg1c);
    }

    @Bindable
    public String getSg1d() {
        return sg1d;
    }

    public void setSg1d(String sg1d) {
        this.sg1d = sg1d;
        notifyPropertyChanged(BR.sg1d);
    }

    @Bindable
    public String getSg2a() {
        return sg2a;
    }

    public void setSg2a(String sg2a) {
        this.sg2a = sg2a;
        notifyPropertyChanged(BR.sg2a);
    }

    @Bindable
    public String getSg2b() {
        return sg2b;
    }

    public void setSg2b(String sg2b) {
        this.sg2b = sg2b;
        notifyPropertyChanged(BR.sg2b);
    }

    @Bindable
    public String getSg2c() {
        return sg2c;
    }

    public void setSg2c(String sg2c) {
        this.sg2c = sg2c;
        notifyPropertyChanged(BR.sg2c);
    }

    @Bindable
    public String getSg3a() {
        return sg3a;
    }

    public void setSg3a(String sg3a) {
        this.sg3a = sg3a;
        notifyPropertyChanged(BR.sg3a);
    }

    @Bindable
    public String getSg3b() {
        return sg3b;
    }

    public void setSg3b(String sg3b) {
        this.sg3b = sg3b;
        notifyPropertyChanged(BR.sg3b);
    }

    @Bindable
    public String getSg3c() {
        return sg3c;
    }

    public void setSg3c(String sg3c) {
        this.sg3c = sg3c;
        notifyPropertyChanged(BR.sg3c);
    }

    @Bindable
    public String getSg3d() {
        return sg3d;
    }

    public void setSg3d(String sg3d) {
        this.sg3d = sg3d;
        notifyPropertyChanged(BR.sg3d);
    }

    @Bindable
    public String getSg3e() {
        return sg3e;
    }

    public void setSg3e(String sg3e) {
        this.sg3e = sg3e;
        notifyPropertyChanged(BR.sg3e);
    }

    @Bindable
    public String getSg3f() {
        return sg3f;
    }

    public void setSg3f(String sg3f) {
        this.sg3f = sg3f;
        notifyPropertyChanged(BR.sg3f);
    }

    @Bindable
    public String getSg3g() {
        return sg3g;
    }

    public void setSg3g(String sg3g) {
        this.sg3g = sg3g;
        setSg3g01x(sg3g.equals("1") ? this.sg3g01x : "");
        notifyPropertyChanged(BR.sg3g);
    }

    @Bindable
    public String getSg3g01x() {
        return sg3g01x;
    }

    public void setSg3g01x(String sg3g01x) {
        this.sg3g01x = sg3g01x;
        notifyPropertyChanged(BR.sg3g01x);
    }

    @Bindable
    public String getSg3gxx() {
        return sg3gxx;
    }

    public void setSg3gxx(String sg3gxx) {
        this.sg3gxx = sg3gxx;
        notifyPropertyChanged(BR.sg3gxx);
    }

    @Bindable
    public String getSg4a() {
        return sg4a;
    }

    public void setSg4a(String sg4a) {
        this.sg4a = sg4a;
        notifyPropertyChanged(BR.sg4a);
    }

    @Bindable
    public String getSg4b() {
        return sg4b;
    }

    public void setSg4b(String sg4b) {
        this.sg4b = sg4b;
        notifyPropertyChanged(BR.sg4b);
    }

    @Bindable
    public String getSg4c() {
        return sg4c;
    }

    public void setSg4c(String sg4c) {
        this.sg4c = sg4c;
        notifyPropertyChanged(BR.sg4c);
    }

    @Bindable
    public String getSg4d() {
        return sg4d;
    }

    public void setSg4d(String sg4d) {
        this.sg4d = sg4d;
        notifyPropertyChanged(BR.sg4d);
    }

    @Bindable
    public String getSg4e() {
        return sg4e;
    }

    public void setSg4e(String sg4e) {
        this.sg4e = sg4e;
        notifyPropertyChanged(BR.sg4e);
    }

    @Bindable
    public String getSg4f() {
        return sg4f;
    }

    public void setSg4f(String sg4f) {
        this.sg4f = sg4f;
        notifyPropertyChanged(BR.sg4f);
    }

    @Bindable
    public String getSg5a() {
        return sg5a;
    }

    public void setSg5a(String sg5a) {
        this.sg5a = sg5a;
        notifyPropertyChanged(BR.sg5a);
    }

    @Bindable
    public String getSg5b() {
        return sg5b;
    }

    public void setSg5b(String sg5b) {
        this.sg5b = sg5b;
        notifyPropertyChanged(BR.sg5b);
    }

    @Bindable
    public String getSg5c() {
        return sg5c;
    }

    public void setSg5c(String sg5c) {
        this.sg5c = sg5c;
        notifyPropertyChanged(BR.sg5c);
    }

    @Bindable
    public String getSg6a() {
        return sg6a;
    }

    public void setSg6a(String sg6a) {
        this.sg6a = sg6a;
        setSg6ar(sg6a.equals("2") || sg6a.equals("4") || sg6a.equals("6") ? this.sg6ar : "");
        notifyPropertyChanged(BR.sg6a);
    }

    @Bindable
    public String getSg6ar() {
        return sg6ar;
    }

    public void setSg6ar(String sg6ar) {
        this.sg6ar = sg6ar;
        notifyPropertyChanged(BR.sg6ar);
    }

    @Bindable
    public String getSg6b() {
        return sg6b;
    }

    public void setSg6b(String sg6b) {
        this.sg6b = sg6b;
        setSg6br(sg6b.equals("2") || sg6b.equals("4") || sg6b.equals("6") ? this.sg6br : "");
        notifyPropertyChanged(BR.sg6b);
    }

    @Bindable
    public String getSg6br() {
        return sg6br;
    }

    public void setSg6br(String sg6br) {
        this.sg6br = sg6br;
        notifyPropertyChanged(BR.sg6br);
    }

    @Bindable
    public String getSg7a() {
        return sg7a;
    }

    public void setSg7a(String sg7a) {
        this.sg7a = sg7a;
        setSg7ar(sg7a.equals("1") ? this.sg7ar : "");
        notifyPropertyChanged(BR.sg7a);
    }

    @Bindable
    public String getSg7ar() {
        return sg7ar;
    }

    public void setSg7ar(String sg7ar) {
        this.sg7ar = sg7ar;
        notifyPropertyChanged(BR.sg7ar);
    }

    @Bindable
    public String getSg7b() {
        return sg7b;
    }

    public void setSg7b(String sg7b) {
        this.sg7b = sg7b;
        setSg7br(sg7b.equals("1") ? this.sg7br : "");
        notifyPropertyChanged(BR.sg7b);
    }

    @Bindable
    public String getSg7br() {
        return sg7br;
    }

    public void setSg7br(String sg7br) {
        this.sg7br = sg7br;
        notifyPropertyChanged(BR.sg7br);
    }

    @Bindable
    public String getSg7c() {
        return sg7c;
    }

    public void setSg7c(String sg7c) {
        this.sg7c = sg7c;
        setSg7cr(sg7c.equals("1") ? this.sg7cr : "");
        notifyPropertyChanged(BR.sg7c);
    }

    @Bindable
    public String getSg7cr() {
        return sg7cr;
    }

    public void setSg7cr(String sg7cr) {
        this.sg7cr = sg7cr;
        notifyPropertyChanged(BR.sg7cr);
    }

    @Bindable
    public String getSg7d() {
        return sg7d;
    }

    public void setSg7d(String sg7d) {
        this.sg7d = sg7d;
        setSg7dr(sg7d.equals("1") ? this.sg7dr : "");
        notifyPropertyChanged(BR.sg7d);
    }

    @Bindable
    public String getSg7dr() {
        return sg7dr;
    }

    public void setSg7dr(String sg7dr) {
        this.sg7dr = sg7dr;
        notifyPropertyChanged(BR.sg7dr);
    }

    @Bindable
    public String getSg7e() {
        return sg7e;
    }

    public void setSg7e(String sg7e) {
        this.sg7e = sg7e;
        setSg7er(sg7e.equals("1") ? this.sg7er : "");
        notifyPropertyChanged(BR.sg7e);
    }

    @Bindable
    public String getSg7er() {
        return sg7er;
    }

    public void setSg7er(String sg7er) {
        this.sg7er = sg7er;
        notifyPropertyChanged(BR.sg7er);
    }

    @Bindable
    public String getSg7f() {
        return sg7f;
    }

    public void setSg7f(String sg7f) {
        this.sg7f = sg7f;
        setSg7fr(sg7f.equals("1") ? this.sg7fr : "");
        notifyPropertyChanged(BR.sg7f);
    }

    @Bindable
    public String getSg7fr() {
        return sg7fr;
    }

    public void setSg7fr(String sg7fr) {
        this.sg7fr = sg7fr;
        notifyPropertyChanged(BR.sg7fr);
    }

    @Bindable
    public String getSg7g() {
        return sg7g;
    }

    public void setSg7g(String sg7g) {
        this.sg7g = sg7g;
        setSg7g01x(sg7g01x.equals("1") ? this.sg7g01x : "");
        setSg7gr(sg7g.equals("1") ? this.sg7gr : "");
        notifyPropertyChanged(BR.sg7g);
    }

    @Bindable
    public String getSg7g01x() {
        return sg7g01x;
    }

    public void setSg7g01x(String sg7g01x) {
        this.sg7g01x = sg7g01x;
        notifyPropertyChanged(BR.sg7g01x);
    }

    @Bindable
    public String getSg7gxx() {
        return sg7gxx;
    }

    public void setSg7gxx(String sg7gxx) {
        this.sg7gxx = sg7gxx;
        notifyPropertyChanged(BR.sg7gxx);
    }

    @Bindable
    public String getSg7gr() {
        return sg7gr;
    }

    public void setSg7gr(String sg7gr) {
        this.sg7gr = sg7gr;
        notifyPropertyChanged(BR.sg7gr);
    }

    @Bindable
    public String getSg8a() {
        return sg8a;
    }

    public void setSg8a(String sg8a) {
        this.sg8a = sg8a;
        setSg8an(sg8a.equals("1") ? this.sg8an : "");
        setSg8ar(sg8a.equals("1") ? this.sg8ar : "");
        notifyPropertyChanged(BR.sg8a);
    }

    @Bindable
    public String getSg8an() {
        return sg8an;
    }

    public void setSg8an(String sg8an) {
        this.sg8an = sg8an;
        notifyPropertyChanged(BR.sg8an);
    }

    @Bindable
    public String getSg8ar() {
        return sg8ar;
    }

    public void setSg8ar(String sg8ar) {
        this.sg8ar = sg8ar;
        notifyPropertyChanged(BR.sg8ar);
    }

    @Bindable
    public String getSg8b() {
        return sg8b;
    }

    public void setSg8b(String sg8b) {
        this.sg8b = sg8b;
        setSg8bn(sg8b.equals("1") ? this.sg8bn : "");
        setSg8br(sg8b.equals("1") ? this.sg8br : "");
        notifyPropertyChanged(BR.sg8b);
    }

    @Bindable
    public String getSg8bn() {
        return sg8bn;
    }

    public void setSg8bn(String sg8bn) {
        this.sg8bn = sg8bn;
        notifyPropertyChanged(BR.sg8bn);
    }

    @Bindable
    public String getSg8br() {
        return sg8br;
    }

    public void setSg8br(String sg8br) {
        this.sg8br = sg8br;
        notifyPropertyChanged(BR.sg8br);
    }

    @Bindable
    public String getSg8c() {
        return sg8c;
    }

    public void setSg8c(String sg8c) {
        this.sg8c = sg8c;
        setSg8cn(sg8c.equals("1") ? this.sg8cn : "");
        setSg8cr(sg8c.equals("1") ? this.sg8cr : "");
        notifyPropertyChanged(BR.sg8c);
    }

    @Bindable
    public String getSg8cn() {
        return sg8cn;
    }

    public void setSg8cn(String sg8cn) {
        this.sg8cn = sg8cn;
        notifyPropertyChanged(BR.sg8cn);
    }

    @Bindable
    public String getSg8cr() {
        return sg8cr;
    }

    public void setSg8cr(String sg8cr) {
        this.sg8cr = sg8cr;
        notifyPropertyChanged(BR.sg8cr);
    }

    @Bindable
    public String getSg8d() {
        return sg8d;
    }

    public void setSg8d(String sg8d) {
        this.sg8d = sg8d;
        setSg8dn(sg8d.equals("1") ? this.sg8dn : "");
        setSg8dr(sg8d.equals("1") ? this.sg8dr : "");
        notifyPropertyChanged(BR.sg8d);
    }

    @Bindable
    public String getSg8dn() {
        return sg8dn;
    }

    public void setSg8dn(String sg8dn) {
        this.sg8dn = sg8dn;
        notifyPropertyChanged(BR.sg8dn);
    }

    @Bindable
    public String getSg8dr() {
        return sg8dr;
    }

    public void setSg8dr(String sg8dr) {
        this.sg8dr = sg8dr;
        notifyPropertyChanged(BR.sg8dr);
    }

    @Bindable
    public String getSg8e() {
        return sg8e;
    }

    public void setSg8e(String sg8e) {
        this.sg8e = sg8e;
        setSg8en(sg8e.equals("1") ? this.sg8en : "");
        setSg8er(sg8e.equals("1") ? this.sg8er : "");
        notifyPropertyChanged(BR.sg8e);
    }

    @Bindable
    public String getSg8en() {
        return sg8en;
    }

    public void setSg8en(String sg8en) {
        this.sg8en = sg8en;
        notifyPropertyChanged(BR.sg8en);
    }

    @Bindable
    public String getSg8er() {
        return sg8er;
    }

    public void setSg8er(String sg8er) {
        this.sg8er = sg8er;
        notifyPropertyChanged(BR.sg8er);
    }

    @Bindable
    public String getSg9a() {
        return sg9a;
    }

    public void setSg9a(String sg9a) {
        this.sg9a = sg9a;
        setSg9ab(sg9a.equals("2") || sg9a.equals("4") || sg9a.equals("6") ? this.sg9ab : "");
        notifyPropertyChanged(BR.sg9a);
    }

    @Bindable
    public String getSg9ab() {
        return sg9ab;
    }

    public void setSg9ab(String sg9ab) {
        this.sg9ab = sg9ab;
        notifyPropertyChanged(BR.sg9ab);
    }

    @Bindable
    public String getSg9b() {
        return sg9b;
    }

    public void setSg9b(String sg9b) {
        this.sg9b = sg9b;
        setSg9bb(sg9b.equals("2") || sg9b.equals("4") || sg9b.equals("6") ? this.sg9bb : "");
        notifyPropertyChanged(BR.sg9b);
    }

    @Bindable
    public String getSg9bb() {
        return sg9bb;
    }

    public void setSg9bb(String sg9bb) {
        this.sg9bb = sg9bb;
        notifyPropertyChanged(BR.sg9bb);
    }

    @Bindable
    public String getSg9c() {
        return sg9c;
    }

    public void setSg9c(String sg9c) {
        this.sg9c = sg9c;
        setSg9cb(sg9c.equals("2") || sg9c.equals("4") || sg9c.equals("6") ? this.sg9cb : "");
        notifyPropertyChanged(BR.sg9c);
    }

    @Bindable
    public String getSg9cb() {
        return sg9cb;
    }

    public void setSg9cb(String sg9cb) {
        this.sg9cb = sg9cb;
        notifyPropertyChanged(BR.sg9cb);
    }

    @Bindable
    public String getSg9d() {
        return sg9d;
    }

    public void setSg9d(String sg9d) {
        this.sg9d = sg9d;
        setSg9db(sg9d.equals("2") || sg9d.equals("4") || sg9d.equals("6") ? this.sg9db : "");
        notifyPropertyChanged(BR.sg9d);
    }

    @Bindable
    public String getSg9db() {
        return sg9db;
    }

    public void setSg9db(String sg9db) {
        this.sg9db = sg9db;
        notifyPropertyChanged(BR.sg9db);
    }

    @Bindable
    public String getSg9e() {
        return sg9e;
    }

    public void setSg9e(String sg9e) {
        this.sg9e = sg9e;
        setSg9eb(sg9e.equals("2") || sg9e.equals("4") || sg9e.equals("6") ? this.sg9eb : "");
        notifyPropertyChanged(BR.sg9e);
    }

    @Bindable
    public String getSg9eb() {
        return sg9eb;
    }

    public void setSg9eb(String sg9eb) {
        this.sg9eb = sg9eb;
        notifyPropertyChanged(BR.sg9eb);
    }

    @Bindable
    public String getSg9f() {
        return sg9f;
    }

    public void setSg9f(String sg9f) {
        this.sg9f = sg9f;
        setSg9fb(sg9f.equals("2") || sg9f.equals("4") || sg9f.equals("6") ? this.sg9fb : "");
        notifyPropertyChanged(BR.sg9f);
    }

    @Bindable
    public String getSg9fb() {
        return sg9fb;
    }

    public void setSg9fb(String sg9fb) {
        this.sg9fb = sg9fb;
        notifyPropertyChanged(BR.sg9fb);
    }

    @Bindable
    public String getSg9g() {
        return sg9g;
    }

    public void setSg9g(String sg9g) {
        this.sg9g = sg9g;
        setSg9gb(sg9g.equals("2") || sg9g.equals("4") || sg9g.equals("6") ? this.sg9gb : "");
        notifyPropertyChanged(BR.sg9g);
    }

    @Bindable
    public String getSg9gb() {
        return sg9gb;
    }

    public void setSg9gb(String sg9gb) {
        this.sg9gb = sg9gb;
        notifyPropertyChanged(BR.sg9gb);
    }

    @Bindable
    public String getSg9h() {
        return sg9h;
    }

    public void setSg9h(String sg9h) {
        this.sg9h = sg9h;
        setSg9hb(sg9h.equals("2") || sg9h.equals("4") || sg9h.equals("6") ? this.sg9hb : "");
        notifyPropertyChanged(BR.sg9h);
    }

    @Bindable
    public String getSg9hb() {
        return sg9hb;
    }

    public void setSg9hb(String sg9hb) {
        this.sg9hb = sg9hb;
        notifyPropertyChanged(BR.sg9hb);
    }

    @Bindable
    public String getSg9i() {
        return sg9i;
    }

    public void setSg9i(String sg9i) {
        this.sg9i = sg9i;
        setSg9ib(sg9i.equals("2") || sg9i.equals("4") || sg9i.equals("6") ? this.sg9ib : "");
        notifyPropertyChanged(BR.sg9i);
    }

    @Bindable
    public String getSg9ib() {
        return sg9ib;
    }

    public void setSg9ib(String sg9ib) {
        this.sg9ib = sg9ib;
        notifyPropertyChanged(BR.sg9ib);
    }

    @Bindable
    public String getSg9j() {
        return sg9j;
    }

    public void setSg9j(String sg9j) {
        this.sg9j = sg9j;
        setSg9jb(sg9j.equals("2") || sg9j.equals("4") || sg9j.equals("6") ? this.sg9jb : "");
        notifyPropertyChanged(BR.sg9j);
    }

    @Bindable
    public String getSg9jb() {
        return sg9jb;
    }

    public void setSg9jb(String sg9jb) {
        this.sg9jb = sg9jb;
        notifyPropertyChanged(BR.sg9jb);
    }

    @Bindable
    public String getSg9k() {
        return sg9k;
    }

    public void setSg9k(String sg9k) {
        this.sg9k = sg9k;
        setSg9kb(sg9k.equals("2") || sg9k.equals("4") || sg9k.equals("6") ? this.sg9kb : "");
        notifyPropertyChanged(BR.sg9k);
    }

    @Bindable
    public String getSg9kb() {
        return sg9kb;
    }

    public void setSg9kb(String sg9kb) {
        this.sg9kb = sg9kb;
        notifyPropertyChanged(BR.sg9kb);
    }

    @Bindable
    public String getSg9l() {
        return sg9l;
    }

    public void setSg9l(String sg9l) {
        this.sg9l = sg9l;
        setSg9lb(sg9l.equals("2") || sg9l.equals("4") || sg9l.equals("6") ? this.sg9lb : "");
        notifyPropertyChanged(BR.sg9l);
    }

    @Bindable
    public String getSg9lb() {
        return sg9lb;
    }

    public void setSg9lb(String sg9lb) {
        this.sg9lb = sg9lb;
        notifyPropertyChanged(BR.sg9lb);
    }

    @Bindable
    public String getSg9m() {
        return sg9m;
    }

    public void setSg9m(String sg9m) {
        this.sg9m = sg9m;
        setSg9mb(sg9m.equals("2") || sg9m.equals("4") || sg9m.equals("6") ? this.sg9mb : "");
        notifyPropertyChanged(BR.sg9m);
    }

    @Bindable
    public String getSg9mb() {
        return sg9mb;
    }

    public void setSg9mb(String sg9mb) {
        this.sg9mb = sg9mb;
        notifyPropertyChanged(BR.sg9mb);
    }

    @Bindable
    public String getSg9n() {
        return sg9n;
    }

    public void setSg9n(String sg9n) {
        this.sg9n = sg9n;
        setSg9nb(sg9n.equals("2") || sg9n.equals("4") || sg9n.equals("6") ? this.sg9nb : "");
        notifyPropertyChanged(BR.sg9n);
    }

    @Bindable
    public String getSg9nb() {
        return sg9nb;
    }

    public void setSg9nb(String sg9nb) {
        this.sg9nb = sg9nb;
        notifyPropertyChanged(BR.sg9nb);
    }

    @Bindable
    public String getSg9o() {
        return sg9o;
    }

    public void setSg9o(String sg9o) {
        this.sg9o = sg9o;
        setSg9ob(sg9o.equals("2") || sg9o.equals("4") || sg9o.equals("6") ? this.sg9ob : "");
        notifyPropertyChanged(BR.sg9o);
    }

    @Bindable
    public String getSg9ob() {
        return sg9ob;
    }

    public void setSg9ob(String sg9ob) {
        this.sg9ob = sg9ob;
        notifyPropertyChanged(BR.sg9ob);
    }

    @Bindable
    public String getSg9p() {
        return sg9p;
    }

    public void setSg9p(String sg9p) {
        this.sg9p = sg9p;
        setSg9pb(sg9p.equals("2") || sg9p.equals("4") || sg9p.equals("6") ? this.sg9pb : "");
        notifyPropertyChanged(BR.sg9p);
    }

    @Bindable
    public String getSg9pb() {
        return sg9pb;
    }

    public void setSg9pb(String sg9pb) {
        this.sg9pb = sg9pb;
        notifyPropertyChanged(BR.sg9pb);
    }

    @Bindable
    public String getSg9q() {
        return sg9q;
    }

    public void setSg9q(String sg9q) {
        this.sg9q = sg9q;
        setSg9qb(sg9q.equals("2") || sg9q.equals("4") || sg9q.equals("6") ? this.sg9qb : "");
        notifyPropertyChanged(BR.sg9q);
    }

    @Bindable
    public String getSg9qb() {
        return sg9qb;
    }

    public void setSg9qb(String sg9qb) {
        this.sg9qb = sg9qb;
        notifyPropertyChanged(BR.sg9qb);
    }

    @Bindable
    public String getSg10a() {
        return sg10a;
    }

    public void setSg10a(String sg10a) {
        this.sg10a = sg10a;
        notifyPropertyChanged(BR.sg10a);
    }

    @Bindable
    public String getSg11a() {
        return sg11a;
    }

    public void setSg11a(String sg11a) {
        this.sg11a = sg11a;
        notifyPropertyChanged(BR.sg11a);
    }

    @Bindable
    public String getSg12a() {
        return sg12a;
    }

    public void setSg12a(String sg12a) {
        this.sg12a = sg12a;
        setSg12ar(sg12a.equals("1") ? this.sg12ar : "");
        setSg12an(sg12a.equals("1") ? this.sg12an : "");
        notifyPropertyChanged(BR.sg12a);
    }

    @Bindable
    public String getSg12ar() {
        return sg12ar;
    }

    public void setSg12ar(String sg12ar) {
        this.sg12ar = sg12ar;
        notifyPropertyChanged(BR.sg12ar);
    }

    @Bindable
    public String getSg12an() {
        return sg12an;
    }

    public void setSg12an(String sg12an) {
        this.sg12an = sg12an;
        notifyPropertyChanged(BR.sg12an);
    }

    @Bindable
    public String getSg12b() {
        return sg12b;
    }

    public void setSg12b(String sg12b) {
        this.sg12b = sg12b;
        setSg12br(sg12b.equals("1") ? this.sg12br : "");
        setSg12bn(sg12b.equals("1") ? this.sg12bn : "");
        notifyPropertyChanged(BR.sg12b);
    }

    @Bindable
    public String getSg12br() {
        return sg12br;
    }

    public void setSg12br(String sg12br) {
        this.sg12br = sg12br;
        notifyPropertyChanged(BR.sg12br);
    }

    @Bindable
    public String getSg12bn() {
        return sg12bn;
    }

    public void setSg12bn(String sg12bn) {
        this.sg12bn = sg12bn;
        notifyPropertyChanged(BR.sg12bn);
    }

    @Bindable
    public String getSg12c() {
        return sg12c;
    }

    public void setSg12c(String sg12c) {
        this.sg12c = sg12c;
        setSg12cr(sg12c.equals("1") ? this.sg12cr : "");
        setSg12cn(sg12c.equals("1") ? this.sg12cn : "");
        notifyPropertyChanged(BR.sg12c);
    }

    @Bindable
    public String getSg12cr() {
        return sg12cr;
    }

    public void setSg12cr(String sg12cr) {
        this.sg12cr = sg12cr;
        notifyPropertyChanged(BR.sg12cr);
    }

    @Bindable
    public String getSg12cn() {
        return sg12cn;
    }

    public void setSg12cn(String sg12cn) {
        this.sg12cn = sg12cn;
        notifyPropertyChanged(BR.sg12cn);
    }

    @Bindable
    public String getSg12d() {
        return sg12d;
    }

    public void setSg12d(String sg12d) {
        this.sg12d = sg12d;
        setSg12dr(sg12d.equals("1") ? this.sg12dr : "");
        setSg12dn(sg12d.equals("1") ? this.sg12dn : "");
        notifyPropertyChanged(BR.sg12d);
    }

    @Bindable
    public String getSg12dr() {
        return sg12dr;
    }

    public void setSg12dr(String sg12dr) {
        this.sg12dr = sg12dr;
        notifyPropertyChanged(BR.sg12dr);
    }

    @Bindable
    public String getSg12dn() {
        return sg12dn;
    }

    public void setSg12dn(String sg12dn) {
        this.sg12dn = sg12dn;
        notifyPropertyChanged(BR.sg12dn);
    }

    @Bindable
    public String getSg12e() {
        return sg12e;
    }

    public void setSg12e(String sg12e) {
        this.sg12e = sg12e;
        setSg12er(sg12e.equals("1") ? this.sg12er : "");
        setSg12en(sg12e.equals("1") ? this.sg12en : "");
        notifyPropertyChanged(BR.sg12e);
    }

    @Bindable
    public String getSg12er() {
        return sg12er;
    }

    public void setSg12er(String sg12er) {
        this.sg12er = sg12er;
        notifyPropertyChanged(BR.sg12er);
    }

    @Bindable
    public String getSg12en() {
        return sg12en;
    }

    public void setSg12en(String sg12en) {
        this.sg12en = sg12en;
        notifyPropertyChanged(BR.sg12en);
    }

    @Bindable
    public String getSg13a() {
        return sg13a;
    }

    public void setSg13a(String sg13a) {
        this.sg13a = sg13a;
        notifyPropertyChanged(BR.sg13a);
    }

    @Bindable
    public String getSg14a() {
        return sg14a;
    }

    public void setSg14a(String sg14a) {
        this.sg14a = sg14a;
        notifyPropertyChanged(BR.sg14a);
    }

    @Bindable
    public String getSg14b() {
        return sg14b;
    }

    public void setSg14b(String sg14b) {
        this.sg14b = sg14b;
        notifyPropertyChanged(BR.sg14b);
    }

    @Bindable
    public String getSg14c() {
        return sg14c;
    }

    public void setSg14c(String sg14c) {
        this.sg14c = sg14c;
        notifyPropertyChanged(BR.sg14c);
    }

    @Bindable
    public String getSg15a() {
        return sg15a;
    }

    public void setSg15a(String sg15a) {
        this.sg15a = sg15a;
        setSg15b(sg15a.equals("97") ? "" : this.sg15b);
        setSg15c(sg15a.equals("97") ? "" : this.sg15c);
        notifyPropertyChanged(BR.sg15a);
    }

    @Bindable
    public String getSg15b() {
        return sg15b;
    }

    public void setSg15b(String sg15b) {
        this.sg15b = sg15b;
        notifyPropertyChanged(BR.sg15b);
    }

    @Bindable
    public String getSg15c() {
        return sg15c;
    }

    public void setSg15c(String sg15c) {
        this.sg15c = sg15c;
        notifyPropertyChanged(BR.sg15c);
    }

    @Bindable
    public String getIstga() {
        return istga;
    }

    public void setIstga(String istga) {
        this.istga = istga;
        notifyPropertyChanged(BR.istga);
    }

    @Bindable
    public String getIstgb() {
        return istgb;
    }

    public void setIstgb(String istgb) {
        this.istgb = istgb;
        setIstgb96x(istgb.equals("96") ? this.istgb96x : "");
        notifyPropertyChanged(BR.istgb);
    }

    @Bindable
    public String getIstgb96x() {
        return istgb96x;
    }

    public void setIstgb96x(String istgb96x) {
        this.istgb96x = istgb96x;
        notifyPropertyChanged(BR.istgb96x);
    }


    public WEDM Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_UUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_PROJECT_NAME));
        this.villageCode = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_VILLAGE_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_HHID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_DEVICETAG));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_SYNCED_DATE));
        sG1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_SG1)));
        sG2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_SG2)));
        sG3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(WEDMTable.COLUMN_SG3)));
        return this;
    }

    public void sG1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.sg1a = json.getString("sg1a");
            this.sg1b = json.getString("sg1b");
            this.sg1c = json.getString("sg1c");
            this.sg1d = json.getString("sg1d");
            this.sg2a = json.getString("sg2a");
            this.sg2b = json.getString("sg2b");
            this.sg2c = json.getString("sg2c");
            this.sg3a = json.getString("sg3a");
            this.sg3b = json.getString("sg3b");
            this.sg3c = json.getString("sg3c");
            this.sg3d = json.getString("sg3d");
            this.sg3e = json.getString("sg3e");
            this.sg3f = json.getString("sg3f");
            this.sg3g = json.getString("sg3g");
            this.sg3g01x = json.getString("sg3g01x");
            this.sg3gxx = json.getString("sg3gxx");
            this.sg4a = json.getString("sg4a");
            this.sg4b = json.getString("sg4b");
            this.sg4c = json.getString("sg4c");
            this.sg4d = json.getString("sg4d");
            this.sg4e = json.getString("sg4e");
            this.sg4f = json.getString("sg4f");
            this.sg5a = json.getString("sg5a");
            this.sg5b = json.getString("sg5b");
            this.sg5c = json.getString("sg5c");
            this.sg6a = json.getString("sg6a");
            this.sg6ar = json.getString("sg6ar");
            this.sg6b = json.getString("sg6b");
            this.sg6br = json.getString("sg6br");
            this.sg7a = json.getString("sg7a");
            this.sg7ar = json.getString("sg7ar");
            this.sg7b = json.getString("sg7b");
            this.sg7br = json.getString("sg7br");
            this.sg7c = json.getString("sg7c");
            this.sg7cr = json.getString("sg7cr");
            this.sg7d = json.getString("sg7d");
            this.sg7dr = json.getString("sg7dr");
            this.sg7e = json.getString("sg7e");
            this.sg7er = json.getString("sg7er");
            this.sg7f = json.getString("sg7f");
            this.sg7fr = json.getString("sg7fr");
            this.sg7g = json.getString("sg7g");
            this.sg7g01x = json.getString("sg7g01x");
            this.sg7gxx = json.getString("sg7gxx");
            this.sg7gr = json.getString("sg7gr");
        }
    }

    public void sG2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.sg8a = json.getString("sg8a");
            this.sg8an = json.getString("sg8an");
            this.sg8ar = json.getString("sg8ar");
            this.sg8b = json.getString("sg8b");
            this.sg8bn = json.getString("sg8bn");
            this.sg8br = json.getString("sg8br");
            this.sg8c = json.getString("sg8c");
            this.sg8cn = json.getString("sg8cn");
            this.sg8cr = json.getString("sg8cr");
            this.sg8d = json.getString("sg8d");
            this.sg8dn = json.getString("sg8dn");
            this.sg8dr = json.getString("sg8dr");
            this.sg8e = json.getString("sg8e");
            this.sg8en = json.getString("sg8en");
            this.sg8er = json.getString("sg8er");
            this.sg9a = json.getString("sg9a");
            this.sg9ab = json.getString("sg9ab");
            this.sg9b = json.getString("sg9b");
            this.sg9bb = json.getString("sg9bb");
            this.sg9c = json.getString("sg9c");
            this.sg9cb = json.getString("sg9cb");
            this.sg9d = json.getString("sg9d");
            this.sg9db = json.getString("sg9db");
            this.sg9e = json.getString("sg9e");
            this.sg9eb = json.getString("sg9eb");
            this.sg9f = json.getString("sg9f");
            this.sg9fb = json.getString("sg9fb");
            this.sg9g = json.getString("sg9g");
            this.sg9gb = json.getString("sg9gb");
            this.sg9h = json.getString("sg9h");
            this.sg9hb = json.getString("sg9hb");
            this.sg9i = json.getString("sg9i");
            this.sg9ib = json.getString("sg9ib");
        }
    }

    public void sG3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sG3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.sg9j = json.getString("sg9j");
            this.sg9jb = json.getString("sg9jb");
            this.sg9k = json.getString("sg9k");
            this.sg9kb = json.getString("sg9kb");
            this.sg9l = json.getString("sg9l");
            this.sg9lb = json.getString("sg9lb");
            this.sg9m = json.getString("sg9m");
            this.sg9mb = json.getString("sg9mb");
            this.sg9n = json.getString("sg9n");
            this.sg9nb = json.getString("sg9nb");
            this.sg9o = json.getString("sg9o");
            this.sg9ob = json.getString("sg9ob");
            this.sg9p = json.getString("sg9p");
            this.sg9pb = json.getString("sg9pb");
            this.sg9q = json.getString("sg9q");
            this.sg9qb = json.getString("sg9qb");
            this.sg10a = json.getString("sg10a");
            this.sg11a = json.getString("sg11a");
            this.sg12a = json.getString("sg12a");
            this.sg12ar = json.getString("sg12ar");
            this.sg12an = json.getString("sg12an");
            this.sg12b = json.getString("sg12b");
            this.sg12br = json.getString("sg12br");
            this.sg12bn = json.getString("sg12bn");
            this.sg12c = json.getString("sg12c");
            this.sg12cr = json.getString("sg12cr");
            this.sg12cn = json.getString("sg12cn");
            this.sg12d = json.getString("sg12d");
            this.sg12dr = json.getString("sg12dr");
            this.sg12dn = json.getString("sg12dn");
            this.sg12e = json.getString("sg12e");
            this.sg12er = json.getString("sg12er");
            this.sg12en = json.getString("sg12en");
            this.sg13a = json.getString("sg13a");
            this.sg14a = json.getString("sg14a");
            this.sg14b = json.getString("sg14b");
            this.sg14c = json.getString("sg14c");
            this.sg15a = json.getString("sg15a");
            this.sg15b = json.getString("sg15b");
            this.sg15c = json.getString("sg15c");
            this.istga = json.getString("istga");
            this.istgb = json.getString("istgb");
            this.istgb96x = json.getString("istgb96x");

        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(WEDMTable.COLUMN_ID, this.id);
        json.put(WEDMTable.COLUMN_UID, this.uid);
        json.put(WEDMTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(WEDMTable.COLUMN_UUID, this.uuid);
        json.put(WEDMTable.COLUMN_VILLAGE_CODE, this.villageCode);
        json.put(WEDMTable.COLUMN_HHID, this.hhid);
        json.put(WEDMTable.COLUMN_USERNAME, this.userName);
        json.put(WEDMTable.COLUMN_SYSDATE, this.sysDate);
        json.put(WEDMTable.COLUMN_DEVICEID, this.deviceId);
        json.put(WEDMTable.COLUMN_DEVICETAG, this.deviceTag);
        json.put(WEDMTable.COLUMN_ISTATUS, this.iStatus);
        json.put(WEDMTable.COLUMN_SYNCED, this.synced);
        json.put(WEDMTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(WEDMTable.COLUMN_APPVERSION, this.appver);
        json.put(WEDMTable.COLUMN_SG1, new JSONObject(sG1toString()));
        json.put(WEDMTable.COLUMN_SG2, new JSONObject(sG2toString()));
        json.put(WEDMTable.COLUMN_SG3, new JSONObject(sG3toString()));
        return json;
    }

    public String sG1toString() throws JSONException {
        Log.d(TAG, "sG1toString: ");
        JSONObject json = new JSONObject();
        json.put("sg1a", sg1a)
                .put("sg1b", sg1b)
                .put("sg1c", sg1c)
                .put("sg1d", sg1d)
                .put("sg2a", sg2a)
                .put("sg2b", sg2b)
                .put("sg2c", sg2c)
                .put("sg3a", sg3a)
                .put("sg3b", sg3b)
                .put("sg3c", sg3c)
                .put("sg3d", sg3d)
                .put("sg3e", sg3e)
                .put("sg3f", sg3f)
                .put("sg3g", sg3g)
                .put("sg3g01x", sg3g01x)
                .put("sg3gxx", sg3gxx)
                .put("sg4a", sg4a)
                .put("sg4b", sg4b)
                .put("sg4c", sg4c)
                .put("sg4d", sg4d)
                .put("sg4e", sg4e)
                .put("sg4f", sg4f)
                .put("sg5a", sg5a)
                .put("sg5b", sg5b)
                .put("sg5c", sg5c)
                .put("sg6a", sg6a)
                .put("sg6ar", sg6ar)
                .put("sg6b", sg6b)
                .put("sg6br", sg6br)
                .put("sg7a", sg7a)
                .put("sg7ar", sg7ar)
                .put("sg7b", sg7b)
                .put("sg7br", sg7br)
                .put("sg7c", sg7c)
                .put("sg7cr", sg7cr)
                .put("sg7d", sg7d)
                .put("sg7dr", sg7dr)
                .put("sg7e", sg7e)
                .put("sg7er", sg7er)
                .put("sg7f", sg7f)
                .put("sg7fr", sg7fr)
                .put("sg7g", sg7g)
                .put("sg7g01x", sg7g01x)
                .put("sg7gxx", sg7gxx)
                .put("sg7gr", sg7gr);
        return json.toString();
    }

    public String sG2toString() throws JSONException {
        Log.d(TAG, "sG2toString: ");
        JSONObject json = new JSONObject();
        json.put("sg8a", sg8a)
                .put("sg8an", sg8an)
                .put("sg8ar", sg8ar)
                .put("sg8b", sg8b)
                .put("sg8bn", sg8bn)
                .put("sg8br", sg8br)
                .put("sg8c", sg8c)
                .put("sg8cn", sg8cn)
                .put("sg8cr", sg8cr)
                .put("sg8d", sg8d)
                .put("sg8dn", sg8dn)
                .put("sg8dr", sg8dr)
                .put("sg8e", sg8e)
                .put("sg8en", sg8en)
                .put("sg8er", sg8er)
                .put("sg9a", sg9a)
                .put("sg9ab", sg9ab)
                .put("sg9b", sg9b)
                .put("sg9bb", sg9bb)
                .put("sg9c", sg9c)
                .put("sg9cb", sg9cb)
                .put("sg9d", sg9d)
                .put("sg9db", sg9db)
                .put("sg9e", sg9e)
                .put("sg9eb", sg9eb)
                .put("sg9f", sg9f)
                .put("sg9fb", sg9fb)
                .put("sg9g", sg9g)
                .put("sg9gb", sg9gb)
                .put("sg9h", sg9h)
                .put("sg9hb", sg9hb)
                .put("sg9i", sg9i)
                .put("sg9ib", sg9ib);
        return json.toString();
    }

    public String sG3toString() throws JSONException {
        Log.d(TAG, "sG3toString: ");
        JSONObject json = new JSONObject();
        json.put("sg9j", sg9j)
                .put("sg9jb", sg9jb)
                .put("sg9k", sg9k)
                .put("sg9kb", sg9kb)
                .put("sg9l", sg9l)
                .put("sg9lb", sg9lb)
                .put("sg9m", sg9m)
                .put("sg9mb", sg9mb)
                .put("sg9n", sg9n)
                .put("sg9nb", sg9nb)
                .put("sg9o", sg9o)
                .put("sg9ob", sg9ob)
                .put("sg9p", sg9p)
                .put("sg9pb", sg9pb)
                .put("sg9q", sg9q)
                .put("sg9qb", sg9qb)
                .put("sg10a", sg10a)
                .put("sg11a", sg11a)
                .put("sg12a", sg12a)
                .put("sg12ar", sg12ar)
                .put("sg12an", sg12an)
                .put("sg12b", sg12b)
                .put("sg12br", sg12br)
                .put("sg12bn", sg12bn)
                .put("sg12c", sg12c)
                .put("sg12cr", sg12cr)
                .put("sg12cn", sg12cn)
                .put("sg12d", sg12d)
                .put("sg12dr", sg12dr)
                .put("sg12dn", sg12dn)
                .put("sg12e", sg12e)
                .put("sg12er", sg12er)
                .put("sg12en", sg12en)
                .put("sg13a", sg13a)
                .put("sg14a", sg14a)
                .put("sg14b", sg14b)
                .put("sg14c", sg14c)
                .put("sg15a", sg15a)
                .put("sg15b", sg15b)
                .put("sg15c", sg15c)
                .put("istga", istga)
                .put("istgb", istgb)
                .put("istgb96x", istgb96x);
        return json.toString();
    }

}
