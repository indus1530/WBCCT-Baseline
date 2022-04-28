package edu.aku.hassannaqvi.wbcct_baseline.models;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedDistrict;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedHHID;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedPSU;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedProvince;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedTehsil;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedUc;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.selectedVillage;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.wbcct_baseline.BR;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;


public class Form extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
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
    private String entryType = _EMPTY_;

    // MAIN FIELDS
    private String provinceCode = _EMPTY_;
    private String districtCode = _EMPTY_;
    private String tehsilCode = _EMPTY_;
    private String ucCode = _EMPTY_;
    private String villageCode = _EMPTY_;
    private String a105b = _EMPTY_;
    private String a106 = _EMPTY_;
    private String a107 = _EMPTY_;

    //ModuleStatusVariables
    private String astaa = _EMPTY_;
    private String astab = _EMPTY_;
    private String astab96x = _EMPTY_;

    // FIELD VARIABLES
    private String a101 = _EMPTY_;
    private String a102 = _EMPTY_;
    private String a103 = _EMPTY_;
    private String a104 = _EMPTY_;
    private String a105a = _EMPTY_;
    private String a108d = _EMPTY_;
    private String a108m = _EMPTY_;
    private String a108y = _EMPTY_;
    private String a109 = _EMPTY_;
    private String a110 = _EMPTY_;
    private String a111 = _EMPTY_;
    private String a112 = _EMPTY_;
    private String a113 = _EMPTY_;
    private String a114 = _EMPTY_;
    private String a114a = _EMPTY_;
    private String a115h = _EMPTY_;
    private String a115m = _EMPTY_;
    private String a116h = _EMPTY_;
    private String a116m = _EMPTY_;
    private String a117 = _EMPTY_;
    private String a118 = _EMPTY_;
    private String a119 = _EMPTY_;
    private String a301 = _EMPTY_;
    private String a30196x = _EMPTY_;
    private String a302 = _EMPTY_;
    private String a30296x = _EMPTY_;
    private String a303 = _EMPTY_;
    private String a30396x = _EMPTY_;
    private String a305 = _EMPTY_;
    private String a30601 = _EMPTY_;
    private String a30602 = _EMPTY_;
    private String a30603 = _EMPTY_;
    private String a30604 = _EMPTY_;
    private String a30605 = _EMPTY_;
    private String a30606 = _EMPTY_;
    private String a30696 = _EMPTY_;
    private String a30696x = _EMPTY_;
    private String a307 = _EMPTY_;
    private String a30796x = _EMPTY_;
    private String a308 = _EMPTY_;
    private String a309 = _EMPTY_;
    private String a310 = _EMPTY_;
    private String a31096x = _EMPTY_;
    private String a31101 = _EMPTY_;
    private String a31102 = _EMPTY_;
    private String a31103 = _EMPTY_;
    private String a31104 = _EMPTY_;
    private String a31105 = _EMPTY_;
    private String a31106 = _EMPTY_;
    private String a31107 = _EMPTY_;
    private String a31108 = _EMPTY_;
    private String a31109 = _EMPTY_;
    private String a31110 = _EMPTY_;
    private String a31111 = _EMPTY_;
    private String a31112 = _EMPTY_;
    private String a31113 = _EMPTY_;
    private String a31114 = _EMPTY_;
    private String a31115 = _EMPTY_;
    private String a31116 = _EMPTY_;
    private String a31117 = _EMPTY_;
    private String a31118 = _EMPTY_;
    private String a31119 = _EMPTY_;
    private String a31201 = _EMPTY_;
    private String a31202 = _EMPTY_;
    private String a31203 = _EMPTY_;
    private String a31204 = _EMPTY_;
    private String a31205 = _EMPTY_;
    private String a31206 = _EMPTY_;
    private String a31207 = _EMPTY_;
    private String a31208 = _EMPTY_;
    private String a313 = _EMPTY_;
    private String a31396x = _EMPTY_;
    private String a314 = _EMPTY_;
    private String a315 = _EMPTY_;
    private String a31596x = _EMPTY_;
    private String a316 = _EMPTY_;
    private String a31696x = _EMPTY_;
    private String a317 = _EMPTY_;
    private String a31796x = _EMPTY_;
    private String a318 = _EMPTY_;
    private String a319 = _EMPTY_;
    private String a320a = _EMPTY_;
    private String a320k = _EMPTY_;
    private String a320m = _EMPTY_;
    private String a32098 = _EMPTY_;
    private String a321 = _EMPTY_;
    private String a304 = _EMPTY_;
    private String a322a = _EMPTY_;
    private String a322ax = _EMPTY_;
    private String a322b = _EMPTY_;
    private String a322bx = _EMPTY_;
    private String a322c = _EMPTY_;
    private String a322cx = _EMPTY_;
    private String a322d = _EMPTY_;
    private String a322dx = _EMPTY_;
    private String a322e = _EMPTY_;
    private String a322ex = _EMPTY_;
    private String a322f = _EMPTY_;
    private String a322fx = _EMPTY_;
    private String a322g = _EMPTY_;
    private String a322gx = _EMPTY_;
    private String a322998 = _EMPTY_;
    private String a401 = _EMPTY_;
    private String a402 = _EMPTY_;
    private String a403 = _EMPTY_;
    private String a40301 = _EMPTY_;
    private String a40302 = _EMPTY_;
    private String a40303 = _EMPTY_;
    private String a40304 = _EMPTY_;
    private String a40305 = _EMPTY_;
    private String a404 = _EMPTY_;
    private String a405 = _EMPTY_;
    private String a40501 = _EMPTY_;
    private String a40502 = _EMPTY_;
    private String a40503 = _EMPTY_;
    private String a40504 = _EMPTY_;
    private String a40505 = _EMPTY_;
    private String a406 = _EMPTY_;
    private String a40601 = _EMPTY_;
    private String a40602 = _EMPTY_;
    private String a40603 = _EMPTY_;
    private String a40604 = _EMPTY_;
    private String a40605 = _EMPTY_;
    private String a40606 = _EMPTY_;
    private String a40607 = _EMPTY_;
    private String a40608 = _EMPTY_;
    private String a40609 = _EMPTY_;
    private String a40696 = _EMPTY_;
    private String a40696x = _EMPTY_;
    private String a501 = _EMPTY_;
    private String a502 = _EMPTY_;
    private String a503 = _EMPTY_;
    private String a504 = _EMPTY_;
    private String a505 = _EMPTY_;
    private String a506 = _EMPTY_;
    private String a507 = _EMPTY_;
    private String a508 = _EMPTY_;


    public Form() {

/*        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());*/

    }


    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        //   setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);

        setUserName(MainApp.user.getUserName());
        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.versionName + "." + MainApp.versionCode);

        setProvinceCode(selectedProvince);
        setDistrictCode(selectedDistrict);
        setTehsilCode(selectedTehsil);
        setUcCode(selectedUc);
        setVillageCode(selectedVillage);
        setPsuCode(selectedPSU);
        setHhid(selectedHHID);


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

    @Bindable
    public String getPsuCode() {
        return psuCode;
    }

    public void setPsuCode(String psuCode) {
        this.psuCode = psuCode;
        setA105b(psuCode);
        notifyPropertyChanged(BR.psuCode);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        setA106(hhid);
        notifyPropertyChanged(BR.hhid);
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
        notifyPropertyChanged(BR.sno);
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

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
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


    public String getA101() {
        return a101;
    }

    public void setA101(String a101) {
        this.a101 = a101;
    }


    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        setA101(provinceCode);
    }


    public String getA102() {
        return a102;
    }

    public void setA102(String a102) {
        this.a102 = a102;
    }


    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        setA102(districtCode);
    }


    public String getA103() {
        return a103;
    }

    public void setA103(String a103) {
        this.a103 = a103;
    }


    public String getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
        setA103(tehsilCode);
    }


    public String getA104() {
        return a104;
    }

    public void setA104(String a104) {
        this.a104 = a104;
    }


    public String getUcCode() {
        return ucCode;
    }

    public void setUcCode(String ucCode) {
        this.ucCode = ucCode;
        setA104(ucCode);
    }


    public String getA105a() {
        return a105a;
    }

    public void setA105a(String a105a) {
        this.a105a = a105a;
    }


    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
        setA105a(villageCode);
    }


    public String getA105b() {
        return a105b;
    }

    public void setA105b(String a105b) {
        this.a105b = a105b;
    }


    public String getA106() {
        return a106;
    }

    public void setA106(String a106) {
        this.a106 = a106;
    }


    @Bindable
    public String getA107() {
        return a107;
    }

    public void setA107(String a107) {
        this.a107 = a107;
        notifyPropertyChanged(BR.a107);
    }


    @Bindable
    public String getA108d() {
        return a108d;
    }

    public void setA108d(String a108d) {
        this.a108d = a108d;
        notifyPropertyChanged(BR.a108d);
    }

    @Bindable
    public String getA108m() {
        return a108m;
    }

    public void setA108m(String a108m) {
        this.a108m = a108m;
        notifyPropertyChanged(BR.a108m);
    }

    @Bindable
    public String getA108y() {
        return a108y;
    }

    public void setA108y(String a108y) {
        this.a108y = a108y;
        notifyPropertyChanged(BR.a108y);
    }

    @Bindable
    public String getA109() {
        return a109;
    }

    public void setA109(String a109) {
        this.a109 = a109;
        notifyPropertyChanged(BR.a109);
    }

    @Bindable
    public String getA110() {
        return a110;
    }

    public void setA110(String a110) {
        this.a110 = a110;
        notifyPropertyChanged(BR.a110);
    }

    @Bindable
    public String getA111() {
        return a111;
    }

    public void setA111(String a111) {
        this.a111 = a111;
        notifyPropertyChanged(BR.a111);
    }

    @Bindable
    public String getA112() {
        return a112;
    }

    public void setA112(String a112) {
        this.a112 = a112;
        notifyPropertyChanged(BR.a112);
    }

    @Bindable
    public String getA113() {
        return a113;
    }

    public void setA113(String a113) {
        this.a113 = a113;
        setA114(a113.equals("2") ? "" : this.a114);
        notifyPropertyChanged(BR.a113);
    }

    @Bindable
    public String getA114() {
        return a114;
    }

    public void setA114(String a114) {
        this.a114 = a114;
        notifyPropertyChanged(BR.a114);
    }

    @Bindable
    public String getA114a() {
        return a114a;
    }

    public void setA114a(String a114a) {
        this.a114a = a114a;
        notifyPropertyChanged(BR.a114a);
    }

    @Bindable
    public String getA115h() {
        return a115h;
    }

    public void setA115h(String a115h) {
        this.a115h = a115h;
        notifyPropertyChanged(BR.a115h);
    }

    @Bindable
    public String getA115m() {
        return a115m;
    }

    public void setA115m(String a115m) {
        this.a115m = a115m;
        notifyPropertyChanged(BR.a115m);
    }

    @Bindable
    public String getA116h() {
        return a116h;
    }

    public void setA116h(String a116h) {
        this.a116h = a116h;
        notifyPropertyChanged(BR.a116h);
    }

    @Bindable
    public String getA116m() {
        return a116m;
    }

    public void setA116m(String a116m) {
        this.a116m = a116m;
        notifyPropertyChanged(BR.a116m);
    }

    @Bindable
    public String getA117() {
        return a117;
    }

    public void setA117(String a117) {
        this.a117 = a117;
        notifyPropertyChanged(BR.a117);
    }

    @Bindable
    public String getA118() {
        return a118;
    }

    public void setA118(String a118) {
        this.a118 = a118;
        notifyPropertyChanged(BR.a118);
    }

    @Bindable
    public String getA119() {
        return a119;
    }

    public void setA119(String a119) {
        this.a119 = a119;
        notifyPropertyChanged(BR.a119);
    }

    @Bindable
    public String getA301() {
        return a301;
    }

    public void setA301(String a301) {
        this.a301 = a301;
        setA30196x(a301.equals("96") ? this.a30196x : "");
        notifyPropertyChanged(BR.a301);
    }

    @Bindable
    public String getA30196x() {
        return a30196x;
    }

    public void setA30196x(String a30196x) {
        this.a30196x = a30196x;
        notifyPropertyChanged(BR.a30196x);
    }

    @Bindable
    public String getA302() {
        return a302;
    }

    public void setA302(String a302) {
        this.a302 = a302;
        setA30296x(a302.equals("96") ? this.a30296x : "");
        notifyPropertyChanged(BR.a302);
    }

    @Bindable
    public String getA30296x() {
        return a30296x;
    }

    public void setA30296x(String a30296x) {
        this.a30296x = a30296x;
        notifyPropertyChanged(BR.a30296x);
    }

    @Bindable
    public String getA303() {
        return a303;
    }

    public void setA303(String a303) {
        this.a303 = a303;
        setA30396x(a303.equals("96") ? this.a30396x : "");
        setA304(a303.equals("1") || a303.equals("2") ? "" : this.a304);
        notifyPropertyChanged(BR.a303);
    }

    @Bindable
    public String getA30396x() {
        return a30396x;
    }

    public void setA30396x(String a30396x) {
        this.a30396x = a30396x;
        notifyPropertyChanged(BR.a30396x);
    }

    @Bindable
    public String getA304() {
        return a304;
    }

    public void setA304(String a304) {
        this.a304 = a304;
        notifyPropertyChanged(BR.a304);
    }

    @Bindable
    public String getA305() {
        return a305;
    }

    public void setA305(String a305) {
        this.a305 = a305;
        setA30601(a305.equals("2") ? "" : this.a30601);
        setA30602(a305.equals("2") ? "" : this.a30602);
        setA30603(a305.equals("2") ? "" : this.a30603);
        setA30604(a305.equals("2") ? "" : this.a30604);
        setA30605(a305.equals("2") ? "" : this.a30605);
        setA30606(a305.equals("2") ? "" : this.a30606);
        setA30696(a305.equals("2") ? "" : this.a30696);
        notifyPropertyChanged(BR.a305);
    }


    @Bindable
    public String getA30601() {
        return a30601;
    }

    public void setA30601(String a30601) {
        if (this.a30601.equals(a30601)) return;
        this.a30601 = a30601;
        notifyPropertyChanged(BR.a30601);
    }

    @Bindable
    public String getA30602() {
        return a30602;
    }

    public void setA30602(String a30602) {
        if (this.a30602.equals(a30602)) return;
        this.a30602 = a30602;
        notifyPropertyChanged(BR.a30602);
    }

    @Bindable
    public String getA30603() {
        return a30603;
    }

    public void setA30603(String a30603) {
        if (this.a30603.equals(a30603)) return;
        this.a30603 = a30603;
        notifyPropertyChanged(BR.a30603);
    }

    @Bindable
    public String getA30604() {
        return a30604;
    }

    public void setA30604(String a30604) {
        if (this.a30604.equals(a30604)) return;
        this.a30604 = a30604;
        notifyPropertyChanged(BR.a30604);
    }

    @Bindable
    public String getA30605() {
        return a30605;
    }

    public void setA30605(String a30605) {
        if (this.a30605.equals(a30605)) return;
        this.a30605 = a30605;
        notifyPropertyChanged(BR.a30605);
    }

    @Bindable
    public String getA30606() {
        return a30606;
    }

    public void setA30606(String a30606) {
        if (this.a30606.equals(a30606)) return;
        this.a30606 = a30606;
        notifyPropertyChanged(BR.a30606);
    }

    @Bindable
    public String getA30696() {
        return a30696;
    }

    public void setA30696(String a30696) {
        if (this.a30696.equals(a30696)) return;
        this.a30696 = a30696;
        setA30696x(a30696.equals("96") ? this.a30696x : "");
        notifyPropertyChanged(BR.a30696);
    }

    @Bindable
    public String getA30696x() {
        return a30696x;
    }

    public void setA30696x(String a30696x) {
        this.a30696x = a30696x;
        notifyPropertyChanged(BR.a30696x);
    }

    @Bindable
    public String getA307() {
        return a307;
    }

    public void setA307(String a307) {
        this.a307 = a307;
        setA30796x(a307.equals("96") ? this.a30796x : "");
        setA308(a307.equals("8") || a307.equals("9") ? "" : this.a308);
        setA309(a307.equals("8") || a307.equals("9") ? "" : this.a309);
        notifyPropertyChanged(BR.a307);
    }

    @Bindable
    public String getA30796x() {
        return a30796x;
    }

    public void setA30796x(String a30796x) {
        this.a30796x = a30796x;
        notifyPropertyChanged(BR.a30796x);
    }

    @Bindable
    public String getA308() {
        return a308;
    }

    public void setA308(String a308) {
        this.a308 = a308;
        setA309(a308.equals("2") ? "" : this.a309);
        notifyPropertyChanged(BR.a308);
    }

    @Bindable
    public String getA309() {
        return a309;
    }

    public void setA309(String a309) {
        this.a309 = a309;
        notifyPropertyChanged(BR.a309);
    }

    @Bindable
    public String getA310() {
        return a310;
    }

    public void setA310(String a310) {
        this.a310 = a310;
        setA31096x(a310.equals("96") ? this.a31096x : "");
        notifyPropertyChanged(BR.a310);
    }

    @Bindable
    public String getA31096x() {
        return a31096x;
    }

    public void setA31096x(String a31096x) {
        this.a31096x = a31096x;
        notifyPropertyChanged(BR.a31096x);
    }

    @Bindable
    public String getA31101() {
        return a31101;
    }

    public void setA31101(String a31101) {
        this.a31101 = a31101;
        notifyPropertyChanged(BR.a31101);
    }

    @Bindable
    public String getA31102() {
        return a31102;
    }

    public void setA31102(String a31102) {
        this.a31102 = a31102;
        notifyPropertyChanged(BR.a31102);
    }

    @Bindable
    public String getA31103() {
        return a31103;
    }

    public void setA31103(String a31103) {
        this.a31103 = a31103;
        notifyPropertyChanged(BR.a31103);
    }

    @Bindable
    public String getA31104() {
        return a31104;
    }

    public void setA31104(String a31104) {
        this.a31104 = a31104;
        notifyPropertyChanged(BR.a31104);
    }

    @Bindable
    public String getA31105() {
        return a31105;
    }

    public void setA31105(String a31105) {
        this.a31105 = a31105;
        notifyPropertyChanged(BR.a31105);
    }

    @Bindable
    public String getA31106() {
        return a31106;
    }

    public void setA31106(String a31106) {
        this.a31106 = a31106;
        notifyPropertyChanged(BR.a31106);
    }

    @Bindable
    public String getA31107() {
        return a31107;
    }

    public void setA31107(String a31107) {
        this.a31107 = a31107;
        notifyPropertyChanged(BR.a31107);
    }

    @Bindable
    public String getA31108() {
        return a31108;
    }

    public void setA31108(String a31108) {
        this.a31108 = a31108;
        notifyPropertyChanged(BR.a31108);
    }

    @Bindable
    public String getA31109() {
        return a31109;
    }

    public void setA31109(String a31109) {
        this.a31109 = a31109;
        notifyPropertyChanged(BR.a31109);
    }

    @Bindable
    public String getA31110() {
        return a31110;
    }

    public void setA31110(String a31110) {
        this.a31110 = a31110;
        notifyPropertyChanged(BR.a31110);
    }

    @Bindable
    public String getA31111() {
        return a31111;
    }

    public void setA31111(String a31111) {
        this.a31111 = a31111;
        notifyPropertyChanged(BR.a31111);
    }

    @Bindable
    public String getA31112() {
        return a31112;
    }

    public void setA31112(String a31112) {
        this.a31112 = a31112;
        notifyPropertyChanged(BR.a31112);
    }

    @Bindable
    public String getA31113() {
        return a31113;
    }

    public void setA31113(String a31113) {
        this.a31113 = a31113;
        notifyPropertyChanged(BR.a31113);
    }

    @Bindable
    public String getA31114() {
        return a31114;
    }

    public void setA31114(String a31114) {
        this.a31114 = a31114;
        notifyPropertyChanged(BR.a31114);
    }

    @Bindable
    public String getA31115() {
        return a31115;
    }

    public void setA31115(String a31115) {
        this.a31115 = a31115;
        notifyPropertyChanged(BR.a31115);
    }

    @Bindable
    public String getA31116() {
        return a31116;
    }

    public void setA31116(String a31116) {
        this.a31116 = a31116;
        notifyPropertyChanged(BR.a31116);
    }

    @Bindable
    public String getA31117() {
        return a31117;
    }

    public void setA31117(String a31117) {
        this.a31117 = a31117;
        notifyPropertyChanged(BR.a31117);
    }

    @Bindable
    public String getA31118() {
        return a31118;
    }

    public void setA31118(String a31118) {
        this.a31118 = a31118;
        notifyPropertyChanged(BR.a31118);
    }

    @Bindable
    public String getA31119() {
        return a31119;
    }

    public void setA31119(String a31119) {
        this.a31119 = a31119;
        notifyPropertyChanged(BR.a31119);
    }

    @Bindable
    public String getA31201() {
        return a31201;
    }

    public void setA31201(String a31201) {
        this.a31201 = a31201;
        notifyPropertyChanged(BR.a31201);
    }

    @Bindable
    public String getA31202() {
        return a31202;
    }

    public void setA31202(String a31202) {
        this.a31202 = a31202;
        notifyPropertyChanged(BR.a31202);
    }

    @Bindable
    public String getA31203() {
        return a31203;
    }

    public void setA31203(String a31203) {
        this.a31203 = a31203;
        notifyPropertyChanged(BR.a31203);
    }

    @Bindable
    public String getA31204() {
        return a31204;
    }

    public void setA31204(String a31204) {
        this.a31204 = a31204;
        notifyPropertyChanged(BR.a31204);
    }

    @Bindable
    public String getA31205() {
        return a31205;
    }

    public void setA31205(String a31205) {
        this.a31205 = a31205;
        notifyPropertyChanged(BR.a31205);
    }

    @Bindable
    public String getA31206() {
        return a31206;
    }

    public void setA31206(String a31206) {
        this.a31206 = a31206;
        notifyPropertyChanged(BR.a31206);
    }

    @Bindable
    public String getA31207() {
        return a31207;
    }

    public void setA31207(String a31207) {
        this.a31207 = a31207;
        notifyPropertyChanged(BR.a31207);
    }

    @Bindable
    public String getA31208() {
        return a31208;
    }

    public void setA31208(String a31208) {
        this.a31208 = a31208;
        notifyPropertyChanged(BR.a31208);
    }

    @Bindable
    public String getA313() {
        return a313;
    }

    public void setA313(String a313) {
        this.a313 = a313;
        setA31396x(a313.equals("96") ? this.a31396x : "");
        notifyPropertyChanged(BR.a313);
    }

    @Bindable
    public String getA31396x() {
        return a31396x;
    }

    public void setA31396x(String a31396x) {
        this.a31396x = a31396x;
        notifyPropertyChanged(BR.a31396x);
    }

    @Bindable
    public String getA314() {
        return a314;
    }

    public void setA314(String a314) {
        this.a314 = a314;
        notifyPropertyChanged(BR.a314);
    }

    @Bindable
    public String getA315() {
        return a315;
    }

    public void setA315(String a315) {
        this.a315 = a315;
        setA31596x(a315.equals("96") ? this.a31596x : "");
        notifyPropertyChanged(BR.a315);
    }

    @Bindable
    public String getA31596x() {
        return a31596x;
    }

    public void setA31596x(String a31596x) {
        this.a31596x = a31596x;
        notifyPropertyChanged(BR.a31596x);
    }

    @Bindable
    public String getA316() {
        return a316;
    }

    public void setA316(String a316) {
        this.a316 = a316;
        setA31696x(a316.equals("96") ? this.a31696x : "");
        notifyPropertyChanged(BR.a316);
    }

    @Bindable
    public String getA31696x() {
        return a31696x;
    }

    public void setA31696x(String a31696x) {
        this.a31696x = a31696x;
        notifyPropertyChanged(BR.a31696x);
    }

    @Bindable
    public String getA317() {
        return a317;
    }

    public void setA317(String a317) {
        this.a317 = a317;
        setA31796x(a317.equals("96") ? this.a31796x : "");
        notifyPropertyChanged(BR.a317);
    }

    @Bindable
    public String getA31796x() {
        return a31796x;
    }

    public void setA31796x(String a31796x) {
        this.a31796x = a31796x;
        notifyPropertyChanged(BR.a31796x);
    }

    @Bindable
    public String getA318() {
        return a318;
    }

    public void setA318(String a318) {
        this.a318 = a318;
        notifyPropertyChanged(BR.a318);
    }

    @Bindable
    public String getA319() {
        return a319;
    }

    public void setA319(String a319) {
        this.a319 = a319;
        setA320a(a319.equals("2") ? "" : this.a320a);
        setA320k(a319.equals("2") ? "" : this.a320k);
        setA320m(a319.equals("2") ? "" : this.a320m);
        setA32098(a319.equals("2") ? "" : this.a32098);
        notifyPropertyChanged(BR.a319);
    }

    @Bindable
    public String getA320a() {
        return a320a;
    }

    public void setA320a(String a320a) {
        this.a320a = a320a;
        notifyPropertyChanged(BR.a320a);
    }

    @Bindable
    public String getA320k() {
        return a320k;
    }

    public void setA320k(String a320k) {
        this.a320k = a320k;
        notifyPropertyChanged(BR.a320k);
    }

    @Bindable
    public String getA320m() {
        return a320m;
    }

    public void setA320m(String a320m) {
        this.a320m = a320m;
        notifyPropertyChanged(BR.a320m);
    }

    @Bindable
    public String getA32098() {
        return a32098;
    }

    public void setA32098(String a32098) {
        if (this.a32098.equals(a32098)) return;
        this.a32098 = a32098;
        setA320a(a32098.equals("998") ? "" : this.a320a);
        setA320k(a32098.equals("998") ? "" : this.a320k);
        setA320m(a32098.equals("998") ? "" : this.a320m);
        notifyPropertyChanged(BR.a32098);
    }

    @Bindable
    public String getA321() {
        return a321;
    }

    public void setA321(String a321) {
        this.a321 = a321;
        setA322a(a321.equals("1") ? this.a322a : "");
        setA322b(a321.equals("1") ? this.a322b : "");
        setA322c(a321.equals("1") ? this.a322c : "");
        setA322d(a321.equals("1") ? this.a322d : "");
        setA322e(a321.equals("1") ? this.a322e : "");
        setA322f(a321.equals("1") ? this.a322f : "");
        setA322g(a321.equals("1") ? this.a322g : "");
        setA322998(a321.equals("1") ? this.a322998 : "");
        notifyPropertyChanged(BR.a321);
    }

    @Bindable
    public String getA322a() {
        return a322a;
    }

    public void setA322a(String a322a) {
        if (this.a322a.equals(a322a)) return;
        this.a322a = a322a;
        setA322ax(a322a.equals("1") ? this.a322ax : "");
        notifyPropertyChanged(BR.a322a);
    }

    @Bindable
    public String getA322ax() {
        return a322ax;
    }

    public void setA322ax(String a322ax) {
        this.a322ax = a322ax;
        notifyPropertyChanged(BR.a322ax);
    }

    @Bindable
    public String getA322b() {
        return a322b;
    }

    public void setA322b(String a322b) {
        if (this.a322b.equals(a322b)) return;
        this.a322b = a322b;
        setA322bx(a322b.equals("2") ? this.a322bx : "");
        notifyPropertyChanged(BR.a322b);
    }

    @Bindable
    public String getA322bx() {
        return a322bx;
    }

    public void setA322bx(String a322bx) {
        this.a322bx = a322bx;
        notifyPropertyChanged(BR.a322bx);
    }

    @Bindable
    public String getA322c() {
        return a322c;
    }

    public void setA322c(String a322c) {
        if (this.a322c.equals(a322c)) return;
        this.a322c = a322c;
        setA322cx(a322c.equals("3") ? this.a322cx : "");
        notifyPropertyChanged(BR.a322c);
    }

    @Bindable
    public String getA322cx() {
        return a322cx;
    }

    public void setA322cx(String a322cx) {
        this.a322cx = a322cx;
        notifyPropertyChanged(BR.a322cx);
    }

    @Bindable
    public String getA322d() {
        return a322d;
    }

    public void setA322d(String a322d) {
        if (this.a322d.equals(a322d)) return;
        this.a322d = a322d;
        setA322dx(a322d.equals("4") ? this.a322dx : "");
        notifyPropertyChanged(BR.a322d);
    }

    @Bindable
    public String getA322dx() {
        return a322dx;
    }

    public void setA322dx(String a322dx) {
        this.a322dx = a322dx;
        notifyPropertyChanged(BR.a322dx);
    }

    @Bindable
    public String getA322e() {
        return a322e;
    }

    public void setA322e(String a322e) {
        if (this.a322e.equals(a322e)) return;
        this.a322e = a322e;
        setA322ex(a322e.equals("5") ? this.a322ex : "");
        notifyPropertyChanged(BR.a322e);
    }

    @Bindable
    public String getA322ex() {
        return a322ex;
    }

    public void setA322ex(String a322ex) {
        this.a322ex = a322ex;
        notifyPropertyChanged(BR.a322ex);
    }

    @Bindable
    public String getA322f() {
        return a322f;
    }

    public void setA322f(String a322f) {
        if (this.a322f.equals(a322f)) return;
        this.a322f = a322f;
        setA322fx(a322f.equals("6") ? this.a322fx : "");
        notifyPropertyChanged(BR.a322f);
    }

    @Bindable
    public String getA322fx() {
        return a322fx;
    }

    public void setA322fx(String a322fx) {
        this.a322fx = a322fx;
        notifyPropertyChanged(BR.a322fx);
    }

    @Bindable
    public String getA322g() {
        return a322g;
    }

    public void setA322g(String a322g) {
        if (this.a322g.equals(a322g)) return;
        this.a322g = a322g;
        setA322gx(a322g.equals("7") ? this.a322gx : "");
        notifyPropertyChanged(BR.a322g);
    }

    @Bindable
    public String getA322gx() {
        return a322gx;
    }

    public void setA322gx(String a322gx) {
        this.a322gx = a322gx;
        notifyPropertyChanged(BR.a322gx);
    }

    @Bindable
    public String getA322998() {
        return a322998;
    }

    public void setA322998(String a322998) {
        if (this.a322998.equals(a322998)) return;
        this.a322998 = a322998;
        setA322a(a322998.equals("998") ? "" : this.a322a);
        setA322b(a322998.equals("998") ? "" : this.a322b);
        setA322c(a322998.equals("998") ? "" : this.a322c);
        setA322d(a322998.equals("998") ? "" : this.a322d);
        setA322e(a322998.equals("998") ? "" : this.a322e);
        setA322f(a322998.equals("998") ? "" : this.a322f);
        setA322g(a322998.equals("998") ? "" : this.a322g);
        notifyPropertyChanged(BR.a322998);
    }

    @Bindable
    public String getA401() {
        return a401;
    }

    public void setA401(String a401) {
        this.a401 = a401;
        setA402(a401.equals("1") ? this.a402 : "");
        setA40301(a401.equals("1") ? this.a40301 : "");
        setA40302(a401.equals("1") ? this.a40302 : "");
        setA40303(a401.equals("1") ? this.a40303 : "");
        setA40304(a401.equals("1") ? this.a40304 : "");
        setA40305(a401.equals("1") ? this.a40305 : "");
        notifyPropertyChanged(BR.a401);
    }

    @Bindable
    public String getA402() {
        return a402;
    }

    public void setA402(String a402) {
        this.a402 = a402;
        notifyPropertyChanged(BR.a402);
    }

    @Bindable
    public String getA403() {
        return a403;
    }

    public void setA403(String a403) {
        this.a403 = a403;
        notifyPropertyChanged(BR.a403);
    }

    @Bindable
    public String getA40301() {
        return a40301;
    }

    public void setA40301(String a40301) {
        if (this.a40301.equals(a40301)) return;
        this.a40301 = a40301;
        setA404(a40301.equals("1") ? "" : this.a404);
        setA40501(a40301.equals("1") ? "" : this.a40501);
        setA40502(a40301.equals("1") ? "" : this.a40502);
        setA40503(a40301.equals("1") ? "" : this.a40503);
        setA40504(a40301.equals("1") ? "" : this.a40504);
        setA40505(a40301.equals("1") ? "" : this.a40505);
        notifyPropertyChanged(BR.a40301);
    }

    @Bindable
    public String getA40302() {
        return a40302;
    }

    public void setA40302(String a40302) {
        if (this.a40302.equals(a40302)) return;
        this.a40302 = a40302;
        setA404(a40302.equals("2") ? "" : this.a404);
        setA40501(a40302.equals("2") ? "" : this.a40501);
        setA40502(a40302.equals("2") ? "" : this.a40502);
        setA40503(a40302.equals("2") ? "" : this.a40503);
        setA40504(a40302.equals("2") ? "" : this.a40504);
        setA40505(a40302.equals("2") ? "" : this.a40505);
        notifyPropertyChanged(BR.a40302);
    }

    @Bindable
    public String getA40303() {
        return a40303;
    }

    public void setA40303(String a40303) {
        if (this.a40303.equals(a40303)) return;
        this.a40303 = a40303;
        setA404(a40303.equals("3") ? "" : this.a404);
        setA40501(a40303.equals("3") ? "" : this.a40501);
        setA40502(a40303.equals("3") ? "" : this.a40502);
        setA40503(a40303.equals("3") ? "" : this.a40503);
        setA40504(a40303.equals("3") ? "" : this.a40504);
        setA40505(a40303.equals("3") ? "" : this.a40505);
        notifyPropertyChanged(BR.a40303);
    }

    @Bindable
    public String getA40304() {
        return a40304;
    }

    public void setA40304(String a40304) {
        if (this.a40304.equals(a40304)) return;
        this.a40304 = a40304;
        notifyPropertyChanged(BR.a40304);
    }

    @Bindable
    public String getA40305() {
        return a40305;
    }

    public void setA40305(String a40305) {
        if (this.a40305.equals(a40305)) return;
        this.a40305 = a40305;
        setA40301(a40305.equals("5") ? "" : this.a40301);
        setA40302(a40305.equals("5") ? "" : this.a40302);
        setA40303(a40305.equals("5") ? "" : this.a40303);
        setA40304(a40305.equals("5") ? "" : this.a40304);
        notifyPropertyChanged(BR.a40305);
    }

    @Bindable
    public String getA404() {
        return a404;
    }

    public void setA404(String a404) {
        this.a404 = a404;
        setA40501(a404.equals("2") ? "" : this.a40501);
        setA40502(a404.equals("2") ? "" : this.a40502);
        setA40503(a404.equals("2") ? "" : this.a40503);
        setA40504(a404.equals("2") ? "" : this.a40504);
        setA40505(a404.equals("2") ? "" : this.a40505);
        notifyPropertyChanged(BR.a404);
    }

    @Bindable
    public String getA405() {
        return a405;
    }

    public void setA405(String a405) {
        this.a405 = a405;
        notifyPropertyChanged(BR.a405);
    }

    @Bindable
    public String getA40501() {
        return a40501;
    }

    public void setA40501(String a40501) {
        if (this.a40501.equals(a40501)) return;
        this.a40501 = a40501;
        notifyPropertyChanged(BR.a40501);
    }

    @Bindable
    public String getA40502() {
        return a40502;
    }

    public void setA40502(String a40502) {
        if (this.a40502.equals(a40502)) return;
        this.a40502 = a40502;
        notifyPropertyChanged(BR.a40502);
    }

    @Bindable
    public String getA40503() {
        return a40503;
    }

    public void setA40503(String a40503) {
        if (this.a40503.equals(a40503)) return;
        this.a40503 = a40503;
        notifyPropertyChanged(BR.a40503);
    }

    @Bindable
    public String getA40504() {
        return a40504;
    }

    public void setA40504(String a40504) {
        if (this.a40504.equals(a40504)) return;
        this.a40504 = a40504;
        notifyPropertyChanged(BR.a40504);
    }

    @Bindable
    public String getA40505() {
        return a40505;
    }

    public void setA40505(String a40505) {
        if (this.a40505.equals(a40505)) return;
        this.a40505 = a40505;
        setA40501(a40505.equals("5") ? "" : this.a40501);
        setA40502(a40505.equals("5") ? "" : this.a40502);
        setA40503(a40505.equals("5") ? "" : this.a40503);
        setA40504(a40505.equals("5") ? "" : this.a40504);
        notifyPropertyChanged(BR.a40505);
    }

    @Bindable
    public String getA406() {
        return a406;
    }

    public void setA406(String a406) {
        this.a406 = a406;
        notifyPropertyChanged(BR.a406);
    }

    @Bindable
    public String getA40601() {
        return a40601;
    }

    public void setA40601(String a40601) {
        if (this.a40601.equals(a40601)) return;
        this.a40601 = a40601;
        notifyPropertyChanged(BR.a40601);
    }

    @Bindable
    public String getA40602() {
        return a40602;
    }

    public void setA40602(String a40602) {
        if (this.a40602.equals(a40602)) return;
        this.a40602 = a40602;
        notifyPropertyChanged(BR.a40602);
    }

    @Bindable
    public String getA40603() {
        return a40603;
    }

    public void setA40603(String a40603) {
        if (this.a40603.equals(a40603)) return;
        this.a40603 = a40603;
        notifyPropertyChanged(BR.a40603);
    }

    @Bindable
    public String getA40604() {
        return a40604;
    }

    public void setA40604(String a40604) {
        if (this.a40604.equals(a40604)) return;
        this.a40604 = a40604;
        notifyPropertyChanged(BR.a40604);
    }

    @Bindable
    public String getA40605() {
        return a40605;
    }

    public void setA40605(String a40605) {
        if (this.a40605.equals(a40605)) return;
        this.a40605 = a40605;
        notifyPropertyChanged(BR.a40605);
    }

    @Bindable
    public String getA40606() {
        return a40606;
    }

    public void setA40606(String a40606) {
        if (this.a40606.equals(a40606)) return;
        this.a40606 = a40606;
        notifyPropertyChanged(BR.a40606);
    }

    @Bindable
    public String getA40607() {
        return a40607;
    }

    public void setA40607(String a40607) {
        if (this.a40607.equals(a40607)) return;
        this.a40607 = a40607;
        notifyPropertyChanged(BR.a40607);
    }

    @Bindable
    public String getA40608() {
        return a40608;
    }

    public void setA40608(String a40608) {
        if (this.a40608.equals(a40608)) return;
        this.a40608 = a40608;
        notifyPropertyChanged(BR.a40608);
    }

    @Bindable
    public String getA40609() {
        return a40609;
    }

    public void setA40609(String a40609) {
        if (this.a40609.equals(a40609)) return;
        this.a40609 = a40609;
        notifyPropertyChanged(BR.a40609);
    }

    @Bindable
    public String getA40696() {
        return a40696;
    }

    public void setA40696(String a40696) {
        if (this.a40696.equals(a40696)) return;
        this.a40696 = a40696;
        setA40696x(a40696.equals("96") ? this.a40696x : "");
        notifyPropertyChanged(BR.a40696);
    }

    @Bindable
    public String getA40696x() {
        return a40696x;
    }

    public void setA40696x(String a40696x) {
        this.a40696x = a40696x;
        notifyPropertyChanged(BR.a40696x);
    }

    @Bindable
    public String getA501() {
        return a501;
    }

    public void setA501(String a501) {
        this.a501 = a501;
        notifyPropertyChanged(BR.a501);
    }

    @Bindable
    public String getA502() {
        return a502;
    }

    public void setA502(String a502) {
        this.a502 = a502;
        notifyPropertyChanged(BR.a502);
    }

    @Bindable
    public String getA503() {
        return a503;
    }

    public void setA503(String a503) {
        this.a503 = a503;
        notifyPropertyChanged(BR.a503);
    }

    @Bindable
    public String getA504() {
        return a504;
    }

    public void setA504(String a504) {
        this.a504 = a504;
        notifyPropertyChanged(BR.a504);
    }

    @Bindable
    public String getA505() {
        return a505;
    }

    public void setA505(String a505) {
        this.a505 = a505;
        notifyPropertyChanged(BR.a505);
    }

    @Bindable
    public String getA506() {
        return a506;
    }

    public void setA506(String a506) {
        this.a506 = a506;
        notifyPropertyChanged(BR.a506);
    }

    @Bindable
    public String getA507() {
        return a507;
    }

    public void setA507(String a507) {
        this.a507 = a507;
        notifyPropertyChanged(BR.a507);
    }

    @Bindable
    public String getA508() {
        return a508;
    }

    public void setA508(String a508) {
        this.a508 = a508;
        notifyPropertyChanged(BR.a508);
    }


    @Bindable
    public String getAstaa() {
        return astaa;
    }

    public void setAstaa(String astaa) {
        this.astaa = astaa;
        setAstab(astaa.equals("1") ? "" : this.astab);
        notifyPropertyChanged(BR.astaa);
    }

    @Bindable
    public String getAstab() {
        return astab;
    }

    public void setAstab(String astab) {
        this.astab = astab;
        setAstab96x(astab.equals("96") ? this.astab96x : "");
        notifyPropertyChanged(BR.astab);
    }

    @Bindable
    public String getAstab96x() {
        return astab96x;
    }

    public void setAstab96x(String astab96x) {
        this.astab96x = astab96x;
        notifyPropertyChanged(BR.astab96x);
    }


    public Form Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.entryType = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ENTRY_TYPE));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));
        this.provinceCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PROVINCE_CODE));
        this.districtCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DISTRICT_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_TEHSIL_CODE));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UC_CODE));
        this.villageCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_VILLAGE_CODE));
        this.a105b = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_A105B));
        this.a106 = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_A106));
        this.a107 = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_A107));

        sA1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA1)));
        sA3AHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA3A)));
        sA3BHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA3B)));
        sA4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA4)));
        sA5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA5)));
        return this;
    }

    public void sA1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a101 = json.getString("a101");
            this.a102 = json.getString("a102");
            this.a103 = json.getString("a103");
            this.a104 = json.getString("a104");
            this.a105a = json.getString("a105a");
            this.a108d = json.getString("a108d");
            this.a108m = json.getString("a108m");
            this.a108y = json.getString("a108y");
            this.a109 = json.getString("a109");
            this.a110 = json.getString("a110");
            this.a111 = json.getString("a111");
            this.a112 = json.getString("a112");
            this.a113 = json.getString("a113");
            this.a114 = json.getString("a114");
            this.a114a = json.getString("a114a");
            this.a115h = json.getString("a115h");
            this.a115m = json.getString("a115m");
            this.a116h = json.getString("a116h");
            this.a116m = json.getString("a116m");
            this.a117 = json.getString("a117");
            this.a118 = json.getString("a118");
            this.a119 = json.getString("a119");
        }
    }

    public void sA3AHydrate(String string) throws JSONException {
        Log.d(TAG, "sA3AHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a301 = json.getString("a301");
            this.a30196x = json.getString("a30196x");
            this.a302 = json.getString("a302");
            this.a30296x = json.getString("a30296x");
            this.a303 = json.getString("a303");
            this.a30396x = json.getString("a30396x");
            this.a304 = json.getString("a304");
            this.a305 = json.getString("a305");
            this.a30601 = json.getString("a30601");
            this.a30602 = json.getString("a30602");
            this.a30603 = json.getString("a30603");
            this.a30604 = json.getString("a30604");
            this.a30605 = json.getString("a30605");
            this.a30606 = json.getString("a30606");
            this.a30696 = json.getString("a30696");
            this.a30696x = json.getString("a30696x");
            this.a307 = json.getString("a307");
            this.a30796x = json.getString("a30796x");
            this.a308 = json.getString("a308");
            this.a309 = json.getString("a309");
            this.a310 = json.getString("a310");
            this.a31096x = json.getString("a31096x");
            this.a31101 = json.getString("a31101");
            this.a31102 = json.getString("a31102");
            this.a31103 = json.getString("a31103");
            this.a31104 = json.getString("a31104");
            this.a31105 = json.getString("a31105");
            this.a31106 = json.getString("a31106");
            this.a31107 = json.getString("a31107");
            this.a31108 = json.getString("a31108");
            this.a31109 = json.getString("a31109");
            this.a31110 = json.getString("a31110");
            this.a31111 = json.getString("a31111");
            this.a31112 = json.getString("a31112");
            this.a31113 = json.getString("a31113");
            this.a31114 = json.getString("a31114");
            this.a31115 = json.getString("a31115");
            this.a31116 = json.getString("a31116");
            this.a31117 = json.getString("a31117");
            this.a31118 = json.getString("a31118");
            this.a31119 = json.getString("a31119");
        }
    }

    public void sA3BHydrate(String string) throws JSONException {
        Log.d(TAG, "sA3BHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a31201 = json.getString("a31201");
            this.a31202 = json.getString("a31202");
            this.a31203 = json.getString("a31203");
            this.a31204 = json.getString("a31204");
            this.a31205 = json.getString("a31205");
            this.a31206 = json.getString("a31206");
            this.a31207 = json.getString("a31207");
            this.a31208 = json.getString("a31208");
            this.a313 = json.getString("a313");
            this.a31396x = json.getString("a31396x");
            this.a314 = json.getString("a314");
            this.a315 = json.getString("a315");
            this.a31596x = json.getString("a31596x");
            this.a316 = json.getString("a316");
            this.a31696x = json.getString("a31696x");
            this.a317 = json.getString("a317");
            this.a31796x = json.getString("a31796x");
            this.a318 = json.getString("a318");
            this.a319 = json.getString("a319");
            this.a320a = json.getString("a320a");
            this.a320k = json.getString("a320k");
            this.a320m = json.getString("a320m");
            this.a32098 = json.getString("a32098");
            this.a321 = json.getString("a321");
            this.a322a = json.getString("a322a");
            this.a322ax = json.getString("a322ax");
            this.a322b = json.getString("a322b");
            this.a322bx = json.getString("a322bx");
            this.a322c = json.getString("a322c");
            this.a322cx = json.getString("a322cx");
            this.a322d = json.getString("a322d");
            this.a322dx = json.getString("a322dx");
            this.a322e = json.getString("a322e");
            this.a322ex = json.getString("a322ex");
            this.a322f = json.getString("a322f");
            this.a322fx = json.getString("a322fx");
            this.a322g = json.getString("a322g");
            this.a322gx = json.getString("a322gx");
            this.a322998 = json.getString("a322998");
        }
    }

    public void sA4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a401 = json.getString("a401");
            this.a402 = json.getString("a402");
            this.a403 = json.getString("a403");
            this.a40301 = json.getString("a40301");
            this.a40302 = json.getString("a40302");
            this.a40303 = json.getString("a40303");
            this.a40304 = json.getString("a40304");
            this.a40305 = json.getString("a40305");
            this.a404 = json.getString("a404");
            this.a405 = json.getString("a405");
            this.a40501 = json.getString("a40501");
            this.a40502 = json.getString("a40502");
            this.a40503 = json.getString("a40503");
            this.a40504 = json.getString("a40504");
            this.a40505 = json.getString("a40505");
            this.a406 = json.getString("a406");
            this.a40601 = json.getString("a40601");
            this.a40602 = json.getString("a40602");
            this.a40603 = json.getString("a40603");
            this.a40604 = json.getString("a40604");
            this.a40605 = json.getString("a40605");
            this.a40606 = json.getString("a40606");
            this.a40607 = json.getString("a40607");
            this.a40608 = json.getString("a40608");
            this.a40609 = json.getString("a40609");
            this.a40696 = json.getString("a40696");
            this.a40696x = json.getString("a40696x");
        }
    }

    public void sA5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a501 = json.getString("a501");
            this.a502 = json.getString("a502");
            this.a503 = json.getString("a503");
            this.a504 = json.getString("a504");
            this.a505 = json.getString("a505");
            this.a506 = json.getString("a506");
            this.a507 = json.getString("a507");
            this.a508 = json.getString("a508");
            this.astaa = json.getString("astaa");
            this.astab = json.getString("astab");
            this.astab96x = json.getString("astab96x");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FormsTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(FormsTable.COLUMN_HHID, this.hhid);
        json.put(FormsTable.COLUMN_SNO, this.sno);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ENTRY_TYPE, this.entryType);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(FormsTable.COLUMN_APPVERSION, this.appver);
        json.put(FormsTable.COLUMN_PROVINCE_CODE, this.provinceCode);
        json.put(FormsTable.COLUMN_DISTRICT_CODE, this.districtCode);
        json.put(FormsTable.COLUMN_TEHSIL_CODE, this.tehsilCode);
        json.put(FormsTable.COLUMN_UC_CODE, this.ucCode);
        json.put(FormsTable.COLUMN_VILLAGE_CODE, this.villageCode);
        json.put(FormsTable.COLUMN_A105B, this.a105b);
        json.put(FormsTable.COLUMN_A106, this.a106);
        json.put(FormsTable.COLUMN_A107, this.a107);
        json.put(FormsTable.COLUMN_SA1, new JSONObject(sA1toString()));
        json.put(FormsTable.COLUMN_SA3A, new JSONObject(sA3AtoString()));
        json.put(FormsTable.COLUMN_SA3B, new JSONObject(sA3BtoString()));
        json.put(FormsTable.COLUMN_SA4, new JSONObject(sA4toString()));
        json.put(FormsTable.COLUMN_SA5, new JSONObject(sA5toString()));
        return json;
    }

    public String sA1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
        JSONObject json = new JSONObject();
        json.put("a101", a101)
                .put("a102", a102)
                .put("a103", a103)
                .put("a104", a104)
                .put("a105a", a105a)
                .put("a108d", a108d)
                .put("a108m", a108m)
                .put("a108y", a108y)
                .put("a109", a109)
                .put("a110", a110)
                .put("a111", a111)
                .put("a112", a112)
                .put("a113", a113)
                .put("a114", a114)
                .put("a114a", a114a)
                .put("a115h", a115h)
                .put("a115m", a115m)
                .put("a116h", a116h)
                .put("a116m", a116m)
                .put("a117", a117)
                .put("a118", a118)
                .put("a119", a119);
        return json.toString();
    }

    public String sA3AtoString() throws JSONException {
        Log.d(TAG, "sA3toString: ");
        JSONObject json = new JSONObject();
        json.put("a301", a301)
                .put("a30196x", a30196x)
                .put("a302", a302)
                .put("a30296x", a30296x)
                .put("a303", a303)
                .put("a30396x", a30396x)
                .put("a304", a304)
                .put("a305", a305)
                .put("a30601", a30601)
                .put("a30602", a30602)
                .put("a30603", a30603)
                .put("a30604", a30604)
                .put("a30605", a30605)
                .put("a30606", a30606)
                .put("a30696", a30696)
                .put("a30696x", a30696x)
                .put("a307", a307)
                .put("a30796x", a30796x)
                .put("a308", a308)
                .put("a309", a309)
                .put("a310", a310)
                .put("a31096x", a31096x)
                .put("a31101", a31101)
                .put("a31102", a31102)
                .put("a31103", a31103)
                .put("a31104", a31104)
                .put("a31105", a31105)
                .put("a31106", a31106)
                .put("a31107", a31107)
                .put("a31108", a31108)
                .put("a31109", a31109)
                .put("a31110", a31110)
                .put("a31111", a31111)
                .put("a31112", a31112)
                .put("a31113", a31113)
                .put("a31114", a31114)
                .put("a31115", a31115)
                .put("a31116", a31116)
                .put("a31117", a31117)
                .put("a31118", a31118)
                .put("a31119", a31119);
        return json.toString();
    }

    public String sA3BtoString() throws JSONException {
        Log.d(TAG, "sA3toString: ");
        JSONObject json = new JSONObject();
        json.put("a31201", a31201)
                .put("a31202", a31202)
                .put("a31203", a31203)
                .put("a31204", a31204)
                .put("a31205", a31205)
                .put("a31206", a31206)
                .put("a31207", a31207)
                .put("a31208", a31208)
                .put("a313", a313)
                .put("a31396x", a31396x)
                .put("a314", a314)
                .put("a315", a315)
                .put("a31596x", a31596x)
                .put("a316", a316)
                .put("a31696x", a31696x)
                .put("a317", a317)
                .put("a31796x", a31796x)
                .put("a318", a318)
                .put("a319", a319)
                .put("a320a", a320a)
                .put("a320k", a320k)
                .put("a320m", a320m)
                .put("a32098", a32098)
                .put("a321", a321)
                .put("a322a", a322a)
                .put("a322ax", a322ax)
                .put("a322b", a322b)
                .put("a322bx", a322bx)
                .put("a322c", a322c)
                .put("a322cx", a322cx)
                .put("a322d", a322d)
                .put("a322dx", a322dx)
                .put("a322e", a322e)
                .put("a322ex", a322ex)
                .put("a322f", a322f)
                .put("a322fx", a322fx)
                .put("a322g", a322g)
                .put("a322gx", a322gx)
                .put("a322998", a322998);
        return json.toString();
    }

    public String sA4toString() throws JSONException {
        Log.d(TAG, "sA4toString: ");
        JSONObject json = new JSONObject();
        json.put("a401", a401)
                .put("a402", a402)
                .put("a403", a403)
                .put("a40301", a40301)
                .put("a40302", a40302)
                .put("a40303", a40303)
                .put("a40304", a40304)
                .put("a40305", a40305)
                .put("a404", a404)
                .put("a405", a405)
                .put("a40501", a40501)
                .put("a40502", a40502)
                .put("a40503", a40503)
                .put("a40504", a40504)
                .put("a40505", a40505)
                .put("a406", a406)
                .put("a40601", a40601)
                .put("a40602", a40602)
                .put("a40603", a40603)
                .put("a40604", a40604)
                .put("a40605", a40605)
                .put("a40606", a40606)
                .put("a40607", a40607)
                .put("a40608", a40608)
                .put("a40609", a40609)
                .put("a40696", a40696)
                .put("a40696x", a40696x);
        return json.toString();
    }

    public String sA5toString() throws JSONException {
        Log.d(TAG, "sA5toString: ");
        JSONObject json = new JSONObject();
        json.put("a501", a501)
                .put("a502", a502)
                .put("a503", a503)
                .put("a504", a504)
                .put("a505", a505)
                .put("a506", a506)
                .put("a507", a507)
                .put("a508", a508)
                .put("astaa", astaa)
                .put("astab", astab)
                .put("astab96x", astab96x);
        return json.toString();
    }


}
