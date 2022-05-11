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
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;

public class Pregnancy extends BaseObservable implements Observable {

    private final String TAG = "Pregnancy";
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
    private String villageCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String indexed = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    private String eh101 = _EMPTY_; //Cluster Number
    private String eh102 = _EMPTY_; //District
    private String eh103 = _EMPTY_; //HouseHold Number
    private String eh104 = _EMPTY_; //Questionnaire Number

    // FIELD VARIABLES
    private String e101 = _EMPTY_;
    private String e102 = _EMPTY_;
    private String e103 = _EMPTY_;
    private String e104 = _EMPTY_;
    private String e105 = _EMPTY_;
    private String e106d = _EMPTY_;
    private String e106m = _EMPTY_;
    private String e106y = _EMPTY_;
    private String e107w = _EMPTY_;
    private String e107m = _EMPTY_;
    private String e108 = _EMPTY_;
    private String e109 = _EMPTY_;
    private String e10901 = _EMPTY_;
    private String e10902 = _EMPTY_;
    private String e10903 = _EMPTY_;
    private String e10904 = _EMPTY_;
    private String e10905 = _EMPTY_;
    private String e10906 = _EMPTY_;
    private String e10907 = _EMPTY_;
    private String e10908 = _EMPTY_;
    private String e10996 = _EMPTY_;
    private String e10996x = _EMPTY_;
    private String e109t = _EMPTY_;
    private String e110 = _EMPTY_;
    private String e11001 = _EMPTY_;
    private String e11002 = _EMPTY_;
    private String e11003 = _EMPTY_;
    private String e11004 = _EMPTY_;
    private String e11005 = _EMPTY_;
    private String e11096 = _EMPTY_;
    private String e11096x = _EMPTY_;
    private String e111w = _EMPTY_;
    private String e111m = _EMPTY_;
    private String e112 = _EMPTY_;
    private String e11201x = _EMPTY_;
    private String e113a = _EMPTY_;
    private String e113b = _EMPTY_;
    private String e113c = _EMPTY_;
    private String e113d = _EMPTY_;
    private String e113e = _EMPTY_;
    private String e113f = _EMPTY_;
    private String e113g = _EMPTY_;
    private String e113h = _EMPTY_;
    private String e11397 = _EMPTY_;
    private String e11396 = _EMPTY_;
    private String e11396x = _EMPTY_;
    private String e114 = _EMPTY_;
    private String e115 = _EMPTY_;
    private String e116 = _EMPTY_;
    private String e11601 = _EMPTY_;
    private String e11602 = _EMPTY_;
    private String e11603 = _EMPTY_;
    private String e11604 = _EMPTY_;
    private String e11605 = _EMPTY_;
    private String e11606 = _EMPTY_;
    private String e11607 = _EMPTY_;
    private String e11608 = _EMPTY_;
    private String e11696 = _EMPTY_;
    private String e11696x = _EMPTY_;
    private String e117 = _EMPTY_;
    private String e11701 = _EMPTY_;
    private String e11702 = _EMPTY_;
    private String e11703 = _EMPTY_;
    private String e11703x = _EMPTY_;
    private String e118 = _EMPTY_;
    private String e119 = _EMPTY_;
    private String e120 = _EMPTY_;
    private String e121 = _EMPTY_;
    private String e122 = _EMPTY_;
    private String e12201 = _EMPTY_;
    private String e12202 = _EMPTY_;
    private String e12296 = _EMPTY_;
    private String e12296x = _EMPTY_;
    private String e123 = _EMPTY_;
    private String e124 = _EMPTY_;
    private String e12401x = _EMPTY_;
    private String e12402x = _EMPTY_;
    private String e125 = _EMPTY_;
    private String e12596x = _EMPTY_;
    private String e126 = _EMPTY_;
    private String e127 = _EMPTY_;
    private String e12701x = _EMPTY_;
    private String e20101 = _EMPTY_;
    private String e20102 = _EMPTY_;
    private String e20103 = _EMPTY_;
    private String e20104 = _EMPTY_;
    private String e20105 = _EMPTY_;
    private String e20106 = _EMPTY_;
    private String e20107 = _EMPTY_;
    private String e20197 = _EMPTY_;
    private String e20201 = _EMPTY_;
    private String e20202 = _EMPTY_;
    private String e20203 = _EMPTY_;
    private String e20204 = _EMPTY_;
    private String e20205 = _EMPTY_;
    private String e20206 = _EMPTY_;
    private String e20207 = _EMPTY_;
    private String e20297 = _EMPTY_;
    private String e20301 = _EMPTY_;
    private String e20302 = _EMPTY_;
    private String e20303 = _EMPTY_;
    private String e20304 = _EMPTY_;
    private String e20305 = _EMPTY_;
    private String e20306 = _EMPTY_;
    private String e20307 = _EMPTY_;
    private String e20397 = _EMPTY_;
    private String e20401 = _EMPTY_;
    private String e20402 = _EMPTY_;
    private String e20403 = _EMPTY_;
    private String e20404 = _EMPTY_;
    private String e20405 = _EMPTY_;
    private String e20406 = _EMPTY_;
    private String e20407 = _EMPTY_;
    private String e20497 = _EMPTY_;
    private String e20501 = _EMPTY_;
    private String e20502 = _EMPTY_;
    private String e20503 = _EMPTY_;
    private String e20504 = _EMPTY_;
    private String e20505 = _EMPTY_;
    private String e20506 = _EMPTY_;
    private String e20507 = _EMPTY_;
    private String e20597 = _EMPTY_;
    private String e20601 = _EMPTY_;
    private String e20602 = _EMPTY_;
    private String e20603 = _EMPTY_;
    private String e20604 = _EMPTY_;
    private String e20605 = _EMPTY_;
    private String e20606 = _EMPTY_;
    private String e20607 = _EMPTY_;
    private String e20697 = _EMPTY_;
    private String e20701 = _EMPTY_;
    private String e20702 = _EMPTY_;
    private String e20703 = _EMPTY_;
    private String e20704 = _EMPTY_;
    private String e20705 = _EMPTY_;
    private String e20706 = _EMPTY_;
    private String e20707 = _EMPTY_;
    private String e20797 = _EMPTY_;
    private String e20801 = _EMPTY_;
    private String e20802 = _EMPTY_;
    private String e20803 = _EMPTY_;
    private String e20804 = _EMPTY_;
    private String e20805 = _EMPTY_;
    private String e20806 = _EMPTY_;
    private String e20807 = _EMPTY_;
    private String e20897 = _EMPTY_;
    private String e20901 = _EMPTY_;
    private String e20902 = _EMPTY_;
    private String e20903 = _EMPTY_;
    private String e20904 = _EMPTY_;
    private String e20905 = _EMPTY_;
    private String e20906 = _EMPTY_;
    private String e20907 = _EMPTY_;
    private String e20997 = _EMPTY_;
    private String e21001 = _EMPTY_;
    private String e21002 = _EMPTY_;
    private String e21003 = _EMPTY_;
    private String e21004 = _EMPTY_;
    private String e21005 = _EMPTY_;
    private String e21006 = _EMPTY_;
    private String e21007 = _EMPTY_;
    private String e21097 = _EMPTY_;


    public void Pregnancy() {
    }

    public void populateMeta() {
        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyMember.getUid()); //// not applicable in Form table
        //setMsno(MainApp.mwra.getBs1q1());
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getVillageCode() {
        return villageCode;
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


    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
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

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }


    @Bindable
    public String getEh101() {
        return eh101;
    }

    public void setEh101(String eh101) {
        this.eh101 = eh101;
        notifyPropertyChanged(BR.eh101);
    }

    @Bindable
    public String getEh102() {
        return eh102;
    }

    public void setEh102(String eh102) {
        this.eh102 = eh102;
        notifyPropertyChanged(BR.eh102);
    }

    @Bindable
    public String getEh103() {
        return eh103;
    }

    public void setEh103(String eh103) {
        this.eh103 = eh103;
        notifyPropertyChanged(BR.eh103);
    }

    @Bindable
    public String getEh104() {
        return eh104;
    }

    public void setEh104(String eh104) {
        this.eh104 = eh104;
        notifyPropertyChanged(BR.eh104);
    }

    @Bindable
    public String getE101() {
        return e101;
    }

    public void setE101(String e101) {
        this.e101 = e101;
        notifyPropertyChanged(BR.e101);
    }

    @Bindable
    public String getE102() {
        return e102;
    }

    public void setE102(String e102) {
        this.e102 = e102;
        notifyPropertyChanged(BR.e102);
    }

    @Bindable
    public String getE103() {
        return e103;
    }

    public void setE103(String e103) {
        this.e103 = e103;
        notifyPropertyChanged(BR.e103);
    }

    @Bindable
    public String getE104() {
        return e104;
    }

    public void setE104(String e104) {
        this.e104 = e104;
        notifyPropertyChanged(BR.e104);
    }

    @Bindable
    public String getE105() {
        return e105;
    }

    public void setE105(String e105) {
        this.e105 = e105;
        setE106d(e105.equals("1") ? this.e106d : "");
        setE106m(e105.equals("1") ? this.e106m : "");
        setE106y(e105.equals("1") ? this.e106y : "");
        setE107w(e105.equals("1") ? this.e107w : "");
        setE107m(e105.equals("1") ? this.e107m : "");
        setE108(e105.equals("1") ? this.e108 : "");
        setE10901(e105.equals("1") ? this.e10901 : "");
        setE10902(e105.equals("1") ? this.e10902 : "");
        setE10903(e105.equals("1") ? this.e10903 : "");
        setE10904(e105.equals("1") ? this.e10904 : "");
        setE10905(e105.equals("1") ? this.e10905 : "");
        setE10906(e105.equals("1") ? this.e10906 : "");
        setE10907(e105.equals("1") ? this.e10907 : "");
        setE10908(e105.equals("1") ? this.e10908 : "");
        setE10996(e105.equals("1") ? this.e10996 : "");
        setE11001(e105.equals("1") ? this.e11001 : "");
        setE11002(e105.equals("1") ? this.e11002 : "");
        setE11003(e105.equals("1") ? this.e11003 : "");
        setE11004(e105.equals("1") ? this.e11004 : "");
        setE11005(e105.equals("1") ? this.e11005 : "");
        setE11096(e105.equals("1") ? this.e11096 : "");
        setE111w(e105.equals("1") ? this.e111w : "");
        setE111m(e105.equals("1") ? this.e111m : "");
        setE112(e105.equals("1") ? this.e112 : "");
        setE113a(e105.equals("1") ? this.e113a : "");
        setE113b(e105.equals("1") ? this.e113b : "");
        setE113c(e105.equals("1") ? this.e113c : "");
        setE113d(e105.equals("1") ? this.e113d : "");
        setE113e(e105.equals("1") ? this.e113e : "");
        setE113f(e105.equals("1") ? this.e113f : "");
        setE113g(e105.equals("1") ? this.e113g : "");
        setE113h(e105.equals("1") ? this.e113h : "");
        setE11397(e105.equals("1") ? this.e11397 : "");
        setE11396(e105.equals("1") ? this.e11396 : "");
        setE114(e105.equals("1") ? this.e114 : "");
        setE115(e105.equals("1") ? this.e115 : "");
        setE11601(e105.equals("1") ? this.e11601 : "");
        setE11602(e105.equals("1") ? this.e11602 : "");
        setE11603(e105.equals("1") ? this.e11603 : "");
        setE11604(e105.equals("1") ? this.e11604 : "");
        setE11605(e105.equals("1") ? this.e11605 : "");
        setE11606(e105.equals("1") ? this.e11606 : "");
        setE11607(e105.equals("1") ? this.e11607 : "");
        setE11608(e105.equals("1") ? this.e11608 : "");
        setE11696(e105.equals("1") ? this.e11696 : "");
        setE11701(e105.equals("1") ? this.e11701 : "");
        setE11702(e105.equals("1") ? this.e11702 : "");
        setE11703(e105.equals("1") ? this.e11703 : "");
        setE118(e105.equals("1") ? this.e118 : "");
        setE119(e105.equals("1") ? this.e119 : "");
        setE120(e105.equals("1") ? this.e120 : "");
        setE121(e105.equals("1") ? this.e121 : "");
        setE12201(e105.equals("1") ? this.e12201 : "");
        setE12202(e105.equals("1") ? this.e12202 : "");
        setE12296(e105.equals("1") ? this.e12296 : "");
        setE123(e105.equals("1") ? this.e123 : "");
        setE124(e105.equals("1") ? this.e124 : "");
        setE125(e105.equals("1") ? this.e125 : "");
        setE126(e105.equals("1") ? this.e126 : "");
        setE127(e105.equals("1") ? this.e127 : "");

        notifyPropertyChanged(BR.e105);
    }

    @Bindable
    public String getE106d() {
        return e106d;
    }

    public void setE106d(String e106d) {
        this.e106d = e106d;
        notifyPropertyChanged(BR.e106d);
    }

    @Bindable
    public String getE106m() {
        return e106m;
    }

    public void setE106m(String e106m) {
        this.e106m = e106m;
        notifyPropertyChanged(BR.e106m);
    }

    @Bindable
    public String getE106y() {
        return e106y;
    }

    public void setE106y(String e106y) {
        this.e106y = e106y;
        notifyPropertyChanged(BR.e106y);
    }


    @Bindable
    public String getE107w() {
        return e107w;
    }

    public void setE107w(String e107w) {
        this.e107w = e107w;
        notifyPropertyChanged(BR.e107w);
    }

    @Bindable
    public String getE107m() {
        return e107m;
    }

    public void setE107m(String e107m) {
        this.e107m = e107m;
        notifyPropertyChanged(BR.e107m);
    }

    @Bindable
    public String getE108() {
        return e108;
    }

    public void setE108(String e108) {
        this.e108 = e108;
        setE10901(e108.equals("1") ? this.e10901 : "");
        setE10902(e108.equals("1") ? this.e10902 : "");
        setE10903(e108.equals("1") ? this.e10903 : "");
        setE10904(e108.equals("1") ? this.e10904 : "");
        setE10905(e108.equals("1") ? this.e10905 : "");
        setE10906(e108.equals("1") ? this.e10906 : "");
        setE10907(e108.equals("1") ? this.e10907 : "");
        setE10908(e108.equals("1") ? this.e10908 : "");
        setE10996(e108.equals("1") ? this.e10996 : "");
        setE11001(e108.equals("1") ? this.e11001 : "");
        setE11002(e108.equals("1") ? this.e11002 : "");
        setE11003(e108.equals("1") ? this.e11003 : "");
        setE11004(e108.equals("1") ? this.e11004 : "");
        setE11005(e108.equals("1") ? this.e11005 : "");
        setE11096(e108.equals("1") ? this.e11096 : "");
        setE111w(e108.equals("1") ? this.e111w : "");
        setE111m(e108.equals("1") ? this.e111m : "");
        setE112(e108.equals("1") ? this.e112 : "");
        setE113a(e108.equals("1") ? this.e113a : "");
        setE113b(e108.equals("1") ? this.e113b : "");
        setE113c(e108.equals("1") ? this.e113c : "");
        setE113d(e108.equals("1") ? this.e113d : "");
        setE113e(e108.equals("1") ? this.e113e : "");
        setE113f(e108.equals("1") ? this.e113f : "");
        setE113g(e108.equals("1") ? this.e113g : "");
        setE113h(e108.equals("1") ? this.e113h : "");
        setE11397(e108.equals("1") ? this.e11397 : "");
        setE11396(e108.equals("1") ? this.e11396 : "");
        notifyPropertyChanged(BR.e108);
    }

    @Bindable
    public String getE109() {
        return e109;
    }

    public void setE109(String e109) {
        this.e109 = e109;
        notifyPropertyChanged(BR.e109);
    }

    @Bindable
    public String getE10901() {
        return e10901;
    }

    public void setE10901(String e10901) {
        if (this.e10901.equals(e10901)) return;
        this.e10901 = e10901;
        notifyPropertyChanged(BR.e10901);
    }

    @Bindable
    public String getE10902() {
        return e10902;
    }

    public void setE10902(String e10902) {
        if (this.e10902.equals(e10902)) return;
        this.e10902 = e10902;
        notifyPropertyChanged(BR.e10902);
    }

    @Bindable
    public String getE10903() {
        return e10903;
    }

    public void setE10903(String e10903) {
        if (this.e10903.equals(e10903)) return;
        this.e10903 = e10903;
        notifyPropertyChanged(BR.e10903);
    }

    @Bindable
    public String getE10904() {
        return e10904;
    }

    public void setE10904(String e10904) {
        if (this.e10904.equals(e10904)) return;
        this.e10904 = e10904;
        notifyPropertyChanged(BR.e10904);
    }

    @Bindable
    public String getE10905() {
        return e10905;
    }

    public void setE10905(String e10905) {
        if (this.e10905.equals(e10905)) return;
        this.e10905 = e10905;
        notifyPropertyChanged(BR.e10905);
    }

    @Bindable
    public String getE10906() {
        return e10906;
    }

    public void setE10906(String e10906) {
        if (this.e10906.equals(e10906)) return;
        this.e10906 = e10906;
        notifyPropertyChanged(BR.e10906);
    }

    @Bindable
    public String getE10907() {
        return e10907;
    }

    public void setE10907(String e10907) {
        if (this.e10907.equals(e10907)) return;
        this.e10907 = e10907;
        notifyPropertyChanged(BR.e10907);
    }

    @Bindable
    public String getE10908() {
        return e10908;
    }

    public void setE10908(String e10908) {
        if (this.e10908.equals(e10908)) return;
        this.e10908 = e10908;
        notifyPropertyChanged(BR.e10908);
    }

    @Bindable
    public String getE10996() {
        return e10996;
    }

    public void setE10996(String e10996) {
        if (this.e10996.equals(e10996)) return;
        this.e10996 = e10996;
        setE10996x(e10996.equals("96") ? this.e10996x : "");
        notifyPropertyChanged(BR.e10996);
    }

    @Bindable
    public String getE10996x() {
        return e10996x;
    }

    public void setE10996x(String e10996x) {
        this.e10996x = e10996x;
        notifyPropertyChanged(BR.e10996x);
    }

    @Bindable
    public String getE109t() {
        return e109t;
    }

    public void setE109t(String e109t) {
        this.e109t = e109t;
        notifyPropertyChanged(BR.e109t);
    }

    @Bindable
    public String getE110() {
        return e110;
    }

    public void setE110(String e110) {
        this.e110 = e110;
        notifyPropertyChanged(BR.e110);
    }

    @Bindable
    public String getE11001() {
        return e11001;
    }

    public void setE11001(String e11001) {
        if (this.e11001.equals(e11001)) return;
        this.e11001 = e11001;
        notifyPropertyChanged(BR.e11001);
    }

    @Bindable
    public String getE11002() {
        return e11002;
    }

    public void setE11002(String e11002) {
        if (this.e11002.equals(e11002)) return;
        this.e11002 = e11002;
        notifyPropertyChanged(BR.e11002);
    }

    @Bindable
    public String getE11003() {
        return e11003;
    }

    public void setE11003(String e11003) {
        if (this.e11003.equals(e11003)) return;
        this.e11003 = e11003;
        notifyPropertyChanged(BR.e11003);
    }

    @Bindable
    public String getE11004() {
        return e11004;
    }

    public void setE11004(String e11004) {
        if (this.e11004.equals(e11004)) return;
        this.e11004 = e11004;
        notifyPropertyChanged(BR.e11004);
    }

    @Bindable
    public String getE11005() {
        return e11005;
    }

    public void setE11005(String e11005) {
        if (this.e11005.equals(e11005)) return;
        this.e11005 = e11005;
        notifyPropertyChanged(BR.e11005);
    }

    @Bindable
    public String getE11096() {
        return e11096;
    }

    public void setE11096(String e11096) {
        if (this.e11096.equals(e11096)) return;
        this.e11096 = e11096;
        setE11096x(e11096.equals("96") ? this.e11096x : "");
        notifyPropertyChanged(BR.e11096);
    }

    @Bindable
    public String getE11096x() {
        return e11096x;
    }

    public void setE11096x(String e11096x) {
        this.e11096x = e11096x;
        notifyPropertyChanged(BR.e11096x);
    }

    @Bindable
    public String getE111w() {
        return e111w;
    }

    public void setE111w(String e111w) {
        this.e111w = e111w;
        notifyPropertyChanged(BR.e111w);
    }

    @Bindable
    public String getE111m() {
        return e111m;
    }

    public void setE111m(String e111m) {
        this.e111m = e111m;
        notifyPropertyChanged(BR.e111m);
    }

    @Bindable
    public String getE112() {
        return e112;
    }

    public void setE112(String e112) {
        this.e112 = e112;
        setE11201x(e112.equals("1") ? this.e11201x : "");
        notifyPropertyChanged(BR.e112);
    }

    @Bindable
    public String getE11201x() {
        return e11201x;
    }

    public void setE11201x(String e11201x) {
        this.e11201x = e11201x;
        notifyPropertyChanged(BR.e11201x);
    }

    @Bindable
    public String getE113a() {
        return e113a;
    }

    public void setE113a(String e113a) {
        this.e113a = e113a;
        notifyPropertyChanged(BR.e113a);
    }

    @Bindable
    public String getE113b() {
        return e113b;
    }

    public void setE113b(String e113b) {
        this.e113b = e113b;
        notifyPropertyChanged(BR.e113b);
    }

    @Bindable
    public String getE113c() {
        return e113c;
    }

    public void setE113c(String e113c) {
        this.e113c = e113c;
        notifyPropertyChanged(BR.e113c);
    }

    @Bindable
    public String getE113d() {
        return e113d;
    }

    public void setE113d(String e113d) {
        this.e113d = e113d;
        notifyPropertyChanged(BR.e113d);
    }

    @Bindable
    public String getE113e() {
        return e113e;
    }

    public void setE113e(String e113e) {
        this.e113e = e113e;
        notifyPropertyChanged(BR.e113e);
    }

    @Bindable
    public String getE113f() {
        return e113f;
    }

    public void setE113f(String e113f) {
        this.e113f = e113f;
        notifyPropertyChanged(BR.e113f);
    }

    @Bindable
    public String getE113g() {
        return e113g;
    }

    public void setE113g(String e113g) {
        this.e113g = e113g;
        notifyPropertyChanged(BR.e113g);
    }

    @Bindable
    public String getE113h() {
        return e113h;
    }

    public void setE113h(String e113h) {
        this.e113h = e113h;
        notifyPropertyChanged(BR.e113h);
    }

    @Bindable
    public String getE11397() {
        return e11397;
    }

    public void setE11397(String e11397) {
        this.e11397 = e11397;
        setE113a(e11397.equals("1") ? "" : this.e113a);
        setE113b(e11397.equals("1") ? "" : this.e113b);
        setE113c(e11397.equals("1") ? "" : this.e113c);
        setE113d(e11397.equals("1") ? "" : this.e113d);
        setE113e(e11397.equals("1") ? "" : this.e113e);
        setE113f(e11397.equals("1") ? "" : this.e113f);
        setE113g(e11397.equals("1") ? "" : this.e113g);
        setE113h(e11397.equals("1") ? "" : this.e113h);
        setE11396(e11397.equals("1") ? "" : this.e11396);
        notifyPropertyChanged(BR.e11397);
    }

    @Bindable
    public String getE11396() {
        return e11396;
    }

    public void setE11396(String e11396) {
        this.e11396 = e11396;
        setE11396x(e11396.equals("96") ? this.e11396x : "");
        notifyPropertyChanged(BR.e11396);
    }

    @Bindable
    public String getE11396x() {
        return e11396x;
    }

    public void setE11396x(String e11396x) {
        this.e11396x = e11396x;
        notifyPropertyChanged(BR.e11396x);
    }


    @Bindable
    public String getE114() {
        return e114;
    }

    public void setE114(String e114) {
        this.e114 = e114;
        setE115(e114.equals("1") ? this.e115 : "");
        setE11601(e114.equals("1") ? this.e11601 : "");
        setE11602(e114.equals("1") ? this.e11602 : "");
        setE11603(e114.equals("1") ? this.e11603 : "");
        setE11604(e114.equals("1") ? this.e11604 : "");
        setE11605(e114.equals("1") ? this.e11605 : "");
        setE11606(e114.equals("1") ? this.e11606 : "");
        setE11607(e114.equals("1") ? this.e11607 : "");
        setE11608(e114.equals("1") ? this.e11608 : "");
        setE11696(e114.equals("1") ? this.e11696 : "");
        setE11701(e114.equals("1") ? this.e11701 : "");
        setE11702(e114.equals("1") ? this.e11702 : "");
        setE11703(e114.equals("1") ? this.e11703 : "");
        setE118(e114.equals("1") ? this.e118 : "");
        notifyPropertyChanged(BR.e114);
    }

    @Bindable
    public String getE115() {
        return e115;
    }

    public void setE115(String e115) {
        this.e115 = e115;
        notifyPropertyChanged(BR.e115);
    }

    @Bindable
    public String getE116() {
        return e116;
    }

    public void setE116(String e116) {
        this.e116 = e116;
        notifyPropertyChanged(BR.e116);
    }

    @Bindable
    public String getE11601() {
        return e11601;
    }

    public void setE11601(String e11601) {
        if (this.e11601.equals(e11601)) return;
        this.e11601 = e11601;
        notifyPropertyChanged(BR.e11601);
    }

    @Bindable
    public String getE11602() {
        return e11602;
    }

    public void setE11602(String e11602) {
        if (this.e11602.equals(e11602)) return;
        this.e11602 = e11602;
        notifyPropertyChanged(BR.e11602);
    }

    @Bindable
    public String getE11603() {
        return e11603;
    }

    public void setE11603(String e11603) {
        if (this.e11603.equals(e11603)) return;
        this.e11603 = e11603;
        notifyPropertyChanged(BR.e11603);
    }

    @Bindable
    public String getE11604() {
        return e11604;
    }

    public void setE11604(String e11604) {
        if (this.e11604.equals(e11604)) return;
        this.e11604 = e11604;
        notifyPropertyChanged(BR.e11604);
    }

    @Bindable
    public String getE11605() {
        return e11605;
    }

    public void setE11605(String e11605) {
        if (this.e11605.equals(e11605)) return;
        this.e11605 = e11605;
        notifyPropertyChanged(BR.e11605);
    }

    @Bindable
    public String getE11606() {
        return e11606;
    }

    public void setE11606(String e11606) {
        if (this.e11606.equals(e11606)) return;
        this.e11606 = e11606;
        notifyPropertyChanged(BR.e11606);
    }

    @Bindable
    public String getE11607() {
        return e11607;
    }

    public void setE11607(String e11607) {
        if (this.e11607.equals(e11607)) return;
        this.e11607 = e11607;
        notifyPropertyChanged(BR.e11607);
    }

    @Bindable
    public String getE11608() {
        return e11608;
    }

    public void setE11608(String e11608) {
        if (this.e11608.equals(e11608)) return;
        this.e11608 = e11608;
        notifyPropertyChanged(BR.e11608);
    }

    @Bindable
    public String getE11696() {
        return e11696;
    }

    public void setE11696(String e11696) {
        if (this.e11696.equals(e11696)) return;
        this.e11696 = e11696;
        setE11696x(e11696.equals("96") ? this.e11696x : "");
        notifyPropertyChanged(BR.e11696);
    }

    @Bindable
    public String getE11696x() {
        return e11696x;
    }

    public void setE11696x(String e11696x) {
        this.e11696x = e11696x;
        notifyPropertyChanged(BR.e11696x);
    }

    @Bindable
    public String getE117() {
        return e117;
    }

    public void setE117(String e117) {
        this.e117 = e117;
        notifyPropertyChanged(BR.e117);
    }

    @Bindable
    public String getE11701() {
        return e11701;
    }

    public void setE11701(String e11701) {
        if (this.e11701.equals(e11701)) return;
        this.e11701 = e11701;
        notifyPropertyChanged(BR.e11701);
    }

    @Bindable
    public String getE11702() {
        return e11702;
    }

    public void setE11702(String e11702) {
        if (this.e11702.equals(e11702)) return;
        this.e11702 = e11702;
        notifyPropertyChanged(BR.e11702);
    }

    @Bindable
    public String getE11703() {
        return e11703;
    }

    public void setE11703(String e11703) {
        if (this.e11703.equals(e11703)) return;
        this.e11703 = e11703;
        setE11703x(e11703.equals("96") ? this.e11703x : "");
        notifyPropertyChanged(BR.e11703);
    }

    @Bindable
    public String getE11703x() {
        return e11703x;
    }

    public void setE11703x(String e11703x) {
        this.e11703x = e11703x;
        notifyPropertyChanged(BR.e11703x);
    }

    @Bindable
    public String getE118() {
        return e118;
    }

    public void setE118(String e118) {
        this.e118 = e118;
        notifyPropertyChanged(BR.e118);
    }

    @Bindable
    public String getE119() {
        return e119;
    }

    public void setE119(String e119) {
        this.e119 = e119;
        setE120(e119.equals("1") ? this.e120 : "");
        setE121(e119.equals("1") ? this.e121 : "");
        setE12201(e119.equals("1") ? this.e12201 : "");
        setE12202(e119.equals("1") ? this.e12202 : "");
        setE12296(e119.equals("1") ? this.e12296 : "");
        notifyPropertyChanged(BR.e119);
    }

    @Bindable
    public String getE120() {
        return e120;
    }

    public void setE120(String e120) {
        this.e120 = e120;
        notifyPropertyChanged(BR.e120);
    }

    @Bindable
    public String getE121() {
        return e121;
    }

    public void setE121(String e121) {
        this.e121 = e121;
        notifyPropertyChanged(BR.e121);
    }

    @Bindable
    public String getE122() {
        return e122;
    }

    public void setE122(String e122) {
        this.e122 = e122;
        notifyPropertyChanged(BR.e122);
    }

    @Bindable
    public String getE12201() {
        return e12201;
    }

    public void setE12201(String e12201) {
        if (this.e12201.equals(e12201)) return;
        this.e12201 = e12201;
        notifyPropertyChanged(BR.e12201);
    }

    @Bindable
    public String getE12202() {
        return e12202;
    }

    public void setE12202(String e12202) {
        if (this.e12202.equals(e12202)) return;
        this.e12202 = e12202;
        notifyPropertyChanged(BR.e12202);
    }

    @Bindable
    public String getE12296() {
        return e12296;
    }

    public void setE12296(String e12296) {
        if (this.e12296.equals(e12296)) return;
        this.e12296 = e12296;
        setE12296x(e12296.equals("96") ? this.e12296x : "");
        notifyPropertyChanged(BR.e12296);
    }

    @Bindable
    public String getE12296x() {
        return e12296x;
    }

    public void setE12296x(String e12296x) {
        this.e12296x = e12296x;
        notifyPropertyChanged(BR.e12296x);
    }

    @Bindable
    public String getE123() {
        return e123;
    }

    public void setE123(String e123) {
        this.e123 = e123;
        setE124(e123.equals("1") ? this.e124 : "");
        setE125(e123.equals("1") ? this.e125 : "");
        notifyPropertyChanged(BR.e123);
    }

    @Bindable
    public String getE124() {
        return e124;
    }

    public void setE124(String e124) {
        this.e124 = e124;
        setE12401x(e124.equals("1") ? this.e12401x : "");
        setE12402x(e124.equals("2") ? this.e12402x : "");
        notifyPropertyChanged(BR.e124);
    }

    @Bindable
    public String getE12401x() {
        return e12401x;
    }

    public void setE12401x(String e12401x) {
        this.e12401x = e12401x;
        notifyPropertyChanged(BR.e12401x);
    }

    @Bindable
    public String getE12402x() {
        return e12402x;
    }

    public void setE12402x(String e12402x) {
        this.e12402x = e12402x;
        notifyPropertyChanged(BR.e12402x);
    }

    @Bindable
    public String getE125() {
        return e125;
    }

    public void setE125(String e125) {
        this.e125 = e125;
        setE12596x(e125.equals("96") ? this.e12596x : "");
        notifyPropertyChanged(BR.e125);
    }

    @Bindable
    public String getE12596x() {
        return e12596x;
    }

    public void setE12596x(String e12596x) {
        this.e12596x = e12596x;
        notifyPropertyChanged(BR.e12596x);
    }

    @Bindable
    public String getE126() {
        return e126;
    }

    public void setE126(String e126) {
        this.e126 = e126;
        setE127(e126.equals("1") ? this.e127 : "");
        notifyPropertyChanged(BR.e126);
    }

    @Bindable
    public String getE127() {
        return e127;
    }

    public void setE127(String e127) {
        this.e127 = e127;
        setE12701x(e127.equals("1") ? this.e12701x : "");
        notifyPropertyChanged(BR.e127);
    }

    @Bindable
    public String getE12701x() {
        return e12701x;
    }

    public void setE12701x(String e12701x) {
        this.e12701x = e12701x;
        notifyPropertyChanged(BR.e12701x);
    }

    @Bindable
    public String getE20101() {
        return e20101;
    }

    public void setE20101(String e20101) {
        if (this.e20101.equals(e20101)) return;
        this.e20101 = e20101;
        notifyPropertyChanged(BR.e20101);
    }

    @Bindable
    public String getE20102() {
        return e20102;
    }

    public void setE20102(String e20102) {
        if (this.e20102.equals(e20102)) return;
        this.e20102 = e20102;
        notifyPropertyChanged(BR.e20102);
    }

    @Bindable
    public String getE20103() {
        return e20103;
    }

    public void setE20103(String e20103) {
        if (this.e20103.equals(e20103)) return;
        this.e20103 = e20103;
        notifyPropertyChanged(BR.e20103);
    }

    @Bindable
    public String getE20104() {
        return e20104;
    }

    public void setE20104(String e20104) {
        if (this.e20104.equals(e20104)) return;
        this.e20104 = e20104;
        notifyPropertyChanged(BR.e20104);
    }

    @Bindable
    public String getE20105() {
        return e20105;
    }

    public void setE20105(String e20105) {
        if (this.e20105.equals(e20105)) return;
        this.e20105 = e20105;
        notifyPropertyChanged(BR.e20105);
    }

    @Bindable
    public String getE20106() {
        return e20106;
    }

    public void setE20106(String e20106) {
        if (this.e20106.equals(e20106)) return;
        this.e20106 = e20106;
        notifyPropertyChanged(BR.e20106);
    }

    @Bindable
    public String getE20107() {
        return e20107;
    }

    public void setE20107(String e20107) {
        if (this.e20107.equals(e20107)) return;
        this.e20107 = e20107;
        notifyPropertyChanged(BR.e20107);
    }

    @Bindable
    public String getE20197() {
        return e20197;
    }

    public void setE20197(String e20197) {
        if (this.e20197.equals(e20197)) return;
        this.e20197 = e20197;
        setE20101(e20197.equals("97") ? "" : this.e20101);
        setE20102(e20197.equals("97") ? "" : this.e20102);
        setE20103(e20197.equals("97") ? "" : this.e20103);
        setE20104(e20197.equals("97") ? "" : this.e20104);
        setE20105(e20197.equals("97") ? "" : this.e20105);
        setE20106(e20197.equals("97") ? "" : this.e20106);
        setE20107(e20197.equals("97") ? "" : this.e20107);
        notifyPropertyChanged(BR.e20197);
    }

    @Bindable
    public String getE20201() {
        return e20201;
    }

    public void setE20201(String e20201) {
        if (this.e20201.equals(e20201)) return;
        this.e20201 = e20201;
        notifyPropertyChanged(BR.e20201);
    }

    @Bindable
    public String getE20202() {
        return e20202;
    }

    public void setE20202(String e20202) {
        if (this.e20202.equals(e20202)) return;
        this.e20202 = e20202;
        notifyPropertyChanged(BR.e20202);
    }

    @Bindable
    public String getE20203() {
        return e20203;
    }

    public void setE20203(String e20203) {
        if (this.e20203.equals(e20203)) return;
        this.e20203 = e20203;
        notifyPropertyChanged(BR.e20203);
    }

    @Bindable
    public String getE20204() {
        return e20204;
    }

    public void setE20204(String e20204) {
        if (this.e20204.equals(e20204)) return;
        this.e20204 = e20204;
        notifyPropertyChanged(BR.e20204);
    }

    @Bindable
    public String getE20205() {
        return e20205;
    }

    public void setE20205(String e20205) {
        if (this.e20205.equals(e20205)) return;
        this.e20205 = e20205;
        notifyPropertyChanged(BR.e20205);
    }

    @Bindable
    public String getE20206() {
        return e20206;
    }

    public void setE20206(String e20206) {
        if (this.e20206.equals(e20206)) return;
        this.e20206 = e20206;
        notifyPropertyChanged(BR.e20206);
    }

    @Bindable
    public String getE20207() {
        return e20207;
    }

    public void setE20207(String e20207) {
        if (this.e20207.equals(e20207)) return;
        this.e20207 = e20207;
        notifyPropertyChanged(BR.e20207);
    }

    @Bindable
    public String getE20297() {
        return e20297;
    }

    public void setE20297(String e20297) {
        if (this.e20297.equals(e20297)) return;
        this.e20297 = e20297;
        setE20201(e20297.equals("97") ? "" : this.e20201);
        setE20202(e20297.equals("97") ? "" : this.e20202);
        setE20203(e20297.equals("97") ? "" : this.e20203);
        setE20204(e20297.equals("97") ? "" : this.e20204);
        setE20205(e20297.equals("97") ? "" : this.e20205);
        setE20206(e20297.equals("97") ? "" : this.e20206);
        setE20207(e20297.equals("97") ? "" : this.e20207);
        notifyPropertyChanged(BR.e20297);
    }

    @Bindable
    public String getE20301() {
        return e20301;
    }

    public void setE20301(String e20301) {
        if (this.e20301.equals(e20301)) return;
        this.e20301 = e20301;
        notifyPropertyChanged(BR.e20301);
    }

    @Bindable
    public String getE20302() {
        return e20302;
    }

    public void setE20302(String e20302) {
        if (this.e20302.equals(e20302)) return;
        this.e20302 = e20302;
        notifyPropertyChanged(BR.e20302);
    }

    @Bindable
    public String getE20303() {
        return e20303;
    }

    public void setE20303(String e20303) {
        if (this.e20303.equals(e20303)) return;
        this.e20303 = e20303;
        notifyPropertyChanged(BR.e20303);
    }

    @Bindable
    public String getE20304() {
        return e20304;
    }

    public void setE20304(String e20304) {
        if (this.e20304.equals(e20304)) return;
        this.e20304 = e20304;
        notifyPropertyChanged(BR.e20304);
    }

    @Bindable
    public String getE20305() {
        return e20305;
    }

    public void setE20305(String e20305) {
        if (this.e20305.equals(e20305)) return;
        this.e20305 = e20305;
        notifyPropertyChanged(BR.e20305);
    }

    @Bindable
    public String getE20306() {
        return e20306;
    }

    public void setE20306(String e20306) {
        if (this.e20306.equals(e20306)) return;
        this.e20306 = e20306;
        notifyPropertyChanged(BR.e20306);
    }

    @Bindable
    public String getE20307() {
        return e20307;
    }

    public void setE20307(String e20307) {
        if (this.e20307.equals(e20307)) return;
        this.e20307 = e20307;
        notifyPropertyChanged(BR.e20307);
    }

    @Bindable
    public String getE20397() {
        return e20397;
    }

    public void setE20397(String e20397) {
        if (this.e20397.equals(e20397)) return;
        this.e20397 = e20397;
        setE20301(e20397.equals("97") ? "" : this.e20301);
        setE20302(e20397.equals("97") ? "" : this.e20302);
        setE20303(e20397.equals("97") ? "" : this.e20303);
        setE20304(e20397.equals("97") ? "" : this.e20304);
        setE20305(e20397.equals("97") ? "" : this.e20305);
        setE20306(e20397.equals("97") ? "" : this.e20306);
        setE20307(e20397.equals("97") ? "" : this.e20307);
        notifyPropertyChanged(BR.e20397);
    }

    @Bindable
    public String getE20401() {
        return e20401;
    }

    public void setE20401(String e20401) {
        if (this.e20401.equals(e20401)) return;
        this.e20401 = e20401;
        notifyPropertyChanged(BR.e20401);
    }

    @Bindable
    public String getE20402() {
        return e20402;
    }

    public void setE20402(String e20402) {
        if (this.e20402.equals(e20402)) return;
        this.e20402 = e20402;
        notifyPropertyChanged(BR.e20402);
    }

    @Bindable
    public String getE20403() {
        return e20403;
    }

    public void setE20403(String e20403) {
        if (this.e20403.equals(e20403)) return;
        this.e20403 = e20403;
        notifyPropertyChanged(BR.e20403);
    }

    @Bindable
    public String getE20404() {
        return e20404;
    }

    public void setE20404(String e20404) {
        if (this.e20404.equals(e20404)) return;
        this.e20404 = e20404;
        notifyPropertyChanged(BR.e20404);
    }

    @Bindable
    public String getE20405() {
        return e20405;
    }

    public void setE20405(String e20405) {
        if (this.e20405.equals(e20405)) return;
        this.e20405 = e20405;
        notifyPropertyChanged(BR.e20405);
    }

    @Bindable
    public String getE20406() {
        return e20406;
    }

    public void setE20406(String e20406) {
        if (this.e20406.equals(e20406)) return;
        this.e20406 = e20406;
        notifyPropertyChanged(BR.e20406);
    }

    @Bindable
    public String getE20407() {
        return e20407;
    }

    public void setE20407(String e20407) {
        if (this.e20407.equals(e20407)) return;
        this.e20407 = e20407;
        notifyPropertyChanged(BR.e20407);
    }

    @Bindable
    public String getE20497() {
        return e20497;
    }

    public void setE20497(String e20497) {
        if (this.e20497.equals(e20497)) return;
        this.e20497 = e20497;
        setE20401(e20497.equals("97") ? "" : this.e20401);
        setE20402(e20497.equals("97") ? "" : this.e20402);
        setE20403(e20497.equals("97") ? "" : this.e20403);
        setE20404(e20497.equals("97") ? "" : this.e20404);
        setE20405(e20497.equals("97") ? "" : this.e20405);
        setE20406(e20497.equals("97") ? "" : this.e20406);
        setE20407(e20497.equals("97") ? "" : this.e20407);
        notifyPropertyChanged(BR.e20497);
    }

    @Bindable
    public String getE20501() {
        return e20501;
    }

    public void setE20501(String e20501) {
        if (this.e20501.equals(e20501)) return;
        this.e20501 = e20501;
        notifyPropertyChanged(BR.e20501);
    }

    @Bindable
    public String getE20502() {
        return e20502;
    }

    public void setE20502(String e20502) {
        if (this.e20502.equals(e20502)) return;
        this.e20502 = e20502;
        notifyPropertyChanged(BR.e20502);
    }

    @Bindable
    public String getE20503() {
        return e20503;
    }

    public void setE20503(String e20503) {
        if (this.e20503.equals(e20503)) return;
        this.e20503 = e20503;
        notifyPropertyChanged(BR.e20503);
    }

    @Bindable
    public String getE20504() {
        return e20504;
    }

    public void setE20504(String e20504) {
        if (this.e20504.equals(e20504)) return;
        this.e20504 = e20504;
        notifyPropertyChanged(BR.e20504);
    }

    @Bindable
    public String getE20505() {
        return e20505;
    }

    public void setE20505(String e20505) {
        if (this.e20505.equals(e20505)) return;
        this.e20505 = e20505;
        notifyPropertyChanged(BR.e20505);
    }

    @Bindable
    public String getE20506() {
        return e20506;
    }

    public void setE20506(String e20506) {
        if (this.e20506.equals(e20506)) return;
        this.e20506 = e20506;
        notifyPropertyChanged(BR.e20506);
    }

    @Bindable
    public String getE20507() {
        return e20507;
    }

    public void setE20507(String e20507) {
        if (this.e20507.equals(e20507)) return;
        this.e20507 = e20507;
        notifyPropertyChanged(BR.e20507);
    }

    @Bindable
    public String getE20597() {
        return e20597;
    }

    public void setE20597(String e20597) {
        if (this.e20597.equals(e20597)) return;
        this.e20597 = e20597;
        setE20501(e20597.equals("97") ? "" : this.e20501);
        setE20502(e20597.equals("97") ? "" : this.e20502);
        setE20503(e20597.equals("97") ? "" : this.e20503);
        setE20504(e20597.equals("97") ? "" : this.e20504);
        setE20505(e20597.equals("97") ? "" : this.e20505);
        setE20506(e20597.equals("97") ? "" : this.e20506);
        setE20507(e20597.equals("97") ? "" : this.e20507);
        notifyPropertyChanged(BR.e20597);
    }

    @Bindable
    public String getE20601() {
        return e20601;
    }

    public void setE20601(String e20601) {
        if (this.e20601.equals(e20601)) return;
        this.e20601 = e20601;
        notifyPropertyChanged(BR.e20601);
    }

    @Bindable
    public String getE20602() {
        return e20602;
    }

    public void setE20602(String e20602) {
        if (this.e20602.equals(e20602)) return;
        this.e20602 = e20602;
        notifyPropertyChanged(BR.e20602);
    }

    @Bindable
    public String getE20603() {
        return e20603;
    }

    public void setE20603(String e20603) {
        if (this.e20603.equals(e20603)) return;
        this.e20603 = e20603;
        notifyPropertyChanged(BR.e20603);
    }

    @Bindable
    public String getE20604() {
        return e20604;
    }

    public void setE20604(String e20604) {
        if (this.e20604.equals(e20604)) return;
        this.e20604 = e20604;
        notifyPropertyChanged(BR.e20604);
    }

    @Bindable
    public String getE20605() {
        return e20605;
    }

    public void setE20605(String e20605) {
        if (this.e20605.equals(e20605)) return;
        this.e20605 = e20605;
        notifyPropertyChanged(BR.e20605);
    }

    @Bindable
    public String getE20606() {
        return e20606;
    }

    public void setE20606(String e20606) {
        if (this.e20606.equals(e20606)) return;
        this.e20606 = e20606;
        notifyPropertyChanged(BR.e20606);
    }

    @Bindable
    public String getE20607() {
        return e20607;
    }

    public void setE20607(String e20607) {
        if (this.e20607.equals(e20607)) return;
        this.e20607 = e20607;
        notifyPropertyChanged(BR.e20607);
    }

    @Bindable
    public String getE20697() {
        return e20697;
    }

    public void setE20697(String e20697) {
        if (this.e20697.equals(e20697)) return;
        this.e20697 = e20697;
        setE20601(e20697.equals("97") ? "" : this.e20601);
        setE20602(e20697.equals("97") ? "" : this.e20602);
        setE20603(e20697.equals("97") ? "" : this.e20603);
        setE20604(e20697.equals("97") ? "" : this.e20604);
        setE20605(e20697.equals("97") ? "" : this.e20605);
        setE20606(e20697.equals("97") ? "" : this.e20606);
        setE20607(e20697.equals("97") ? "" : this.e20607);
        notifyPropertyChanged(BR.e20697);
    }

    @Bindable
    public String getE20701() {
        return e20701;
    }

    public void setE20701(String e20701) {
        if (this.e20701.equals(e20701)) return;
        this.e20701 = e20701;
        notifyPropertyChanged(BR.e20701);
    }

    @Bindable
    public String getE20702() {
        return e20702;
    }

    public void setE20702(String e20702) {
        if (this.e20702.equals(e20702)) return;
        this.e20702 = e20702;
        notifyPropertyChanged(BR.e20702);
    }

    @Bindable
    public String getE20703() {
        return e20703;
    }

    public void setE20703(String e20703) {
        if (this.e20703.equals(e20703)) return;
        this.e20703 = e20703;
        notifyPropertyChanged(BR.e20703);
    }

    @Bindable
    public String getE20704() {
        return e20704;
    }

    public void setE20704(String e20704) {
        if (this.e20704.equals(e20704)) return;
        this.e20704 = e20704;
        notifyPropertyChanged(BR.e20704);
    }

    @Bindable
    public String getE20705() {
        return e20705;
    }

    public void setE20705(String e20705) {
        if (this.e20705.equals(e20705)) return;
        this.e20705 = e20705;
        notifyPropertyChanged(BR.e20705);
    }

    @Bindable
    public String getE20706() {
        return e20706;
    }

    public void setE20706(String e20706) {
        if (this.e20706.equals(e20706)) return;
        this.e20706 = e20706;
        notifyPropertyChanged(BR.e20706);
    }

    @Bindable
    public String getE20707() {
        return e20707;
    }

    public void setE20707(String e20707) {
        if (this.e20707.equals(e20707)) return;
        this.e20707 = e20707;
        notifyPropertyChanged(BR.e20707);
    }

    @Bindable
    public String getE20797() {
        return e20797;
    }

    public void setE20797(String e20797) {
        if (this.e20797.equals(e20797)) return;
        this.e20797 = e20797;
        setE20701(e20797.equals("97") ? "" : this.e20701);
        setE20702(e20797.equals("97") ? "" : this.e20702);
        setE20703(e20797.equals("97") ? "" : this.e20703);
        setE20704(e20797.equals("97") ? "" : this.e20704);
        setE20705(e20797.equals("97") ? "" : this.e20705);
        setE20706(e20797.equals("97") ? "" : this.e20706);
        setE20707(e20797.equals("97") ? "" : this.e20707);
        notifyPropertyChanged(BR.e20797);
    }

    @Bindable
    public String getE20801() {
        return e20801;
    }

    public void setE20801(String e20801) {
        if (this.e20801.equals(e20801)) return;
        this.e20801 = e20801;
        notifyPropertyChanged(BR.e20801);
    }

    @Bindable
    public String getE20802() {
        return e20802;
    }

    public void setE20802(String e20802) {
        if (this.e20802.equals(e20802)) return;
        this.e20802 = e20802;
        notifyPropertyChanged(BR.e20802);
    }

    @Bindable
    public String getE20803() {
        return e20803;
    }

    public void setE20803(String e20803) {
        if (this.e20803.equals(e20803)) return;
        this.e20803 = e20803;
        notifyPropertyChanged(BR.e20803);
    }

    @Bindable
    public String getE20804() {
        return e20804;
    }

    public void setE20804(String e20804) {
        if (this.e20804.equals(e20804)) return;
        this.e20804 = e20804;
        notifyPropertyChanged(BR.e20804);
    }

    @Bindable
    public String getE20805() {
        return e20805;
    }

    public void setE20805(String e20805) {
        if (this.e20805.equals(e20805)) return;
        this.e20805 = e20805;
        notifyPropertyChanged(BR.e20805);
    }

    @Bindable
    public String getE20806() {
        return e20806;
    }

    public void setE20806(String e20806) {
        if (this.e20806.equals(e20806)) return;
        this.e20806 = e20806;
        notifyPropertyChanged(BR.e20806);
    }

    @Bindable
    public String getE20807() {
        return e20807;
    }

    public void setE20807(String e20807) {
        if (this.e20807.equals(e20807)) return;
        this.e20807 = e20807;
        notifyPropertyChanged(BR.e20807);
    }

    @Bindable
    public String getE20897() {
        return e20897;
    }

    public void setE20897(String e20897) {
        if (this.e20897.equals(e20897)) return;
        this.e20897 = e20897;
        setE20801(e20897.equals("97") ? "" : this.e20801);
        setE20802(e20897.equals("97") ? "" : this.e20802);
        setE20803(e20897.equals("97") ? "" : this.e20803);
        setE20804(e20897.equals("97") ? "" : this.e20804);
        setE20805(e20897.equals("97") ? "" : this.e20805);
        setE20806(e20897.equals("97") ? "" : this.e20806);
        setE20807(e20897.equals("97") ? "" : this.e20807);
        notifyPropertyChanged(BR.e20897);
    }

    @Bindable
    public String getE20901() {
        return e20901;
    }

    public void setE20901(String e20901) {
        if (this.e20901.equals(e20901)) return;
        this.e20901 = e20901;
        notifyPropertyChanged(BR.e20901);
    }

    @Bindable
    public String getE20902() {
        return e20902;
    }

    public void setE20902(String e20902) {
        if (this.e20902.equals(e20902)) return;
        this.e20902 = e20902;
        notifyPropertyChanged(BR.e20902);
    }

    @Bindable
    public String getE20903() {
        return e20903;
    }

    public void setE20903(String e20903) {
        if (this.e20903.equals(e20903)) return;
        this.e20903 = e20903;
        notifyPropertyChanged(BR.e20903);
    }

    @Bindable
    public String getE20904() {
        return e20904;
    }

    public void setE20904(String e20904) {
        if (this.e20904.equals(e20904)) return;
        this.e20904 = e20904;
        notifyPropertyChanged(BR.e20904);
    }

    @Bindable
    public String getE20905() {
        return e20905;
    }

    public void setE20905(String e20905) {
        if (this.e20905.equals(e20905)) return;
        this.e20905 = e20905;
        notifyPropertyChanged(BR.e20905);
    }

    @Bindable
    public String getE20906() {
        return e20906;
    }

    public void setE20906(String e20906) {
        if (this.e20906.equals(e20906)) return;
        this.e20906 = e20906;
        notifyPropertyChanged(BR.e20906);
    }

    @Bindable
    public String getE20907() {
        return e20907;
    }

    public void setE20907(String e20907) {
        if (this.e20907.equals(e20907)) return;
        this.e20907 = e20907;
        notifyPropertyChanged(BR.e20907);
    }

    @Bindable
    public String getE20997() {
        return e20997;
    }

    public void setE20997(String e20997) {
        if (this.e20997.equals(e20997)) return;
        this.e20997 = e20997;
        setE20901(e20997.equals("97") ? "" : this.e20901);
        setE20902(e20997.equals("97") ? "" : this.e20902);
        setE20903(e20997.equals("97") ? "" : this.e20903);
        setE20904(e20997.equals("97") ? "" : this.e20904);
        setE20905(e20997.equals("97") ? "" : this.e20905);
        setE20906(e20997.equals("97") ? "" : this.e20906);
        setE20907(e20997.equals("97") ? "" : this.e20907);
        notifyPropertyChanged(BR.e20997);
    }

    @Bindable
    public String getE21001() {
        return e21001;
    }

    public void setE21001(String e21001) {
        if (this.e21001.equals(e21001)) return;
        this.e21001 = e21001;
        notifyPropertyChanged(BR.e21001);
    }

    @Bindable
    public String getE21002() {
        return e21002;
    }

    public void setE21002(String e21002) {
        if (this.e21002.equals(e21002)) return;
        this.e21002 = e21002;
        notifyPropertyChanged(BR.e21002);
    }

    @Bindable
    public String getE21003() {
        return e21003;
    }

    public void setE21003(String e21003) {
        if (this.e21003.equals(e21003)) return;
        this.e21003 = e21003;
        notifyPropertyChanged(BR.e21003);
    }

    @Bindable
    public String getE21004() {
        return e21004;
    }

    public void setE21004(String e21004) {
        if (this.e21004.equals(e21004)) return;
        this.e21004 = e21004;
        notifyPropertyChanged(BR.e21004);
    }

    @Bindable
    public String getE21005() {
        return e21005;
    }

    public void setE21005(String e21005) {
        if (this.e21005.equals(e21005)) return;
        this.e21005 = e21005;
        notifyPropertyChanged(BR.e21005);
    }

    @Bindable
    public String getE21006() {
        return e21006;
    }

    public void setE21006(String e21006) {
        if (this.e21006.equals(e21006)) return;
        this.e21006 = e21006;
        notifyPropertyChanged(BR.e21006);
    }

    @Bindable
    public String getE21007() {
        return e21007;
    }

    public void setE21007(String e21007) {
        if (this.e21007.equals(e21007)) return;
        this.e21007 = e21007;
        notifyPropertyChanged(BR.e21007);
    }

    @Bindable
    public String getE21097() {
        return e21097;
    }

    public void setE21097(String e21097) {
        if (this.e21097.equals(e21097)) return;
        this.e21097 = e21097;
        setE21001(e21097.equals("97") ? "" : this.e21001);
        setE21002(e21097.equals("97") ? "" : this.e21002);
        setE21003(e21097.equals("97") ? "" : this.e21003);
        setE21004(e21097.equals("97") ? "" : this.e21004);
        setE21005(e21097.equals("97") ? "" : this.e21005);
        setE21006(e21097.equals("97") ? "" : this.e21006);
        setE21007(e21097.equals("97") ? "" : this.e21007);
        notifyPropertyChanged(BR.e21097);
    }


    public Pregnancy Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_PROJECT_NAME));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_INDEXED));
        this.villageCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_VILLAGE_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SYNCED_DATE));

        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SE1)));
        sE2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SE2)));
        return this;
    }

    public void sE1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.eh101 = json.getString("eh101");
            this.eh102 = json.getString("eh102");
            this.eh103 = json.getString("eh103");
            this.eh104 = json.getString("eh104");
            this.e101 = json.getString("e101");
            this.e102 = json.getString("e102");
            this.e103 = json.getString("e103");
            this.e104 = json.getString("e104");
            this.e105 = json.getString("e105");
            this.e106d = json.getString("e106d");
            this.e106m = json.getString("e106m");
            this.e106y = json.getString("e106y");
            this.e107w = json.getString("e107w");
            this.e107m = json.getString("e107m");
            this.e108 = json.getString("e108");
            this.e109 = json.getString("e109");
            this.e10901 = json.getString("e10901");
            this.e10902 = json.getString("e10902");
            this.e10903 = json.getString("e10903");
            this.e10904 = json.getString("e10904");
            this.e10905 = json.getString("e10905");
            this.e10906 = json.getString("e10906");
            this.e10907 = json.getString("e10907");
            this.e10908 = json.getString("e10908");
            this.e10996 = json.getString("e10996");
            this.e10996x = json.getString("e10996x");
            this.e109t = json.getString("e109t");
            this.e110 = json.getString("e110");
            this.e11001 = json.getString("e11001");
            this.e11002 = json.getString("e11002");
            this.e11003 = json.getString("e11003");
            this.e11004 = json.getString("e11004");
            this.e11005 = json.getString("e11005");
            this.e11096 = json.getString("e11096");
            this.e11096x = json.getString("e11096x");
            this.e111w = json.getString("e111w");
            this.e111m = json.getString("e111m");
            this.e112 = json.getString("e112");
            this.e11201x = json.getString("e11201x");
            this.e113a = json.getString("e113a");
            this.e113b = json.getString("e113b");
            this.e113c = json.getString("e113c");
            this.e113d = json.getString("e113d");
            this.e113e = json.getString("e113e");
            this.e113f = json.getString("e113f");
            this.e113g = json.getString("e113g");
            this.e113h = json.getString("e113h");
            this.e11397 = json.getString("e11397");
            this.e11396 = json.getString("e11396");
            this.e11396x = json.getString("e11396x");
            this.e114 = json.getString("e114");
            this.e115 = json.getString("e115");
            this.e116 = json.getString("e116");
            this.e11601 = json.getString("e11601");
            this.e11602 = json.getString("e11602");
            this.e11603 = json.getString("e11603");
            this.e11604 = json.getString("e11604");
            this.e11605 = json.getString("e11605");
            this.e11606 = json.getString("e11606");
            this.e11607 = json.getString("e11607");
            this.e11608 = json.getString("e11608");
            this.e11696 = json.getString("e11696");
            this.e11696x = json.getString("e11696x");
            this.e117 = json.getString("e117");
            this.e11701 = json.getString("e11701");
            this.e11702 = json.getString("e11702");
            this.e11703 = json.getString("e11703");
            this.e11703x = json.getString("e11703x");
            this.e118 = json.getString("e118");
            this.e119 = json.getString("e119");
            this.e120 = json.getString("e120");
            this.e121 = json.getString("e121");
            this.e122 = json.getString("e122");
            this.e12201 = json.getString("e12201");
            this.e12202 = json.getString("e12202");
            this.e12296 = json.getString("e12296");
            this.e12296x = json.getString("e12296x");
            this.e123 = json.getString("e123");
            this.e124 = json.getString("e124");
            this.e12401x = json.getString("e12401x");
            this.e12402x = json.getString("e12402x");
            this.e125 = json.getString("e125");
            this.e12596x = json.getString("e12596x");
            this.e126 = json.getString("e126");
            this.e127 = json.getString("e127");
            this.e12701x = json.getString("e12701x");
        }
    }

    public void sE2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e20101 = json.getString("e20101");
            this.e20102 = json.getString("e20102");
            this.e20103 = json.getString("e20103");
            this.e20104 = json.getString("e20104");
            this.e20105 = json.getString("e20105");
            this.e20106 = json.getString("e20106");
            this.e20107 = json.getString("e20107");
            this.e20197 = json.getString("e20197");
            this.e20201 = json.getString("e20201");
            this.e20202 = json.getString("e20202");
            this.e20203 = json.getString("e20203");
            this.e20204 = json.getString("e20204");
            this.e20205 = json.getString("e20205");
            this.e20206 = json.getString("e20206");
            this.e20207 = json.getString("e20207");
            this.e20297 = json.getString("e20297");
            this.e20301 = json.getString("e20301");
            this.e20302 = json.getString("e20302");
            this.e20303 = json.getString("e20303");
            this.e20304 = json.getString("e20304");
            this.e20305 = json.getString("e20305");
            this.e20306 = json.getString("e20306");
            this.e20307 = json.getString("e20307");
            this.e20397 = json.getString("e20397");
            this.e20401 = json.getString("e20401");
            this.e20402 = json.getString("e20402");
            this.e20403 = json.getString("e20403");
            this.e20404 = json.getString("e20404");
            this.e20405 = json.getString("e20405");
            this.e20406 = json.getString("e20406");
            this.e20407 = json.getString("e20407");
            this.e20497 = json.getString("e20497");
            this.e20501 = json.getString("e20501");
            this.e20502 = json.getString("e20502");
            this.e20503 = json.getString("e20503");
            this.e20504 = json.getString("e20504");
            this.e20505 = json.getString("e20505");
            this.e20506 = json.getString("e20506");
            this.e20507 = json.getString("e20507");
            this.e20597 = json.getString("e20597");
            this.e20601 = json.getString("e20601");
            this.e20602 = json.getString("e20602");
            this.e20603 = json.getString("e20603");
            this.e20604 = json.getString("e20604");
            this.e20605 = json.getString("e20605");
            this.e20606 = json.getString("e20606");
            this.e20607 = json.getString("e20607");
            this.e20697 = json.getString("e20697");
            this.e20701 = json.getString("e20701");
            this.e20702 = json.getString("e20702");
            this.e20703 = json.getString("e20703");
            this.e20704 = json.getString("e20704");
            this.e20705 = json.getString("e20705");
            this.e20706 = json.getString("e20706");
            this.e20707 = json.getString("e20707");
            this.e20797 = json.getString("e20797");
            this.e20801 = json.getString("e20801");
            this.e20802 = json.getString("e20802");
            this.e20803 = json.getString("e20803");
            this.e20804 = json.getString("e20804");
            this.e20805 = json.getString("e20805");
            this.e20806 = json.getString("e20806");
            this.e20807 = json.getString("e20807");
            this.e20897 = json.getString("e20897");
            this.e20901 = json.getString("e20901");
            this.e20902 = json.getString("e20902");
            this.e20903 = json.getString("e20903");
            this.e20904 = json.getString("e20904");
            this.e20905 = json.getString("e20905");
            this.e20906 = json.getString("e20906");
            this.e20907 = json.getString("e20907");
            this.e20997 = json.getString("e20997");
            this.e21001 = json.getString("e21001");
            this.e21002 = json.getString("e21002");
            this.e21003 = json.getString("e21003");
            this.e21004 = json.getString("e21004");
            this.e21005 = json.getString("e21005");
            this.e21006 = json.getString("e21006");
            this.e21007 = json.getString("e21007");
            this.e21097 = json.getString("e21097");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.PregnancyTable.COLUMN_ID, this.id);
        json.put(TableContracts.PregnancyTable.COLUMN_UID, this.uid);
        json.put(TableContracts.PregnancyTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.PregnancyTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.PregnancyTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.PregnancyTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.PregnancyTable.COLUMN_VILLAGE_CODE, this.villageCode);
        json.put(TableContracts.PregnancyTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.PregnancyTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.PregnancyTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.PregnancyTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.PregnancyTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.PregnancyTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.PregnancyTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.PregnancyTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.PregnancyTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(TableContracts.PregnancyTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.PregnancyTable.COLUMN_SE1, new JSONObject(sE1toString()));
        json.put(TableContracts.PregnancyTable.COLUMN_SE2, new JSONObject(sE2toString()));
        return json;
    }

    public String sE1toString() throws JSONException {
        Log.d(TAG, "sE1toString: ");
        JSONObject json = new JSONObject();
        json.put("eh101", eh101)
                .put("eh102", eh102)
                .put("eh103", eh103)
                .put("eh104", eh104)
                .put("e101", e101)
                .put("e102", e102)
                .put("e103", e103)
                .put("e104", e104)
                .put("e105", e105)
                .put("e106d", e106d)
                .put("e106m", e106m)
                .put("e106y", e106y)
                .put("e107w", e107w)
                .put("e107m", e107m)
                .put("e108", e108)
                .put("e109", e109)
                .put("e10901", e10901)
                .put("e10902", e10902)
                .put("e10903", e10903)
                .put("e10904", e10904)
                .put("e10905", e10905)
                .put("e10906", e10906)
                .put("e10907", e10907)
                .put("e10908", e10908)
                .put("e10996", e10996)
                .put("e10996x", e10996x)
                .put("e109t", e109t)
                .put("e110", e110)
                .put("e11001", e11001)
                .put("e11002", e11002)
                .put("e11003", e11003)
                .put("e11004", e11004)
                .put("e11005", e11005)
                .put("e11096", e11096)
                .put("e11096x", e11096x)
                .put("e111w", e111w)
                .put("e111m", e111m)
                .put("e112", e112)
                .put("e11201x", e11201x)
                .put("e113a", e113a)
                .put("e113b", e113b)
                .put("e113c", e113c)
                .put("e113d", e113d)
                .put("e113e", e113e)
                .put("e113f", e113f)
                .put("e113g", e113g)
                .put("e113h", e113h)
                .put("e11397", e11397)
                .put("e11396", e11396)
                .put("e11396x", e11396x)
                .put("e114", e114)
                .put("e115", e115)
                .put("e116", e116)
                .put("e11601", e11601)
                .put("e11602", e11602)
                .put("e11603", e11603)
                .put("e11604", e11604)
                .put("e11605", e11605)
                .put("e11606", e11606)
                .put("e11607", e11607)
                .put("e11608", e11608)
                .put("e11696", e11696)
                .put("e11696x", e11696x)
                .put("e117", e117)
                .put("e11701", e11701)
                .put("e11702", e11702)
                .put("e11703", e11703)
                .put("e11703x", e11703x)
                .put("e118", e118)
                .put("e119", e119)
                .put("e120", e120)
                .put("e121", e121)
                .put("e122", e122)
                .put("e12201", e12201)
                .put("e12202", e12202)
                .put("e12296", e12296)
                .put("e12296x", e12296x)
                .put("e123", e123)
                .put("e124", e124)
                .put("e12401x", e12401x)
                .put("e12402x", e12402x)
                .put("e125", e125)
                .put("e12596x", e12596x)
                .put("e126", e126)
                .put("e127", e127)
                .put("e12701x", e12701x);
        return json.toString();
    }

    public String sE2toString() throws JSONException {
        Log.d(TAG, "sE2toString: ");
        JSONObject json = new JSONObject();
        json.put("e20101", e20101)
                .put("e20102", e20102)
                .put("e20103", e20103)
                .put("e20104", e20104)
                .put("e20105", e20105)
                .put("e20106", e20106)
                .put("e20107", e20107)
                .put("e20197", e20197)
                .put("e20201", e20201)
                .put("e20202", e20202)
                .put("e20203", e20203)
                .put("e20204", e20204)
                .put("e20205", e20205)
                .put("e20206", e20206)
                .put("e20207", e20207)
                .put("e20297", e20297)
                .put("e20301", e20301)
                .put("e20302", e20302)
                .put("e20303", e20303)
                .put("e20304", e20304)
                .put("e20305", e20305)
                .put("e20306", e20306)
                .put("e20307", e20307)
                .put("e20397", e20397)
                .put("e20401", e20401)
                .put("e20402", e20402)
                .put("e20403", e20403)
                .put("e20404", e20404)
                .put("e20405", e20405)
                .put("e20406", e20406)
                .put("e20407", e20407)
                .put("e20497", e20497)
                .put("e20501", e20501)
                .put("e20502", e20502)
                .put("e20503", e20503)
                .put("e20504", e20504)
                .put("e20505", e20505)
                .put("e20506", e20506)
                .put("e20507", e20507)
                .put("e20597", e20597)
                .put("e20601", e20601)
                .put("e20602", e20602)
                .put("e20603", e20603)
                .put("e20604", e20604)
                .put("e20605", e20605)
                .put("e20606", e20606)
                .put("e20607", e20607)
                .put("e20697", e20697)
                .put("e20701", e20701)
                .put("e20702", e20702)
                .put("e20703", e20703)
                .put("e20704", e20704)
                .put("e20705", e20705)
                .put("e20706", e20706)
                .put("e20707", e20707)
                .put("e20797", e20797)
                .put("e20801", e20801)
                .put("e20802", e20802)
                .put("e20803", e20803)
                .put("e20804", e20804)
                .put("e20805", e20805)
                .put("e20806", e20806)
                .put("e20807", e20807)
                .put("e20897", e20897)
                .put("e20901", e20901)
                .put("e20902", e20902)
                .put("e20903", e20903)
                .put("e20904", e20904)
                .put("e20905", e20905)
                .put("e20906", e20906)
                .put("e20907", e20907)
                .put("e20997", e20997)
                .put("e21001", e21001)
                .put("e21002", e21002)
                .put("e21003", e21003)
                .put("e21004", e21004)
                .put("e21005", e21005)
                .put("e21006", e21006)
                .put("e21007", e21007)
                .put("e21097", e21097);
        return json.toString();
    }


}
