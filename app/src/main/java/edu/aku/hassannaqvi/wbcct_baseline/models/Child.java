package edu.aku.hassannaqvi.wbcct_baseline.models;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedMWRA;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.wbcct_baseline.BR;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;

public class Child extends BaseObservable implements Observable {

    private final String TAG = "Child";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String muid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String indexed = _EMPTY_;
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

    //ModuleStatusVariables
    private String dstaa = _EMPTY_;
    private String dstab = _EMPTY_;
    private String dstab96x = _EMPTY_;

    // FIELD VARIABLES
    private String d101 = _EMPTY_;
    private String d102 = _EMPTY_;
    private String d103 = _EMPTY_;
    private String d104 = _EMPTY_;
    private String d105 = _EMPTY_;
    private String d201 = _EMPTY_;
    private String d202 = _EMPTY_;
    private String d20202x = _EMPTY_;
    private String d20203x = _EMPTY_;
    private String d203 = _EMPTY_;
    private String d204 = _EMPTY_;
    private String d205 = _EMPTY_;
    private String d206a = _EMPTY_;
    private String d206b = _EMPTY_;
    private String d206c = _EMPTY_;
    private String d206d = _EMPTY_;
    private String d206e = _EMPTY_;
    private String d206f = _EMPTY_;
    private String d206g = _EMPTY_;
    private String d206h = _EMPTY_;
    private String d206i = _EMPTY_;
    private String d206j = _EMPTY_;
    private String d206k = _EMPTY_;
    private String d206l = _EMPTY_;
    private String d206m = _EMPTY_;
    private String d206n = _EMPTY_;
    private String d206o = _EMPTY_;
    private String d206p = _EMPTY_;
    private String d206q = _EMPTY_;
    private String d207a = _EMPTY_;
    private String d207b = _EMPTY_;
    private String d207c = _EMPTY_;
    private String d207d = _EMPTY_;
    private String d207e = _EMPTY_;
    private String d207f = _EMPTY_;
    private String d207g = _EMPTY_;
    private String d207h = _EMPTY_;
    private String d207i = _EMPTY_;
    private String d207j = _EMPTY_;
    private String d207k = _EMPTY_;
    private String d207l = _EMPTY_;
    private String d207m = _EMPTY_;
    private String d207n = _EMPTY_;
    private String d207o = _EMPTY_;
    private String d207p = _EMPTY_;
    private String d207q = _EMPTY_;
    private String d207r = _EMPTY_;
    private String d207s = _EMPTY_;
    private String d208 = _EMPTY_;
    private String d209 = _EMPTY_;
    private String d210 = _EMPTY_;
    private String d21001x = _EMPTY_;
    private String d21002x = _EMPTY_;
    private String d211 = _EMPTY_;
    private String d21196x = _EMPTY_;
    private String d301 = _EMPTY_;
    private String d302 = _EMPTY_;
    private String d303 = _EMPTY_;
    private String d30396x = _EMPTY_;
    private String d304d = _EMPTY_;
    private String d304m = _EMPTY_;
    private String d304y = _EMPTY_;
    private String d30501d = _EMPTY_;
    private String d30501m = _EMPTY_;
    private String d30501y = _EMPTY_;
    private String check0 = _EMPTY_;
    private String check6 = _EMPTY_;
    private String check10 = _EMPTY_;
    private String check14 = _EMPTY_;
    private String d30502d = _EMPTY_;
    private String d30502m = _EMPTY_;
    private String d30502y = _EMPTY_;
    private String d30503d = _EMPTY_;
    private String d30503m = _EMPTY_;
    private String d30503y = _EMPTY_;
    private String d30504d = _EMPTY_;
    private String d30504m = _EMPTY_;
    private String d30504y = _EMPTY_;
    private String d30505d = _EMPTY_;
    private String d30505m = _EMPTY_;
    private String d30505y = _EMPTY_;
    private String d30506d = _EMPTY_;
    private String d30506m = _EMPTY_;
    private String d30506y = _EMPTY_;
    private String d30507d = _EMPTY_;
    private String d30507m = _EMPTY_;
    private String d30507y = _EMPTY_;
    private String d30508d = _EMPTY_;
    private String d30508m = _EMPTY_;
    private String d30508y = _EMPTY_;
    private String d30509d = _EMPTY_;
    private String d30509m = _EMPTY_;
    private String d30509y = _EMPTY_;
    private String d30510d = _EMPTY_;
    private String d30510m = _EMPTY_;
    private String d30510y = _EMPTY_;
    private String d30511d = _EMPTY_;
    private String d30511m = _EMPTY_;
    private String d30511y = _EMPTY_;
    private String d30512d = _EMPTY_;
    private String d30512m = _EMPTY_;
    private String d30512y = _EMPTY_;
    private String d30513d = _EMPTY_;
    private String d30513m = _EMPTY_;
    private String d30513y = _EMPTY_;
    private String d30514d = _EMPTY_;
    private String d30514m = _EMPTY_;
    private String d30514y = _EMPTY_;
    private String d30515d = _EMPTY_;
    private String d30515m = _EMPTY_;
    private String d30515y = _EMPTY_;
    private String d30516d = _EMPTY_;
    private String d30516m = _EMPTY_;
    private String d30516y = _EMPTY_;
    private String d307 = _EMPTY_;
    private String d308 = _EMPTY_;
    private String d309 = _EMPTY_;
    private String d310 = _EMPTY_;
    private String d311 = _EMPTY_;
    private String d312 = _EMPTY_;
    private String d31201x = _EMPTY_;
    private String d313 = _EMPTY_;
    private String d314 = _EMPTY_;
    private String d31401x = _EMPTY_;
    private String d315 = _EMPTY_;
    private String d316 = _EMPTY_;
    private String d31601x = _EMPTY_;
    private String d317 = _EMPTY_;
    private String d318 = _EMPTY_;
    private String d31801x = _EMPTY_;
    private String d319 = _EMPTY_;
    private String d320 = _EMPTY_;
    private String d321 = _EMPTY_;
    private String d32101x = _EMPTY_;
    private String d322 = _EMPTY_;
    private String d32296x = _EMPTY_;
    private String d323a = _EMPTY_;
    private String d323a96x = _EMPTY_;
    private String d323b01 = _EMPTY_;
    private String d323b02 = _EMPTY_;
    private String d324 = _EMPTY_;
    private String d32401 = _EMPTY_;
    private String d32402 = _EMPTY_;
    private String d32403 = _EMPTY_;
    private String d32404 = _EMPTY_;
    private String d32405 = _EMPTY_;
    private String d32406 = _EMPTY_;
    private String d32407 = _EMPTY_;
    private String d32408 = _EMPTY_;
    private String d32409 = _EMPTY_;
    private String d32410 = _EMPTY_;
    private String d32411 = _EMPTY_;
    private String d32412 = _EMPTY_;
    private String d32413 = _EMPTY_;
    private String d32414 = _EMPTY_;
    private String d32415 = _EMPTY_;
    private String d32416 = _EMPTY_;
    private String d32417 = _EMPTY_;
    private String d324998 = _EMPTY_;
    private String d32496 = _EMPTY_;
    private String d32496x = _EMPTY_;
    private String d325 = _EMPTY_;
    private String d326 = _EMPTY_;
    private String d327 = _EMPTY_;
    private String d328 = _EMPTY_;
    private String d329 = _EMPTY_;
    private String d33001 = _EMPTY_;
    private String d33002 = _EMPTY_;
    private String d33003 = _EMPTY_;
    private String d33004 = _EMPTY_;
    private String d33005 = _EMPTY_;
    private String d33006 = _EMPTY_;
    private String d33007 = _EMPTY_;
    private String d33008 = _EMPTY_;
    private String d33009 = _EMPTY_;
    private String d33010 = _EMPTY_;
    private String d33011 = _EMPTY_;
    private String d33012 = _EMPTY_;
    private String d33013 = _EMPTY_;
    private String d330998 = _EMPTY_;
    private String d33096 = _EMPTY_;
    private String d33096x = _EMPTY_;
    private String d401 = _EMPTY_;
    private String d40101 = _EMPTY_;
    private String d40102 = _EMPTY_;
    private String d40103 = _EMPTY_;
    private String d40104 = _EMPTY_;
    private String d40105 = _EMPTY_;
    private String d40106 = _EMPTY_;
    private String d40107 = _EMPTY_;
    private String d40108 = _EMPTY_;
    private String d40110 = _EMPTY_;
    private String d40196 = _EMPTY_;
    private String d40196x = _EMPTY_;
    private String d401998 = _EMPTY_;
    private String d402 = _EMPTY_;
    private String d403 = _EMPTY_;
    private String d40301 = _EMPTY_;
    private String d40302 = _EMPTY_;
    private String d40303 = _EMPTY_;
    private String d40304 = _EMPTY_;
    private String d40305 = _EMPTY_;
    private String d40306 = _EMPTY_;
    private String d40307 = _EMPTY_;
    private String d40308 = _EMPTY_;
    private String d40396 = _EMPTY_;
    private String d40396x = _EMPTY_;
    private String d404 = _EMPTY_;
    private String d40401 = _EMPTY_;
    private String d40402 = _EMPTY_;
    private String d40403 = _EMPTY_;
    private String d40404 = _EMPTY_;
    private String d40405 = _EMPTY_;
    private String d40406 = _EMPTY_;
    private String d40407 = _EMPTY_;
    private String d40408 = _EMPTY_;
    private String d40409 = _EMPTY_;
    private String d40410 = _EMPTY_;
    private String d40411 = _EMPTY_;
    private String d40496 = _EMPTY_;
    private String d40496x = _EMPTY_;
    private String d404998 = _EMPTY_;

    public void Child() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyMember.getUid()); //// not applicable in Form table
        if (!selectedMWRA.equals("97")) {
            setMuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA)).getUid());  // not applicable in Form table
        }
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

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
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

    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
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
    public String getD101() {
        return d101;
    }

    public void setD101(String d101) {
        this.d101 = d101;
        notifyPropertyChanged(BR.d101);
    }

    @Bindable
    public String getD102() {
        return d102;
    }

    public void setD102(String d102) {
        this.d102 = d102;
        notifyPropertyChanged(BR.d102);
    }

    @Bindable
    public String getD103() {
        return d103;
    }

    public void setD103(String d103) {
        this.d103 = d103;
        notifyPropertyChanged(BR.d103);
    }

    @Bindable
    public String getD104() {
        return d104;
    }

    public void setD104(String d104) {
        this.d104 = d104;
        notifyPropertyChanged(BR.d104);
    }

    @Bindable
    public String getD105() {
        return d105;
    }

    public void setD105(String d105) {
        this.d105 = d105;
        notifyPropertyChanged(BR.d105);
    }

    @Bindable
    public String getD201() {
        return d201;
    }

    public void setD201(String d201) {
        this.d201 = d201;
        setD202(d201.equals("1") ? this.d202 : "");
        notifyPropertyChanged(BR.d201);
    }

    @Bindable
    public String getD202() {
        return d202;
    }

    public void setD202(String d202) {
        this.d202 = d202;
        setD20202x(d202.equals("2") ? this.d20202x : "");
        setD20203x(d202.equals("3") ? this.d20203x : "");
        notifyPropertyChanged(BR.d202);
    }

    @Bindable
    public String getD20202x() {
        return d20202x;
    }

    public void setD20202x(String d20202x) {
        this.d20202x = d20202x;
        notifyPropertyChanged(BR.d20202x);
    }

    @Bindable
    public String getD20203x() {
        return d20203x;
    }

    public void setD20203x(String d20203x) {
        this.d20203x = d20203x;
        notifyPropertyChanged(BR.d20203x);
    }

    @Bindable
    public String getD203() {
        return d203;
    }

    public void setD203(String d203) {
        this.d203 = d203;
        notifyPropertyChanged(BR.d203);
    }

    @Bindable
    public String getD204() {
        return d204;
    }

    public void setD204(String d204) {
        this.d204 = d204;
        notifyPropertyChanged(BR.d204);
    }

    @Bindable
    public String getD205() {
        return d205;
    }

    public void setD205(String d205) {
        this.d205 = d205;
        notifyPropertyChanged(BR.d205);
    }

    @Bindable
    public String getD206a() {
        return d206a;
    }

    public void setD206a(String d206a) {
        this.d206a = d206a;
        notifyPropertyChanged(BR.d206a);
    }

    @Bindable
    public String getD206b() {
        return d206b;
    }

    public void setD206b(String d206b) {
        this.d206b = d206b;
        setD206c(d206b.equals("1") ? this.d206c : "");
        notifyPropertyChanged(BR.d206b);
    }

    @Bindable
    public String getD206c() {
        return d206c;
    }

    public void setD206c(String d206c) {
        this.d206c = d206c;
        notifyPropertyChanged(BR.d206c);
    }

    @Bindable
    public String getD206d() {
        return d206d;
    }

    public void setD206d(String d206d) {
        this.d206d = d206d;
        setD206e(d206d.equals("1") ? this.d206e : "");
        setD206f(d206d.equals("1") ? this.d206f : "");
        notifyPropertyChanged(BR.d206d);
    }

    @Bindable
    public String getD206e() {
        return d206e;
    }

    public void setD206e(String d206e) {
        this.d206e = d206e;
        notifyPropertyChanged(BR.d206e);
    }

    @Bindable
    public String getD206f() {
        return d206f;
    }

    public void setD206f(String d206f) {
        this.d206f = d206f;
        notifyPropertyChanged(BR.d206f);
    }

    @Bindable
    public String getD206g() {
        return d206g;
    }

    public void setD206g(String d206g) {
        this.d206g = d206g;
        setD206h(d206g.equals("1") ? this.d206h : "");
        setD206i(d206g.equals("1") ? this.d206i : "");
        notifyPropertyChanged(BR.d206g);
    }

    @Bindable
    public String getD206h() {
        return d206h;
    }

    public void setD206h(String d206h) {
        this.d206h = d206h;
        notifyPropertyChanged(BR.d206h);
    }

    @Bindable
    public String getD206i() {
        return d206i;
    }

    public void setD206i(String d206i) {
        this.d206i = d206i;
        notifyPropertyChanged(BR.d206i);
    }

    @Bindable
    public String getD206j() {
        return d206j;
    }

    public void setD206j(String d206j) {
        this.d206j = d206j;
        notifyPropertyChanged(BR.d206j);
    }

    @Bindable
    public String getD206k() {
        return d206k;
    }

    public void setD206k(String d206k) {
        this.d206k = d206k;
        notifyPropertyChanged(BR.d206k);
    }

    @Bindable
    public String getD206l() {
        return d206l;
    }

    public void setD206l(String d206l) {
        this.d206l = d206l;
        notifyPropertyChanged(BR.d206l);
    }

    @Bindable
    public String getD206m() {
        return d206m;
    }

    public void setD206m(String d206m) {
        this.d206m = d206m;
        setD206n(d206m.equals("1") ? this.d206n : "");
        setD206o(d206m.equals("1") ? this.d206o : "");
        notifyPropertyChanged(BR.d206m);
    }

    @Bindable
    public String getD206n() {
        return d206n;
    }

    public void setD206n(String d206n) {
        this.d206n = d206n;
        notifyPropertyChanged(BR.d206n);
    }

    @Bindable
    public String getD206o() {
        return d206o;
    }

    public void setD206o(String d206o) {
        this.d206o = d206o;
        notifyPropertyChanged(BR.d206o);
    }

    @Bindable
    public String getD206p() {
        return d206p;
    }

    public void setD206p(String d206p) {
        this.d206p = d206p;
        setD206q(d206p.equals("1") ? this.d206q : "");
        notifyPropertyChanged(BR.d206p);
    }

    @Bindable
    public String getD206q() {
        return d206q;
    }

    public void setD206q(String d206q) {
        this.d206q = d206q;
        notifyPropertyChanged(BR.d206q);
    }

    @Bindable
    public String getD207a() {
        return d207a;
    }

    public void setD207a(String d207a) {
        this.d207a = d207a;
        setD207b(d207a.equals("1") ? this.d207b : "");
        notifyPropertyChanged(BR.d207a);
    }

    @Bindable
    public String getD207b() {
        return d207b;
    }

    public void setD207b(String d207b) {
        this.d207b = d207b;
        notifyPropertyChanged(BR.d207b);
    }

    @Bindable
    public String getD207c() {
        return d207c;
    }

    public void setD207c(String d207c) {
        this.d207c = d207c;
        notifyPropertyChanged(BR.d207c);
    }

    @Bindable
    public String getD207d() {
        return d207d;
    }

    public void setD207d(String d207d) {
        this.d207d = d207d;
        notifyPropertyChanged(BR.d207d);
    }

    @Bindable
    public String getD207e() {
        return d207e;
    }

    public void setD207e(String d207e) {
        this.d207e = d207e;
        notifyPropertyChanged(BR.d207e);
    }

    @Bindable
    public String getD207f() {
        return d207f;
    }

    public void setD207f(String d207f) {
        this.d207f = d207f;
        notifyPropertyChanged(BR.d207f);
    }

    @Bindable
    public String getD207g() {
        return d207g;
    }

    public void setD207g(String d207g) {
        this.d207g = d207g;
        notifyPropertyChanged(BR.d207g);
    }

    @Bindable
    public String getD207h() {
        return d207h;
    }

    public void setD207h(String d207h) {
        this.d207h = d207h;
        notifyPropertyChanged(BR.d207h);
    }

    @Bindable
    public String getD207i() {
        return d207i;
    }

    public void setD207i(String d207i) {
        this.d207i = d207i;
        notifyPropertyChanged(BR.d207i);
    }

    @Bindable
    public String getD207j() {
        return d207j;
    }

    public void setD207j(String d207j) {
        this.d207j = d207j;
        notifyPropertyChanged(BR.d207j);
    }

    @Bindable
    public String getD207k() {
        return d207k;
    }

    public void setD207k(String d207k) {
        this.d207k = d207k;
        notifyPropertyChanged(BR.d207k);
    }

    @Bindable
    public String getD207l() {
        return d207l;
    }

    public void setD207l(String d207l) {
        this.d207l = d207l;
        notifyPropertyChanged(BR.d207l);
    }

    @Bindable
    public String getD207m() {
        return d207m;
    }

    public void setD207m(String d207m) {
        this.d207m = d207m;
        notifyPropertyChanged(BR.d207m);
    }

    @Bindable
    public String getD207n() {
        return d207n;
    }

    public void setD207n(String d207n) {
        this.d207n = d207n;
        notifyPropertyChanged(BR.d207n);
    }

    @Bindable
    public String getD207o() {
        return d207o;
    }

    public void setD207o(String d207o) {
        this.d207o = d207o;
        notifyPropertyChanged(BR.d207o);
    }

    @Bindable
    public String getD207p() {
        return d207p;
    }

    public void setD207p(String d207p) {
        this.d207p = d207p;
        notifyPropertyChanged(BR.d207p);
    }

    @Bindable
    public String getD207q() {
        return d207q;
    }

    public void setD207q(String d207q) {
        this.d207q = d207q;
        notifyPropertyChanged(BR.d207q);
    }

    @Bindable
    public String getD207r() {
        return d207r;
    }

    public void setD207r(String d207r) {
        this.d207r = d207r;
        setD207s(d207r.equals("1") ? this.d207s : "");
        notifyPropertyChanged(BR.d207r);
    }

    @Bindable
    public String getD207s() {
        return d207s;
    }

    public void setD207s(String d207s) {
        this.d207s = d207s;
        notifyPropertyChanged(BR.d207s);
    }

    @Bindable
    public String getD208() {
        return d208;
    }

    public void setD208(String d208) {
        this.d208 = d208;
        notifyPropertyChanged(BR.d208);
    }

    @Bindable
    public String getD209() {
        return d209;
    }

    public void setD209(String d209) {
        this.d209 = d209;
        setD210(d209.equals("1") ? this.d210 : "");
        setD211(d209.equals("1") ? this.d211 : "");

        notifyPropertyChanged(BR.d209);
    }

    @Bindable
    public String getD210() {
        return d210;
    }

    public void setD210(String d210) {
        this.d210 = d210;
        setD21001x(d210.equals("1") ? this.d21001x : "");
        setD21002x(d210.equals("2") ? this.d21002x : "");
        notifyPropertyChanged(BR.d210);
    }

    @Bindable
    public String getD21001x() {
        return d21001x;
    }

    public void setD21001x(String d21001x) {
        this.d21001x = d21001x;
        notifyPropertyChanged(BR.d21001x);
    }

    @Bindable
    public String getD21002x() {
        return d21002x;
    }

    public void setD21002x(String d21002x) {
        this.d21002x = d21002x;
        notifyPropertyChanged(BR.d21002x);
    }

    @Bindable
    public String getD211() {
        return d211;
    }

    public void setD211(String d211) {
        this.d211 = d211;
        setD21196x(d211.equals("96") ? this.d21196x : ""); // For all other
        notifyPropertyChanged(BR.d211);
    }

    @Bindable
    public String getD21196x() {
        return d21196x;
    }

    public void setD21196x(String d21196x) {
        this.d21196x = d21196x;
        notifyPropertyChanged(BR.d21196x);
    }

    @Bindable
    public String getD301() {
        return d301;
    }

    public void setD301(String d301) {
        this.d301 = d301;
        setD302(d301.equals("1") ? this.d302 : "");
        setD303(d301.equals("2") ? this.d303 : "");
        setD308(d301.equals("2") ? this.d308 : "");
        setD309(d301.equals("2") ? this.d309 : "");
        setD310(d301.equals("2") ? this.d310 : "");
        setD311(d301.equals("2") ? this.d311 : "");
        setD312(d301.equals("2") ? this.d312 : "");
        setD313(d301.equals("2") ? this.d313 : "");
        setD314(d301.equals("2") ? this.d314 : "");
        setD315(d301.equals("2") ? this.d315 : "");
        setD316(d301.equals("2") ? this.d316 : "");
        setD317(d301.equals("2") ? this.d317 : "");
        setD318(d301.equals("2") ? this.d318 : "");
        setD319(d301.equals("2") ? this.d319 : "");
        setD320(d301.equals("2") ? this.d320 : "");
        setD321(d301.equals("2") ? this.d321 : "");
        setD322(d301.equals("2") ? this.d322 : "");
        setD323a(d301.equals("2") ? this.d323a : "");
        setD323b01(d301.equals("2") ? this.d323b01 : "");
        setD323b02(d301.equals("2") ? this.d323b02 : "");
        notifyPropertyChanged(BR.d301);
    }

    @Bindable
    public String getD302() {
        return d302;
    }

    public void setD302(String d302) {
        this.d302 = d302;
        setD303(d302.equals("1") ? "" : this.d303);
        setD304d(d302.equals("1") ? this.d304d : "");
        setD304m(d302.equals("1") ? this.d304m : "");
        setD304y(d302.equals("1") ? this.d304y : "");

        setD30501d(d302.equals("1") ? this.d30501d : "");
        setD30501m(d302.equals("1") ? this.d30501m : "");
        setD30501y(d302.equals("1") ? this.d30501y : "");

        setD30502d(d302.equals("1") ? this.d30502d : "");
        setD30502m(d302.equals("1") ? this.d30502m : "");
        setD30502y(d302.equals("1") ? this.d30502y : "");

        setD30503d(d302.equals("1") ? this.d30503d : "");
        setD30503m(d302.equals("1") ? this.d30503m : "");
        setD30503y(d302.equals("1") ? this.d30503y : "");

        setD30504d(d302.equals("1") ? this.d30504d : "");
        setD30504m(d302.equals("1") ? this.d30504m : "");
        setD30504y(d302.equals("1") ? this.d30504y : "");

        setD30505d(d302.equals("1") ? this.d30505d : "");
        setD30505m(d302.equals("1") ? this.d30505m : "");
        setD30505y(d302.equals("1") ? this.d30505y : "");

        setD30506d(d302.equals("1") ? this.d30506d : "");
        setD30506m(d302.equals("1") ? this.d30506m : "");
        setD30506y(d302.equals("1") ? this.d30506y : "");

        setD30507d(d302.equals("1") ? this.d30507d : "");
        setD30507m(d302.equals("1") ? this.d30507m : "");
        setD30507y(d302.equals("1") ? this.d30507y : "");

        setD30508d(d302.equals("1") ? this.d30508d : "");
        setD30508m(d302.equals("1") ? this.d30508m : "");
        setD30508y(d302.equals("1") ? this.d30508y : "");

        setD30509d(d302.equals("1") ? this.d30509d : "");
        setD30509m(d302.equals("1") ? this.d30509m : "");
        setD30509y(d302.equals("1") ? this.d30509y : "");

        setD30510d(d302.equals("1") ? this.d30510d : "");
        setD30510m(d302.equals("1") ? this.d30510m : "");
        setD30510y(d302.equals("1") ? this.d30510y : "");

        setD30511d(d302.equals("1") ? this.d30511d : "");
        setD30511m(d302.equals("1") ? this.d30511m : "");
        setD30511y(d302.equals("1") ? this.d30511y : "");

        setD30512d(d302.equals("1") ? this.d30512d : "");
        setD30512m(d302.equals("1") ? this.d30512m : "");
        setD30512y(d302.equals("1") ? this.d30512y : "");

        setD30513d(d302.equals("1") ? this.d30513d : "");
        setD30513m(d302.equals("1") ? this.d30513m : "");
        setD30513y(d302.equals("1") ? this.d30513y : "");

        setD30514d(d302.equals("1") ? this.d30514d : "");
        setD30514m(d302.equals("1") ? this.d30514m : "");
        setD30514y(d302.equals("1") ? this.d30514y : "");

        setD30515d(d302.equals("1") ? this.d30515d : "");
        setD30515m(d302.equals("1") ? this.d30515m : "");
        setD30515y(d302.equals("1") ? this.d30515y : "");

        setD30516d(d302.equals("1") ? this.d30507d : "");
        setD30516m(d302.equals("1") ? this.d30507m : "");
        setD30516y(d302.equals("1") ? this.d30516y : "");

        setD307(d302.equals("1") ? this.d307 : "");

        setD308(d302.equals("2") ? this.d308 : "");
        setD309(d302.equals("2") ? this.d309 : "");
        setD310(d302.equals("2") ? this.d310 : "");
        setD311(d302.equals("2") ? this.d311 : "");
        setD312(d302.equals("2") ? this.d312 : "");
        setD313(d302.equals("2") ? this.d313 : "");
        setD314(d302.equals("2") ? this.d314 : "");
        setD315(d302.equals("2") ? this.d315 : "");
        setD316(d302.equals("2") ? this.d316 : "");
        setD317(d302.equals("2") ? this.d317 : "");
        setD318(d302.equals("2") ? this.d318 : "");
        setD319(d302.equals("2") ? this.d319 : "");
        setD320(d302.equals("2") ? this.d320 : "");
        setD321(d302.equals("2") ? this.d321 : "");
        setD322(d302.equals("2") ? this.d322 : "");
        setD323a(d302.equals("2") ? this.d323a : "");
        setD323b01(d302.equals("2") ? this.d323b01 : "");
        setD323b02(d302.equals("2") ? this.d323b02 : "");
        notifyPropertyChanged(BR.d302);
    }

    @Bindable
    public String getD303() {
        return d303;
    }

    public void setD303(String d303) {
        this.d303 = d303;
        setD30396x(d303.equals("96") ? this.d30396x : "");
        notifyPropertyChanged(BR.d303);
    }

    @Bindable
    public String getD30396x() {
        return d30396x;
    }

    public void setD30396x(String d30396x) {
        this.d30396x = d30396x;
        notifyPropertyChanged(BR.d30396x);
    }

    @Bindable
    public String getD304d() {
        return d304d;
    }

    public void setD304d(String d304d) {
        this.d304d = d304d;
        notifyPropertyChanged(BR.d304d);
    }

    @Bindable
    public String getD304m() {
        return d304m;
    }

    public void setD304m(String d304m) {
        this.d304m = d304m;
        notifyPropertyChanged(BR.d304m);
    }

    @Bindable
    public String getD304y() {
        return d304y;
    }

    public void setD304y(String d304y) {
        this.d304y = d304y;
        notifyPropertyChanged(BR.d304y);
    }

    @Bindable
    public String getCheck0() {
        return check0;
    }

    public void setCheck0(String check0) {
        if (this.check0.equals(check0)) return;
        this.check0 = check0;
        setD30502d(check0.equals("0") ? this.d30501d : "");
        setD30502m(check0.equals("0") ? this.d30501m : "");
        setD30502y(check0.equals("0") ? this.d30501y : "");
        notifyPropertyChanged(BR.check0);
    }

    @Bindable
    public String getCheck6() {
        return check6;
    }

    public void setCheck6(String check6) {
        if (this.check6.equals(check6)) return;
        this.check6 = check6;
        setD30504d(check6.equals("6") ? this.d30503d : "");
        setD30504m(check6.equals("6") ? this.d30503m : "");
        setD30504y(check6.equals("6") ? this.d30503y : "");
        setD30505d(check6.equals("6") ? this.d30503d : "");
        setD30505m(check6.equals("6") ? this.d30503m : "");
        setD30505y(check6.equals("6") ? this.d30503y : "");
        setD30506d(check6.equals("6") ? this.d30503d : "");
        setD30506m(check6.equals("6") ? this.d30503m : "");
        setD30506y(check6.equals("6") ? this.d30503y : "");
        notifyPropertyChanged(BR.check6);
    }

    @Bindable
    public String getCheck10() {
        return check10;
    }

    public void setCheck10(String check10) {
        if (this.check10.equals(check10)) return;
        this.check10 = check10;
        setD30508d(check10.equals("10") ? this.d30507d : "");
        setD30508m(check10.equals("10") ? this.d30507m : "");
        setD30508y(check10.equals("10") ? this.d30507y : "");
        setD30509d(check10.equals("10") ? this.d30507d : "");
        setD30509m(check10.equals("10") ? this.d30507m : "");
        setD30509y(check10.equals("10") ? this.d30507y : "");
        setD30510d(check10.equals("10") ? this.d30507d : "");
        setD30510m(check10.equals("10") ? this.d30507m : "");
        setD30510y(check10.equals("10") ? this.d30507y : "");
        notifyPropertyChanged(BR.check10);
    }

    @Bindable
    public String getCheck14() {
        return check14;
    }

    public void setCheck14(String check14) {
        if (this.check14.equals(check14)) return;
        this.check14 = check14;
        setD30512d(check14.equals("14") ? this.d30511d : "");
        setD30512m(check14.equals("14") ? this.d30511m : "");
        setD30512y(check14.equals("14") ? this.d30511y : "");
        setD30513d(check14.equals("14") ? this.d30511d : "");
        setD30513m(check14.equals("14") ? this.d30511m : "");
        setD30513y(check14.equals("14") ? this.d30511y : "");
        setD30514d(check14.equals("14") ? this.d30511d : "");
        setD30514m(check14.equals("14") ? this.d30511m : "");
        setD30514y(check14.equals("14") ? this.d30511y : "");
        notifyPropertyChanged(BR.check14);
    }

    @Bindable
    public String getD30501d() {
        return d30501d;
    }

    public void setD30501d(String d30501d) {
        this.d30501d = d30501d;
        boolean b = d30501d.length() > 0 && Integer.parseInt(d30501d) > 31;
        setD30501m(b ? "" : this.d30501m);
        setD30501y(b ? "" : this.d30501y);
        notifyPropertyChanged(BR.d30501d);
    }

    @Bindable
    public String getD30501m() {
        return d30501m;
    }

    public void setD30501m(String d30501m) {
        this.d30501m = d30501m;
        notifyPropertyChanged(BR.d30501m);
    }

    @Bindable
    public String getD30501y() {
        return d30501y;
    }

    public void setD30501y(String d30501y) {
        this.d30501y = d30501y;
        setCheck0(d30501y.length() == 4 ? this.check0 : "");
        notifyPropertyChanged(BR.d30501y);
    }

    @Bindable
    public String getD30502d() {
        return d30502d;
    }

    public void setD30502d(String d30502d) {
        this.d30502d = d30502d;
        boolean b = d30502d.length() > 0 && Integer.parseInt(d30502d) > 31;
        setD30502m(b ? "" : this.d30502m);
        setD30502y(b ? "" : this.d30502y);
        notifyPropertyChanged(BR.d30502d);
    }

    @Bindable
    public String getD30502m() {
        return d30502m;
    }

    public void setD30502m(String d30502m) {
        this.d30502m = d30502m;
        notifyPropertyChanged(BR.d30502m);
    }

    @Bindable
    public String getD30502y() {
        return d30502y;
    }

    public void setD30502y(String d30502y) {
        this.d30502y = d30502y;
        notifyPropertyChanged(BR.d30502y);
    }

    @Bindable
    public String getD30503d() {
        return d30503d;
    }

    public void setD30503d(String d30503d) {
        this.d30503d = d30503d;
        boolean b = d30503d.length() > 0 && Integer.parseInt(d30503d) > 31;
        setD30503m(b ? "" : this.d30503m);
        setD30503y(b ? "" : this.d30503y);
        notifyPropertyChanged(BR.d30503d);
    }

    @Bindable
    public String getD30503m() {
        return d30503m;
    }

    public void setD30503m(String d30503m) {
        this.d30503m = d30503m;
        notifyPropertyChanged(BR.d30503m);
    }

    @Bindable
    public String getD30503y() {
        return d30503y;
    }

    public void setD30503y(String d30503y) {
        this.d30503y = d30503y;
        setCheck6(d30503y.length() == 4 ? this.check6 : "");
        notifyPropertyChanged(BR.d30503y);
    }

    @Bindable
    public String getD30504d() {
        return d30504d;
    }

    public void setD30504d(String d30504d) {
        this.d30504d = d30504d;
        boolean b = d30504d.length() > 0 && Integer.parseInt(d30504d) > 31;
        setD30504m(b ? "" : this.d30504m);
        setD30504y(b ? "" : this.d30504y);
        notifyPropertyChanged(BR.d30504d);
    }

    @Bindable
    public String getD30504m() {
        return d30504m;
    }

    public void setD30504m(String d30504m) {
        this.d30504m = d30504m;
        notifyPropertyChanged(BR.d30504m);
    }

    @Bindable
    public String getD30504y() {
        return d30504y;
    }

    public void setD30504y(String d30504y) {
        this.d30504y = d30504y;
        notifyPropertyChanged(BR.d30504y);
    }

    @Bindable
    public String getD30505d() {
        return d30505d;
    }

    public void setD30505d(String d30505d) {
        this.d30505d = d30505d;
        boolean b = d30505d.length() > 0 && Integer.parseInt(d30505d) > 31;
        setD30505m(b ? "" : this.d30505m);
        setD30505y(b ? "" : this.d30505y);
        notifyPropertyChanged(BR.d30505d);
    }

    @Bindable
    public String getD30505m() {
        return d30505m;
    }

    public void setD30505m(String d30505m) {
        this.d30505m = d30505m;
        notifyPropertyChanged(BR.d30505m);
    }

    @Bindable
    public String getD30505y() {
        return d30505y;
    }

    public void setD30505y(String d30505y) {
        this.d30505y = d30505y;
        notifyPropertyChanged(BR.d30505y);
    }

    @Bindable
    public String getD30506d() {
        return d30506d;
    }

    public void setD30506d(String d30506d) {
        this.d30506d = d30506d;
        boolean b = d30506d.length() > 0 && Integer.parseInt(d30506d) > 31;
        setD30506m(b ? "" : this.d30506m);
        setD30506y(b ? "" : this.d30506y);
        notifyPropertyChanged(BR.d30506d);
    }

    @Bindable
    public String getD30506m() {
        return d30506m;
    }

    public void setD30506m(String d30506m) {
        this.d30506m = d30506m;
        notifyPropertyChanged(BR.d30506m);
    }

    @Bindable
    public String getD30506y() {
        return d30506y;
    }

    public void setD30506y(String d30506y) {
        this.d30506y = d30506y;
        notifyPropertyChanged(BR.d30506y);
    }

    @Bindable
    public String getD30507d() {
        return d30507d;
    }

    public void setD30507d(String d30507d) {
        this.d30507d = d30507d;
        boolean b = d30507d.length() > 0 && Integer.parseInt(d30507d) > 31;
        setD30507m(b ? "" : this.d30507m);
        setD30507y(b ? "" : this.d30507y);
        notifyPropertyChanged(BR.d30507d);
    }

    @Bindable
    public String getD30507m() {
        return d30507m;
    }

    public void setD30507m(String d30507m) {
        this.d30507m = d30507m;
        notifyPropertyChanged(BR.d30507m);
    }

    @Bindable
    public String getD30507y() {
        return d30507y;
    }

    public void setD30507y(String d30507y) {
        this.d30507y = d30507y;
        setCheck10(d30507y.length() == 4 ? this.check10 : "");
        notifyPropertyChanged(BR.d30507y);
    }

    @Bindable
    public String getD30508d() {
        return d30508d;
    }

    public void setD30508d(String d30508d) {
        this.d30508d = d30508d;
        boolean b = d30508d.length() > 0 && Integer.parseInt(d30508d) > 31;
        setD30508m(b ? "" : this.d30508m);
        setD30508y(b ? "" : this.d30508y);
        notifyPropertyChanged(BR.d30508d);
    }

    @Bindable
    public String getD30508m() {
        return d30508m;
    }

    public void setD30508m(String d30508m) {
        this.d30508m = d30508m;
        notifyPropertyChanged(BR.d30508m);
    }

    @Bindable
    public String getD30508y() {
        return d30508y;
    }

    public void setD30508y(String d30508y) {
        this.d30508y = d30508y;
        notifyPropertyChanged(BR.d30508y);
    }

    @Bindable
    public String getD30509d() {
        return d30509d;
    }

    public void setD30509d(String d30509d) {
        this.d30509d = d30509d;
        boolean b = d30509d.length() > 0 && Integer.parseInt(d30509d) > 31;
        setD30509m(b ? "" : this.d30509m);
        setD30509y(b ? "" : this.d30509y);
        notifyPropertyChanged(BR.d30509d);
    }

    @Bindable
    public String getD30509m() {
        return d30509m;
    }

    public void setD30509m(String d30509m) {
        this.d30509m = d30509m;
        notifyPropertyChanged(BR.d30509m);
    }

    @Bindable
    public String getD30509y() {
        return d30509y;
    }

    public void setD30509y(String d30509y) {
        this.d30509y = d30509y;
        notifyPropertyChanged(BR.d30509y);
    }

    @Bindable
    public String getD30510d() {
        return d30510d;
    }

    public void setD30510d(String d30510d) {
        this.d30510d = d30510d;
        boolean b = d30510d.length() > 0 && Integer.parseInt(d30510d) > 31;
        setD30510m(b ? "" : this.d30510m);
        setD30510y(b ? "" : this.d30510y);
        notifyPropertyChanged(BR.d30510d);
    }

    @Bindable
    public String getD30510m() {
        return d30510m;
    }

    public void setD30510m(String d30510m) {
        this.d30510m = d30510m;
        notifyPropertyChanged(BR.d30510m);
    }

    @Bindable
    public String getD30510y() {
        return d30510y;
    }

    public void setD30510y(String d30510y) {
        this.d30510y = d30510y;
        notifyPropertyChanged(BR.d30510y);
    }

    @Bindable
    public String getD30511d() {
        return d30511d;
    }

    public void setD30511d(String d30511d) {
        this.d30511d = d30511d;
        boolean b = d30511d.length() > 0 && Integer.parseInt(d30511d) > 31;
        setD30511m(b ? "" : this.d30511m);
        setD30511y(b ? "" : this.d30511y);
        notifyPropertyChanged(BR.d30511d);
    }

    @Bindable
    public String getD30511m() {
        return d30511m;
    }

    public void setD30511m(String d30511m) {
        this.d30511m = d30511m;
        notifyPropertyChanged(BR.d30511m);
    }

    @Bindable
    public String getD30511y() {
        return d30511y;
    }

    public void setD30511y(String d30511y) {
        this.d30511y = d30511y;
        setCheck14(d30511y.length() == 4 ? this.check14 : "");
        notifyPropertyChanged(BR.d30511y);
    }

    @Bindable
    public String getD30512d() {
        return d30512d;
    }

    public void setD30512d(String d30512d) {
        this.d30512d = d30512d;
        boolean b = d30512d.length() > 0 && Integer.parseInt(d30512d) > 31;
        setD30512m(b ? "" : this.d30512m);
        setD30512y(b ? "" : this.d30512y);
        notifyPropertyChanged(BR.d30512d);
    }

    @Bindable
    public String getD30512m() {
        return d30512m;
    }

    public void setD30512m(String d30512m) {
        this.d30512m = d30512m;
        notifyPropertyChanged(BR.d30512m);
    }

    @Bindable
    public String getD30512y() {
        return d30512y;
    }

    public void setD30512y(String d30512y) {
        this.d30512y = d30512y;
        notifyPropertyChanged(BR.d30512y);
    }

    @Bindable
    public String getD30513d() {
        return d30513d;
    }

    public void setD30513d(String d30513d) {
        this.d30513d = d30513d;
        boolean b = d30513d.length() > 0 && Integer.parseInt(d30513d) > 31;
        setD30513m(b ? "" : this.d30513m);
        setD30513y(b ? "" : this.d30513y);
        notifyPropertyChanged(BR.d30513d);
    }

    @Bindable
    public String getD30513m() {
        return d30513m;
    }

    public void setD30513m(String d30513m) {
        this.d30513m = d30513m;
        notifyPropertyChanged(BR.d30513m);
    }

    @Bindable
    public String getD30513y() {
        return d30513y;
    }

    public void setD30513y(String d30513y) {
        this.d30513y = d30513y;
        notifyPropertyChanged(BR.d30513y);
    }

    @Bindable
    public String getD30514d() {
        return d30514d;
    }

    public void setD30514d(String d30514d) {
        this.d30514d = d30514d;
        boolean b = d30514d.length() > 0 && Integer.parseInt(d30514d) > 31;
        setD30514m(b ? "" : this.d30514m);
        setD30514y(b ? "" : this.d30514y);
        notifyPropertyChanged(BR.d30514d);
    }

    @Bindable
    public String getD30514m() {
        return d30514m;
    }

    public void setD30514m(String d30514m) {
        this.d30514m = d30514m;
        notifyPropertyChanged(BR.d30514m);
    }

    @Bindable
    public String getD30514y() {
        return d30514y;
    }

    public void setD30514y(String d30514y) {
        this.d30514y = d30514y;
        notifyPropertyChanged(BR.d30514y);
    }

    @Bindable
    public String getD30515d() {
        return d30515d;
    }

    public void setD30515d(String d30515d) {
        this.d30515d = d30515d;
        boolean b = d30515d.length() > 0 && Integer.parseInt(d30515d) > 31;
        setD30515m(b ? "" : this.d30515m);
        setD30515y(b ? "" : this.d30515y);
        notifyPropertyChanged(BR.d30515d);
    }

    @Bindable
    public String getD30515m() {
        return d30515m;
    }

    public void setD30515m(String d30515m) {
        this.d30515m = d30515m;
        notifyPropertyChanged(BR.d30515m);
    }

    @Bindable
    public String getD30515y() {
        return d30515y;
    }

    public void setD30515y(String d30515y) {
        this.d30515y = d30515y;
        notifyPropertyChanged(BR.d30515y);
    }

    @Bindable
    public String getD30516d() {
        return d30516d;
    }

    public void setD30516d(String d30516d) {
        this.d30516d = d30516d;
        boolean b = d30516d.length() > 0 && Integer.parseInt(d30516d) > 31;
        setD30516m(b ? "" : this.d30516m);
        setD30516y(b ? "" : this.d30516y);
        notifyPropertyChanged(BR.d30516d);
    }

    @Bindable
    public String getD30516m() {
        return d30516m;
    }

    public void setD30516m(String d30516m) {
        this.d30516m = d30516m;
        notifyPropertyChanged(BR.d30516m);
    }

    @Bindable
    public String getD30516y() {
        return d30516y;
    }

    public void setD30516y(String d30516y) {
        this.d30516y = d30516y;
        notifyPropertyChanged(BR.d30516y);
    }

    @Bindable
    public String getD307() {
        return d307;
    }

    public void setD307(String d307) {
        this.d307 = d307;
        notifyPropertyChanged(BR.d307);
    }

    @Bindable
    public String getD308() {
        return d308;
    }

    public void setD308(String d308) {
        this.d308 = d308;
        setD309(d308.equals("1") ? this.d309 : "");
        setD310(d308.equals("1") ? this.d310 : "");
        setD311(d308.equals("1") ? this.d311 : "");
        setD312(d308.equals("1") ? this.d312 : "");
        setD31201x(d308.equals("1") ? this.d31201x : "");
        setD313(d308.equals("1") ? this.d313 : "");
        setD314(d308.equals("1") ? this.d314 : "");
        setD31401x(d308.equals("1") ? this.d31401x : "");
        setD315(d308.equals("1") ? this.d315 : "");
        setD316(d308.equals("1") ? this.d316 : "");
        setD31601x(d308.equals("1") ? this.d31601x : "");
        setD317(d308.equals("1") ? this.d317 : "");
        setD318(d308.equals("1") ? this.d318 : "");
        setD319(d308.equals("1") ? this.d319 : "");
        setD320(d308.equals("1") ? this.d320 : "");
        setD321(d308.equals("1") ? this.d321 : "");
        setD322(d308.equals("1") ? this.d322 : "");
        setD323a(d308.equals("1") ? this.d323a : "");
        setD323b01(d308.equals("1") ? this.d323b01 : "");
        setD323b02(d308.equals("1") ? this.d323b02 : "");
        setD32401(d308.equals("2") || d308.equals("998") ? this.d32401 : "");
        setD32402(d308.equals("2") || d308.equals("998") ? this.d32402 : "");
        setD32403(d308.equals("2") || d308.equals("998") ? this.d32403 : "");
        setD32404(d308.equals("2") || d308.equals("998") ? this.d32404 : "");
        setD32405(d308.equals("2") || d308.equals("998") ? this.d32405 : "");
        setD32406(d308.equals("2") || d308.equals("998") ? this.d32406 : "");
        setD32407(d308.equals("2") || d308.equals("998") ? this.d32407 : "");
        setD32408(d308.equals("2") || d308.equals("998") ? this.d32408 : "");
        setD32409(d308.equals("2") || d308.equals("998") ? this.d32409 : "");
        setD32410(d308.equals("2") || d308.equals("998") ? this.d32410 : "");
        setD32411(d308.equals("2") || d308.equals("998") ? this.d32411 : "");
        setD32412(d308.equals("2") || d308.equals("998") ? this.d32412 : "");
        setD32413(d308.equals("2") || d308.equals("998") ? this.d32413 : "");
        setD32414(d308.equals("2") || d308.equals("998") ? this.d32414 : "");
        setD32415(d308.equals("2") || d308.equals("998") ? this.d32415 : "");
        setD32416(d308.equals("2") || d308.equals("998") ? this.d32416 : "");
        setD32417(d308.equals("2") || d308.equals("998") ? this.d32417 : "");
        setD324998(d308.equals("2") || d308.equals("998") ? this.d324998 : "");
        setD32496(d308.equals("2") || d308.equals("998") ? this.d32496 : "");
        notifyPropertyChanged(BR.d308);
    }

    @Bindable
    public String getD309() {
        return d309;
    }

    public void setD309(String d309) {
        this.d309 = d309;
        notifyPropertyChanged(BR.d309);
    }

    @Bindable
    public String getD310() {
        return d310;
    }

    public void setD310(String d310) {
        this.d310 = d310;
        setD311(d310.equals("1") ? this.d311 : "");
        setD312(d310.equals("1") ? this.d312 : "");
        notifyPropertyChanged(BR.d310);
    }

    @Bindable
    public String getD311() {
        return d311;
    }

    public void setD311(String d311) {
        this.d311 = d311;
        notifyPropertyChanged(BR.d311);
    }

    @Bindable
    public String getD312() {
        return d312;
    }

    public void setD312(String d312) {
        this.d312 = d312;
        setD31201x(d312.equals("1") ? this.d31201x : "");
        notifyPropertyChanged(BR.d312);
    }

    @Bindable
    public String getD31201x() {
        return d31201x;
    }

    public void setD31201x(String d31201x) {
        this.d31201x = d31201x;
        notifyPropertyChanged(BR.d31201x);
    }

    @Bindable
    public String getD313() {
        return d313;
    }

    public void setD313(String d313) {
        this.d313 = d313;
        setD314(d313.equals("1") ? this.d314 : "");
        notifyPropertyChanged(BR.d313);
    }

    @Bindable
    public String getD314() {
        return d314;
    }

    public void setD314(String d314) {
        this.d314 = d314;
        setD31401x(d314.equals("1") ? this.d31401x : "");
        notifyPropertyChanged(BR.d314);
    }

    @Bindable
    public String getD31401x() {
        return d31401x;
    }

    public void setD31401x(String d31401x) {
        this.d31401x = d31401x;
        notifyPropertyChanged(BR.d31401x);
    }

    @Bindable
    public String getD315() {
        return d315;
    }

    public void setD315(String d315) {
        this.d315 = d315;
        setD316(d315.equals("1") ? this.d316 : "");
        notifyPropertyChanged(BR.d315);
    }

    @Bindable
    public String getD316() {
        return d316;
    }

    public void setD316(String d316) {
        this.d316 = d316;
        setD31601x(d316.equals("1") ? this.d31601x : "");
        notifyPropertyChanged(BR.d316);
    }

    @Bindable
    public String getD31601x() {
        return d31601x;
    }

    public void setD31601x(String d31601x) {
        this.d31601x = d31601x;
        notifyPropertyChanged(BR.d31601x);
    }

    @Bindable
    public String getD317() {
        return d317;
    }

    public void setD317(String d317) {
        this.d317 = d317;
        setD318(d317.equals("1") ? this.d318 : "");
        notifyPropertyChanged(BR.d317);
    }

    @Bindable
    public String getD318() {
        return d318;
    }

    public void setD318(String d318) {
        this.d318 = d318;
        setD31801x(d318.equals("1") ? this.d31801x : "");
        notifyPropertyChanged(BR.d318);
    }

    @Bindable
    public String getD31801x() {
        return d31801x;
    }

    public void setD31801x(String d31801x) {
        this.d31801x = d31801x;
        notifyPropertyChanged(BR.d31801x);
    }

    @Bindable
    public String getD319() {
        return d319;
    }

    public void setD319(String d319) {
        this.d319 = d319;
        notifyPropertyChanged(BR.d319);
    }

    @Bindable
    public String getD320() {
        return d320;
    }

    public void setD320(String d320) {
        this.d320 = d320;
        setD321(d320.equals("1") ? this.d321 : "");
        setD322(d320.equals("1") ? this.d322 : "");
        notifyPropertyChanged(BR.d320);
    }

    @Bindable
    public String getD321() {
        return d321;
    }

    public void setD321(String d321) {
        this.d321 = d321;
        setD32101x(d321.equals("1") ? this.d32101x : "");
        notifyPropertyChanged(BR.d321);
    }

    @Bindable
    public String getD32101x() {
        return d32101x;
    }

    public void setD32101x(String d32101x) {
        this.d32101x = d32101x;
        notifyPropertyChanged(BR.d32101x);
    }

    @Bindable
    public String getD322() {
        return d322;
    }

    public void setD322(String d322) {
        this.d322 = d322;
        setD32296x(d322.equals("96") ? this.d32296x : "");
        setD323a(d322.equals("3") ? "" : this.d323a);
        setD323b01(d322.equals("3") ? "" : this.d323b01);
        setD323b02(d322.equals("3") ? "" : this.d323b02);
        notifyPropertyChanged(BR.d322);
    }

    @Bindable
    public String getD32296x() {
        return d32296x;
    }

    public void setD32296x(String d32296x) {
        this.d32296x = d32296x;
        notifyPropertyChanged(BR.d32296x);
    }

    @Bindable
    public String getD323a() {
        return d323a;
    }

    public void setD323a(String d323a) {
        this.d323a = d323a;
        setD323a96x(d323a.equals("96") ? this.d323a96x : "");
        notifyPropertyChanged(BR.d323a);
    }

    @Bindable
    public String getD323a96x() {
        return d323a96x;
    }

    public void setD323a96x(String d323a96x) {
        this.d323a96x = d323a96x;
        notifyPropertyChanged(BR.d323a96x);
    }

    @Bindable
    public String getD323b01() {
        return d323b01;
    }

    public void setD323b01(String d323b01) {
        this.d323b01 = d323b01;
        notifyPropertyChanged(BR.d323b01);
    }

    @Bindable
    public String getD323b02() {
        return d323b02;
    }

    public void setD323b02(String d323b02) {
        this.d323b02 = d323b02;
        notifyPropertyChanged(BR.d323b02);
    }

    @Bindable
    public String getD324() {
        return d324;
    }

    public void setD324(String d324) {
        this.d324 = d324;
        notifyPropertyChanged(BR.d324);
    }

    @Bindable
    public String getD32401() {
        return d32401;
    }

    public void setD32401(String d32401) {
        if (this.d32401.equals(d32401)) return;
        this.d32401 = d32401;
        notifyPropertyChanged(BR.d32401);
    }

    @Bindable
    public String getD32402() {
        return d32402;
    }

    public void setD32402(String d32402) {
        if (this.d32402.equals(d32402)) return;
        this.d32402 = d32402;
        notifyPropertyChanged(BR.d32402);
    }

    @Bindable
    public String getD32403() {
        return d32403;
    }

    public void setD32403(String d32403) {
        if (this.d32403.equals(d32403)) return;
        this.d32403 = d32403;
        notifyPropertyChanged(BR.d32403);
    }

    @Bindable
    public String getD32404() {
        return d32404;
    }

    public void setD32404(String d32404) {
        if (this.d32404.equals(d32404)) return;
        this.d32404 = d32404;
        notifyPropertyChanged(BR.d32404);
    }

    @Bindable
    public String getD32405() {
        return d32405;
    }

    public void setD32405(String d32405) {
        if (this.d32405.equals(d32405)) return;
        this.d32405 = d32405;
        notifyPropertyChanged(BR.d32405);
    }

    @Bindable
    public String getD32406() {
        return d32406;
    }

    public void setD32406(String d32406) {
        if (this.d32406.equals(d32406)) return;
        this.d32406 = d32406;
        notifyPropertyChanged(BR.d32406);
    }

    @Bindable
    public String getD32407() {
        return d32407;
    }

    public void setD32407(String d32407) {
        if (this.d32407.equals(d32407)) return;
        this.d32407 = d32407;
        notifyPropertyChanged(BR.d32407);
    }

    @Bindable
    public String getD32408() {
        return d32408;
    }

    public void setD32408(String d32408) {
        if (this.d32408.equals(d32408)) return;
        this.d32408 = d32408;
        notifyPropertyChanged(BR.d32408);
    }

    @Bindable
    public String getD32409() {
        return d32409;
    }

    public void setD32409(String d32409) {
        if (this.d32409.equals(d32409)) return;
        this.d32409 = d32409;
        notifyPropertyChanged(BR.d32409);
    }

    @Bindable
    public String getD32410() {
        return d32410;
    }

    public void setD32410(String d32410) {
        if (this.d32410.equals(d32410)) return;
        this.d32410 = d32410;
        notifyPropertyChanged(BR.d32410);
    }

    @Bindable
    public String getD32411() {
        return d32411;
    }

    public void setD32411(String d32411) {
        if (this.d32411.equals(d32411)) return;
        this.d32411 = d32411;
        notifyPropertyChanged(BR.d32411);
    }

    @Bindable
    public String getD32412() {
        return d32412;
    }

    public void setD32412(String d32412) {
        if (this.d32412.equals(d32412)) return;
        this.d32412 = d32412;
        notifyPropertyChanged(BR.d32412);
    }

    @Bindable
    public String getD32413() {
        return d32413;
    }

    public void setD32413(String d32413) {
        if (this.d32413.equals(d32413)) return;
        this.d32413 = d32413;
        notifyPropertyChanged(BR.d32413);
    }

    @Bindable
    public String getD32414() {
        return d32414;
    }

    public void setD32414(String d32414) {
        if (this.d32414.equals(d32414)) return;
        this.d32414 = d32414;
        notifyPropertyChanged(BR.d32414);
    }

    @Bindable
    public String getD32415() {
        return d32415;
    }

    public void setD32415(String d32415) {
        if (this.d32415.equals(d32415)) return;
        this.d32415 = d32415;
        notifyPropertyChanged(BR.d32415);
    }

    @Bindable
    public String getD32416() {
        return d32416;
    }

    public void setD32416(String d32416) {
        if (this.d32416.equals(d32416)) return;
        this.d32416 = d32416;
        notifyPropertyChanged(BR.d32416);
    }

    @Bindable
    public String getD32417() {
        return d32417;
    }

    public void setD32417(String d32417) {
        if (this.d32417.equals(d32417)) return;
        this.d32417 = d32417;
        notifyPropertyChanged(BR.d32417);
    }

    @Bindable
    public String getD324998() {
        return d324998;
    }

    public void setD324998(String d324998) {
        if (this.d324998.equals(d324998)) return;
        this.d324998 = d324998;
        setD32401(d324998.equals("998") ? "" : this.d32401);
        setD32402(d324998.equals("998") ? "" : this.d32402);
        setD32403(d324998.equals("998") ? "" : this.d32403);
        setD32404(d324998.equals("998") ? "" : this.d32404);
        setD32405(d324998.equals("998") ? "" : this.d32405);
        setD32406(d324998.equals("998") ? "" : this.d32406);
        setD32407(d324998.equals("998") ? "" : this.d32407);
        setD32408(d324998.equals("998") ? "" : this.d32408);
        setD32409(d324998.equals("998") ? "" : this.d32409);
        setD32410(d324998.equals("998") ? "" : this.d32410);
        setD32411(d324998.equals("998") ? "" : this.d32411);
        setD32412(d324998.equals("998") ? "" : this.d32412);
        setD32413(d324998.equals("998") ? "" : this.d32413);
        setD32414(d324998.equals("998") ? "" : this.d32414);
        setD32415(d324998.equals("998") ? "" : this.d32415);
        setD32416(d324998.equals("998") ? "" : this.d32416);
        setD32417(d324998.equals("998") ? "" : this.d32417);
        setD32496(d324998.equals("998") ? "" : this.d32496);
        notifyPropertyChanged(BR.d324998);
    }

    @Bindable
    public String getD32496() {
        return d32496;
    }

    public void setD32496(String d32496) {
        if (this.d32496.equals(d32496)) return;
        this.d32496 = d32496;
        setD32496x(d32496.equals("96") ? this.d32496x : "");
        notifyPropertyChanged(BR.d32496);
    }

    @Bindable
    public String getD32496x() {
        return d32496x;
    }

    public void setD32496x(String d32496x) {
        this.d32496x = d32496x;
        notifyPropertyChanged(BR.d32496x);
    }

    @Bindable
    public String getD325() {
        return d325;
    }

    public void setD325(String d325) {
        this.d325 = d325;
        notifyPropertyChanged(BR.d325);
    }

    @Bindable
    public String getD326() {
        return d326;
    }

    public void setD326(String d326) {
        this.d326 = d326;
        setD327(d326.equals("1") ? this.d327 : "");
        setD328(d326.equals("1") ? this.d328 : "");
        setD329(d326.equals("1") ? this.d329 : "");
        setD33001(d326.equals("1") ? "" : this.d33001);
        setD33002(d326.equals("1") ? "" : this.d33002);
        setD33003(d326.equals("1") ? "" : this.d33003);
        setD33004(d326.equals("1") ? "" : this.d33004);
        setD33005(d326.equals("1") ? "" : this.d33005);
        setD33006(d326.equals("1") ? "" : this.d33006);
        setD33007(d326.equals("1") ? "" : this.d33007);
        setD33008(d326.equals("1") ? "" : this.d33008);
        setD33009(d326.equals("1") ? "" : this.d33009);
        setD33010(d326.equals("1") ? "" : this.d33010);
        setD33011(d326.equals("1") ? "" : this.d33011);
        setD33012(d326.equals("1") ? "" : this.d33012);
        setD33013(d326.equals("1") ? "" : this.d33013);
        setD330998(d326.equals("1") ? "" : this.d330998);
        setD33096(d326.equals("1") ? "" : this.d33096);
        notifyPropertyChanged(BR.d326);
    }

    @Bindable
    public String getD327() {
        return d327;
    }

    public void setD327(String d327) {
        this.d327 = d327;
        notifyPropertyChanged(BR.d327);
    }

    @Bindable
    public String getD328() {
        return d328;
    }

    public void setD328(String d328) {
        this.d328 = d328;
        setD329(d328.equals("1") ? this.d329 : "");
        setD33001(d328.equals("1") ? "" : this.d33001);
        setD33002(d328.equals("1") ? "" : this.d33002);
        setD33003(d328.equals("1") ? "" : this.d33003);
        setD33004(d328.equals("1") ? "" : this.d33004);
        setD33005(d328.equals("1") ? "" : this.d33005);
        setD33006(d328.equals("1") ? "" : this.d33006);
        setD33007(d328.equals("1") ? "" : this.d33007);
        setD33008(d328.equals("1") ? "" : this.d33008);
        setD33009(d328.equals("1") ? "" : this.d33009);
        setD33010(d328.equals("1") ? "" : this.d33010);
        setD33011(d328.equals("1") ? "" : this.d33011);
        setD33012(d328.equals("1") ? "" : this.d33012);
        setD33013(d328.equals("1") ? "" : this.d33013);
        setD330998(d328.equals("1") ? "" : this.d330998);
        setD33096(d328.equals("1") ? "" : this.d33096);
        notifyPropertyChanged(BR.d328);
    }

    @Bindable
    public String getD329() {
        return d329;
    }

    public void setD329(String d329) {
        this.d329 = d329;
        notifyPropertyChanged(BR.d329);
    }


    @Bindable
    public String getD33001() {
        return d33001;
    }

    public void setD33001(String d33001) {
        if (this.d33001.equals(d33001)) return;
        this.d33001 = d33001;
        notifyPropertyChanged(BR.d33001);
    }

    @Bindable
    public String getD33002() {
        return d33002;
    }

    public void setD33002(String d33002) {
        if (this.d33002.equals(d33002)) return;
        this.d33002 = d33002;
        notifyPropertyChanged(BR.d33002);
    }

    @Bindable
    public String getD33003() {
        return d33003;
    }

    public void setD33003(String d33003) {
        if (this.d33003.equals(d33003)) return;
        this.d33003 = d33003;
        notifyPropertyChanged(BR.d33003);
    }

    @Bindable
    public String getD33004() {
        return d33004;
    }

    public void setD33004(String d33004) {
        if (this.d33004.equals(d33004)) return;
        this.d33004 = d33004;
        notifyPropertyChanged(BR.d33004);
    }

    @Bindable
    public String getD33005() {
        return d33005;
    }

    public void setD33005(String d33005) {
        if (this.d33005.equals(d33005)) return;
        this.d33005 = d33005;
        notifyPropertyChanged(BR.d33005);
    }

    @Bindable
    public String getD33006() {
        return d33006;
    }

    public void setD33006(String d33006) {
        if (this.d33006.equals(d33006)) return;
        this.d33006 = d33006;
        notifyPropertyChanged(BR.d33006);
    }

    @Bindable
    public String getD33007() {
        return d33007;
    }

    public void setD33007(String d33007) {
        if (this.d33007.equals(d33007)) return;
        this.d33007 = d33007;
        notifyPropertyChanged(BR.d33007);
    }

    @Bindable
    public String getD33008() {
        return d33008;
    }

    public void setD33008(String d33008) {
        if (this.d33008.equals(d33008)) return;
        this.d33008 = d33008;
        notifyPropertyChanged(BR.d33008);
    }

    @Bindable
    public String getD33009() {
        return d33009;
    }

    public void setD33009(String d33009) {
        if (this.d33009.equals(d33009)) return;
        this.d33009 = d33009;
        notifyPropertyChanged(BR.d33009);
    }

    @Bindable
    public String getD33010() {
        return d33010;
    }

    public void setD33010(String d33010) {
        if (this.d33010.equals(d33010)) return;
        this.d33010 = d33010;
        notifyPropertyChanged(BR.d33010);
    }

    @Bindable
    public String getD33011() {
        return d33011;
    }

    public void setD33011(String d33011) {
        if (this.d33011.equals(d33011)) return;
        this.d33011 = d33011;
        notifyPropertyChanged(BR.d33011);
    }

    @Bindable
    public String getD33012() {
        return d33012;
    }

    public void setD33012(String d33012) {
        if (this.d33012.equals(d33012)) return;
        this.d33012 = d33012;
        notifyPropertyChanged(BR.d33012);
    }

    @Bindable
    public String getD33013() {
        return d33013;
    }

    public void setD33013(String d33013) {
        if (this.d33013.equals(d33013)) return;
        this.d33013 = d33013;
        notifyPropertyChanged(BR.d33013);
    }

    @Bindable
    public String getD330998() {
        return d330998;
    }

    public void setD330998(String d330998) {
        if (this.d330998.equals(d330998)) return;
        this.d330998 = d330998;
        setD33001(d330998.equals("998") ? "" : this.d33001);
        setD33002(d330998.equals("998") ? "" : this.d33002);
        setD33003(d330998.equals("998") ? "" : this.d33003);
        setD33004(d330998.equals("998") ? "" : this.d33004);
        setD33005(d330998.equals("998") ? "" : this.d33005);
        setD33006(d330998.equals("998") ? "" : this.d33006);
        setD33007(d330998.equals("998") ? "" : this.d33007);
        setD33008(d330998.equals("998") ? "" : this.d33008);
        setD33009(d330998.equals("998") ? "" : this.d33009);
        setD33010(d330998.equals("998") ? "" : this.d33010);
        setD33011(d330998.equals("998") ? "" : this.d33011);
        setD33012(d330998.equals("998") ? "" : this.d33012);
        setD33013(d330998.equals("998") ? "" : this.d33013);
        setD33096(d330998.equals("998") ? "" : this.d33096);
        notifyPropertyChanged(BR.d330998);
    }

    @Bindable
    public String getD33096() {
        return d33096;
    }

    public void setD33096(String d33096) {
        if (this.d33096.equals(d33096)) return;
        this.d33096 = d33096;
        setD33096x(d33096.equals("96") ? this.d33096x : "");
        notifyPropertyChanged(BR.d33096);
    }

    @Bindable
    public String getD33096x() {
        return d33096x;
    }

    public void setD33096x(String d33096x) {
        this.d33096x = d33096x;
        notifyPropertyChanged(BR.d33096x);
    }

    @Bindable
    public String getD401() {
        return d401;
    }

    public void setD401(String d401) {
        this.d401 = d401;
        notifyPropertyChanged(BR.d401);
    }

    @Bindable
    public String getD40101() {
        return d40101;
    }

    public void setD40101(String d40101) {
        if (this.d40101.equals(d40101)) return;
        this.d40101 = d40101;
        notifyPropertyChanged(BR.d40101);
    }

    @Bindable
    public String getD40102() {
        return d40102;
    }

    public void setD40102(String d40102) {
        if (this.d40102.equals(d40102)) return;
        this.d40102 = d40102;
        notifyPropertyChanged(BR.d40102);
    }

    @Bindable
    public String getD40103() {
        return d40103;
    }

    public void setD40103(String d40103) {
        if (this.d40103.equals(d40103)) return;
        this.d40103 = d40103;
        notifyPropertyChanged(BR.d40103);
    }

    @Bindable
    public String getD40104() {
        return d40104;
    }

    public void setD40104(String d40104) {
        if (this.d40104.equals(d40104)) return;
        this.d40104 = d40104;
        notifyPropertyChanged(BR.d40104);
    }

    @Bindable
    public String getD40105() {
        return d40105;
    }

    public void setD40105(String d40105) {
        if (this.d40105.equals(d40105)) return;
        this.d40105 = d40105;
        notifyPropertyChanged(BR.d40105);
    }

    @Bindable
    public String getD40106() {
        return d40106;
    }

    public void setD40106(String d40106) {
        if (this.d40106.equals(d40106)) return;
        this.d40106 = d40106;
        notifyPropertyChanged(BR.d40106);
    }

    @Bindable
    public String getD40107() {
        return d40107;
    }

    public void setD40107(String d40107) {
        if (this.d40107.equals(d40107)) return;
        this.d40107 = d40107;
        notifyPropertyChanged(BR.d40107);
    }

    @Bindable
    public String getD40108() {
        return d40108;
    }

    public void setD40108(String d40108) {
        if (this.d40108.equals(d40108)) return;
        this.d40108 = d40108;
        notifyPropertyChanged(BR.d40108);
    }

    @Bindable
    public String getD40110() {
        return d40110;
    }

    public void setD40110(String d40110) {
        if (this.d40110.equals(d40110)) return;
        this.d40110 = d40110;
        notifyPropertyChanged(BR.d40110);
    }

    @Bindable
    public String getD40196() {
        return d40196;
    }

    public void setD40196(String d40196) {
        if (this.d40196.equals(d40196)) return;
        this.d40196 = d40196;
        setD40196x(d40196.equals("96") ? this.d40196x : "");
        notifyPropertyChanged(BR.d40196);
    }

    @Bindable
    public String getD40196x() {
        return d40196x;
    }

    public void setD40196x(String d40196x) {
        this.d40196x = d40196x;
        notifyPropertyChanged(BR.d40196x);
    }

    @Bindable
    public String getD401998() {
        return d401998;
    }

    public void setD401998(String d401998) {
        if (this.d401998.equals(d401998)) return;
        this.d401998 = d401998;
        setD40101(d401998.equals("998") ? "" : this.d40101);
        setD40102(d401998.equals("998") ? "" : this.d40102);
        setD40103(d401998.equals("998") ? "" : this.d40103);
        setD40104(d401998.equals("998") ? "" : this.d40104);
        setD40105(d401998.equals("998") ? "" : this.d40105);
        setD40106(d401998.equals("998") ? "" : this.d40106);
        setD40107(d401998.equals("998") ? "" : this.d40107);
        setD40108(d401998.equals("998") ? "" : this.d40108);
        //setD40109(d401998.equals("998") ? "" : this.d40109);
        setD40110(d401998.equals("998") ? "" : this.d40110);
        setD40196(d401998.equals("998") ? "" : this.d40196);

        setD402(d401998.equals("998") ? "" : this.d402);
        setD40301(d401998.equals("998") ? "" : this.d40301);
        setD40302(d401998.equals("998") ? "" : this.d40302);
        setD40303(d401998.equals("998") ? "" : this.d40303);
        setD40304(d401998.equals("998") ? "" : this.d40304);
        setD40305(d401998.equals("998") ? "" : this.d40305);
        setD40306(d401998.equals("998") ? "" : this.d40306);
        setD40307(d401998.equals("998") ? "" : this.d40307);
        setD40308(d401998.equals("998") ? "" : this.d40308);
        setD40396(d401998.equals("998") ? "" : this.d40396);

        setD40401(d401998.equals("998") ? "" : this.d40401);
        setD40402(d401998.equals("998") ? "" : this.d40402);
        setD40403(d401998.equals("998") ? "" : this.d40403);
        setD40404(d401998.equals("998") ? "" : this.d40404);
        setD40405(d401998.equals("998") ? "" : this.d40405);
        setD40406(d401998.equals("998") ? "" : this.d40406);
        setD40407(d401998.equals("998") ? "" : this.d40407);
        setD40408(d401998.equals("998") ? "" : this.d40408);
        setD40409(d401998.equals("998") ? "" : this.d40409);
        setD40410(d401998.equals("998") ? "" : this.d40410);
        setD40411(d401998.equals("998") ? "" : this.d40411);
        setD40496(d401998.equals("998") ? "" : this.d40496);
        setD404998(d401998.equals("998") ? "" : this.d404998);
        notifyPropertyChanged(BR.d401998);
    }

    @Bindable
    public String getD402() {
        return d402;
    }

    public void setD402(String d402) {
        this.d402 = d402;
        setD40301(d402.equals("1") ? this.d40301 : "");
        setD40302(d402.equals("1") ? this.d40302 : "");
        setD40303(d402.equals("1") ? this.d40303 : "");
        setD40304(d402.equals("1") ? this.d40304 : "");
        setD40305(d402.equals("1") ? this.d40305 : "");
        setD40306(d402.equals("1") ? this.d40306 : "");
        setD40307(d402.equals("1") ? this.d40307 : "");
        setD40308(d402.equals("1") ? this.d40308 : "");
        setD40396(d402.equals("1") ? this.d40396 : "");
        setD40401(d402.equals("1") ? this.d40401 : "");
        setD40402(d402.equals("1") ? this.d40402 : "");
        setD40403(d402.equals("1") ? this.d40403 : "");
        setD40404(d402.equals("1") ? this.d40404 : "");
        setD40405(d402.equals("1") ? this.d40405 : "");
        setD40406(d402.equals("1") ? this.d40406 : "");
        setD40407(d402.equals("1") ? this.d40407 : "");
        setD40408(d402.equals("1") ? this.d40408 : "");
        setD40409(d402.equals("1") ? this.d40409 : "");
        setD40410(d402.equals("1") ? this.d40410 : "");
        setD40411(d402.equals("1") ? this.d40411 : "");
        setD40496(d402.equals("1") ? this.d40496 : "");
        setD404998(d402.equals("1") ? this.d404998 : "");
        notifyPropertyChanged(BR.d402);
    }

    @Bindable
    public String getD403() {
        return d403;
    }

    public void setD403(String d403) {
        this.d403 = d403;
        notifyPropertyChanged(BR.d403);
    }

    @Bindable
    public String getD40301() {
        return d40301;
    }

    public void setD40301(String d40301) {
        if (this.d40301.equals(d40301)) return;
        this.d40301 = d40301;
        notifyPropertyChanged(BR.d40301);
    }

    @Bindable
    public String getD40302() {
        return d40302;
    }

    public void setD40302(String d40302) {
        if (this.d40302.equals(d40302)) return;
        this.d40302 = d40302;
        notifyPropertyChanged(BR.d40302);
    }

    @Bindable
    public String getD40303() {
        return d40303;
    }

    public void setD40303(String d40303) {
        if (this.d40303.equals(d40303)) return;
        this.d40303 = d40303;
        notifyPropertyChanged(BR.d40303);
    }

    @Bindable
    public String getD40304() {
        return d40304;
    }

    public void setD40304(String d40304) {
        if (this.d40304.equals(d40304)) return;
        this.d40304 = d40304;
        notifyPropertyChanged(BR.d40304);
    }

    @Bindable
    public String getD40305() {
        return d40305;
    }

    public void setD40305(String d40305) {
        if (this.d40305.equals(d40305)) return;
        this.d40305 = d40305;
        notifyPropertyChanged(BR.d40305);
    }

    @Bindable
    public String getD40306() {
        return d40306;
    }

    public void setD40306(String d40306) {
        if (this.d40306.equals(d40306)) return;
        this.d40306 = d40306;
        notifyPropertyChanged(BR.d40306);
    }

    @Bindable
    public String getD40307() {
        return d40307;
    }

    public void setD40307(String d40307) {
        if (this.d40307.equals(d40307)) return;
        this.d40307 = d40307;
        notifyPropertyChanged(BR.d40307);
    }

    @Bindable
    public String getD40308() {
        return d40308;
    }

    public void setD40308(String d40308) {
        if (this.d40308.equals(d40308)) return;
        this.d40308 = d40308;
        notifyPropertyChanged(BR.d40308);
    }

    @Bindable
    public String getD40396() {
        return d40396;
    }

    public void setD40396(String d40396) {
        if (this.d40396.equals(d40396)) return;
        this.d40396 = d40396;
        setD40396x(d40396.equals("96") ? this.d40396x : "");
        notifyPropertyChanged(BR.d40396);
    }

    @Bindable
    public String getD40396x() {
        return d40396x;
    }

    public void setD40396x(String d40396x) {
        this.d40396x = d40396x;
        notifyPropertyChanged(BR.d40396x);
    }

    @Bindable
    public String getD404() {
        return d404;
    }

    public void setD404(String d404) {
        this.d404 = d404;
        notifyPropertyChanged(BR.d404);
    }

    @Bindable
    public String getD40401() {
        return d40401;
    }

    public void setD40401(String d40401) {
        if (this.d40401.equals(d40401)) return;
        this.d40401 = d40401;
        notifyPropertyChanged(BR.d40401);
    }

    @Bindable
    public String getD40402() {
        return d40402;
    }

    public void setD40402(String d40402) {
        if (this.d40402.equals(d40402)) return;
        this.d40402 = d40402;
        notifyPropertyChanged(BR.d40402);
    }

    @Bindable
    public String getD40403() {
        return d40403;
    }

    public void setD40403(String d40403) {
        if (this.d40403.equals(d40403)) return;
        this.d40403 = d40403;
        notifyPropertyChanged(BR.d40403);
    }

    @Bindable
    public String getD40404() {
        return d40404;
    }

    public void setD40404(String d40404) {
        if (this.d40404.equals(d40404)) return;
        this.d40404 = d40404;
        notifyPropertyChanged(BR.d40404);
    }

    @Bindable
    public String getD40405() {
        return d40405;
    }

    public void setD40405(String d40405) {
        if (this.d40405.equals(d40405)) return;
        this.d40405 = d40405;
        notifyPropertyChanged(BR.d40405);
    }

    @Bindable
    public String getD40406() {
        return d40406;
    }

    public void setD40406(String d40406) {
        if (this.d40406.equals(d40406)) return;
        this.d40406 = d40406;
        notifyPropertyChanged(BR.d40406);
    }

    @Bindable
    public String getD40407() {
        return d40407;
    }

    public void setD40407(String d40407) {
        if (this.d40407.equals(d40407)) return;
        this.d40407 = d40407;
        notifyPropertyChanged(BR.d40407);
    }

    @Bindable
    public String getD40408() {
        return d40408;
    }

    public void setD40408(String d40408) {
        if (this.d40408.equals(d40408)) return;
        this.d40408 = d40408;
        notifyPropertyChanged(BR.d40408);
    }

    @Bindable
    public String getD40409() {
        return d40409;
    }

    public void setD40409(String d40409) {
        if (this.d40409.equals(d40409)) return;
        this.d40409 = d40409;
        notifyPropertyChanged(BR.d40409);
    }

    @Bindable
    public String getD40410() {
        return d40410;
    }

    public void setD40410(String d40410) {
        if (this.d40410.equals(d40410)) return;
        this.d40410 = d40410;
        notifyPropertyChanged(BR.d40410);
    }

    @Bindable
    public String getD40411() {
        return d40411;
    }

    public void setD40411(String d40411) {
        if (this.d40411.equals(d40411)) return;
        this.d40411 = d40411;
        notifyPropertyChanged(BR.d40411);
    }

    @Bindable
    public String getD40496() {
        return d40496;
    }

    public void setD40496(String d40496) {
        if (this.d40496.equals(d40496)) return;
        this.d40496 = d40496;
        setD40496x(d40496.equals("96") ? this.d40496x : "");
        notifyPropertyChanged(BR.d40496);
    }

    @Bindable
    public String getD40496x() {
        return d40496x;
    }

    public void setD40496x(String d40496x) {
        this.d40496x = d40496x;
        notifyPropertyChanged(BR.d40496x);
    }

    @Bindable
    public String getD404998() {
        return d404998;
    }

    public void setD404998(String d404998) {
        if (this.d404998.equals(d404998)) return;
        this.d404998 = d404998;
        setD40401(d404998.equals("998") ? "" : this.d40401);
        setD40402(d404998.equals("998") ? "" : this.d40402);
        setD40403(d404998.equals("998") ? "" : this.d40403);
        setD40404(d404998.equals("998") ? "" : this.d40404);
        setD40405(d404998.equals("998") ? "" : this.d40405);
        setD40406(d404998.equals("998") ? "" : this.d40406);
        setD40407(d404998.equals("998") ? "" : this.d40407);
        setD40408(d404998.equals("998") ? "" : this.d40408);
        setD40409(d404998.equals("998") ? "" : this.d40409);
        setD40410(d404998.equals("998") ? "" : this.d40410);
        setD40411(d404998.equals("998") ? "" : this.d40411);
        setD40496(d404998.equals("998") ? "" : this.d40496);
        notifyPropertyChanged(BR.d404998);
    }


    @Bindable
    public String getDstaa() {
        return dstaa;
    }

    public void setDstaa(String dstaa) {
        this.dstaa = dstaa;
        setDstab(dstaa.equals("2") ? this.dstab : "");
        notifyPropertyChanged(BR.dstaa);
    }

    @Bindable
    public String getDstab() {
        return dstab;
    }

    public void setDstab(String dstab) {
        this.dstab = dstab;
        setDstab96x(dstab.equals("96") ? this.dstab96x : "");
        notifyPropertyChanged(BR.dstab);
    }

    @Bindable
    public String getDstab96x() {
        return dstab96x;
    }

    public void setDstab96x(String dstab96x) {
        this.dstab96x = dstab96x;
        notifyPropertyChanged(BR.dstab96x);
    }


    public Child Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_FMUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_MUID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_INDEXED));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNCED_DATE));

        sD1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SD1)));
        sD2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SD2)));
        sD3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SD3)));
        sD4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SD4)));

        return this;
    }

    public void sD1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d101 = json.getString("d101");
            this.d102 = json.getString("d102");
            this.d103 = json.getString("d103");
            this.d104 = json.getString("d104");
            this.d105 = json.getString("d105");
        }
    }

    public void sD2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d201 = json.getString("d201");
            this.d202 = json.getString("d202");
            this.d20202x = json.getString("d20202x");
            this.d20203x = json.getString("d20203x");
            this.d203 = json.getString("d203");
            this.d204 = json.getString("d204");
            this.d205 = json.getString("d205");
            this.d206a = json.getString("d206a");
            this.d206b = json.getString("d206b");
            this.d206c = json.getString("d206c");
            this.d206d = json.getString("d206d");
            this.d206e = json.getString("d206e");
            this.d206f = json.getString("d206f");
            this.d206g = json.getString("d206g");
            this.d206h = json.getString("d206h");
            this.d206i = json.getString("d206i");
            this.d206j = json.getString("d206j");
            this.d206k = json.getString("d206k");
            this.d206l = json.getString("d206l");
            this.d206m = json.getString("d206m");
            this.d206n = json.getString("d206n");
            this.d206o = json.getString("d206o");
            this.d206p = json.getString("d206p");
            this.d206q = json.getString("d206q");
            this.d207a = json.getString("d207a");
            this.d207b = json.getString("d207b");
            this.d207c = json.getString("d207c");
            this.d207d = json.getString("d207d");
            this.d207e = json.getString("d207e");
            this.d207f = json.getString("d207f");
            this.d207g = json.getString("d207g");
            this.d207h = json.getString("d207h");
            this.d207i = json.getString("d207i");
            this.d207j = json.getString("d207j");
            this.d207k = json.getString("d207k");
            this.d207l = json.getString("d207l");
            this.d207m = json.getString("d207m");
            this.d207n = json.getString("d207n");
            this.d207o = json.getString("d207o");
            this.d207p = json.getString("d207p");
            this.d207q = json.getString("d207q");
            this.d207r = json.getString("d207r");
            this.d207s = json.getString("d207s");
            this.d208 = json.getString("d208");
            this.d209 = json.getString("d209");
            this.d210 = json.getString("d210");
            this.d21001x = json.getString("d21001x");
            this.d21002x = json.getString("d21002x");
            this.d211 = json.getString("d211");
            this.d21196x = json.getString("d21196x");
        }
    }

    public void sD3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d301 = json.getString("d301");
            this.d302 = json.getString("d302");
            this.d303 = json.getString("d303");
            this.d30396x = json.getString("d30396x");
            this.d304d = json.getString("d304d");
            this.d304m = json.getString("d304m");
            this.d304y = json.getString("d304y");
            this.d30501d = json.getString("d30501d");
            this.d30501m = json.getString("d30501m");
            this.d30501y = json.getString("d30501y");
            this.d30502d = json.getString("d30502d");
            this.d30502m = json.getString("d30502m");
            this.d30502y = json.getString("d30502y");
            this.d30503d = json.getString("d30503d");
            this.d30503m = json.getString("d30503m");
            this.d30503y = json.getString("d30503y");
            this.d30504d = json.getString("d30504d");
            this.d30504m = json.getString("d30504m");
            this.d30504y = json.getString("d30504y");
            this.d30505d = json.getString("d30505d");
            this.d30505m = json.getString("d30505m");
            this.d30505y = json.getString("d30505y");
            this.d30506d = json.getString("d30506d");
            this.d30506m = json.getString("d30506m");
            this.d30506y = json.getString("d30506y");
            this.d30507d = json.getString("d30507d");
            this.d30507m = json.getString("d30507m");
            this.d30507y = json.getString("d30507y");
            this.d30508d = json.getString("d30508d");
            this.d30508m = json.getString("d30508m");
            this.d30508y = json.getString("d30508y");
            this.d30509d = json.getString("d30509d");
            this.d30509m = json.getString("d30509m");
            this.d30509y = json.getString("d30509y");
            this.d30510d = json.getString("d30510d");
            this.d30510m = json.getString("d30510m");
            this.d30510y = json.getString("d30510y");
            this.d30511d = json.getString("d30511d");
            this.d30511m = json.getString("d30511m");
            this.d30511y = json.getString("d30511y");
            this.d30512d = json.getString("d30512d");
            this.d30512m = json.getString("d30512m");
            this.d30512y = json.getString("d30512y");
            this.d30513d = json.getString("d30513d");
            this.d30513m = json.getString("d30513m");
            this.d30513y = json.getString("d30513y");
            this.d30514d = json.getString("d30514d");
            this.d30514m = json.getString("d30514m");
            this.d30514y = json.getString("d30514y");
            this.d30515d = json.getString("d30515d");
            this.d30515m = json.getString("d30515m");
            this.d30515y = json.getString("d30515y");
            this.d30516d = json.getString("d30516d");
            this.d30516m = json.getString("d30516m");
            this.d30516y = json.getString("d30516y");
            this.d307 = json.getString("d307");
            this.d308 = json.getString("d308");
            this.d309 = json.getString("d309");
            this.d310 = json.getString("d310");
            this.d311 = json.getString("d311");
            this.d312 = json.getString("d312");
            this.d31201x = json.getString("d31201x");
            this.d313 = json.getString("d313");
            this.d314 = json.getString("d314");
            this.d31401x = json.getString("d31401x");
            this.d315 = json.getString("d315");
            this.d316 = json.getString("d316");
            this.d31601x = json.getString("d31601x");
            this.d317 = json.getString("d317");
            this.d318 = json.getString("d318");
            this.d31801x = json.getString("d31801x");
            this.d319 = json.getString("d319");
            this.d320 = json.getString("d320");
            this.d321 = json.getString("d321");
            this.d32101x = json.getString("d32101x");
            this.d322 = json.getString("d322");
            this.d32296x = json.getString("d32296x");
            this.d323a = json.getString("d323a");
            this.d323a96x = json.getString("d323a96x");
            this.d323b01 = json.getString("d323b01");
            this.d323b02 = json.getString("d323b02");
            this.d324 = json.getString("d324");
            this.d32401 = json.getString("d32401");
            this.d32402 = json.getString("d32402");
            this.d32403 = json.getString("d32403");
            this.d32404 = json.getString("d32404");
            this.d32405 = json.getString("d32405");
            this.d32406 = json.getString("d32406");
            this.d32407 = json.getString("d32407");
            this.d32408 = json.getString("d32408");
            this.d32409 = json.getString("d32409");
            this.d32410 = json.getString("d32410");
            this.d32411 = json.getString("d32411");
            this.d32412 = json.getString("d32412");
            this.d32413 = json.getString("d32413");
            this.d32414 = json.getString("d32414");
            this.d32415 = json.getString("d32415");
            this.d32416 = json.getString("d32416");
            this.d32417 = json.getString("d32417");
            this.d324998 = json.getString("d324998");
            this.d32496 = json.getString("d32496");
            this.d32496x = json.getString("d32496x");
            this.d325 = json.getString("d325");
            this.d326 = json.getString("d326");
            this.d327 = json.getString("d327");
            this.d328 = json.getString("d328");
            this.d329 = json.getString("d329");
            this.d33001 = json.getString("d33001");
            this.d33002 = json.getString("d33002");
            this.d33003 = json.getString("d33003");
            this.d33004 = json.getString("d33004");
            this.d33005 = json.getString("d33005");
            this.d33006 = json.getString("d33006");
            this.d33007 = json.getString("d33007");
            this.d33008 = json.getString("d33008");
            this.d33009 = json.getString("d33009");
            this.d33010 = json.getString("d33010");
            this.d33011 = json.getString("d33011");
            this.d33012 = json.getString("d33012");
            this.d33013 = json.getString("d33013");
            this.d330998 = json.getString("d330998");
            this.d33096 = json.getString("d33096");
            this.d33096x = json.getString("d33096x");
        }
    }

    public void sD4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d401 = json.getString("d401");
            this.d40101 = json.getString("d40101");
            this.d40102 = json.getString("d40102");
            this.d40103 = json.getString("d40103");
            this.d40104 = json.getString("d40104");
            this.d40105 = json.getString("d40105");
            this.d40106 = json.getString("d40106");
            this.d40107 = json.getString("d40107");
            this.d40108 = json.getString("d40108");
            this.d40110 = json.getString("d40110");
            this.d40196 = json.getString("d40196");
            this.d40196x = json.getString("d40196x");
            this.d401998 = json.getString("d401998");
            this.d402 = json.getString("d402");
            this.d403 = json.getString("d403");
            this.d40301 = json.getString("d40301");
            this.d40302 = json.getString("d40302");
            this.d40303 = json.getString("d40303");
            this.d40304 = json.getString("d40304");
            this.d40305 = json.getString("d40305");
            this.d40306 = json.getString("d40306");
            this.d40307 = json.getString("d40307");
            this.d40308 = json.getString("d40308");
            this.d40396 = json.getString("d40396");
            this.d40396x = json.getString("d40396x");
            this.d404 = json.getString("d404");
            this.d40401 = json.getString("d40401");
            this.d40402 = json.getString("d40402");
            this.d40403 = json.getString("d40403");
            this.d40404 = json.getString("d40404");
            this.d40405 = json.getString("d40405");
            this.d40406 = json.getString("d40406");
            this.d40407 = json.getString("d40407");
            this.d40408 = json.getString("d40408");
            this.d40409 = json.getString("d40409");
            this.d40410 = json.getString("d40410");
            this.d40411 = json.getString("d40411");
            this.d40496 = json.getString("d40496");
            this.d40496x = json.getString("d40496x");
            this.d404998 = json.getString("d404998");
            this.dstaa = json.getString("dstaa");
            this.dstab = json.getString("dstab");
            this.dstab96x = json.getString("dstab96x");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.ChildTable.COLUMN_ID, this.id);
        json.put(TableContracts.ChildTable.COLUMN_UID, this.uid);
        json.put(TableContracts.ChildTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.ChildTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.ChildTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.ChildTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.ChildTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.ChildTable.COLUMN_MUID, this.muid);
        json.put(TableContracts.ChildTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.ChildTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.ChildTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.ChildTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.ChildTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.ChildTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.ChildTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.ChildTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.ChildTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(TableContracts.ChildTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.ChildTable.COLUMN_SD1, new JSONObject(sD1toString()));
        json.put(TableContracts.ChildTable.COLUMN_SD2, new JSONObject(sD2toString()));
        json.put(TableContracts.ChildTable.COLUMN_SD3, new JSONObject(sD3toString()));
        json.put(TableContracts.ChildTable.COLUMN_SD4, new JSONObject(sD4toString()));

        return json;
    }

    public String sD1toString() throws JSONException {
        Log.d(TAG, "sD1toString: ");
        JSONObject json = new JSONObject();
        json.put("d101", d101)
                .put("d102", d102)
                .put("d103", d103)
                .put("d104", d104)
                .put("d105", d105);
        return json.toString();
    }

    public String sD2toString() throws JSONException {
        Log.d(TAG, "sD2toString: ");
        JSONObject json = new JSONObject();
        json.put("d201", d201)
                .put("d202", d202)
                .put("d20202x", d20202x)
                .put("d20203x", d20203x)
                .put("d203", d203)
                .put("d204", d204)
                .put("d205", d205)
                .put("d206a", d206a)
                .put("d206b", d206b)
                .put("d206c", d206c)
                .put("d206d", d206d)
                .put("d206e", d206e)
                .put("d206f", d206f)
                .put("d206g", d206g)
                .put("d206h", d206h)
                .put("d206i", d206i)
                .put("d206j", d206j)
                .put("d206k", d206k)
                .put("d206l", d206l)
                .put("d206m", d206m)
                .put("d206n", d206n)
                .put("d206o", d206o)
                .put("d206p", d206p)
                .put("d206q", d206q)
                .put("d207a", d207a)
                .put("d207b", d207b)
                .put("d207c", d207c)
                .put("d207d", d207d)
                .put("d207e", d207e)
                .put("d207f", d207f)
                .put("d207g", d207g)
                .put("d207h", d207h)
                .put("d207i", d207i)
                .put("d207j", d207j)
                .put("d207k", d207k)
                .put("d207l", d207l)
                .put("d207m", d207m)
                .put("d207n", d207n)
                .put("d207o", d207o)
                .put("d207p", d207p)
                .put("d207q", d207q)
                .put("d207r", d207r)
                .put("d207s", d207s)
                .put("d208", d208)
                .put("d209", d209)
                .put("d210", d210)
                .put("d21001x", d21001x)
                .put("d21002x", d21002x)
                .put("d211", d211)
                .put("d21196x", d21196x);
        return json.toString();
    }

    public String sD3toString() throws JSONException {
        Log.d(TAG, "sD3toString: ");
        JSONObject json = new JSONObject();
        json.put("d301", d301)
                .put("d302", d302)
                .put("d303", d303)
                .put("d30396x", d30396x)
                .put("d304d", d304d)
                .put("d304m", d304m)
                .put("d304y", d304y)
                .put("d30501d", d30501d)
                .put("d30501m", d30501m)
                .put("d30501y", d30501y)
                .put("d30502d", d30502d)
                .put("d30502m", d30502m)
                .put("d30502y", d30502y)
                .put("d30503d", d30503d)
                .put("d30503m", d30503m)
                .put("d30503y", d30503y)
                .put("d30504d", d30504d)
                .put("d30504m", d30504m)
                .put("d30504y", d30504y)
                .put("d30505d", d30505d)
                .put("d30505m", d30505m)
                .put("d30505y", d30505y)
                .put("d30506d", d30506d)
                .put("d30506m", d30506m)
                .put("d30506y", d30506y)
                .put("d30507d", d30507d)
                .put("d30507m", d30507m)
                .put("d30507y", d30507y)
                .put("d30508d", d30508d)
                .put("d30508m", d30508m)
                .put("d30508y", d30508y)
                .put("d30509d", d30509d)
                .put("d30509m", d30509m)
                .put("d30509y", d30509y)
                .put("d30510d", d30510d)
                .put("d30510m", d30510m)
                .put("d30510y", d30510y)
                .put("d30511d", d30511d)
                .put("d30511m", d30511m)
                .put("d30511y", d30511y)
                .put("d30512d", d30512d)
                .put("d30512m", d30512m)
                .put("d30512y", d30512y)
                .put("d30513d", d30513d)
                .put("d30513m", d30513m)
                .put("d30513y", d30513y)
                .put("d30514d", d30514d)
                .put("d30514m", d30514m)
                .put("d30514y", d30514y)
                .put("d30515d", d30515d)
                .put("d30515m", d30515m)
                .put("d30515y", d30515y)
                .put("d30516d", d30516d)
                .put("d30516m", d30516m)
                .put("d30516y", d30516y)
                .put("d307", d307)
                .put("d308", d308)
                .put("d309", d309)
                .put("d310", d310)
                .put("d311", d311)
                .put("d312", d312)
                .put("d31201x", d31201x)
                .put("d313", d313)
                .put("d314", d314)
                .put("d31401x", d31401x)
                .put("d315", d315)
                .put("d316", d316)
                .put("d31601x", d31601x)
                .put("d317", d317)
                .put("d318", d318)
                .put("d31801x", d31801x)
                .put("d319", d319)
                .put("d320", d320)
                .put("d321", d321)
                .put("d32101x", d32101x)
                .put("d322", d322)
                .put("d32296x", d32296x)
                .put("d323a", d323a)
                .put("d323a96x", d323a96x)
                .put("d323b01", d323b01)
                .put("d323b02", d323b02)
                .put("d324", d324)
                .put("d32401", d32401)
                .put("d32402", d32402)
                .put("d32403", d32403)
                .put("d32404", d32404)
                .put("d32405", d32405)
                .put("d32406", d32406)
                .put("d32407", d32407)
                .put("d32408", d32408)
                .put("d32409", d32409)
                .put("d32410", d32410)
                .put("d32411", d32411)
                .put("d32412", d32412)
                .put("d32413", d32413)
                .put("d32414", d32414)
                .put("d32415", d32415)
                .put("d32416", d32416)
                .put("d32417", d32417)
                .put("d324998", d324998)
                .put("d32496", d32496)
                .put("d32496x", d32496x)
                .put("d325", d325)
                .put("d326", d326)
                .put("d327", d327)
                .put("d328", d328)
                .put("d329", d329)
                .put("d33001", d33001)
                .put("d33002", d33002)
                .put("d33003", d33003)
                .put("d33004", d33004)
                .put("d33005", d33005)
                .put("d33006", d33006)
                .put("d33007", d33007)
                .put("d33008", d33008)
                .put("d33009", d33009)
                .put("d33010", d33010)
                .put("d33011", d33011)
                .put("d33012", d33012)
                .put("d33013", d33013)
                .put("d330998", d330998)
                .put("d33096", d33096)
                .put("d33096x", d33096x);
        return json.toString();
    }

    public String sD4toString() throws JSONException {
        Log.d(TAG, "sD4toString: ");
        JSONObject json = new JSONObject();
        json.put("d401", d401)
                .put("d40101", d40101)
                .put("d40102", d40102)
                .put("d40103", d40103)
                .put("d40104", d40104)
                .put("d40105", d40105)
                .put("d40106", d40106)
                .put("d40107", d40107)
                .put("d40108", d40108)
                .put("d40110", d40110)
                .put("d40196", d40196)
                .put("d40196x", d40196x)
                .put("d401998", d401998)
                .put("d402", d402)
                .put("d403", d403)
                .put("d40301", d40301)
                .put("d40302", d40302)
                .put("d40303", d40303)
                .put("d40304", d40304)
                .put("d40305", d40305)
                .put("d40306", d40306)
                .put("d40307", d40307)
                .put("d40308", d40308)
                .put("d40396", d40396)
                .put("d40396x", d40396x)
                .put("d404", d404)
                .put("d40401", d40401)
                .put("d40402", d40402)
                .put("d40403", d40403)
                .put("d40404", d40404)
                .put("d40405", d40405)
                .put("d40406", d40406)
                .put("d40407", d40407)
                .put("d40408", d40408)
                .put("d40409", d40409)
                .put("d40410", d40410)
                .put("d40411", d40411)
                .put("d40496", d40496)
                .put("d40496x", d40496x)
                .put("d404998", d404998)
                .put("dstaa", dstaa)
                .put("dstab", dstab)
                .put("dstab96x", dstab96x);
        return json.toString();
    }

}
