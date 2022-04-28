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


public class ModuleG extends BaseObservable implements Observable {

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

    private String villagename = _EMPTY_;
    private String district = _EMPTY_;
    private String hcla = _EMPTY_;
    private String household = _EMPTY_;
    private String qnumber = _EMPTY_;
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
    private String istg01 = _EMPTY_;
    private String istg02 = _EMPTY_;
    private String istg0296x = _EMPTY_;


    public ModuleG() {

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
    public String getVillagename() {
        return villagename;
    }

    public void setVillagename(String villagename) {
        this.villagename = villagename;
        notifyPropertyChanged(BR.villagename);
    }

    @Bindable
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
        notifyPropertyChanged(BR.district);
    }

    @Bindable
    public String getHcla() {
        return hcla;
    }

    public void setHcla(String hcla) {
        this.hcla = hcla;
        notifyPropertyChanged(BR.hcla);
    }

    @Bindable
    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
        notifyPropertyChanged(BR.household);
    }

    @Bindable
    public String getQnumber() {
        return qnumber;
    }

    public void setQnumber(String qnumber) {
        this.qnumber = qnumber;
        notifyPropertyChanged(BR.qnumber);
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
    public String getIstg01() {
        return istg01;
    }

    public void setIstg01(String istg01) {
        this.istg01 = istg01;
        notifyPropertyChanged(BR.istg01);
    }

    @Bindable
    public String getIstg02() {
        return istg02;
    }

    public void setIstg02(String istg02) {
        this.istg02 = istg02;
        notifyPropertyChanged(BR.istg02);
    }

    @Bindable
    public String getIstg0296x() {
        return istg0296x;
    }

    public void setIstg0296x(String istg0296x) {
        this.istg0296x = istg0296x;
        notifyPropertyChanged(BR.istg0296x);
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


    public ModuleG Hydrate(Cursor cursor) throws JSONException {
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
