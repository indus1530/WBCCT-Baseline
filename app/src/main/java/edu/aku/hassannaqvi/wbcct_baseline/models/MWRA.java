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

import java.time.LocalDate;

import edu.aku.hassannaqvi.wbcct_baseline.BR;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;

public class MWRA extends BaseObservable implements Observable {

    private final String TAG = "MWRA";
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
    // private String muid = _EMPTY_;
    private String cluster = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String indexed = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    //ModuleStatusVariables
    private String cstaa = _EMPTY_;
    private String cstab = _EMPTY_;
    private String cstab96x = _EMPTY_;

    // FIELD VARIABLES
    private String c101 = _EMPTY_;
    private String c102 = _EMPTY_;
    private String c103 = _EMPTY_;
    private String c104 = _EMPTY_;
    private String c105 = _EMPTY_;
    private String c10501x = _EMPTY_;
    private String c106 = _EMPTY_;
    private String c107 = _EMPTY_;
    private String c108 = _EMPTY_;
    private String c109 = _EMPTY_;
    private String c110 = _EMPTY_;
    private String c111 = _EMPTY_;
    private String c112wk = _EMPTY_;
    private String c112mm = _EMPTY_;
    private String c113dd = _EMPTY_;
    private String c113mm = _EMPTY_;
    private String c113yy = _EMPTY_;
    private String c114 = _EMPTY_;
    private String c115 = _EMPTY_;
    private String c11501 = _EMPTY_;
    private String c11502 = _EMPTY_;
    private String c11503 = _EMPTY_;
    private String c11504 = _EMPTY_;
    private String c11505 = _EMPTY_;
    private String c11506 = _EMPTY_;
    private String c11507 = _EMPTY_;
    private String c11508 = _EMPTY_;
    private String c11596 = _EMPTY_;
    private String c11596x = _EMPTY_;
    private String c116w = _EMPTY_;
    private String c116m = _EMPTY_;
    private String c116998 = _EMPTY_;
    private String c117 = _EMPTY_;
    private String c11701 = _EMPTY_;
    private String c11702 = _EMPTY_;
    private String c11702x = _EMPTY_;
    private String c11703 = _EMPTY_;
    private String c11703x = _EMPTY_;
    private String c11796 = _EMPTY_;
    private String c11796x = _EMPTY_;
    private String c118 = _EMPTY_;
    private String c119 = _EMPTY_;
    private String c11996x = _EMPTY_;
    private String c119a = _EMPTY_;
    private String c119b = _EMPTY_;
    private String c119c = _EMPTY_;
    private String c119d = _EMPTY_;
    private String c119e = _EMPTY_;
    private String c119f = _EMPTY_;
    private String c119g = _EMPTY_;
    private String c119h = _EMPTY_;
    private String c11998 = _EMPTY_;
    private String c120 = _EMPTY_;
    private String c121 = _EMPTY_;
    private String c122 = _EMPTY_;
    private String c12201 = _EMPTY_;
    private String c12202 = _EMPTY_;
    private String c12203 = _EMPTY_;
    private String c12204 = _EMPTY_;
    private String c12205 = _EMPTY_;
    private String c12206 = _EMPTY_;
    private String c12207 = _EMPTY_;
    private String c12208 = _EMPTY_;
    private String c12296 = _EMPTY_;
    private String c12296x = _EMPTY_;
    private String c123 = _EMPTY_;
    private String c12301 = _EMPTY_;
    private String c12302 = _EMPTY_;
    private String c12396 = _EMPTY_;
    private String c12396x = _EMPTY_;
    private String c124 = _EMPTY_;
    private String c125 = _EMPTY_;
    private String c126 = _EMPTY_;
    private String c127 = _EMPTY_;
    private String c128 = _EMPTY_;
    private String c12801 = _EMPTY_;
    private String c12802 = _EMPTY_;
    private String c12896 = _EMPTY_;
    private String c12896x = _EMPTY_;
    private String c129 = _EMPTY_;
    private String c130 = _EMPTY_;
    private String c130cx = _EMPTY_;
    private String c130sx = _EMPTY_;
    private String c131 = _EMPTY_;
    private String c13196x = _EMPTY_;
    private String c132 = _EMPTY_;
    private String c133 = _EMPTY_;
    private String c133ax = _EMPTY_;
    private String c2na = _EMPTY_;
    private String c201 = _EMPTY_;
    private String c202 = _EMPTY_;
    private String c20201 = _EMPTY_;
    private String c20202 = _EMPTY_;
    private String c20203 = _EMPTY_;
    private String c20204 = _EMPTY_;
    private String c20205 = _EMPTY_;
    private String c20206 = _EMPTY_;
    private String c20207 = _EMPTY_;
    private String c20208 = _EMPTY_;
    private String c20296 = _EMPTY_;
    private String c20296x = _EMPTY_;
    private String c203 = _EMPTY_;
    private String c20301 = _EMPTY_;
    private String c20302 = _EMPTY_;
    private String c20303 = _EMPTY_;
    private String c20304 = _EMPTY_;
    private String c20304x = _EMPTY_;
    private String c20305 = _EMPTY_;
    private String c20305x = _EMPTY_;
    private String c20396 = _EMPTY_;
    private String c20396x = _EMPTY_;
    private String c204m = _EMPTY_;
    private String c204w = _EMPTY_;
    private String c20498 = _EMPTY_;
    private String c205 = _EMPTY_;
    private String c20501x = _EMPTY_;
    private String c20601 = _EMPTY_;
    private String c20602 = _EMPTY_;
    private String c20603 = _EMPTY_;
    private String c20604 = _EMPTY_;
    private String c20605 = _EMPTY_;
    private String c20606 = _EMPTY_;
    private String c20607 = _EMPTY_;
    private String c20608 = _EMPTY_;
    private String c20697 = _EMPTY_;
    private String c20696 = _EMPTY_;
    private String c20696x = _EMPTY_;
    private String c207 = _EMPTY_;
    private String c208 = _EMPTY_;
    private String c209 = _EMPTY_;
    private String c20901 = _EMPTY_;
    private String c20902 = _EMPTY_;
    private String c20903 = _EMPTY_;
    private String c20904 = _EMPTY_;
    private String c20905 = _EMPTY_;
    private String c20906 = _EMPTY_;
    private String c20907 = _EMPTY_;
    private String c20908 = _EMPTY_;
    private String c20996 = _EMPTY_;
    private String c20996x = _EMPTY_;
    private String c210 = _EMPTY_;
    private String c21001 = _EMPTY_;
    private String c21001x = _EMPTY_;
    private String c21002 = _EMPTY_;
    private String c21002x = _EMPTY_;
    private String c21096 = _EMPTY_;
    private String c21096x = _EMPTY_;
    private String c211 = _EMPTY_;
    private String c212 = _EMPTY_;
    private String c213 = _EMPTY_;
    private String c214 = _EMPTY_;
    private String c215 = _EMPTY_;
    private String c21501 = _EMPTY_;
    private String c21501x = _EMPTY_;
    private String c21502 = _EMPTY_;
    private String c21502x = _EMPTY_;
    private String c21596 = _EMPTY_;
    private String c21596x = _EMPTY_;
    private String c216 = _EMPTY_;
    private String c217 = _EMPTY_;
    private String c21701x = _EMPTY_;
    private String c21702x = _EMPTY_;
    private String c218 = _EMPTY_;
    private String c21896x = _EMPTY_;
    private String c219 = _EMPTY_;
    private String c220 = _EMPTY_;
    private String c221 = _EMPTY_;
    private String c221ax = _EMPTY_;
    private String c3na = _EMPTY_;
    private String c301 = _EMPTY_;
    private String c30196x = _EMPTY_;
    private String c302 = _EMPTY_;
    private String c30204x = _EMPTY_;
    private String c30205x = _EMPTY_;
    private String c30296x = _EMPTY_;
    private String c303 = _EMPTY_;
    private String c304 = _EMPTY_;
    private String c305 = _EMPTY_;
    private String c306 = _EMPTY_;
    private String c30601x = _EMPTY_;
    private String c30602x = _EMPTY_;
    private String c307 = _EMPTY_;
    private String c308 = _EMPTY_;
    private String c309 = _EMPTY_;
    private String c310 = _EMPTY_;
    private String c310hx = _EMPTY_;
    private String c311 = _EMPTY_;
    private String c311hx = _EMPTY_;
    private String c311dx = _EMPTY_;
    private String c312 = _EMPTY_;
    private String c31301 = _EMPTY_;
    private String c31302 = _EMPTY_;
    private String c31303 = _EMPTY_;
    private String c31304 = _EMPTY_;
    private String c31305 = _EMPTY_;
    private String c31306 = _EMPTY_;
    private String c31396 = _EMPTY_;
    private String c313998 = _EMPTY_;
    private String c31396x = _EMPTY_;
    private String c314 = _EMPTY_;
    private String c31401x = _EMPTY_;
    private String c31402x = _EMPTY_;
    private String c31496x = _EMPTY_;
    private String c315 = _EMPTY_;
    private String c316 = _EMPTY_;
    private String c31601 = _EMPTY_;
    private String c31602 = _EMPTY_;
    private String c31603 = _EMPTY_;
    private String c31604 = _EMPTY_;
    private String c31605 = _EMPTY_;
    private String c31606 = _EMPTY_;
    private String c31607 = _EMPTY_;
    private String c31608 = _EMPTY_;
    private String c31696 = _EMPTY_;
    private String c31696x = _EMPTY_;
    private String c317 = _EMPTY_;
    private String c317hx = _EMPTY_;
    private String c317dx = _EMPTY_;
    private String c317wx = _EMPTY_;
    private String c318 = _EMPTY_;
    private String c319 = _EMPTY_;
    private String c31901 = _EMPTY_;
    private String c31902 = _EMPTY_;
    private String c31903 = _EMPTY_;
    private String c31904 = _EMPTY_;
    private String c31905 = _EMPTY_;
    private String c31906 = _EMPTY_;
    private String c31907 = _EMPTY_;
    private String c31908 = _EMPTY_;
    private String c31909 = _EMPTY_;
    private String c31996 = _EMPTY_;
    private String c31996x = _EMPTY_;
    private String c320 = _EMPTY_;
    private String c321 = _EMPTY_;
    private String c32101 = _EMPTY_;
    private String c32102 = _EMPTY_;
    private String c32103 = _EMPTY_;
    private String c32104 = _EMPTY_;
    private String c32105 = _EMPTY_;
    private String c32106 = _EMPTY_;
    private String c32107 = _EMPTY_;
    private String c32108 = _EMPTY_;
    private String c32196 = _EMPTY_;
    private String c32196x = _EMPTY_;
    private String c322 = _EMPTY_;
    private String c322hx = _EMPTY_;
    private String c322dx = _EMPTY_;
    private String c322wx = _EMPTY_;
    private String c323 = _EMPTY_;
    private String c324 = _EMPTY_;
    private String c32401 = _EMPTY_;
    private String c32402 = _EMPTY_;
    private String c32403 = _EMPTY_;
    private String c32404 = _EMPTY_;
    private String c32405 = _EMPTY_;
    private String c32496 = _EMPTY_;
    private String c32496x = _EMPTY_;
    private String c325 = _EMPTY_;
    private String c326 = _EMPTY_;
    private String c32601x = _EMPTY_;
    private String c32602x = _EMPTY_;
    private String c327 = _EMPTY_;
    private String c32701x = _EMPTY_;
    private String c32702x = _EMPTY_;
    private String c328 = _EMPTY_;
    private String c32896x = _EMPTY_;
    private String c329 = _EMPTY_;
    private String c330 = _EMPTY_;
    private String c331 = _EMPTY_;
    private String c33101 = _EMPTY_;
    private String c33102 = _EMPTY_;
    private String c33103 = _EMPTY_;
    private String c33104 = _EMPTY_;
    private String c33105 = _EMPTY_;
    private String c33106 = _EMPTY_;
    private String c33107 = _EMPTY_;
    private String c33108 = _EMPTY_;
    private String c33109 = _EMPTY_;
    private String c33110 = _EMPTY_;
    private String c33111 = _EMPTY_;
    private String c33112 = _EMPTY_;
    private String c33113 = _EMPTY_;
    private String c33114 = _EMPTY_;
    private String c33115 = _EMPTY_;
    private String c33116 = _EMPTY_;
    private String c33196 = _EMPTY_;
    private String c33196x = _EMPTY_;
    private String c401 = _EMPTY_;
    private String c402 = _EMPTY_;
    private String c40296x = _EMPTY_;
    private String c403 = _EMPTY_;
    private String c40301 = _EMPTY_;
    private String c40302 = _EMPTY_;
    private String c40303 = _EMPTY_;
    private String c40304 = _EMPTY_;
    private String c40305 = _EMPTY_;
    private String c40306 = _EMPTY_;
    private String c40307 = _EMPTY_;
    private String c40308 = _EMPTY_;
    private String c40309 = _EMPTY_;
    private String c40310 = _EMPTY_;
    private String c40311 = _EMPTY_;
    private String c40396 = _EMPTY_;
    private String c40396x = _EMPTY_;
    private String c404 = _EMPTY_;
    private String c40401x = _EMPTY_;
    private String c405 = _EMPTY_;
    private String c406 = _EMPTY_;
    private String c40696x = _EMPTY_;
    private String c501 = _EMPTY_;
    private String c5011 = _EMPTY_;
    private String c5012 = _EMPTY_;
    private String c5013 = _EMPTY_;
    private String c502 = _EMPTY_;
    private String c5021 = _EMPTY_;
    private String c5022 = _EMPTY_;
    private String c5023 = _EMPTY_;
    private String c503 = _EMPTY_;
    private String c5031 = _EMPTY_;
    private String c5032 = _EMPTY_;
    private String c5033 = _EMPTY_;
    private String c504 = _EMPTY_;
    private String c50496x = _EMPTY_;
    private String c5041 = _EMPTY_;
    private String c5042 = _EMPTY_;
    private String c5043 = _EMPTY_;
    private String c505 = _EMPTY_;
    private String c50596x = _EMPTY_;
    private String c60101 = _EMPTY_;
    private String c60102 = _EMPTY_;
    private String c60103 = _EMPTY_;
    private String c60104 = _EMPTY_;
    private String c60105 = _EMPTY_;
    private String c60106 = _EMPTY_;
    private String c60107 = _EMPTY_;
    private String c60197 = _EMPTY_;
    private String c60201 = _EMPTY_;
    private String c60202 = _EMPTY_;
    private String c60203 = _EMPTY_;
    private String c60204 = _EMPTY_;
    private String c60205 = _EMPTY_;
    private String c60206 = _EMPTY_;
    private String c60207 = _EMPTY_;
    private String c60297 = _EMPTY_;
    private String c60301 = _EMPTY_;
    private String c60302 = _EMPTY_;
    private String c60303 = _EMPTY_;
    private String c60304 = _EMPTY_;
    private String c60305 = _EMPTY_;
    private String c60306 = _EMPTY_;
    private String c60307 = _EMPTY_;
    private String c60397 = _EMPTY_;
    private String c60401 = _EMPTY_;
    private String c60402 = _EMPTY_;
    private String c60403 = _EMPTY_;
    private String c60404 = _EMPTY_;
    private String c60405 = _EMPTY_;
    private String c60406 = _EMPTY_;
    private String c60407 = _EMPTY_;
    private String c60497 = _EMPTY_;
    private String c60501 = _EMPTY_;
    private String c60502 = _EMPTY_;
    private String c60503 = _EMPTY_;
    private String c60504 = _EMPTY_;
    private String c60505 = _EMPTY_;
    private String c60506 = _EMPTY_;
    private String c60507 = _EMPTY_;
    private String c60597 = _EMPTY_;
    private String c60601 = _EMPTY_;
    private String c60602 = _EMPTY_;
    private String c60603 = _EMPTY_;
    private String c60604 = _EMPTY_;
    private String c60605 = _EMPTY_;
    private String c60606 = _EMPTY_;
    private String c60607 = _EMPTY_;
    private String c60697 = _EMPTY_;
    private String c60701 = _EMPTY_;
    private String c60702 = _EMPTY_;
    private String c60703 = _EMPTY_;
    private String c60704 = _EMPTY_;
    private String c60705 = _EMPTY_;
    private String c60706 = _EMPTY_;
    private String c60707 = _EMPTY_;
    private String c60797 = _EMPTY_;
    private String c60801 = _EMPTY_;
    private String c60802 = _EMPTY_;
    private String c60803 = _EMPTY_;
    private String c60804 = _EMPTY_;
    private String c60805 = _EMPTY_;
    private String c60806 = _EMPTY_;
    private String c60807 = _EMPTY_;
    private String c60897 = _EMPTY_;
    private String c60901 = _EMPTY_;
    private String c60902 = _EMPTY_;
    private String c60903 = _EMPTY_;
    private String c60904 = _EMPTY_;
    private String c60905 = _EMPTY_;
    private String c60906 = _EMPTY_;
    private String c60907 = _EMPTY_;
    private String c60997 = _EMPTY_;
    private String c61001 = _EMPTY_;
    private String c61002 = _EMPTY_;
    private String c61003 = _EMPTY_;
    private String c61004 = _EMPTY_;
    private String c61005 = _EMPTY_;
    private String c61006 = _EMPTY_;
    private String c61007 = _EMPTY_;
    private String c61097 = _EMPTY_;


    // Constructor
    public void Mwra() {
    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyMember.getUid()); //// not applicable in Form table
        // setMuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA) - 1).getUid());  // not applicable in Form table
        setSno(selectedMWRA);
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

    public String getpsuCode() {
        return psuCode;
    }

    private void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }


    @Bindable
    public String getC101() {
        return c101;
    }

    public void setC101(String c101) {
        this.c101 = c101;
        notifyPropertyChanged(BR.c101);
    }

    @Bindable
    public String getC102() {
        return c102;
    }

    public void setC102(String c102) {
        this.c102 = c102;
        setC104(c102.equals("2") ? "" : this.c104);
        setC105(c102.equals("2") ? "" : this.c105);
        setC106(c102.equals("2") ? "" : this.c106);
        setC107(c102.equals("2") ? "" : this.c107);
        setC108(c102.equals("2") ? "" : this.c108);
        setC109(c102.equals("2") ? "" : this.c109);
        setC110(c102.equals("2") ? "" : this.c110);
        setC111(c102.equals("2") ? "" : this.c111);
        setC112wk(c102.equals("2") ? "" : this.c112wk);
        setC112mm(c102.equals("2") ? "" : this.c112mm);
        setC113dd(c102.equals("2") ? "" : this.c113dd);
        setC113mm(c102.equals("2") ? "" : this.c113mm);
        setC113yy(c102.equals("2") ? "" : this.c113yy);
        setC114(c102.equals("2") ? "" : this.c114);
        setC11501(c102.equals("2") ? "" : this.c11501);
        setC11502(c102.equals("2") ? "" : this.c11502);
        setC11503(c102.equals("2") ? "" : this.c11503);
        setC11504(c102.equals("2") ? "" : this.c11504);
        setC11505(c102.equals("2") ? "" : this.c11505);
        setC11506(c102.equals("2") ? "" : this.c11506);
        setC11507(c102.equals("2") ? "" : this.c11507);
        setC11508(c102.equals("2") ? "" : this.c11508);
        setC11596(c102.equals("2") ? "" : this.c11596);
        setC116w(c102.equals("2") ? "" : this.c116w);
        setC116m(c102.equals("2") ? "" : this.c116m);
        setC116998(c102.equals("2") ? "" : this.c116998);
        setC11701(c102.equals("2") ? "" : this.c11701);
        setC11702(c102.equals("2") ? "" : this.c11702);
        setC11703(c102.equals("2") ? "" : this.c11703);
        setC11796(c102.equals("2") ? "" : this.c11796);
        setC118(c102.equals("2") ? "" : this.c118);
        setC119(c102.equals("2") ? "" : this.c119);
        setC119a(c102.equals("2") ? "" : this.c119a);
        setC119b(c102.equals("2") ? "" : this.c119b);
        setC119c(c102.equals("2") ? "" : this.c119c);
        setC119d(c102.equals("2") ? "" : this.c119d);
        setC119e(c102.equals("2") ? "" : this.c119e);
        setC119f(c102.equals("2") ? "" : this.c119f);
        setC119g(c102.equals("2") ? "" : this.c119g);
        setC119h(c102.equals("2") ? "" : this.c119h);
        setC11998(c102.equals("2") ? "" : this.c11998);
        setC120(c102.equals("2") ? "" : this.c120);
        setC121(c102.equals("2") ? "" : this.c121);
        setC12201(c102.equals("2") ? "" : this.c12201);
        setC12202(c102.equals("2") ? "" : this.c12202);
        setC12203(c102.equals("2") ? "" : this.c12203);
        setC12204(c102.equals("2") ? "" : this.c12204);
        setC12205(c102.equals("2") ? "" : this.c12205);
        setC12206(c102.equals("2") ? "" : this.c12206);
        setC12207(c102.equals("2") ? "" : this.c12207);
        setC12208(c102.equals("2") ? "" : this.c12208);
        setC12296(c102.equals("2") ? "" : this.c12296);
        setC12301(c102.equals("2") ? "" : this.c12301);
        setC12302(c102.equals("2") ? "" : this.c12302);
        setC12396(c102.equals("2") ? "" : this.c12396);
        setC124(c102.equals("2") ? "" : this.c124);
        setC125(c102.equals("2") ? "" : this.c125);
        setC126(c102.equals("2") ? "" : this.c126);
        setC127(c102.equals("2") ? "" : this.c127);
        setC12801(c102.equals("2") ? "" : this.c12801);
        setC12802(c102.equals("2") ? "" : this.c12802);
        setC12896(c102.equals("2") ? "" : this.c12896);
        setC129(c102.equals("2") ? "" : this.c129);
        setC130(c102.equals("2") ? "" : this.c130);
        setC131(c102.equals("2") ? "" : this.c131);
        setC132(c102.equals("2") ? "" : this.c132);
        setC133(c102.equals("2") ? "" : this.c133);
        notifyPropertyChanged(BR.c102);
    }

    @Bindable
    public String getC103() {
        return c103;
    }

    public void setC103(String c103) {
        this.c103 = c103;
        notifyPropertyChanged(BR.c103);
    }

    @Bindable
    public String getC104() {
        return c104;
    }

    public void setC104(String c104) {
        this.c104 = c104;
        notifyPropertyChanged(BR.c104);
    }

    @Bindable
    public String getC105() {
        return c105;
    }

    public void setC105(String c105) {
        this.c105 = c105;
        setC10501x(c105.equals("1") ? this.c10501x : "");
        notifyPropertyChanged(BR.c105);
    }

    @Bindable
    public String getC10501x() {
        return c10501x;
    }

    public void setC10501x(String c10501x) {
        this.c10501x = c10501x;
        notifyPropertyChanged(BR.c10501x);
    }

    @Bindable
    public String getC106() {
        return c106;
    }

    public void setC106(String c106) {
        this.c106 = c106;
        notifyPropertyChanged(BR.c106);
    }

    @Bindable
    public String getC107() {
        return c107;
    }

    public void setC107(String c107) {
        this.c107 = c107;
        notifyPropertyChanged(BR.c107);
    }

    @Bindable
    public String getC108() {
        return c108;
    }

    public void setC108(String c108) {
        this.c108 = c108;
        notifyPropertyChanged(BR.c108);
    }

    @Bindable
    public String getC109() {
        return c109;
    }

    public void setC109(String c109) {
        this.c109 = c109;
        notifyPropertyChanged(BR.c109);
    }

    @Bindable
    public String getC110() {
        return c110;
    }

    public void setC110(String c110) {
        this.c110 = c110;
        notifyPropertyChanged(BR.c110);
    }

    @Bindable
    public String getC111() {
        return c111;
    }

    public void setC111(String c111) {
        this.c111 = c111;
        setC112wk(c111.equals("1") ? this.c112wk : "");
        setC112mm(c111.equals("1") ? this.c112mm : "");
        setC113dd(c111.equals("1") ? this.c113dd : "");
        setC113mm(c111.equals("1") ? this.c113mm : "");
        setC113yy(c111.equals("1") ? this.c113yy : "");
        setC114(c111.equals("1") ? this.c114 : "");
        setC11501(c111.equals("1") ? this.c11501 : "");
        setC11502(c111.equals("1") ? this.c11502 : "");
        setC11503(c111.equals("1") ? this.c11503 : "");
        setC11504(c111.equals("1") ? this.c11504 : "");
        setC11505(c111.equals("1") ? this.c11505 : "");
        setC11506(c111.equals("1") ? this.c11506 : "");
        setC11507(c111.equals("1") ? this.c11507 : "");
        setC11508(c111.equals("1") ? this.c11508 : "");
        setC11596(c111.equals("1") ? this.c11596 : "");
        setC116w(c111.equals("1") ? this.c116w : "");
        setC116m(c111.equals("1") ? this.c116m : "");
        setC116998(c111.equals("1") ? this.c116998 : "");
        setC11701(c111.equals("1") ? this.c11701 : "");
        setC11702(c111.equals("1") ? this.c11702 : "");
        setC11703(c111.equals("1") ? this.c11703 : "");
        setC11796(c111.equals("1") ? this.c11796 : "");
        setC118(c111.equals("1") ? this.c118 : "");
        setC119(c111.equals("1") ? this.c119 : "");
        setC119a(c111.equals("1") ? this.c119a : "");
        setC119b(c111.equals("1") ? this.c119b : "");
        setC119c(c111.equals("1") ? this.c119c : "");
        setC119d(c111.equals("1") ? this.c119d : "");
        setC119e(c111.equals("1") ? this.c119e : "");
        setC119f(c111.equals("1") ? this.c119f : "");
        setC119g(c111.equals("1") ? this.c119g : "");
        setC119h(c111.equals("1") ? this.c119h : "");
        setC11998(c111.equals("1") ? this.c11998 : "");
        setC120(c111.equals("1") ? this.c120 : "");
        setC121(c111.equals("1") ? this.c121 : "");
        setC12201(c111.equals("1") ? this.c12201 : "");
        setC12202(c111.equals("1") ? this.c12202 : "");
        setC12203(c111.equals("1") ? this.c12203 : "");
        setC12204(c111.equals("1") ? this.c12204 : "");
        setC12205(c111.equals("1") ? this.c12205 : "");
        setC12206(c111.equals("1") ? this.c12206 : "");
        setC12207(c111.equals("1") ? this.c12207 : "");
        setC12208(c111.equals("1") ? this.c12208 : "");
        setC12296(c111.equals("1") ? this.c12296 : "");
        setC12301(c111.equals("1") ? this.c12301 : "");
        setC12302(c111.equals("1") ? this.c12302 : "");
        setC12396(c111.equals("1") ? this.c12396 : "");
        setC124(c111.equals("1") ? this.c124 : "");
        setC125(c111.equals("1") ? this.c125 : "");
        setC126(c111.equals("1") ? this.c126 : "");
        setC127(c111.equals("1") ? this.c127 : "");
        setC12801(c111.equals("1") ? this.c12801 : "");
        setC12802(c111.equals("1") ? this.c12802 : "");
        setC12896(c111.equals("1") ? this.c12896 : "");
        setC129(c111.equals("1") ? this.c129 : "");
        setC130(c111.equals("1") ? this.c130 : "");
        setC131(c111.equals("1") ? this.c131 : "");
        setC132(c111.equals("1") ? this.c132 : "");
        setC133(c111.equals("1") ? this.c133 : "");
        notifyPropertyChanged(BR.c111);
    }

    @Bindable
    public String getC112wk() {
        return c112wk;
    }

    public void setC112wk(String c112wk) {
        this.c112wk = c112wk;
        notifyPropertyChanged(BR.c112wk);
    }

    @Bindable
    public String getC112mm() {
        return c112mm;
    }

    public void setC112mm(String c112mm) {
        this.c112mm = c112mm;
        notifyPropertyChanged(BR.c112mm);
    }

    @Bindable
    public String getC113dd() {
        return c113dd;
    }

    public void setC113dd(String c113dd) {
        this.c113dd = c113dd;
        notifyPropertyChanged(BR.c113dd);
    }

    @Bindable
    public String getC113mm() {
        return c113mm;
    }

    public void setC113mm(String c113mm) {
        this.c113mm = c113mm;
        notifyPropertyChanged(BR.c113mm);
    }

    @Bindable
    public String getC113yy() {
        return c113yy;
    }

    public void setC113yy(String c113yy) {
        this.c113yy = c113yy;
        notifyPropertyChanged(BR.c113yy);
    }

    @Bindable
    public String getC114() {
        return c114;
    }

    public void setC114(String c114) {
        this.c114 = c114;
        setC11501(c114.equals("1") ? this.c11501 : "");
        setC11502(c114.equals("1") ? this.c11502 : "");
        setC11503(c114.equals("1") ? this.c11503 : "");
        setC11504(c114.equals("1") ? this.c11504 : "");
        setC11505(c114.equals("1") ? this.c11505 : "");
        setC11506(c114.equals("1") ? this.c11506 : "");
        setC11507(c114.equals("1") ? this.c11507 : "");
        setC11508(c114.equals("1") ? this.c11508 : "");
        setC11596(c114.equals("1") ? this.c11596 : "");
        setC116w(c114.equals("1") ? this.c116w : "");
        setC116m(c114.equals("1") ? this.c116m : "");
        setC116998(c114.equals("1") ? this.c116998 : "");
        setC11701(c114.equals("1") ? this.c11701 : "");
        setC11702(c114.equals("1") ? this.c11702 : "");
        setC11703(c114.equals("1") ? this.c11703 : "");
        setC11796(c114.equals("1") ? this.c11796 : "");
        setC118(c114.equals("1") ? this.c118 : "");
        setC119(c114.equals("1") ? this.c119 : "");
        setC119a(c114.equals("1") ? this.c119a : "");
        setC119b(c114.equals("1") ? this.c119b : "");
        setC119c(c114.equals("1") ? this.c119c : "");
        setC119d(c114.equals("1") ? this.c119d : "");
        setC119e(c114.equals("1") ? this.c119e : "");
        setC119f(c114.equals("1") ? this.c119f : "");
        setC119g(c114.equals("1") ? this.c119g : "");
        setC119h(c114.equals("1") ? this.c119h : "");
        setC11998(c114.equals("1") ? this.c11998 : "");
        notifyPropertyChanged(BR.c114);
    }

    @Bindable
    public String getC115() {
        return c115;
    }

    public void setC115(String c115) {
        this.c115 = c115;
        notifyPropertyChanged(BR.c115);
    }

    @Bindable
    public String getC11501() {
        return c11501;
    }

    public void setC11501(String c11501) {
        if (this.c11501.equals(c11501)) return;
        this.c11501 = c11501;
        notifyPropertyChanged(BR.c11501);
    }

    @Bindable
    public String getC11502() {
        return c11502;
    }

    public void setC11502(String c11502) {
        if (this.c11502.equals(c11502)) return;
        this.c11502 = c11502;
        notifyPropertyChanged(BR.c11502);
    }

    @Bindable
    public String getC11503() {
        return c11503;
    }

    public void setC11503(String c11503) {
        if (this.c11503.equals(c11503)) return;
        this.c11503 = c11503;
        notifyPropertyChanged(BR.c11503);
    }

    @Bindable
    public String getC11504() {
        return c11504;
    }

    public void setC11504(String c11504) {
        if (this.c11504.equals(c11504)) return;
        this.c11504 = c11504;
        notifyPropertyChanged(BR.c11504);
    }

    @Bindable
    public String getC11505() {
        return c11505;
    }

    public void setC11505(String c11505) {
        if (this.c11505.equals(c11505)) return;
        this.c11505 = c11505;
        notifyPropertyChanged(BR.c11505);
    }

    @Bindable
    public String getC11506() {
        return c11506;
    }

    public void setC11506(String c11506) {
        if (this.c11506.equals(c11506)) return;
        this.c11506 = c11506;
        notifyPropertyChanged(BR.c11506);
    }

    @Bindable
    public String getC11507() {
        return c11507;
    }

    public void setC11507(String c11507) {
        if (this.c11507.equals(c11507)) return;
        this.c11507 = c11507;
        notifyPropertyChanged(BR.c11507);
    }

    @Bindable
    public String getC11508() {
        return c11508;
    }

    public void setC11508(String c11508) {
        if (this.c11508.equals(c11508)) return;
        this.c11508 = c11508;
        notifyPropertyChanged(BR.c11508);
    }

    @Bindable
    public String getC11596() {
        return c11596;
    }

    public void setC11596(String c11596) {
        if (this.c11596.equals(c11596)) return;
        this.c11596 = c11596;
        setC11596x(c11596.equals("96") ? this.c11596x : "");
        notifyPropertyChanged(BR.c11596);
    }

    @Bindable
    public String getC11596x() {
        return c11596x;
    }

    public void setC11596x(String c11596x) {
        this.c11596x = c11596x;
        notifyPropertyChanged(BR.c11596x);
    }

    @Bindable
    public String getC116w() {
        return c116w;
    }

    public void setC116w(String c116w) {
        this.c116w = c116w;
        notifyPropertyChanged(BR.c116w);
    }

    @Bindable
    public String getC116m() {
        return c116m;
    }

    public void setC116m(String c116m) {
        this.c116m = c116m;
        notifyPropertyChanged(BR.c116m);
    }

    @Bindable
    public String getC116998() {
        return c116998;
    }

    public void setC116998(String c116998) {
        if (this.c116998.equals(c116998)) return;
        this.c116998 = c116998;
        setC116w(c116998.equals("998") ? "" : this.c116w);
        setC116m(c116998.equals("998") ? "" : this.c116m);
        notifyPropertyChanged(BR.c116998);
    }

    @Bindable
    public String getC117() {
        return c117;
    }

    public void setC117(String c117) {
        this.c117 = c117;
        notifyPropertyChanged(BR.c117);
    }

    @Bindable
    public String getC11701() {
        return c11701;
    }

    public void setC11701(String c11701) {
        if (this.c11701.equals(c11701)) return;
        this.c11701 = c11701;
        notifyPropertyChanged(BR.c11701);
    }

    @Bindable
    public String getC11702() {
        return c11702;
    }

    public void setC11702(String c11702) {
        if (this.c11702.equals(c11702)) return;
        this.c11702 = c11702;
        setC11702x(c11702.equals("2") ? this.c11702x : "");
        notifyPropertyChanged(BR.c11702);
    }

    @Bindable
    public String getC11702x() {
        return c11702x;
    }

    public void setC11702x(String c11702x) {
        this.c11702x = c11702x;
        notifyPropertyChanged(BR.c11702x);
    }

    @Bindable
    public String getC11703() {
        return c11703;
    }

    public void setC11703(String c11703) {
        if (this.c11703.equals(c11703)) return;
        this.c11703 = c11703;
        setC11703x(c11703.equals("3") ? this.c11703x : "");
        notifyPropertyChanged(BR.c11703);
    }

    @Bindable
    public String getC11703x() {
        return c11703x;
    }

    public void setC11703x(String c11703x) {
        this.c11703x = c11703x;
        notifyPropertyChanged(BR.c11703x);
    }

    @Bindable
    public String getC11796() {
        return c11796;
    }

    public void setC11796(String c11796) {
        if (this.c11796.equals(c11796)) return;
        this.c11796 = c11796;
        setC11796x(c11796.equals("96") ? this.c11796x : "");
        notifyPropertyChanged(BR.c11796);
    }

    @Bindable
    public String getC11796x() {
        return c11796x;
    }

    public void setC11796x(String c11796x) {
        this.c11796x = c11796x;
        notifyPropertyChanged(BR.c11796x);
    }

    @Bindable
    public String getC118() {
        return c118;
    }

    public void setC118(String c118) {
        this.c118 = c118;
        notifyPropertyChanged(BR.c118);
    }

    @Bindable
    public String getC119() {
        return c119;
    }

    public void setC119(String c119) {
        this.c119 = c119;
        setC11996x(c119.equals("96") ? this.c11996x : "");
        notifyPropertyChanged(BR.c119);
    }

    @Bindable
    public String getC11996x() {
        return c11996x;
    }

    public void setC11996x(String c11996x) {
        this.c11996x = c11996x;
        notifyPropertyChanged(BR.c11996x);
    }

    @Bindable
    public String getC119a() {
        return c119a;
    }

    public void setC119a(String c119a) {
        this.c119a = c119a;
        notifyPropertyChanged(BR.c119a);
    }

    @Bindable
    public String getC119b() {
        return c119b;
    }

    public void setC119b(String c119b) {
        this.c119b = c119b;
        notifyPropertyChanged(BR.c119b);
    }

    @Bindable
    public String getC119c() {
        return c119c;
    }

    public void setC119c(String c119c) {
        this.c119c = c119c;
        notifyPropertyChanged(BR.c119c);
    }

    @Bindable
    public String getC119d() {
        return c119d;
    }

    public void setC119d(String c119d) {
        this.c119d = c119d;
        notifyPropertyChanged(BR.c119d);
    }

    @Bindable
    public String getC119e() {
        return c119e;
    }

    public void setC119e(String c119e) {
        this.c119e = c119e;
        notifyPropertyChanged(BR.c119e);
    }

    @Bindable
    public String getC119f() {
        return c119f;
    }

    public void setC119f(String c119f) {
        this.c119f = c119f;
        notifyPropertyChanged(BR.c119f);
    }

    @Bindable
    public String getC119g() {
        return c119g;
    }

    public void setC119g(String c119g) {
        this.c119g = c119g;
        notifyPropertyChanged(BR.c119g);
    }

    @Bindable
    public String getC119h() {
        return c119h;
    }

    public void setC119h(String c119h) {
        this.c119h = c119h;
        notifyPropertyChanged(BR.c119h);
    }

    @Bindable
    public String getC11998() {
        return c11998;
    }

    public void setC11998(String c11998) {
        this.c11998 = c11998;
        setC119(c11998.equals("1") ? "" : this.c119);
        setC119a(c11998.equals("1") ? "" : this.c119a);
        setC119b(c11998.equals("1") ? "" : this.c119b);
        setC119c(c11998.equals("1") ? "" : this.c119c);
        setC119d(c11998.equals("1") ? "" : this.c119d);
        setC119e(c11998.equals("1") ? "" : this.c119e);
        setC119f(c11998.equals("1") ? "" : this.c119f);
        setC119g(c11998.equals("1") ? "" : this.c119g);
        setC119h(c11998.equals("1") ? "" : this.c119h);
        notifyPropertyChanged(BR.c11998);
    }

    @Bindable
    public String getC120() {
        return c120;
    }

    public void setC120(String c120) {
        this.c120 = c120;
        setC121(c120.equals("1") ? this.c121 : "");
        setC12201(c120.equals("1") ? this.c12201 : "");
        setC12202(c120.equals("1") ? this.c12202 : "");
        setC12203(c120.equals("1") ? this.c12203 : "");
        setC12204(c120.equals("1") ? this.c12204 : "");
        setC12205(c120.equals("1") ? this.c12205 : "");
        setC12206(c120.equals("1") ? this.c12206 : "");
        setC12207(c120.equals("1") ? this.c12207 : "");
        setC12208(c120.equals("1") ? this.c12208 : "");
        setC12296(c120.equals("1") ? this.c12296 : "");
        setC12301(c120.equals("1") ? this.c12301 : "");
        setC12302(c120.equals("1") ? this.c12302 : "");
        setC12396(c120.equals("1") ? this.c12396 : "");
        setC124(c120.equals("1") ? this.c124 : "");
        notifyPropertyChanged(BR.c120);
    }

    @Bindable
    public String getC121() {
        return c121;
    }

    public void setC121(String c121) {
        this.c121 = c121;
        notifyPropertyChanged(BR.c121);
    }

    @Bindable
    public String getC122() {
        return c122;
    }

    public void setC122(String c122) {
        this.c122 = c122;
        notifyPropertyChanged(BR.c122);
    }

    @Bindable
    public String getC12201() {
        return c12201;
    }

    public void setC12201(String c12201) {
        if (this.c12201.equals(c12201)) return;
        this.c12201 = c12201;
        notifyPropertyChanged(BR.c12201);
    }

    @Bindable
    public String getC12202() {
        return c12202;
    }

    public void setC12202(String c12202) {
        if (this.c12202.equals(c12202)) return;
        this.c12202 = c12202;
        notifyPropertyChanged(BR.c12202);
    }

    @Bindable
    public String getC12203() {
        return c12203;
    }

    public void setC12203(String c12203) {
        if (this.c12203.equals(c12203)) return;
        this.c12203 = c12203;
        notifyPropertyChanged(BR.c12203);
    }

    @Bindable
    public String getC12204() {
        return c12204;
    }

    public void setC12204(String c12204) {
        if (this.c12204.equals(c12204)) return;
        this.c12204 = c12204;
        notifyPropertyChanged(BR.c12204);
    }

    @Bindable
    public String getC12205() {
        return c12205;
    }

    public void setC12205(String c12205) {
        if (this.c12205.equals(c12205)) return;
        this.c12205 = c12205;
        notifyPropertyChanged(BR.c12205);
    }

    @Bindable
    public String getC12206() {
        return c12206;
    }

    public void setC12206(String c12206) {
        if (this.c12206.equals(c12206)) return;
        this.c12206 = c12206;
        notifyPropertyChanged(BR.c12206);
    }

    @Bindable
    public String getC12207() {
        return c12207;
    }

    public void setC12207(String c12207) {
        if (this.c12207.equals(c12207)) return;
        this.c12207 = c12207;
        notifyPropertyChanged(BR.c12207);
    }

    @Bindable
    public String getC12208() {
        return c12208;
    }

    public void setC12208(String c12208) {
        if (this.c12208.equals(c12208)) return;
        this.c12208 = c12208;
        notifyPropertyChanged(BR.c12208);
    }

    @Bindable
    public String getC12296() {
        return c12296;
    }

    public void setC12296(String c12296) {
        if (this.c12296.equals(c12296)) return;
        this.c12296 = c12296;
        setC12296x(c12296.equals("96") ? this.c12296x : "");
        notifyPropertyChanged(BR.c12296);
    }

    @Bindable
    public String getC12296x() {
        return c12296x;
    }

    public void setC12296x(String c12296x) {
        this.c12296x = c12296x;
        notifyPropertyChanged(BR.c12296x);
    }

    @Bindable
    public String getC123() {
        return c123;
    }

    public void setC123(String c123) {
        this.c123 = c123;
        notifyPropertyChanged(BR.c123);
    }

    @Bindable
    public String getC12301() {
        return c12301;
    }

    public void setC12301(String c12301) {
        if (this.c12301.equals(c12301)) return;
        this.c12301 = c12301;
        notifyPropertyChanged(BR.c12301);
    }

    @Bindable
    public String getC12302() {
        return c12302;
    }

    public void setC12302(String c12302) {
        if (this.c12302.equals(c12302)) return;
        this.c12302 = c12302;
        notifyPropertyChanged(BR.c12302);
    }

    @Bindable
    public String getC12396() {
        return c12396;
    }

    public void setC12396(String c12396) {
        if (this.c12396.equals(c12396)) return;
        this.c12396 = c12396;
        setC12396x(c12396.equals("96") ? this.c12396x : "");
        notifyPropertyChanged(BR.c12396);
    }

    @Bindable
    public String getC12396x() {
        return c12396x;
    }

    public void setC12396x(String c12396x) {
        this.c12396x = c12396x;
        notifyPropertyChanged(BR.c12396x);
    }

    @Bindable
    public String getC124() {
        return c124;
    }

    public void setC124(String c124) {
        this.c124 = c124;
        notifyPropertyChanged(BR.c124);
    }

    @Bindable
    public String getC125() {
        return c125;
    }

    public void setC125(String c125) {
        this.c125 = c125;
        setC126(c125.equals("1") ? this.c126 : "");
        setC127(c125.equals("1") ? this.c127 : "");
        setC12801(c125.equals("1") ? this.c12801 : "");
        setC12802(c125.equals("1") ? this.c12802 : "");
        setC12896(c125.equals("1") ? this.c12896 : "");
        notifyPropertyChanged(BR.c125);
    }

    @Bindable
    public String getC126() {
        return c126;
    }

    public void setC126(String c126) {
        this.c126 = c126;
        notifyPropertyChanged(BR.c126);
    }

    @Bindable
    public String getC127() {
        return c127;
    }

    public void setC127(String c127) {
        this.c127 = c127;
        notifyPropertyChanged(BR.c127);
    }

    @Bindable
    public String getC128() {
        return c128;
    }

    public void setC128(String c128) {
        this.c128 = c128;
        notifyPropertyChanged(BR.c128);
    }

    @Bindable
    public String getC12801() {
        return c12801;
    }

    public void setC12801(String c12801) {
        if (this.c12801.equals(c12801)) return;
        this.c12801 = c12801;
        notifyPropertyChanged(BR.c12801);
    }

    @Bindable
    public String getC12802() {
        return c12802;
    }

    public void setC12802(String c12802) {
        if (this.c12802.equals(c12802)) return;
        this.c12802 = c12802;
        notifyPropertyChanged(BR.c12802);
    }

    @Bindable
    public String getC12896() {
        return c12896;
    }

    public void setC12896(String c12896) {
        if (this.c12896.equals(c12896)) return;
        this.c12896 = c12896;
        setC12896x(c12896.equals("96") ? this.c12896x : "");
        notifyPropertyChanged(BR.c12896);
    }

    @Bindable
    public String getC12896x() {
        return c12896x;
    }

    public void setC12896x(String c12896x) {
        this.c12896x = c12896x;
        notifyPropertyChanged(BR.c12896x);
    }

    @Bindable
    public String getC129() {
        return c129;
    }

    public void setC129(String c129) {
        this.c129 = c129;
        setC130(c129.equals("1") ? this.c130 : "");
        setC131(c129.equals("1") ? this.c131 : "");
        notifyPropertyChanged(BR.c129);
    }

    @Bindable
    public String getC130() {
        return c130;
    }

    public void setC130(String c130) {
        this.c130 = c130;
        setC130sx(c130.equals("1") ? this.c130sx : "");
        setC130cx(c130.equals("2") ? this.c130cx : "");
        notifyPropertyChanged(BR.c130);
    }

    @Bindable
    public String getC130sx() {
        return c130sx;
    }

    public void setC130sx(String c130sx) {
        this.c130sx = c130sx;
        notifyPropertyChanged(BR.c130sx);
    }

    @Bindable
    public String getC130cx() {
        return c130cx;
    }

    public void setC130cx(String c130cx) {
        this.c130cx = c130cx;
        notifyPropertyChanged(BR.c130cx);
    }

    @Bindable
    public String getC131() {
        return c131;
    }

    public void setC131(String c131) {
        this.c131 = c131;
        setC13196x(c131.equals("96") ? this.c13196x : "");
        notifyPropertyChanged(BR.c131);
    }

    @Bindable
    public String getC13196x() {
        return c13196x;
    }

    public void setC13196x(String c13196x) {
        this.c13196x = c13196x;
        notifyPropertyChanged(BR.c13196x);
    }

    @Bindable
    public String getC132() {
        return c132;
    }

    public void setC132(String c132) {
        this.c132 = c132;
        setC133(c132.equals("1") ? this.c133 : "");
        notifyPropertyChanged(BR.c132);
    }

    @Bindable
    public String getC133() {
        return c133;
    }

    public void setC133(String c133) {
        this.c133 = c133;
        setC133ax(c133.equals("1") ? this.c133ax : "");
        notifyPropertyChanged(BR.c133);
    }

    @Bindable
    public String getC133ax() {
        return c133ax;
    }

    public void setC133ax(String c133ax) {
        this.c133ax = c133ax;
        notifyPropertyChanged(BR.c133ax);
    }


    @Bindable
    public String getC2na() {
        return c2na;
    }

    public void setC2na(String c2na) {
        if (this.c2na.equals(c2na)) return;
        this.c2na = c2na;
        setC201(c2na.equals("997") ? "" : this.c201);
        setC207(c2na.equals("997") ? "" : this.c207);
        setC212(c2na.equals("997") ? "" : this.c212);
        setC216(c2na.equals("997") ? "" : this.c216);
        setC219(c2na.equals("997") ? "" : this.c219);
        setC220(c2na.equals("997") ? "" : this.c220);
        notifyPropertyChanged(BR.c2na);
    }


    @Bindable
    public String getC201() {
        return c201;
    }

    public void setC201(String c201) {
        this.c201 = c201;
        setC20201(c201.equals("1") ? this.c20201 : "");
        setC20202(c201.equals("1") ? this.c20202 : "");
        setC20203(c201.equals("1") ? this.c20203 : "");
        setC20204(c201.equals("1") ? this.c20204 : "");
        setC20205(c201.equals("1") ? this.c20205 : "");
        setC20206(c201.equals("1") ? this.c20206 : "");
        setC20207(c201.equals("1") ? this.c20207 : "");
        setC20208(c201.equals("1") ? this.c20208 : "");
        setC20296(c201.equals("1") ? this.c20296 : "");
        setC20301(c201.equals("1") ? this.c20301 : "");
        setC20302(c201.equals("1") ? this.c20302 : "");
        setC20303(c201.equals("1") ? this.c20303 : "");
        setC20304(c201.equals("1") ? this.c20304 : "");
        setC20305(c201.equals("1") ? this.c20305 : "");
        setC20396(c201.equals("1") ? this.c20396 : "");
        setC204w(c201.equals("1") ? this.c204w : "");
        setC204m(c201.equals("1") ? this.c204m : "");
        setC20498(c201.equals("1") ? this.c20498 : "");
        setC205(c201.equals("1") ? this.c205 : "");
        setC20601(c201.equals("1") ? this.c20601 : "");
        setC20602(c201.equals("1") ? this.c20602 : "");
        setC20603(c201.equals("1") ? this.c20603 : "");
        setC20604(c201.equals("1") ? this.c20604 : "");
        setC20605(c201.equals("1") ? this.c20605 : "");
        setC20606(c201.equals("1") ? this.c20606 : "");
        setC20607(c201.equals("1") ? this.c20607 : "");
        setC20608(c201.equals("1") ? this.c20608 : "");
        setC20697(c201.equals("1") ? this.c20697 : "");
        setC20696(c201.equals("1") ? this.c20696 : "");
        notifyPropertyChanged(BR.c201);
    }

    @Bindable
    public String getC202() {
        return c202;
    }

    public void setC202(String c202) {
        this.c202 = c202;
        notifyPropertyChanged(BR.c202);
    }

    @Bindable
    public String getC20201() {
        return c20201;
    }

    public void setC20201(String c20201) {
        if (this.c20201.equals(c20201)) return;
        this.c20201 = c20201;
        notifyPropertyChanged(BR.c20201);
    }

    @Bindable
    public String getC20202() {
        return c20202;
    }

    public void setC20202(String c20202) {
        if (this.c20202.equals(c20202)) return;
        this.c20202 = c20202;
        notifyPropertyChanged(BR.c20202);
    }

    @Bindable
    public String getC20203() {
        return c20203;
    }

    public void setC20203(String c20203) {
        if (this.c20203.equals(c20203)) return;
        this.c20203 = c20203;
        notifyPropertyChanged(BR.c20203);
    }

    @Bindable
    public String getC20204() {
        return c20204;
    }

    public void setC20204(String c20204) {
        if (this.c20204.equals(c20204)) return;
        this.c20204 = c20204;
        notifyPropertyChanged(BR.c20204);
    }

    @Bindable
    public String getC20205() {
        return c20205;
    }

    public void setC20205(String c20205) {
        if (this.c20205.equals(c20205)) return;
        this.c20205 = c20205;
        notifyPropertyChanged(BR.c20205);
    }

    @Bindable
    public String getC20206() {
        return c20206;
    }

    public void setC20206(String c20206) {
        if (this.c20206.equals(c20206)) return;
        this.c20206 = c20206;
        notifyPropertyChanged(BR.c20206);
    }

    @Bindable
    public String getC20207() {
        return c20207;
    }

    public void setC20207(String c20207) {
        if (this.c20207.equals(c20207)) return;
        this.c20207 = c20207;
        notifyPropertyChanged(BR.c20207);
    }

    @Bindable
    public String getC20208() {
        return c20208;
    }

    public void setC20208(String c20208) {
        if (this.c20208.equals(c20208)) return;
        this.c20208 = c20208;
        notifyPropertyChanged(BR.c20208);
    }

    @Bindable
    public String getC20296() {
        return c20296;
    }

    public void setC20296(String c20296) {
        if (this.c20296.equals(c20296)) return;
        this.c20296 = c20296;
        setC20296x(c20296.equals("96") ? this.c20296x : "");
        notifyPropertyChanged(BR.c20296);
    }

    @Bindable
    public String getC20296x() {
        return c20296x;
    }

    public void setC20296x(String c20296x) {
        this.c20296x = c20296x;
        notifyPropertyChanged(BR.c20296x);
    }

    @Bindable
    public String getC203() {
        return c203;
    }

    public void setC203(String c203) {
        this.c203 = c203;
        notifyPropertyChanged(BR.c203);
    }

    @Bindable
    public String getC20301() {
        return c20301;
    }

    public void setC20301(String c20301) {
        if (this.c20301.equals(c20301)) return;
        this.c20301 = c20301;
        notifyPropertyChanged(BR.c20301);
    }

    @Bindable
    public String getC20302() {
        return c20302;
    }

    public void setC20302(String c20302) {
        if (this.c20302.equals(c20302)) return;
        this.c20302 = c20302;
        notifyPropertyChanged(BR.c20302);
    }

    @Bindable
    public String getC20303() {
        return c20303;
    }

    public void setC20303(String c20303) {
        if (this.c20303.equals(c20303)) return;
        this.c20303 = c20303;
        notifyPropertyChanged(BR.c20303);
    }

    @Bindable
    public String getC20304() {
        return c20304;
    }

    public void setC20304(String c20304) {
        if (this.c20304.equals(c20304)) return;
        this.c20304 = c20304;
        setC20304x(c20304.equals("4") ? this.c20304x : "");
        notifyPropertyChanged(BR.c20304);
    }

    @Bindable
    public String getC20304x() {
        return c20304x;
    }

    public void setC20304x(String c20304x) {
        this.c20304x = c20304x;
        notifyPropertyChanged(BR.c20304x);
    }

    @Bindable
    public String getC20305() {
        return c20305;
    }

    public void setC20305(String c20305) {
        if (this.c20305.equals(c20305)) return;
        this.c20305 = c20305;
        setC20305x(c20305.equals("5") ? this.c20305x : "");
        notifyPropertyChanged(BR.c20305);
    }

    @Bindable
    public String getC20305x() {
        return c20305x;
    }

    public void setC20305x(String c20305x) {
        this.c20305x = c20305x;
        notifyPropertyChanged(BR.c20305x);
    }

    @Bindable
    public String getC20396() {
        return c20396;
    }

    public void setC20396(String c20396) {
        if (this.c20396.equals(c20396)) return;
        this.c20396 = c20396;
        setC20396x(c20396.equals("96") ? this.c20396x : "");
        notifyPropertyChanged(BR.c20396);
    }

    @Bindable
    public String getC20396x() {
        return c20396x;
    }

    public void setC20396x(String c20396x) {
        this.c20396x = c20396x;
        notifyPropertyChanged(BR.c20396x);
    }

    @Bindable
    public String getC204m() {
        return c204m;
    }

    public void setC204m(String c204m) {
        this.c204m = c204m;
        notifyPropertyChanged(BR.c204m);
    }

    @Bindable
    public String getC204w() {
        return c204w;
    }

    public void setC204w(String c204w) {
        this.c204w = c204w;
        notifyPropertyChanged(BR.c204w);
    }

    @Bindable
    public String getC20498() {
        return c20498;
    }

    public void setC20498(String c20498) {
        if (this.c20498.equals(c20498)) return;
        this.c20498 = c20498;
        setC204m(c20498.equals("998") ? "" : this.c204m);
        setC204w(c20498.equals("998") ? "" : this.c204w);
        notifyPropertyChanged(BR.c20498);
    }

    @Bindable
    public String getC205() {
        return c205;
    }

    public void setC205(String c205) {
        this.c205 = c205;
        setC20501x(c205.equals("1") ? this.c20501x : "");
        notifyPropertyChanged(BR.c205);
    }

    @Bindable
    public String getC20501x() {
        return c20501x;
    }

    public void setC20501x(String c20501x) {
        this.c20501x = c20501x;
        notifyPropertyChanged(BR.c20501x);
    }

    @Bindable
    public String getC20601() {
        return c20601;
    }

    public void setC20601(String c20601) {
        this.c20601 = c20601;
        notifyPropertyChanged(BR.c20601);
    }

    @Bindable
    public String getC20602() {
        return c20602;
    }

    public void setC20602(String c20602) {
        this.c20602 = c20602;
        notifyPropertyChanged(BR.c20602);
    }

    @Bindable
    public String getC20603() {
        return c20603;
    }

    public void setC20603(String c20603) {
        this.c20603 = c20603;
        notifyPropertyChanged(BR.c20603);
    }

    @Bindable
    public String getC20604() {
        return c20604;
    }

    public void setC20604(String c20604) {
        this.c20604 = c20604;
        notifyPropertyChanged(BR.c20604);
    }

    @Bindable
    public String getC20605() {
        return c20605;
    }

    public void setC20605(String c20605) {
        this.c20605 = c20605;
        notifyPropertyChanged(BR.c20605);
    }

    @Bindable
    public String getC20606() {
        return c20606;
    }

    public void setC20606(String c20606) {
        this.c20606 = c20606;
        notifyPropertyChanged(BR.c20606);
    }

    @Bindable
    public String getC20607() {
        return c20607;
    }

    public void setC20607(String c20607) {
        this.c20607 = c20607;
        notifyPropertyChanged(BR.c20607);
    }

    @Bindable
    public String getC20608() {
        return c20608;
    }

    public void setC20608(String c20608) {
        this.c20608 = c20608;
        notifyPropertyChanged(BR.c20608);
    }

    @Bindable
    public String getC20697() {
        return c20697;
    }

    public void setC20697(String c20697) {
        this.c20697 = c20697;
        setC20601(c20697.equals("1") ? "" : this.c20601);
        setC20602(c20697.equals("1") ? "" : this.c20602);
        setC20603(c20697.equals("1") ? "" : this.c20603);
        setC20604(c20697.equals("1") ? "" : this.c20604);
        setC20605(c20697.equals("1") ? "" : this.c20605);
        setC20606(c20697.equals("1") ? "" : this.c20606);
        setC20607(c20697.equals("1") ? "" : this.c20607);
        setC20608(c20697.equals("1") ? "" : this.c20608);
        setC20696(c20697.equals("1") ? "" : this.c20696);
        notifyPropertyChanged(BR.c20697);
    }

    @Bindable
    public String getC20696() {
        return c20696;
    }

    public void setC20696(String c20696) {
        this.c20696 = c20696;
        setC20696x(c20696.equals("1") ? this.c20696x : "");
        notifyPropertyChanged(BR.c20696);
    }

    @Bindable
    public String getC20696x() {
        return c20696x;
    }

    public void setC20696x(String c20696x) {
        this.c20696x = c20696x;
        notifyPropertyChanged(BR.c20696x);
    }

    @Bindable
    public String getC207() {
        return c207;
    }

    public void setC207(String c207) {
        this.c207 = c207;
        setC208(c207.equals("1") ? this.c208 : "");
        setC20901(c207.equals("1") ? this.c20901 : "");
        setC20902(c207.equals("1") ? this.c20902 : "");
        setC20903(c207.equals("1") ? this.c20903 : "");
        setC20904(c207.equals("1") ? this.c20904 : "");
        setC20905(c207.equals("1") ? this.c20905 : "");
        setC20906(c207.equals("1") ? this.c20906 : "");
        setC20907(c207.equals("1") ? this.c20907 : "");
        setC20908(c207.equals("1") ? this.c20908 : "");
        setC20996(c207.equals("1") ? this.c20996 : "");
        setC21001(c207.equals("1") ? this.c21001 : "");
        setC21002(c207.equals("1") ? this.c21002 : "");
        setC21096(c207.equals("1") ? this.c21096 : "");
        setC211(c207.equals("1") ? this.c211 : "");
        notifyPropertyChanged(BR.c207);
    }

    @Bindable
    public String getC208() {
        return c208;
    }

    public void setC208(String c208) {
        this.c208 = c208;
        notifyPropertyChanged(BR.c208);
    }

    @Bindable
    public String getC209() {
        return c209;
    }

    public void setC209(String c209) {
        this.c209 = c209;
        notifyPropertyChanged(BR.c209);
    }

    @Bindable
    public String getC20901() {
        return c20901;
    }

    public void setC20901(String c20901) {
        if (this.c20901.equals(c20901)) return;
        this.c20901 = c20901;
        notifyPropertyChanged(BR.c20901);
    }

    @Bindable
    public String getC20902() {
        return c20902;
    }

    public void setC20902(String c20902) {
        if (this.c20902.equals(c20902)) return;
        this.c20902 = c20902;
        notifyPropertyChanged(BR.c20902);
    }

    @Bindable
    public String getC20903() {
        return c20903;
    }

    public void setC20903(String c20903) {
        if (this.c20903.equals(c20903)) return;
        this.c20903 = c20903;
        notifyPropertyChanged(BR.c20903);
    }

    @Bindable
    public String getC20904() {
        return c20904;
    }

    public void setC20904(String c20904) {
        if (this.c20904.equals(c20904)) return;
        this.c20904 = c20904;
        notifyPropertyChanged(BR.c20904);
    }

    @Bindable
    public String getC20905() {
        return c20905;
    }

    public void setC20905(String c20905) {
        if (this.c20905.equals(c20905)) return;
        this.c20905 = c20905;
        notifyPropertyChanged(BR.c20905);
    }

    @Bindable
    public String getC20906() {
        return c20906;
    }

    public void setC20906(String c20906) {
        if (this.c20906.equals(c20906)) return;
        this.c20906 = c20906;
        notifyPropertyChanged(BR.c20906);
    }

    @Bindable
    public String getC20907() {
        return c20907;
    }

    public void setC20907(String c20907) {
        if (this.c20907.equals(c20907)) return;
        this.c20907 = c20907;
        notifyPropertyChanged(BR.c20907);
    }

    @Bindable
    public String getC20908() {
        return c20908;
    }

    public void setC20908(String c20908) {
        if (this.c20908.equals(c20908)) return;
        this.c20908 = c20908;
        notifyPropertyChanged(BR.c20908);
    }

    @Bindable
    public String getC20996() {
        return c20996;
    }

    public void setC20996(String c20996) {
        if (this.c20996.equals(c20996)) return;
        this.c20996 = c20996;
        setC20996x(c20996.equals("1") ? this.c20996x : "");
        notifyPropertyChanged(BR.c20996);
    }

    @Bindable
    public String getC20996x() {
        return c20996x;
    }

    public void setC20996x(String c20996x) {
        this.c20996x = c20996x;
        notifyPropertyChanged(BR.c20996x);
    }

    @Bindable
    public String getC210() {
        return c210;
    }

    public void setC210(String c210) {
        this.c210 = c210;
        notifyPropertyChanged(BR.c210);
    }

    @Bindable
    public String getC21001() {
        return c21001;
    }

    public void setC21001(String c21001) {
        if (this.c21001.equals(c21001)) return;
        this.c21001 = c21001;
        setC21001x(c21001.equals("1") ? this.c21001x : "");
        notifyPropertyChanged(BR.c21001);
    }

    @Bindable
    public String getC21001x() {
        return c21001x;
    }

    public void setC21001x(String c21001x) {
        this.c21001x = c21001x;
        notifyPropertyChanged(BR.c21001x);
    }

    @Bindable
    public String getC21002() {
        return c21002;
    }

    public void setC21002(String c21002) {
        if (this.c21002.equals(c21002)) return;
        this.c21002 = c21002;
        setC21002x(c21002.equals("2") ? this.c21002x : "");
        notifyPropertyChanged(BR.c21002);
    }

    @Bindable
    public String getC21002x() {
        return c21002x;
    }

    public void setC21002x(String c21002x) {
        this.c21002x = c21002x;
        notifyPropertyChanged(BR.c21002x);
    }

    @Bindable
    public String getC21096() {
        return c21096;
    }

    public void setC21096(String c21096) {
        if (this.c21096.equals(c21096)) return;
        this.c21096 = c21096;
        setC21096x(c21096.equals("96") ? this.c21096x : "");
        notifyPropertyChanged(BR.c21096);
    }

    @Bindable
    public String getC21096x() {
        return c21096x;
    }

    public void setC21096x(String c21096x) {
        this.c21096x = c21096x;
        notifyPropertyChanged(BR.c21096x);
    }

    @Bindable
    public String getC211() {
        return c211;
    }

    public void setC211(String c211) {
        this.c211 = c211;
        notifyPropertyChanged(BR.c211);
    }

    @Bindable
    public String getC212() {
        return c212;
    }

    public void setC212(String c212) {
        this.c212 = c212;
        setC213(c212.equals("1") ? this.c213 : "");
        setC214(c212.equals("1") ? this.c214 : "");
        setC21501(c212.equals("1") ? this.c21501 : "");
        setC21502(c212.equals("1") ? this.c21502 : "");
        setC21596(c212.equals("1") ? this.c21596 : "");
        notifyPropertyChanged(BR.c212);
    }

    @Bindable
    public String getC213() {
        return c213;
    }

    public void setC213(String c213) {
        this.c213 = c213;
        notifyPropertyChanged(BR.c213);
    }

    @Bindable
    public String getC214() {
        return c214;
    }

    public void setC214(String c214) {
        this.c214 = c214;
        notifyPropertyChanged(BR.c214);
    }

    @Bindable
    public String getC215() {
        return c215;
    }

    public void setC215(String c215) {
        this.c215 = c215;
        notifyPropertyChanged(BR.c215);
    }

    @Bindable
    public String getC21501() {
        return c21501;
    }

    public void setC21501(String c21501) {
        if (this.c21501.equals(c21501)) return;
        this.c21501 = c21501;
        setC21501x(c21501.equals("1") ? this.c21501x : "");
        notifyPropertyChanged(BR.c21501);
    }

    @Bindable
    public String getC21501x() {
        return c21501x;
    }

    public void setC21501x(String c21501x) {
        this.c21501x = c21501x;
        notifyPropertyChanged(BR.c21501x);
    }

    @Bindable
    public String getC21502() {
        return c21502;
    }

    public void setC21502(String c21502) {
        if (this.c21502.equals(c21502)) return;
        this.c21502 = c21502;
        setC21502x(c21502.equals("2") ? this.c21502x : "");
        notifyPropertyChanged(BR.c21502);
    }

    @Bindable
    public String getC21502x() {
        return c21502x;
    }

    public void setC21502x(String c21502x) {
        this.c21502x = c21502x;
        notifyPropertyChanged(BR.c21502x);
    }

    @Bindable
    public String getC21596() {
        return c21596;
    }

    public void setC21596(String c21596) {
        if (this.c21596.equals(c21596)) return;
        this.c21596 = c21596;
        setC21596x(c21596.equals("96") ? this.c21596x : "");
        notifyPropertyChanged(BR.c21596);
    }

    @Bindable
    public String getC21596x() {
        return c21596x;
    }

    public void setC21596x(String c21596x) {
        this.c21596x = c21596x;
        notifyPropertyChanged(BR.c21596x);
    }

    @Bindable
    public String getC216() {
        return c216;
    }

    public void setC216(String c216) {
        this.c216 = c216;
        setC217(c216.equals("1") ? this.c217 : "");
        setC218(c216.equals("1") ? this.c218 : "");
        notifyPropertyChanged(BR.c216);
    }

    @Bindable
    public String getC217() {
        return c217;
    }

    public void setC217(String c217) {
        this.c217 = c217;
        setC21701x(c217.equals("1") ? this.c21701x : "");
        setC21702x(c217.equals("2") ? this.c21702x : "");
        notifyPropertyChanged(BR.c217);
    }

    @Bindable
    public String getC21701x() {
        return c21701x;
    }

    public void setC21701x(String c21701x) {
        this.c21701x = c21701x;
        notifyPropertyChanged(BR.c21701x);
    }

    @Bindable
    public String getC21702x() {
        return c21702x;
    }

    public void setC21702x(String c21702x) {
        this.c21702x = c21702x;
        notifyPropertyChanged(BR.c21702x);
    }

    @Bindable
    public String getC218() {
        return c218;
    }

    public void setC218(String c218) {
        this.c218 = c218;
        setC21896x(c218.equals("96") ? this.c21896x : "");
        notifyPropertyChanged(BR.c218);
    }

    @Bindable
    public String getC21896x() {
        return c21896x;
    }

    public void setC21896x(String c21896x) {
        this.c21896x = c21896x;
        notifyPropertyChanged(BR.c21896x);
    }

    @Bindable
    public String getC219() {
        return c219;
    }

    public void setC219(String c219) {
        this.c219 = c219;
        notifyPropertyChanged(BR.c219);
    }

    @Bindable
    public String getC220() {
        return c220;
    }

    public void setC220(String c220) {
        this.c220 = c220;
        setC221(c220.equals("1") ? this.c221 : "");
        notifyPropertyChanged(BR.c220);
    }

    @Bindable
    public String getC221() {
        return c221;
    }

    public void setC221(String c221) {
        this.c221 = c221;
        setC221ax(c221.equals("1") ? this.c221ax : "");
        notifyPropertyChanged(BR.c221);
    }

    @Bindable
    public String getC221ax() {
        return c221ax;
    }

    public void setC221ax(String c221ax) {
        this.c221ax = c221ax;
        notifyPropertyChanged(BR.c221ax);
    }


    @Bindable
    public String getC3na() {
        return c3na;
    }

    public void setC3na(String c3na) {
        if (this.c3na.equals(c3na)) return;
        this.c3na = c3na;
        setC301(c3na.equals("997") ? "" : this.c301);
        setC302(c3na.equals("997") ? "" : this.c302);
        setC303(c3na.equals("997") ? "" : this.c303);
        setC304(c3na.equals("997") ? "" : this.c304);
        setC305(c3na.equals("997") ? "" : this.c305);
        setC306(c3na.equals("997") ? "" : this.c306);
        setC307(c3na.equals("997") ? "" : this.c307);
        setC308(c3na.equals("997") ? "" : this.c308);
        setC309(c3na.equals("997") ? "" : this.c309);
        setC310(c3na.equals("997") ? "" : this.c310);
        setC311(c3na.equals("997") ? "" : this.c311);
        setC312(c3na.equals("997") ? "" : this.c312);
        setC315(c3na.equals("997") ? "" : this.c315);
        setC320(c3na.equals("997") ? "" : this.c320);
        setC325(c3na.equals("997") ? "" : this.c325);
        setC329(c3na.equals("997") ? "" : this.c329);
        notifyPropertyChanged(BR.c3na);
    }

    @Bindable
    public String getC301() {
        return c301;
    }

    public void setC301(String c301) {
        this.c301 = c301;
        setC30196x(c301.equals("96") ? this.c30196x : "");
        notifyPropertyChanged(BR.c301);
    }

    @Bindable
    public String getC30196x() {
        return c30196x;
    }

    public void setC30196x(String c30196x) {
        this.c30196x = c30196x;
        notifyPropertyChanged(BR.c30196x);
    }

    @Bindable
    public String getC302() {
        return c302;
    }

    public void setC302(String c302) {
        this.c302 = c302;
        setC30204x(c302.equals("4") ? this.c30204x : "");
        setC30205x(c302.equals("5") ? this.c30205x : "");
        setC30296x(c302.equals("96") ? this.c30296x : "");
        notifyPropertyChanged(BR.c302);
    }

    @Bindable
    public String getC30204x() {
        return c30204x;
    }

    public void setC30204x(String c30204x) {
        this.c30204x = c30204x;
        notifyPropertyChanged(BR.c30204x);
    }

    @Bindable
    public String getC30205x() {
        return c30205x;
    }

    public void setC30205x(String c30205x) {
        this.c30205x = c30205x;
        notifyPropertyChanged(BR.c30205x);
    }

    @Bindable
    public String getC30296x() {
        return c30296x;
    }

    public void setC30296x(String c30296x) {
        this.c30296x = c30296x;
        notifyPropertyChanged(BR.c30296x);
    }

    @Bindable
    public String getC303() {
        return c303;
    }

    public void setC303(String c303) {
        this.c303 = c303;
        notifyPropertyChanged(BR.c303);
    }

    @Bindable
    public String getC304() {
        return c304;
    }

    public void setC304(String c304) {
        this.c304 = c304;
        notifyPropertyChanged(BR.c304);
    }

    @Bindable
    public String getC305() {
        return c305;
    }

    public void setC305(String c305) {
        this.c305 = c305;
        setC306(c305.equals("1") ? this.c306 : "");
        notifyPropertyChanged(BR.c305);
    }

    @Bindable
    public String getC306() {
        return c306;
    }

    public void setC306(String c306) {
        this.c306 = c306;
        setC30601x(c306.equals("1") ? this.c30601x : "");
        setC30602x(c306.equals("2") ? this.c30602x : "");
        notifyPropertyChanged(BR.c306);
    }

    @Bindable
    public String getC30601x() {
        return c30601x;
    }

    public void setC30601x(String c30601x) {
        this.c30601x = c30601x;
        notifyPropertyChanged(BR.c30601x);
    }

    @Bindable
    public String getC30602x() {
        return c30602x;
    }

    public void setC30602x(String c30602x) {
        this.c30602x = c30602x;
        notifyPropertyChanged(BR.c30602x);
    }

    @Bindable
    public String getC307() {
        return c307;
    }

    public void setC307(String c307) {
        this.c307 = c307;
        notifyPropertyChanged(BR.c307);
    }

    @Bindable
    public String getC308() {
        return c308;
    }

    public void setC308(String c308) {
        this.c308 = c308;
        setC309(c308.equals("1") ? this.c309 : "");
        notifyPropertyChanged(BR.c308);
    }

    @Bindable
    public String getC309() {
        return c309;
    }

    public void setC309(String c309) {
        this.c309 = c309;
        notifyPropertyChanged(BR.c309);
    }

    @Bindable
    public String getC310() {
        return c310;
    }

    public void setC310(String c310) {
        this.c310 = c310;
        setC310hx(c310.equals("1") ? this.c310hx : "");
        notifyPropertyChanged(BR.c310);
    }

    @Bindable
    public String getC310hx() {
        return c310hx;
    }

    public void setC310hx(String c310hx) {
        this.c310hx = c310hx;
        notifyPropertyChanged(BR.c310hx);
    }

    @Bindable
    public String getC311() {
        return c311;
    }

    public void setC311(String c311) {
        this.c311 = c311;
        setC311hx(c311.equals("2") ? this.c311hx : "");
        setC311dx(c311.equals("3") ? this.c311dx : "");
        notifyPropertyChanged(BR.c311);
    }


    @Bindable
    public String getC311hx() {
        return c311hx;
    }

    public void setC311hx(String c311hx) {
        this.c311hx = c311hx;
        notifyPropertyChanged(BR.c311hx);
    }


    @Bindable
    public String getC311dx() {
        return c311dx;
    }

    public void setC311dx(String c311dx) {
        this.c311dx = c311dx;
        notifyPropertyChanged(BR.c311dx);
    }

    @Bindable
    public String getC312() {
        return c312;
    }

    public void setC312(String c312) {
        this.c312 = c312;
        setC31301(c312.equals("1") ? this.c31301 : "");
        setC31302(c312.equals("1") ? this.c31302 : "");
        setC31303(c312.equals("1") ? this.c31303 : "");
        setC31304(c312.equals("1") ? this.c31304 : "");
        setC31305(c312.equals("1") ? this.c31305 : "");
        setC31306(c312.equals("1") ? this.c31306 : "");
        setC31396(c312.equals("1") ? this.c31396 : "");
        setC313998(c312.equals("1") ? this.c313998 : "");
        setC314(c312.equals("1") ? this.c314 : "");

        notifyPropertyChanged(BR.c312);
    }

    @Bindable
    public String getC31301() {
        return c31301;
    }

    public void setC31301(String c31301) {
        if (this.c31301.equals(c31301)) return;
        this.c31301 = c31301;
        setC313998(c31301.equals("1") ? "" : this.c313998);
        setC31302(c31301.equals("1") ? "" : this.c31302);
        setC31303(c31301.equals("1") ? "" : this.c31303);
        setC31304(c31301.equals("1") ? "" : this.c31304);
        setC31305(c31301.equals("1") ? "" : this.c31305);
        setC31306(c31301.equals("1") ? "" : this.c31306);
        setC31396(c31301.equals("1") ? "" : this.c31396);
        notifyPropertyChanged(BR.c31301);
    }

    @Bindable
    public String getC31302() {
        return c31302;
    }

    public void setC31302(String c31302) {
        if (this.c31302.equals(c31302)) return;
        this.c31302 = c31302;
        setC314(c31302.equals("2") ? this.c314 : "");
        notifyPropertyChanged(BR.c31302);
    }

    @Bindable
    public String getC31303() {
        return c31303;
    }

    public void setC31303(String c31303) {
        if (this.c31303.equals(c31303)) return;
        this.c31303 = c31303;
        notifyPropertyChanged(BR.c31303);
    }

    @Bindable
    public String getC31304() {
        return c31304;
    }

    public void setC31304(String c31304) {
        if (this.c31304.equals(c31304)) return;
        this.c31304 = c31304;
        notifyPropertyChanged(BR.c31304);
    }

    @Bindable
    public String getC31305() {
        return c31305;
    }

    public void setC31305(String c31305) {
        if (this.c31305.equals(c31305)) return;
        this.c31305 = c31305;
        notifyPropertyChanged(BR.c31305);
    }

    @Bindable
    public String getC31306() {
        return c31306;
    }

    public void setC31306(String c31306) {
        if (this.c31306.equals(c31306)) return;
        this.c31306 = c31306;
        notifyPropertyChanged(BR.c31306);
    }

    @Bindable
    public String getC31396() {
        return c31396;
    }

    public void setC31396(String c31396) {
        if (this.c31396.equals(c31396)) return;
        this.c31396 = c31396;
        setC31396x(c31396.equals("96") ? this.c31396x : "");
        notifyPropertyChanged(BR.c31396);
    }

    @Bindable
    public String getC313998() {
        return c313998;
    }

    public void setC313998(String c313998) {
        if (this.c313998.equals(c313998)) return;
        this.c313998 = c313998;
        setC31301(c313998.equals("998") ? "" : this.c31301);
        setC31302(c313998.equals("998") ? "" : this.c31302);
        setC31303(c313998.equals("998") ? "" : this.c31303);
        setC31304(c313998.equals("998") ? "" : this.c31304);
        setC31305(c313998.equals("998") ? "" : this.c31305);
        setC31306(c313998.equals("998") ? "" : this.c31306);
        setC31396(c313998.equals("998") ? "" : this.c31396);
        notifyPropertyChanged(BR.c313998);
    }


    @Bindable
    public String getC31396x() {
        return c31396x;
    }

    public void setC31396x(String c31396x) {
        this.c31396x = c31396x;
        notifyPropertyChanged(BR.c31396x);
    }

    @Bindable
    public String getC314() {
        return c314;
    }

    public void setC314(String c314) {
        this.c314 = c314;
        setC31401x(c314.equals("1") ? this.c31401x : "");
        setC31402x(c314.equals("2") ? this.c31402x : "");
        setC31496x(c314.equals("96") ? this.c31496x : "");
        notifyPropertyChanged(BR.c314);
    }

    @Bindable
    public String getC31401x() {
        return c31401x;
    }

    public void setC31401x(String c31401x) {
        this.c31401x = c31401x;
        notifyPropertyChanged(BR.c31401x);
    }

    @Bindable
    public String getC31402x() {
        return c31402x;
    }

    public void setC31402x(String c31402x) {
        this.c31402x = c31402x;
        notifyPropertyChanged(BR.c31402x);
    }

    @Bindable
    public String getC31496x() {
        return c31496x;
    }

    public void setC31496x(String c31496x) {
        this.c31496x = c31496x;
        notifyPropertyChanged(BR.c31496x);
    }

    @Bindable
    public String getC315() {
        return c315;
    }

    public void setC315(String c315) {
        this.c315 = c315;
        setC31601(c315.equals("1") ? this.c31601 : "");
        setC31602(c315.equals("1") ? this.c31602 : "");
        setC31603(c315.equals("1") ? this.c31603 : "");
        setC31604(c315.equals("1") ? this.c31604 : "");
        setC31605(c315.equals("1") ? this.c31605 : "");
        setC31606(c315.equals("1") ? this.c31606 : "");
        setC31607(c315.equals("1") ? this.c31607 : "");
        setC31608(c315.equals("1") ? this.c31608 : "");
        setC31696(c315.equals("1") ? this.c31696 : "");
        setC317(c315.equals("1") ? this.c317 : "");
        setC318(c315.equals("1") ? this.c318 : "");
        setC31901(c315.equals("1") ? this.c31901 : "");
        setC31902(c315.equals("1") ? this.c31902 : "");
        setC31903(c315.equals("1") ? this.c31903 : "");
        setC31904(c315.equals("1") ? this.c31904 : "");
        setC31905(c315.equals("1") ? this.c31905 : "");
        setC31906(c315.equals("1") ? this.c31906 : "");
        setC31907(c315.equals("1") ? this.c31907 : "");
        setC31908(c315.equals("1") ? this.c31908 : "");
        setC31909(c315.equals("1") ? this.c31909 : "");
        setC31996(c315.equals("1") ? this.c31996 : "");
        notifyPropertyChanged(BR.c315);
    }

    @Bindable
    public String getC316() {
        return c316;
    }

    public void setC316(String c316) {
        this.c316 = c316;
        notifyPropertyChanged(BR.c316);
    }

    @Bindable
    public String getC31601() {
        return c31601;
    }

    public void setC31601(String c31601) {
        if (this.c31601.equals(c31601)) return;
        this.c31601 = c31601;
        notifyPropertyChanged(BR.c31601);
    }

    @Bindable
    public String getC31602() {
        return c31602;
    }

    public void setC31602(String c31602) {
        if (this.c31602.equals(c31602)) return;
        this.c31602 = c31602;
        notifyPropertyChanged(BR.c31602);
    }

    @Bindable
    public String getC31603() {
        return c31603;
    }

    public void setC31603(String c31603) {
        if (this.c31603.equals(c31603)) return;
        this.c31603 = c31603;
        notifyPropertyChanged(BR.c31603);
    }

    @Bindable
    public String getC31604() {
        return c31604;
    }

    public void setC31604(String c31604) {
        if (this.c31604.equals(c31604)) return;
        this.c31604 = c31604;
        notifyPropertyChanged(BR.c31604);
    }

    @Bindable
    public String getC31605() {
        return c31605;
    }

    public void setC31605(String c31605) {
        if (this.c31605.equals(c31605)) return;
        this.c31605 = c31605;
        notifyPropertyChanged(BR.c31605);
    }

    @Bindable
    public String getC31606() {
        return c31606;
    }

    public void setC31606(String c31606) {
        if (this.c31606.equals(c31606)) return;
        this.c31606 = c31606;
        notifyPropertyChanged(BR.c31606);
    }

    @Bindable
    public String getC31607() {
        return c31607;
    }

    public void setC31607(String c31607) {
        if (this.c31607.equals(c31607)) return;
        this.c31607 = c31607;
        notifyPropertyChanged(BR.c31607);
    }

    @Bindable
    public String getC31608() {
        return c31608;
    }

    public void setC31608(String c31608) {
        if (this.c31608.equals(c31608)) return;
        this.c31608 = c31608;
        notifyPropertyChanged(BR.c31608);
    }

    @Bindable
    public String getC31696() {
        return c31696;
    }

    public void setC31696(String c31696) {
        if (this.c31696.equals(c31696)) return;
        this.c31696 = c31696;
        setC31696x(c31696.equals("96") ? this.c31696x : "");
        notifyPropertyChanged(BR.c31696);
    }

    @Bindable
    public String getC31696x() {
        return c31696x;
    }

    public void setC31696x(String c31696x) {
        this.c31696x = c31696x;
        notifyPropertyChanged(BR.c31696x);
    }

    @Bindable
    public String getC317() {
        return c317;
    }

    public void setC317(String c317) {
        this.c317 = c317;
        setC317hx(c317.equals("1") ? this.c317hx : "");
        setC317dx(c317.equals("2") ? this.c317dx : "");
        setC317wx(c317.equals("3") ? this.c317wx : "");
        notifyPropertyChanged(BR.c317);
    }

    @Bindable
    public String getC317hx() {
        return c317hx;
    }

    public void setC317hx(String c317hx) {
        this.c317hx = c317hx;
        notifyPropertyChanged(BR.c317hx);
    }

    @Bindable
    public String getC317dx() {
        return c317dx;
    }

    public void setC317dx(String c317dx) {
        this.c317dx = c317dx;
        notifyPropertyChanged(BR.c317dx);
    }

    @Bindable
    public String getC317wx() {
        return c317wx;
    }

    public void setC317wx(String c317wx) {
        this.c317wx = c317wx;
        notifyPropertyChanged(BR.c317wx);
    }

    @Bindable
    public String getC318() {
        return c318;
    }

    public void setC318(String c318) {
        this.c318 = c318;
        notifyPropertyChanged(BR.c318);
    }

    @Bindable
    public String getC319() {
        return c319;
    }

    public void setC319(String c319) {
        this.c319 = c319;
        notifyPropertyChanged(BR.c319);
    }

    @Bindable
    public String getC31901() {
        return c31901;
    }

    public void setC31901(String c31901) {
        if (this.c31901.equals(c31901)) return;
        this.c31901 = c31901;
        notifyPropertyChanged(BR.c31901);
    }

    @Bindable
    public String getC31902() {
        return c31902;
    }

    public void setC31902(String c31902) {
        if (this.c31902.equals(c31902)) return;
        this.c31902 = c31902;
        notifyPropertyChanged(BR.c31902);
    }

    @Bindable
    public String getC31903() {
        return c31903;
    }

    public void setC31903(String c31903) {
        if (this.c31903.equals(c31903)) return;
        this.c31903 = c31903;
        notifyPropertyChanged(BR.c31903);
    }

    @Bindable
    public String getC31904() {
        return c31904;
    }

    public void setC31904(String c31904) {
        if (this.c31904.equals(c31904)) return;
        this.c31904 = c31904;
        notifyPropertyChanged(BR.c31904);
    }

    @Bindable
    public String getC31905() {
        return c31905;
    }

    public void setC31905(String c31905) {
        if (this.c31905.equals(c31905)) return;
        this.c31905 = c31905;
        notifyPropertyChanged(BR.c31905);
    }

    @Bindable
    public String getC31906() {
        return c31906;
    }

    public void setC31906(String c31906) {
        if (this.c31906.equals(c31906)) return;
        this.c31906 = c31906;
        notifyPropertyChanged(BR.c31906);
    }

    @Bindable
    public String getC31907() {
        return c31907;
    }

    public void setC31907(String c31907) {
        if (this.c31907.equals(c31907)) return;
        this.c31907 = c31907;
        notifyPropertyChanged(BR.c31907);
    }

    @Bindable
    public String getC31908() {
        return c31908;
    }

    public void setC31908(String c31908) {
        if (this.c31908.equals(c31908)) return;
        this.c31908 = c31908;
        notifyPropertyChanged(BR.c31908);
    }

    @Bindable
    public String getC31909() {
        return c31909;
    }

    public void setC31909(String c31909) {
        if (this.c31909.equals(c31909)) return;
        this.c31909 = c31909;
        notifyPropertyChanged(BR.c31909);
    }

    @Bindable
    public String getC31996() {
        return c31996;
    }

    public void setC31996(String c31996) {
        if (this.c31996.equals(c31996)) return;
        this.c31996 = c31996;
        setC31996x(c31996.equals("96") ? this.c31996x : "");
        notifyPropertyChanged(BR.c31996);
    }

    @Bindable
    public String getC31996x() {
        return c31996x;
    }

    public void setC31996x(String c31996x) {
        this.c31996x = c31996x;
        notifyPropertyChanged(BR.c31996x);
    }

    @Bindable
    public String getC320() {
        return c320;
    }

    public void setC320(String c320) {
        this.c320 = c320;
        setC32101(c320.equals("1") ? this.c32101 : "");
        setC32102(c320.equals("1") ? this.c32102 : "");
        setC32103(c320.equals("1") ? this.c32103 : "");
        setC32104(c320.equals("1") ? this.c32104 : "");
        setC32105(c320.equals("1") ? this.c32105 : "");
        setC32106(c320.equals("1") ? this.c32106 : "");
        setC32107(c320.equals("1") ? this.c32107 : "");
        setC32108(c320.equals("1") ? this.c32108 : "");
        setC32196(c320.equals("1") ? this.c32196 : "");
        setC322(c320.equals("1") ? this.c322 : "");
        setC323(c320.equals("1") ? this.c323 : "");
        setC32401(c320.equals("1") ? this.c32401 : "");
        setC32402(c320.equals("1") ? this.c32402 : "");
        setC32403(c320.equals("1") ? this.c32403 : "");
        setC32404(c320.equals("1") ? this.c32404 : "");
        setC32405(c320.equals("1") ? this.c32405 : "");
        setC32496(c320.equals("1") ? this.c32496 : "");
        notifyPropertyChanged(BR.c320);
    }

    @Bindable
    public String getC321() {
        return c321;
    }

    public void setC321(String c321) {
        this.c321 = c321;
        notifyPropertyChanged(BR.c321);
    }

    @Bindable
    public String getC32101() {
        return c32101;
    }

    public void setC32101(String c32101) {
        if (this.c32101.equals(c32101)) return;
        this.c32101 = c32101;
        notifyPropertyChanged(BR.c32101);
    }

    @Bindable
    public String getC32102() {
        return c32102;
    }

    public void setC32102(String c32102) {
        if (this.c32102.equals(c32102)) return;
        this.c32102 = c32102;
        notifyPropertyChanged(BR.c32102);
    }

    @Bindable
    public String getC32103() {
        return c32103;
    }

    public void setC32103(String c32103) {
        if (this.c32103.equals(c32103)) return;
        this.c32103 = c32103;
        notifyPropertyChanged(BR.c32103);
    }

    @Bindable
    public String getC32104() {
        return c32104;
    }

    public void setC32104(String c32104) {
        if (this.c32104.equals(c32104)) return;
        this.c32104 = c32104;
        notifyPropertyChanged(BR.c32104);
    }

    @Bindable
    public String getC32105() {
        return c32105;
    }

    public void setC32105(String c32105) {
        if (this.c32105.equals(c32105)) return;
        this.c32105 = c32105;
        notifyPropertyChanged(BR.c32105);
    }

    @Bindable
    public String getC32106() {
        return c32106;
    }

    public void setC32106(String c32106) {
        if (this.c32106.equals(c32106)) return;
        this.c32106 = c32106;
        notifyPropertyChanged(BR.c32106);
    }

    @Bindable
    public String getC32107() {
        return c32107;
    }

    public void setC32107(String c32107) {
        if (this.c32107.equals(c32107)) return;
        this.c32107 = c32107;
        notifyPropertyChanged(BR.c32107);
    }

    @Bindable
    public String getC32108() {
        return c32108;
    }

    public void setC32108(String c32108) {
        if (this.c32108.equals(c32108)) return;
        this.c32108 = c32108;
        notifyPropertyChanged(BR.c32108);
    }

    @Bindable
    public String getC32196() {
        return c32196;
    }

    public void setC32196(String c32196) {
        if (this.c32196.equals(c32196)) return;
        this.c32196 = c32196;
        setC32196x(c32196.equals("96") ? this.c32196x : "");
        notifyPropertyChanged(BR.c32196);
    }

    @Bindable
    public String getC32196x() {
        return c32196x;
    }

    public void setC32196x(String c32196x) {
        this.c32196x = c32196x;
        notifyPropertyChanged(BR.c32196x);
    }

    @Bindable
    public String getC322() {
        return c322;
    }

    public void setC322(String c322) {
        this.c322 = c322;
        setC322hx(c322.equals("1") ? this.c322hx : "");
        setC322dx(c322.equals("2") ? this.c322dx : "");
        setC322wx(c322.equals("3") ? this.c322wx : "");
        notifyPropertyChanged(BR.c322);
    }

    @Bindable
    public String getC322hx() {
        return c322hx;
    }

    public void setC322hx(String c322hx) {
        this.c322hx = c322hx;
        notifyPropertyChanged(BR.c322hx);
    }

    @Bindable
    public String getC322dx() {
        return c322dx;
    }

    public void setC322dx(String c322dx) {
        this.c322dx = c322dx;
        notifyPropertyChanged(BR.c322dx);
    }

    @Bindable
    public String getC322wx() {
        return c322wx;
    }

    public void setC322wx(String c322wx) {
        this.c322wx = c322wx;
        notifyPropertyChanged(BR.c322wx);
    }

    @Bindable
    public String getC323() {
        return c323;
    }

    public void setC323(String c323) {
        this.c323 = c323;
        notifyPropertyChanged(BR.c323);
    }

    @Bindable
    public String getC324() {
        return c324;
    }

    public void setC324(String c324) {
        this.c324 = c324;
        notifyPropertyChanged(BR.c324);
    }

    @Bindable
    public String getC32401() {
        return c32401;
    }

    public void setC32401(String c32401) {
        if (this.c32401.equals(c32401)) return;
        this.c32401 = c32401;
        notifyPropertyChanged(BR.c32401);
    }

    @Bindable
    public String getC32402() {
        return c32402;
    }

    public void setC32402(String c32402) {
        if (this.c32402.equals(c32402)) return;
        this.c32402 = c32402;
        notifyPropertyChanged(BR.c32402);
    }

    @Bindable
    public String getC32403() {
        return c32403;
    }

    public void setC32403(String c32403) {
        if (this.c32403.equals(c32403)) return;
        this.c32403 = c32403;
        notifyPropertyChanged(BR.c32403);
    }

    @Bindable
    public String getC32404() {
        return c32404;
    }

    public void setC32404(String c32404) {
        if (this.c32404.equals(c32404)) return;
        this.c32404 = c32404;
        notifyPropertyChanged(BR.c32404);
    }

    @Bindable
    public String getC32405() {
        return c32405;
    }

    public void setC32405(String c32405) {
        if (this.c32405.equals(c32405)) return;
        this.c32405 = c32405;
        notifyPropertyChanged(BR.c32405);
    }

    @Bindable
    public String getC32496() {
        return c32496;
    }

    public void setC32496(String c32496) {
        if (this.c32496.equals(c32496)) return;
        this.c32496 = c32496;
        setC32496x(c32496.equals("96") ? this.c32496x : "");
        notifyPropertyChanged(BR.c32496);
    }

    @Bindable
    public String getC32496x() {
        return c32496x;
    }

    public void setC32496x(String c32496x) {
        this.c32496x = c32496x;
        notifyPropertyChanged(BR.c32496x);
    }

    @Bindable
    public String getC325() {
        return c325;
    }

    public void setC325(String c325) {
        this.c325 = c325;
        setC326(c325.equals("1") ? this.c326 : "");
        setC327(c325.equals("1") ? this.c327 : "");
        setC328(c325.equals("1") ? this.c328 : "");
        notifyPropertyChanged(BR.c325);
    }

    @Bindable
    public String getC326() {
        return c326;
    }

    public void setC326(String c326) {
        this.c326 = c326;
        setC32601x(c326.equals("1") ? this.c32601x : "");
        setC32602x(c326.equals("2") ? this.c32602x : "");
        notifyPropertyChanged(BR.c326);
    }

    @Bindable
    public String getC32601x() {
        return c32601x;
    }

    public void setC32601x(String c32601x) {
        this.c32601x = c32601x;
        notifyPropertyChanged(BR.c32601x);
    }

    @Bindable
    public String getC32602x() {
        return c32602x;
    }

    public void setC32602x(String c32602x) {
        this.c32602x = c32602x;
        notifyPropertyChanged(BR.c32602x);
    }

    @Bindable
    public String getC327() {
        return c327;
    }

    public void setC327(String c327) {
        this.c327 = c327;
        setC32701x(c327.equals("1") ? this.c32701x : "");
        setC32702x(c327.equals("2") ? this.c32702x : "");
        notifyPropertyChanged(BR.c327);
    }

    @Bindable
    public String getC32701x() {
        return c32701x;
    }

    public void setC32701x(String c32701x) {
        this.c32701x = c32701x;
        notifyPropertyChanged(BR.c32701x);
    }

    @Bindable
    public String getC32702x() {
        return c32702x;
    }

    public void setC32702x(String c32702x) {
        this.c32702x = c32702x;
        notifyPropertyChanged(BR.c32702x);
    }

    @Bindable
    public String getC328() {
        return c328;
    }

    public void setC328(String c328) {
        this.c328 = c328;
        setC32896x(c328.equals("96") ? this.c32896x : "");
        notifyPropertyChanged(BR.c328);
    }

    @Bindable
    public String getC32896x() {
        return c32896x;
    }

    public void setC32896x(String c32896x) {
        this.c32896x = c32896x;
        notifyPropertyChanged(BR.c32896x);
    }

    @Bindable
    public String getC329() {
        return c329;
    }

    public void setC329(String c329) {
        this.c329 = c329;
        setC330(c329.equals("1") ? this.c330 : "");
        setC33101(c329.equals("1") ? this.c33101 : "");
        setC33102(c329.equals("1") ? this.c33102 : "");
        setC33103(c329.equals("1") ? this.c33103 : "");
        setC33104(c329.equals("1") ? this.c33104 : "");
        setC33105(c329.equals("1") ? this.c33105 : "");
        setC33106(c329.equals("1") ? this.c33106 : "");
        setC33107(c329.equals("1") ? this.c33107 : "");
        setC33108(c329.equals("1") ? this.c33108 : "");
        setC33109(c329.equals("1") ? this.c33109 : "");
        setC33110(c329.equals("1") ? this.c33110 : "");
        setC33111(c329.equals("1") ? this.c33111 : "");
        setC33112(c329.equals("1") ? this.c33112 : "");
        setC33113(c329.equals("1") ? this.c33113 : "");
        setC33114(c329.equals("1") ? this.c33114 : "");
        setC33115(c329.equals("1") ? this.c33115 : "");
        setC33116(c329.equals("1") ? this.c33116 : "");
        setC33196(c329.equals("1") ? this.c33196 : "");
        notifyPropertyChanged(BR.c329);
    }

    @Bindable
    public String getC330() {
        return c330;
    }

    public void setC330(String c330) {
        this.c330 = c330;
        setC33101(c330.equals("1") ? this.c33101 : "");
        setC33102(c330.equals("1") ? this.c33102 : "");
        setC33103(c330.equals("1") ? this.c33103 : "");
        setC33104(c330.equals("1") ? this.c33104 : "");
        setC33105(c330.equals("1") ? this.c33105 : "");
        setC33106(c330.equals("1") ? this.c33106 : "");
        setC33107(c330.equals("1") ? this.c33107 : "");
        setC33108(c330.equals("1") ? this.c33108 : "");
        setC33109(c330.equals("1") ? this.c33109 : "");
        setC33110(c330.equals("1") ? this.c33110 : "");
        setC33111(c330.equals("1") ? this.c33111 : "");
        setC33112(c330.equals("1") ? this.c33112 : "");
        setC33113(c330.equals("1") ? this.c33113 : "");
        setC33114(c330.equals("1") ? this.c33114 : "");
        setC33115(c330.equals("1") ? this.c33115 : "");
        setC33116(c330.equals("1") ? this.c33116 : "");
        setC33196(c330.equals("1") ? this.c33196 : "");
        notifyPropertyChanged(BR.c330);
    }

    @Bindable
    public String getC331() {
        return c331;
    }

    public void setC331(String c331) {
        this.c331 = c331;
        notifyPropertyChanged(BR.c331);
    }

    @Bindable
    public String getC33101() {
        return c33101;
    }

    public void setC33101(String c33101) {
        if (this.c33101.equals(c33101)) return;
        this.c33101 = c33101;
        notifyPropertyChanged(BR.c33101);
    }

    @Bindable
    public String getC33102() {
        return c33102;
    }

    public void setC33102(String c33102) {
        if (this.c33102.equals(c33102)) return;
        this.c33102 = c33102;
        notifyPropertyChanged(BR.c33102);
    }

    @Bindable
    public String getC33103() {
        return c33103;
    }

    public void setC33103(String c33103) {
        if (this.c33103.equals(c33103)) return;
        this.c33103 = c33103;
        notifyPropertyChanged(BR.c33103);
    }

    @Bindable
    public String getC33104() {
        return c33104;
    }

    public void setC33104(String c33104) {
        if (this.c33104.equals(c33104)) return;
        this.c33104 = c33104;
        notifyPropertyChanged(BR.c33104);
    }

    @Bindable
    public String getC33105() {
        return c33105;
    }

    public void setC33105(String c33105) {
        if (this.c33105.equals(c33105)) return;
        this.c33105 = c33105;
        notifyPropertyChanged(BR.c33105);
    }

    @Bindable
    public String getC33106() {
        return c33106;
    }

    public void setC33106(String c33106) {
        if (this.c33106.equals(c33106)) return;
        this.c33106 = c33106;
        notifyPropertyChanged(BR.c33106);
    }

    @Bindable
    public String getC33107() {
        return c33107;
    }

    public void setC33107(String c33107) {
        if (this.c33107.equals(c33107)) return;
        this.c33107 = c33107;
        notifyPropertyChanged(BR.c33107);
    }

    @Bindable
    public String getC33108() {
        return c33108;
    }

    public void setC33108(String c33108) {
        if (this.c33108.equals(c33108)) return;
        this.c33108 = c33108;
        notifyPropertyChanged(BR.c33108);
    }

    @Bindable
    public String getC33109() {
        return c33109;
    }

    public void setC33109(String c33109) {
        if (this.c33109.equals(c33109)) return;
        this.c33109 = c33109;
        notifyPropertyChanged(BR.c33109);
    }

    @Bindable
    public String getC33110() {
        return c33110;
    }

    public void setC33110(String c33110) {
        if (this.c33110.equals(c33110)) return;
        this.c33110 = c33110;
        notifyPropertyChanged(BR.c33110);
    }

    @Bindable
    public String getC33111() {
        return c33111;
    }

    public void setC33111(String c33111) {
        if (this.c33111.equals(c33111)) return;
        this.c33111 = c33111;
        notifyPropertyChanged(BR.c33111);
    }

    @Bindable
    public String getC33112() {
        return c33112;
    }

    public void setC33112(String c33112) {
        if (this.c33112.equals(c33112)) return;
        this.c33112 = c33112;
        notifyPropertyChanged(BR.c33112);
    }

    @Bindable
    public String getC33113() {
        return c33113;
    }

    public void setC33113(String c33113) {
        if (this.c33113.equals(c33113)) return;
        this.c33113 = c33113;
        notifyPropertyChanged(BR.c33113);
    }

    @Bindable
    public String getC33114() {
        return c33114;
    }

    public void setC33114(String c33114) {
        if (this.c33114.equals(c33114)) return;
        this.c33114 = c33114;
        notifyPropertyChanged(BR.c33114);
    }

    @Bindable
    public String getC33115() {
        return c33115;
    }

    public void setC33115(String c33115) {
        if (this.c33115.equals(c33115)) return;
        this.c33115 = c33115;
        notifyPropertyChanged(BR.c33115);
    }

    @Bindable
    public String getC33116() {
        return c33116;
    }

    public void setC33116(String c33116) {
        if (this.c33116.equals(c33116)) return;
        this.c33116 = c33116;
        notifyPropertyChanged(BR.c33116);
    }

    @Bindable
    public String getC33196() {
        return c33196;
    }

    public void setC33196(String c33196) {
        if (this.c33196.equals(c33196)) return;
        this.c33196 = c33196;
        setC33196x(c33196.equals("96") ? this.c33196x : "");
        notifyPropertyChanged(BR.c33196);
    }

    @Bindable
    public String getC33196x() {
        return c33196x;
    }

    public void setC33196x(String c33196x) {
        this.c33196x = c33196x;
        notifyPropertyChanged(BR.c33196x);
    }

    @Bindable
    public String getC401() {
        return c401;
    }

    public void setC401(String c401) {
        this.c401 = c401;
        setC402(c401.equals("1") ? this.c402 : "");
        setC40301(c401.equals("1") ? this.c40301 : "");
        setC40302(c401.equals("1") ? this.c40302 : "");
        setC40303(c401.equals("1") ? this.c40303 : "");
        setC40304(c401.equals("1") ? this.c40304 : "");
        setC40305(c401.equals("1") ? this.c40305 : "");
        setC40306(c401.equals("1") ? this.c40306 : "");
        setC40307(c401.equals("1") ? this.c40307 : "");
        setC40308(c401.equals("1") ? this.c40308 : "");
        setC40309(c401.equals("1") ? this.c40309 : "");
        setC40310(c401.equals("1") ? this.c40310 : "");
        setC40311(c401.equals("1") ? this.c40311 : "");
        setC40396(c401.equals("1") ? this.c40396 : "");
        setC404(c401.equals("1") ? this.c404 : "");
        setC405(c401.equals("1") ? this.c405 : "");
        setC406(c401.equals("1") ? this.c406 : "");
        notifyPropertyChanged(BR.c401);
    }

    @Bindable
    public String getC402() {
        return c402;
    }

    public void setC402(String c402) {
        this.c402 = c402;
        setC40296x(c402.equals("96") ? this.c40296x : "");
        setC40301(c402.equals("6") ? "" : this.c40301);
        setC40302(c402.equals("6") ? "" : this.c40302);
        setC40303(c402.equals("6") ? "" : this.c40303);
        setC40304(c402.equals("6") ? "" : this.c40304);
        setC40305(c402.equals("6") ? "" : this.c40305);
        setC40306(c402.equals("6") ? "" : this.c40306);
        setC40307(c402.equals("6") ? "" : this.c40307);
        setC40308(c402.equals("6") ? "" : this.c40308);
        setC40309(c402.equals("6") ? "" : this.c40309);
        setC40310(c402.equals("6") ? "" : this.c40310);
        setC40311(c402.equals("6") ? "" : this.c40311);
        setC40396(c402.equals("6") ? "" : this.c40396);
        notifyPropertyChanged(BR.c402);
    }

    @Bindable
    public String getC40296x() {
        return c40296x;
    }

    public void setC40296x(String c40296x) {
        this.c40296x = c40296x;
        notifyPropertyChanged(BR.c40296x);
    }

    @Bindable
    public String getC403() {
        return c403;
    }

    public void setC403(String c403) {
        this.c403 = c403;
        notifyPropertyChanged(BR.c403);
    }

    @Bindable
    public String getC40301() {
        return c40301;
    }

    public void setC40301(String c40301) {
        if (this.c40301.equals(c40301)) return;
        this.c40301 = c40301;
        notifyPropertyChanged(BR.c40301);
    }

    @Bindable
    public String getC40302() {
        return c40302;
    }

    public void setC40302(String c40302) {
        if (this.c40302.equals(c40302)) return;
        this.c40302 = c40302;
        notifyPropertyChanged(BR.c40302);
    }

    @Bindable
    public String getC40303() {
        return c40303;
    }

    public void setC40303(String c40303) {
        if (this.c40303.equals(c40303)) return;
        this.c40303 = c40303;
        notifyPropertyChanged(BR.c40303);
    }

    @Bindable
    public String getC40304() {
        return c40304;
    }

    public void setC40304(String c40304) {
        if (this.c40304.equals(c40304)) return;
        this.c40304 = c40304;
        notifyPropertyChanged(BR.c40304);
    }

    @Bindable
    public String getC40305() {
        return c40305;
    }

    public void setC40305(String c40305) {
        if (this.c40305.equals(c40305)) return;
        this.c40305 = c40305;
        notifyPropertyChanged(BR.c40305);
    }

    @Bindable
    public String getC40306() {
        return c40306;
    }

    public void setC40306(String c40306) {
        if (this.c40306.equals(c40306)) return;
        this.c40306 = c40306;
        notifyPropertyChanged(BR.c40306);
    }

    @Bindable
    public String getC40307() {
        return c40307;
    }

    public void setC40307(String c40307) {
        if (this.c40307.equals(c40307)) return;
        this.c40307 = c40307;
        notifyPropertyChanged(BR.c40307);
    }

    @Bindable
    public String getC40308() {
        return c40308;
    }

    public void setC40308(String c40308) {
        if (this.c40308.equals(c40308)) return;
        this.c40308 = c40308;
        notifyPropertyChanged(BR.c40308);
    }

    @Bindable
    public String getC40309() {
        return c40309;
    }

    public void setC40309(String c40309) {
        if (this.c40309.equals(c40309)) return;
        this.c40309 = c40309;
        notifyPropertyChanged(BR.c40309);
    }

    @Bindable
    public String getC40310() {
        return c40310;
    }

    public void setC40310(String c40310) {
        if (this.c40310.equals(c40310)) return;
        this.c40310 = c40310;
        notifyPropertyChanged(BR.c40310);
    }

    @Bindable
    public String getC40311() {
        return c40311;
    }

    public void setC40311(String c40311) {
        if (this.c40311.equals(c40311)) return;
        this.c40311 = c40311;
        notifyPropertyChanged(BR.c40311);
    }

    @Bindable
    public String getC40396() {
        return c40396;
    }

    public void setC40396(String c40396) {
        if (this.c40396.equals(c40396)) return;
        this.c40396 = c40396;
        setC40396x(c40396.equals("96") ? this.c40396x : "");
        notifyPropertyChanged(BR.c40396);
    }

    @Bindable
    public String getC40396x() {
        return c40396x;
    }

    public void setC40396x(String c40396x) {
        this.c40396x = c40396x;
        notifyPropertyChanged(BR.c40396x);
    }

    @Bindable
    public String getC404() {
        return c404;
    }

    public void setC404(String c404) {
        this.c404 = c404;
        setC40401x(c404.equals("1") ? this.c40401x : "");
        setC405(c404.equals("998") ? "" : this.c405);
        setC406(c404.equals("998") ? "" : this.c406);
        notifyPropertyChanged(BR.c404);
    }

    @Bindable
    public String getC40401x() {
        return c40401x;
    }

    public void setC40401x(String c40401x) {
        this.c40401x = c40401x;
        notifyPropertyChanged(BR.c40401x);
    }

    @Bindable
    public String getC405() {
        return c405;
    }

    public void setC405(String c405) {
        this.c405 = c405;
        setC406(c405.equals("1") ? this.c406 : "");
        notifyPropertyChanged(BR.c405);
    }

    @Bindable
    public String getC406() {
        return c406;
    }

    public void setC406(String c406) {
        this.c406 = c406;
        setC40696x(c406.equals("96") ? this.c40696x : "");
        notifyPropertyChanged(BR.c406);
    }

    @Bindable
    public String getC40696x() {
        return c40696x;
    }

    public void setC40696x(String c40696x) {
        this.c40696x = c40696x;
        notifyPropertyChanged(BR.c40696x);
    }

    @Bindable
    public String getC501() {
        return c501;
    }

    public void setC501(String c501) {
        this.c501 = c501;
        setC5011(c501.equals("2") ? "" : this.c5011);
        setC5012(c501.equals("2") ? "" : this.c5012);
        setC5013(c501.equals("2") ? "" : this.c5013);
        setC505(c501.equals("1") || this.c502.equals("1") || this.c503.equals("1") || this.c504.equals("1") ? this.c505 : "");
        notifyPropertyChanged(BR.c501);
    }

    @Bindable
    public String getC5011() {
        return c5011;
    }

    public void setC5011(String c5011) {
        this.c5011 = c5011;
        notifyPropertyChanged(BR.c5011);
    }

    @Bindable
    public String getC5012() {
        return c5012;
    }

    public void setC5012(String c5012) {
        this.c5012 = c5012;
        notifyPropertyChanged(BR.c5012);
    }

    @Bindable
    public String getC5013() {
        return c5013;
    }

    public void setC5013(String c5013) {
        this.c5013 = c5013;
        notifyPropertyChanged(BR.c5013);
    }

    @Bindable
    public String getC502() {
        return c502;
    }

    public void setC502(String c502) {
        this.c502 = c502;
        setC5021(c502.equals("2") ? "" : this.c5021);
        setC5022(c502.equals("2") ? "" : this.c5022);
        setC5023(c502.equals("2") ? "" : this.c5023);
        setC505(c502.equals("1") || this.c501.equals("1") || this.c503.equals("1") || this.c504.equals("1") ? this.c505 : "");
        notifyPropertyChanged(BR.c502);
    }

    @Bindable
    public String getC5021() {
        return c5021;
    }

    public void setC5021(String c5021) {
        this.c5021 = c5021;
        notifyPropertyChanged(BR.c5021);
    }

    @Bindable
    public String getC5022() {
        return c5022;
    }

    public void setC5022(String c5022) {
        this.c5022 = c5022;
        notifyPropertyChanged(BR.c5022);
    }

    @Bindable
    public String getC5023() {
        return c5023;
    }

    public void setC5023(String c5023) {
        this.c5023 = c5023;
        notifyPropertyChanged(BR.c5023);
    }

    @Bindable
    public String getC503() {
        return c503;
    }

    public void setC503(String c503) {
        this.c503 = c503;
        setC5031(c503.equals("2") ? "" : this.c5031);
        setC5032(c503.equals("2") ? "" : this.c5032);
        setC5033(c503.equals("2") ? "" : this.c5033);
        setC505(c503.equals("1") || this.c501.equals("1") || this.c502.equals("1") || this.c504.equals("1") ? this.c505 : "");
        notifyPropertyChanged(BR.c503);
    }

    @Bindable
    public String getC5031() {
        return c5031;
    }

    public void setC5031(String c5031) {
        this.c5031 = c5031;
        notifyPropertyChanged(BR.c5031);
    }

    @Bindable
    public String getC5032() {
        return c5032;
    }

    public void setC5032(String c5032) {
        this.c5032 = c5032;
        notifyPropertyChanged(BR.c5032);
    }

    @Bindable
    public String getC5033() {
        return c5033;
    }

    public void setC5033(String c5033) {
        this.c5033 = c5033;
        notifyPropertyChanged(BR.c5033);
    }

    @Bindable
    public String getC504() {
        return c504;
    }

    public void setC504(String c504) {
        this.c504 = c504;
        setC50496x(c504.equals("2") ? "" : this.c50496x);
        setC5041(c504.equals("2") ? "" : this.c5041);
        setC5042(c504.equals("2") ? "" : this.c5042);
        setC5043(c504.equals("2") ? "" : this.c5043);
        setC505(c504.equals("1") || this.c501.equals("1") || this.c502.equals("1") || this.c503.equals("1") ? this.c505 : "");
        notifyPropertyChanged(BR.c504);
    }

    @Bindable
    public String getC50496x() {
        return c50496x;
    }

    public void setC50496x(String c50496x) {
        this.c50496x = c50496x;
        notifyPropertyChanged(BR.c50496x);
    }

    @Bindable
    public String getC5041() {
        return c5041;
    }

    public void setC5041(String c5041) {
        this.c5041 = c5041;
        notifyPropertyChanged(BR.c5041);
    }

    @Bindable
    public String getC5042() {
        return c5042;
    }

    public void setC5042(String c5042) {
        this.c5042 = c5042;
        notifyPropertyChanged(BR.c5042);
    }

    @Bindable
    public String getC5043() {
        return c5043;
    }

    public void setC5043(String c5043) {
        this.c5043 = c5043;
        notifyPropertyChanged(BR.c5043);
    }

    @Bindable
    public String getC505() {
        return c505;
    }

    public void setC505(String c505) {
        this.c505 = c505;
        setC50596x(c505.equals("96") ? this.c50596x : "");
        notifyPropertyChanged(BR.c505);
    }

    @Bindable
    public String getC50596x() {
        return c50596x;
    }

    public void setC50596x(String c50596x) {
        this.c50596x = c50596x;
        notifyPropertyChanged(BR.c50596x);
    }

    @Bindable
    public String getC60101() {
        return c60101;
    }

    public void setC60101(String c60101) {
        if (this.c60101.equals(c60101)) return;
        this.c60101 = c60101;
        notifyPropertyChanged(BR.c60101);
    }

    @Bindable
    public String getC60102() {
        return c60102;
    }

    public void setC60102(String c60102) {
        if (this.c60102.equals(c60102)) return;
        this.c60102 = c60102;
        notifyPropertyChanged(BR.c60102);
    }

    @Bindable
    public String getC60103() {
        return c60103;
    }

    public void setC60103(String c60103) {
        if (this.c60103.equals(c60103)) return;
        this.c60103 = c60103;
        notifyPropertyChanged(BR.c60103);
    }

    @Bindable
    public String getC60104() {
        return c60104;
    }

    public void setC60104(String c60104) {
        if (this.c60104.equals(c60104)) return;
        this.c60104 = c60104;
        notifyPropertyChanged(BR.c60104);
    }

    @Bindable
    public String getC60105() {
        return c60105;
    }

    public void setC60105(String c60105) {
        if (this.c60105.equals(c60105)) return;
        this.c60105 = c60105;
        notifyPropertyChanged(BR.c60105);
    }

    @Bindable
    public String getC60106() {
        return c60106;
    }

    public void setC60106(String c60106) {
        if (this.c60106.equals(c60106)) return;
        this.c60106 = c60106;
        notifyPropertyChanged(BR.c60106);
    }

    @Bindable
    public String getC60107() {
        return c60107;
    }

    public void setC60107(String c60107) {
        if (this.c60107.equals(c60107)) return;
        this.c60107 = c60107;
        notifyPropertyChanged(BR.c60107);
    }

    @Bindable
    public String getC60197() {
        return c60197;
    }

    public void setC60197(String c60197) {
        if (this.c60197.equals(c60197)) return;
        this.c60197 = c60197;
        setC60101(c60197.equals("97") ? "" : this.c60101);
        setC60102(c60197.equals("97") ? "" : this.c60102);
        setC60103(c60197.equals("97") ? "" : this.c60103);
        setC60104(c60197.equals("97") ? "" : this.c60104);
        setC60105(c60197.equals("97") ? "" : this.c60105);
        setC60106(c60197.equals("97") ? "" : this.c60106);
        setC60107(c60197.equals("97") ? "" : this.c60107);
        notifyPropertyChanged(BR.c60197);
    }

    @Bindable
    public String getC60201() {
        return c60201;
    }

    public void setC60201(String c60201) {
        if (this.c60201.equals(c60201)) return;
        this.c60201 = c60201;
        notifyPropertyChanged(BR.c60201);
    }

    @Bindable
    public String getC60202() {
        return c60202;
    }

    public void setC60202(String c60202) {
        if (this.c60202.equals(c60202)) return;
        this.c60202 = c60202;
        notifyPropertyChanged(BR.c60202);
    }

    @Bindable
    public String getC60203() {
        return c60203;
    }

    public void setC60203(String c60203) {
        if (this.c60203.equals(c60203)) return;
        this.c60203 = c60203;
        notifyPropertyChanged(BR.c60203);
    }

    @Bindable
    public String getC60204() {
        return c60204;
    }

    public void setC60204(String c60204) {
        if (this.c60204.equals(c60204)) return;
        this.c60204 = c60204;
        notifyPropertyChanged(BR.c60204);
    }

    @Bindable
    public String getC60205() {
        return c60205;
    }

    public void setC60205(String c60205) {
        if (this.c60205.equals(c60205)) return;
        this.c60205 = c60205;
        notifyPropertyChanged(BR.c60205);
    }

    @Bindable
    public String getC60206() {
        return c60206;
    }

    public void setC60206(String c60206) {
        if (this.c60206.equals(c60206)) return;
        this.c60206 = c60206;
        notifyPropertyChanged(BR.c60206);
    }

    @Bindable
    public String getC60207() {
        return c60207;
    }

    public void setC60207(String c60207) {
        if (this.c60207.equals(c60207)) return;
        this.c60207 = c60207;
        notifyPropertyChanged(BR.c60207);
    }

    @Bindable
    public String getC60297() {
        return c60297;
    }

    public void setC60297(String c60297) {
        if (this.c60297.equals(c60297)) return;
        this.c60297 = c60297;
        setC60201(c60297.equals("97") ? "" : this.c60201);
        setC60202(c60297.equals("97") ? "" : this.c60202);
        setC60203(c60297.equals("97") ? "" : this.c60203);
        setC60204(c60297.equals("97") ? "" : this.c60204);
        setC60205(c60297.equals("97") ? "" : this.c60205);
        setC60206(c60297.equals("97") ? "" : this.c60206);
        setC60207(c60297.equals("97") ? "" : this.c60207);
        notifyPropertyChanged(BR.c60297);
    }

    @Bindable
    public String getC60301() {
        return c60301;
    }

    public void setC60301(String c60301) {
        if (this.c60301.equals(c60301)) return;
        this.c60301 = c60301;
        notifyPropertyChanged(BR.c60301);
    }

    @Bindable
    public String getC60302() {
        return c60302;
    }

    public void setC60302(String c60302) {
        if (this.c60302.equals(c60302)) return;
        this.c60302 = c60302;
        notifyPropertyChanged(BR.c60302);
    }

    @Bindable
    public String getC60303() {
        return c60303;
    }

    public void setC60303(String c60303) {
        if (this.c60303.equals(c60303)) return;
        this.c60303 = c60303;
        notifyPropertyChanged(BR.c60303);
    }

    @Bindable
    public String getC60304() {
        return c60304;
    }

    public void setC60304(String c60304) {
        if (this.c60304.equals(c60304)) return;
        this.c60304 = c60304;
        notifyPropertyChanged(BR.c60304);
    }

    @Bindable
    public String getC60305() {
        return c60305;
    }

    public void setC60305(String c60305) {
        if (this.c60305.equals(c60305)) return;
        this.c60305 = c60305;
        notifyPropertyChanged(BR.c60305);
    }

    @Bindable
    public String getC60306() {
        return c60306;
    }

    public void setC60306(String c60306) {
        if (this.c60306.equals(c60306)) return;
        this.c60306 = c60306;
        notifyPropertyChanged(BR.c60306);
    }

    @Bindable
    public String getC60307() {
        return c60307;
    }

    public void setC60307(String c60307) {
        if (this.c60307.equals(c60307)) return;
        this.c60307 = c60307;
        notifyPropertyChanged(BR.c60307);
    }

    @Bindable
    public String getC60397() {
        return c60397;
    }

    public void setC60397(String c60397) {
        if (this.c60397.equals(c60397)) return;
        this.c60397 = c60397;
        setC60301(c60397.equals("97") ? "" : this.c60301);
        setC60302(c60397.equals("97") ? "" : this.c60302);
        setC60303(c60397.equals("97") ? "" : this.c60303);
        setC60304(c60397.equals("97") ? "" : this.c60304);
        setC60305(c60397.equals("97") ? "" : this.c60305);
        setC60306(c60397.equals("97") ? "" : this.c60306);
        setC60307(c60397.equals("97") ? "" : this.c60307);
        notifyPropertyChanged(BR.c60397);
    }

    @Bindable
    public String getC60401() {
        return c60401;
    }

    public void setC60401(String c60401) {
        if (this.c60401.equals(c60401)) return;
        this.c60401 = c60401;
        notifyPropertyChanged(BR.c60401);
    }

    @Bindable
    public String getC60402() {
        return c60402;
    }

    public void setC60402(String c60402) {
        if (this.c60402.equals(c60402)) return;
        this.c60402 = c60402;
        notifyPropertyChanged(BR.c60402);
    }

    @Bindable
    public String getC60403() {
        return c60403;
    }

    public void setC60403(String c60403) {
        if (this.c60403.equals(c60403)) return;
        this.c60403 = c60403;
        notifyPropertyChanged(BR.c60403);
    }

    @Bindable
    public String getC60404() {
        return c60404;
    }

    public void setC60404(String c60404) {
        if (this.c60404.equals(c60404)) return;
        this.c60404 = c60404;
        notifyPropertyChanged(BR.c60404);
    }

    @Bindable
    public String getC60405() {
        return c60405;
    }

    public void setC60405(String c60405) {
        if (this.c60405.equals(c60405)) return;
        this.c60405 = c60405;
        notifyPropertyChanged(BR.c60405);
    }

    @Bindable
    public String getC60406() {
        return c60406;
    }

    public void setC60406(String c60406) {
        if (this.c60406.equals(c60406)) return;
        this.c60406 = c60406;
        notifyPropertyChanged(BR.c60406);
    }

    @Bindable
    public String getC60407() {
        return c60407;
    }

    public void setC60407(String c60407) {
        if (this.c60407.equals(c60407)) return;
        this.c60407 = c60407;
        notifyPropertyChanged(BR.c60407);
    }

    @Bindable
    public String getC60497() {
        return c60497;
    }

    public void setC60497(String c60497) {
        if (this.c60497.equals(c60497)) return;
        this.c60497 = c60497;
        setC60401(c60497.equals("97") ? "" : this.c60401);
        setC60402(c60497.equals("97") ? "" : this.c60402);
        setC60403(c60497.equals("97") ? "" : this.c60403);
        setC60404(c60497.equals("97") ? "" : this.c60404);
        setC60405(c60497.equals("97") ? "" : this.c60405);
        setC60406(c60497.equals("97") ? "" : this.c60406);
        setC60407(c60497.equals("97") ? "" : this.c60407);
        notifyPropertyChanged(BR.c60497);
    }

    @Bindable
    public String getC60501() {
        return c60501;
    }

    public void setC60501(String c60501) {
        if (this.c60501.equals(c60501)) return;
        this.c60501 = c60501;
        notifyPropertyChanged(BR.c60501);
    }

    @Bindable
    public String getC60502() {
        return c60502;
    }

    public void setC60502(String c60502) {
        if (this.c60502.equals(c60502)) return;
        this.c60502 = c60502;
        notifyPropertyChanged(BR.c60502);
    }

    @Bindable
    public String getC60503() {
        return c60503;
    }

    public void setC60503(String c60503) {
        if (this.c60503.equals(c60503)) return;
        this.c60503 = c60503;
        notifyPropertyChanged(BR.c60503);
    }

    @Bindable
    public String getC60504() {
        return c60504;
    }

    public void setC60504(String c60504) {
        if (this.c60504.equals(c60504)) return;
        this.c60504 = c60504;
        notifyPropertyChanged(BR.c60504);
    }

    @Bindable
    public String getC60505() {
        return c60505;
    }

    public void setC60505(String c60505) {
        if (this.c60505.equals(c60505)) return;
        this.c60505 = c60505;
        notifyPropertyChanged(BR.c60505);
    }

    @Bindable
    public String getC60506() {
        return c60506;
    }

    public void setC60506(String c60506) {
        if (this.c60506.equals(c60506)) return;
        this.c60506 = c60506;
        notifyPropertyChanged(BR.c60506);
    }

    @Bindable
    public String getC60507() {
        return c60507;
    }

    public void setC60507(String c60507) {
        if (this.c60507.equals(c60507)) return;
        this.c60507 = c60507;
        notifyPropertyChanged(BR.c60507);
    }

    @Bindable
    public String getC60597() {
        return c60597;
    }

    public void setC60597(String c60597) {
        if (this.c60597.equals(c60597)) return;
        this.c60597 = c60597;
        setC60501(c60597.equals("97") ? "" : this.c60501);
        setC60502(c60597.equals("97") ? "" : this.c60502);
        setC60503(c60597.equals("97") ? "" : this.c60503);
        setC60504(c60597.equals("97") ? "" : this.c60504);
        setC60505(c60597.equals("97") ? "" : this.c60505);
        setC60506(c60597.equals("97") ? "" : this.c60506);
        setC60507(c60597.equals("97") ? "" : this.c60507);
        notifyPropertyChanged(BR.c60597);
    }

    @Bindable
    public String getC60601() {
        return c60601;
    }

    public void setC60601(String c60601) {
        if (this.c60601.equals(c60601)) return;
        this.c60601 = c60601;
        notifyPropertyChanged(BR.c60601);
    }

    @Bindable
    public String getC60602() {
        return c60602;
    }

    public void setC60602(String c60602) {
        if (this.c60602.equals(c60602)) return;
        this.c60602 = c60602;
        notifyPropertyChanged(BR.c60602);
    }

    @Bindable
    public String getC60603() {
        return c60603;
    }

    public void setC60603(String c60603) {
        if (this.c60603.equals(c60603)) return;
        this.c60603 = c60603;
        notifyPropertyChanged(BR.c60603);
    }

    @Bindable
    public String getC60604() {
        return c60604;
    }

    public void setC60604(String c60604) {
        if (this.c60604.equals(c60604)) return;
        this.c60604 = c60604;
        notifyPropertyChanged(BR.c60604);
    }

    @Bindable
    public String getC60605() {
        return c60605;
    }

    public void setC60605(String c60605) {
        if (this.c60605.equals(c60605)) return;
        this.c60605 = c60605;
        notifyPropertyChanged(BR.c60605);
    }

    @Bindable
    public String getC60606() {
        return c60606;
    }

    public void setC60606(String c60606) {
        if (this.c60606.equals(c60606)) return;
        this.c60606 = c60606;
        notifyPropertyChanged(BR.c60606);
    }

    @Bindable
    public String getC60607() {
        return c60607;
    }

    public void setC60607(String c60607) {
        if (this.c60607.equals(c60607)) return;
        this.c60607 = c60607;
        notifyPropertyChanged(BR.c60607);
    }

    @Bindable
    public String getC60697() {
        return c60697;
    }

    public void setC60697(String c60697) {
        if (this.c60697.equals(c60697)) return;
        this.c60697 = c60697;
        setC60601(c60697.equals("97") ? "" : this.c60601);
        setC60602(c60697.equals("97") ? "" : this.c60602);
        setC60603(c60697.equals("97") ? "" : this.c60603);
        setC60604(c60697.equals("97") ? "" : this.c60604);
        setC60605(c60697.equals("97") ? "" : this.c60605);
        setC60606(c60697.equals("97") ? "" : this.c60606);
        setC60607(c60697.equals("97") ? "" : this.c60607);
        notifyPropertyChanged(BR.c60697);
    }

    @Bindable
    public String getC60701() {
        return c60701;
    }

    public void setC60701(String c60701) {
        if (this.c60701.equals(c60701)) return;
        this.c60701 = c60701;
        notifyPropertyChanged(BR.c60701);
    }

    @Bindable
    public String getC60702() {
        return c60702;
    }

    public void setC60702(String c60702) {
        if (this.c60702.equals(c60702)) return;
        this.c60702 = c60702;
        notifyPropertyChanged(BR.c60702);
    }

    @Bindable
    public String getC60703() {
        return c60703;
    }

    public void setC60703(String c60703) {
        if (this.c60703.equals(c60703)) return;
        this.c60703 = c60703;
        notifyPropertyChanged(BR.c60703);
    }

    @Bindable
    public String getC60704() {
        return c60704;
    }

    public void setC60704(String c60704) {
        if (this.c60704.equals(c60704)) return;
        this.c60704 = c60704;
        notifyPropertyChanged(BR.c60704);
    }

    @Bindable
    public String getC60705() {
        return c60705;
    }

    public void setC60705(String c60705) {
        if (this.c60705.equals(c60705)) return;
        this.c60705 = c60705;
        notifyPropertyChanged(BR.c60705);
    }

    @Bindable
    public String getC60706() {
        return c60706;
    }

    public void setC60706(String c60706) {
        if (this.c60706.equals(c60706)) return;
        this.c60706 = c60706;
        notifyPropertyChanged(BR.c60706);
    }

    @Bindable
    public String getC60707() {
        return c60707;
    }

    public void setC60707(String c60707) {
        if (this.c60707.equals(c60707)) return;
        this.c60707 = c60707;
        notifyPropertyChanged(BR.c60707);
    }

    @Bindable
    public String getC60797() {
        return c60797;
    }

    public void setC60797(String c60797) {
        if (this.c60797.equals(c60797)) return;
        this.c60797 = c60797;
        setC60701(c60797.equals("97") ? "" : this.c60701);
        setC60702(c60797.equals("97") ? "" : this.c60702);
        setC60703(c60797.equals("97") ? "" : this.c60703);
        setC60704(c60797.equals("97") ? "" : this.c60704);
        setC60705(c60797.equals("97") ? "" : this.c60705);
        setC60706(c60797.equals("97") ? "" : this.c60706);
        setC60707(c60797.equals("97") ? "" : this.c60707);
        notifyPropertyChanged(BR.c60797);
    }

    @Bindable
    public String getC60801() {
        return c60801;
    }

    public void setC60801(String c60801) {
        if (this.c60801.equals(c60801)) return;
        this.c60801 = c60801;
        notifyPropertyChanged(BR.c60801);
    }

    @Bindable
    public String getC60802() {
        return c60802;
    }

    public void setC60802(String c60802) {
        if (this.c60802.equals(c60802)) return;
        this.c60802 = c60802;
        notifyPropertyChanged(BR.c60802);
    }

    @Bindable
    public String getC60803() {
        return c60803;
    }

    public void setC60803(String c60803) {
        if (this.c60803.equals(c60803)) return;
        this.c60803 = c60803;
        notifyPropertyChanged(BR.c60803);
    }

    @Bindable
    public String getC60804() {
        return c60804;
    }

    public void setC60804(String c60804) {
        if (this.c60804.equals(c60804)) return;
        this.c60804 = c60804;
        notifyPropertyChanged(BR.c60804);
    }

    @Bindable
    public String getC60805() {
        return c60805;
    }

    public void setC60805(String c60805) {
        if (this.c60805.equals(c60805)) return;
        this.c60805 = c60805;
        notifyPropertyChanged(BR.c60805);
    }

    @Bindable
    public String getC60806() {
        return c60806;
    }

    public void setC60806(String c60806) {
        if (this.c60806.equals(c60806)) return;
        this.c60806 = c60806;
        notifyPropertyChanged(BR.c60806);
    }

    @Bindable
    public String getC60807() {
        return c60807;
    }

    public void setC60807(String c60807) {
        if (this.c60807.equals(c60807)) return;
        this.c60807 = c60807;
        notifyPropertyChanged(BR.c60807);
    }

    @Bindable
    public String getC60897() {
        return c60897;
    }

    public void setC60897(String c60897) {
        if (this.c60897.equals(c60897)) return;
        this.c60897 = c60897;
        setC60801(c60897.equals("97") ? "" : this.c60801);
        setC60802(c60897.equals("97") ? "" : this.c60802);
        setC60803(c60897.equals("97") ? "" : this.c60803);
        setC60804(c60897.equals("97") ? "" : this.c60804);
        setC60805(c60897.equals("97") ? "" : this.c60805);
        setC60806(c60897.equals("97") ? "" : this.c60806);
        setC60807(c60897.equals("97") ? "" : this.c60807);
        notifyPropertyChanged(BR.c60897);
    }

    @Bindable
    public String getC60901() {
        return c60901;
    }

    public void setC60901(String c60901) {
        if (this.c60901.equals(c60901)) return;
        this.c60901 = c60901;
        notifyPropertyChanged(BR.c60901);
    }

    @Bindable
    public String getC60902() {
        return c60902;
    }

    public void setC60902(String c60902) {
        if (this.c60902.equals(c60902)) return;
        this.c60902 = c60902;
        notifyPropertyChanged(BR.c60902);
    }

    @Bindable
    public String getC60903() {
        return c60903;
    }

    public void setC60903(String c60903) {
        if (this.c60903.equals(c60903)) return;
        this.c60903 = c60903;
        notifyPropertyChanged(BR.c60903);
    }

    @Bindable
    public String getC60904() {
        return c60904;
    }

    public void setC60904(String c60904) {
        if (this.c60904.equals(c60904)) return;
        this.c60904 = c60904;
        notifyPropertyChanged(BR.c60904);
    }

    @Bindable
    public String getC60905() {
        return c60905;
    }

    public void setC60905(String c60905) {
        if (this.c60905.equals(c60905)) return;
        this.c60905 = c60905;
        notifyPropertyChanged(BR.c60905);
    }

    @Bindable
    public String getC60906() {
        return c60906;
    }

    public void setC60906(String c60906) {
        if (this.c60906.equals(c60906)) return;
        this.c60906 = c60906;
        notifyPropertyChanged(BR.c60906);
    }

    @Bindable
    public String getC60907() {
        return c60907;
    }

    public void setC60907(String c60907) {
        if (this.c60907.equals(c60907)) return;
        this.c60907 = c60907;
        notifyPropertyChanged(BR.c60907);
    }

    @Bindable
    public String getC60997() {
        return c60997;
    }

    public void setC60997(String c60997) {
        if (this.c60997.equals(c60997)) return;
        this.c60997 = c60997;
        setC60901(c60997.equals("97") ? "" : this.c60901);
        setC60902(c60997.equals("97") ? "" : this.c60902);
        setC60903(c60997.equals("97") ? "" : this.c60903);
        setC60904(c60997.equals("97") ? "" : this.c60904);
        setC60905(c60997.equals("97") ? "" : this.c60905);
        setC60906(c60997.equals("97") ? "" : this.c60906);
        setC60907(c60997.equals("97") ? "" : this.c60907);
        notifyPropertyChanged(BR.c60997);
    }

    @Bindable
    public String getC61001() {
        return c61001;
    }

    public void setC61001(String c61001) {
        if (this.c61001.equals(c61001)) return;
        this.c61001 = c61001;
        notifyPropertyChanged(BR.c61001);
    }

    @Bindable
    public String getC61002() {
        return c61002;
    }

    public void setC61002(String c61002) {
        if (this.c61002.equals(c61002)) return;
        this.c61002 = c61002;
        notifyPropertyChanged(BR.c61002);
    }

    @Bindable
    public String getC61003() {
        return c61003;
    }

    public void setC61003(String c61003) {
        if (this.c61003.equals(c61003)) return;
        this.c61003 = c61003;
        notifyPropertyChanged(BR.c61003);
    }

    @Bindable
    public String getC61004() {
        return c61004;
    }

    public void setC61004(String c61004) {
        if (this.c61004.equals(c61004)) return;
        this.c61004 = c61004;
        notifyPropertyChanged(BR.c61004);
    }

    @Bindable
    public String getC61005() {
        return c61005;
    }

    public void setC61005(String c61005) {
        if (this.c61005.equals(c61005)) return;
        this.c61005 = c61005;
        notifyPropertyChanged(BR.c61005);
    }

    @Bindable
    public String getC61006() {
        return c61006;
    }

    public void setC61006(String c61006) {
        if (this.c61006.equals(c61006)) return;
        this.c61006 = c61006;
        notifyPropertyChanged(BR.c61006);
    }

    @Bindable
    public String getC61007() {
        return c61007;
    }

    public void setC61007(String c61007) {
        if (this.c61007.equals(c61007)) return;
        this.c61007 = c61007;
        notifyPropertyChanged(BR.c61007);
    }

    @Bindable
    public String getC61097() {
        return c61097;
    }

    public void setC61097(String c61097) {
        if (this.c61097.equals(c61097)) return;
        this.c61097 = c61097;
        setC61001(c61097.equals("97") ? "" : this.c61001);
        setC61002(c61097.equals("97") ? "" : this.c61002);
        setC61003(c61097.equals("97") ? "" : this.c61003);
        setC61004(c61097.equals("97") ? "" : this.c61004);
        setC61005(c61097.equals("97") ? "" : this.c61005);
        setC61006(c61097.equals("97") ? "" : this.c61006);
        setC61007(c61097.equals("97") ? "" : this.c61007);
        notifyPropertyChanged(BR.c61097);
    }


    @Bindable
    public String getCstaa() {
        return cstaa;
    }

    public void setCstaa(String cstaa) {
        this.cstaa = cstaa;
        setCstab(cstaa.equals("2") ? this.cstab : "");
        notifyPropertyChanged(BR.cstaa);
    }

    @Bindable
    public String getCstab() {
        return cstab;
    }

    public void setCstab(String cstab) {
        this.cstab = cstab;
        setCstab96x(cstab.equals("96") ? this.cstab96x : "");
        notifyPropertyChanged(BR.cstab);
    }

    @Bindable
    public String getCstab96x() {
        return cstab96x;
    }

    public void setCstab96x(String cstab96x) {
        this.cstab96x = cstab96x;
        notifyPropertyChanged(BR.cstab96x);
    }


    public MWRA Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UUID));
        // this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_MUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_HHID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_INDEXED));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNCED_DATE));


        sC1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SC1)));
        sC2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SC2)));
        sC3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SC3)));
        sC4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SC4)));
        sC5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SC5)));
        sC6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SC6)));

        return this;
    }

    public void sC1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c101 = json.getString("c101");
            this.c102 = json.getString("c102");
            this.c103 = json.getString("c103");
            this.c104 = json.getString("c104");
            this.c105 = json.getString("c105");
            this.c10501x = json.getString("c10501x");
            this.c106 = json.getString("c106");
            this.c107 = json.getString("c107");
            this.c108 = json.getString("c108");
            this.c109 = json.getString("c109");
            this.c110 = json.getString("c110");
            this.c111 = json.getString("c111");
            this.c112wk = json.getString("c112wk");
            this.c112mm = json.getString("c112mm");
            this.c113dd = json.getString("c113dd");
            this.c113mm = json.getString("c113mm");
            this.c113yy = json.getString("c113yy");
            this.c114 = json.getString("c114");
            this.c115 = json.getString("c115");
            this.c11501 = json.getString("c11501");
            this.c11502 = json.getString("c11502");
            this.c11503 = json.getString("c11503");
            this.c11504 = json.getString("c11504");
            this.c11505 = json.getString("c11505");
            this.c11506 = json.getString("c11506");
            this.c11507 = json.getString("c11507");
            this.c11508 = json.getString("c11508");
            this.c11596 = json.getString("c11596");
            this.c11596x = json.getString("c11596x");
            this.c116w = json.getString("c116w");
            this.c116m = json.getString("c116m");
            this.c116998 = json.getString("c116998");
            this.c117 = json.getString("c117");
            this.c11701 = json.getString("c11701");
            this.c11702 = json.getString("c11702");
            this.c11702x = json.getString("c11702x");
            this.c11703 = json.getString("c11703");
            this.c11703x = json.getString("c11703x");
            this.c11796 = json.getString("c11796");
            this.c11796x = json.getString("c11796x");
            this.c118 = json.getString("c118");
            this.c119 = json.getString("c119");
            this.c11996x = json.getString("c11996x");
            this.c119a = json.getString("c119a");
            this.c119b = json.getString("c119b");
            this.c119c = json.getString("c119c");
            this.c119d = json.getString("c119d");
            this.c119e = json.getString("c119e");
            this.c119f = json.getString("c119f");
            this.c119g = json.getString("c119g");
            this.c119h = json.getString("c119h");
            this.c11998 = json.getString("c11998");
            this.c120 = json.getString("c120");
            this.c121 = json.getString("c121");
            this.c122 = json.getString("c122");
            this.c12201 = json.getString("c12201");
            this.c12202 = json.getString("c12202");
            this.c12203 = json.getString("c12203");
            this.c12204 = json.getString("c12204");
            this.c12205 = json.getString("c12205");
            this.c12206 = json.getString("c12206");
            this.c12207 = json.getString("c12207");
            this.c12208 = json.getString("c12208");
            this.c12296 = json.getString("c12296");
            this.c12296x = json.getString("c12296x");
            this.c123 = json.getString("c123");
            this.c12301 = json.getString("c12301");
            this.c12302 = json.getString("c12302");
            this.c12396 = json.getString("c12396");
            this.c12396x = json.getString("c12396x");
            this.c124 = json.getString("c124");
            this.c125 = json.getString("c125");
            this.c126 = json.getString("c126");
            this.c127 = json.getString("c127");
            this.c128 = json.getString("c128");
            this.c12801 = json.getString("c12801");
            this.c12802 = json.getString("c12802");
            this.c12896 = json.getString("c12896");
            this.c12896x = json.getString("c12896x");
            this.c129 = json.getString("c129");
            this.c130 = json.getString("c130");
            this.c130sx = json.getString("c130sx");
            this.c130cx = json.getString("c130cx");
            this.c131 = json.getString("c131");
            this.c13196x = json.getString("c13196x");
            this.c132 = json.getString("c132");
            this.c133 = json.getString("c133");
            this.c133ax = json.getString("c133ax");
        }
    }

    public void sC2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c2na = json.getString("c2na");
            this.c201 = json.getString("c201");
            this.c202 = json.getString("c202");
            this.c20201 = json.getString("c20201");
            this.c20202 = json.getString("c20202");
            this.c20203 = json.getString("c20203");
            this.c20204 = json.getString("c20204");
            this.c20205 = json.getString("c20205");
            this.c20206 = json.getString("c20206");
            this.c20207 = json.getString("c20207");
            this.c20208 = json.getString("c20208");
            this.c20296 = json.getString("c20296");
            this.c20296x = json.getString("c20296x");
            this.c203 = json.getString("c203");
            this.c20301 = json.getString("c20301");
            this.c20302 = json.getString("c20302");
            this.c20303 = json.getString("c20303");
            this.c20304 = json.getString("c20304");
            this.c20304x = json.getString("c20304x");
            this.c20305 = json.getString("c20305");
            this.c20305x = json.getString("c20305x");
            this.c20396 = json.getString("c20396");
            this.c20396x = json.getString("c20396x");
            this.c204m = json.getString("c204m");
            this.c204w = json.getString("c204w");
            this.c20498 = json.getString("c20498");
            this.c205 = json.getString("c205");
            this.c20501x = json.getString("c20501x");
            this.c20601 = json.getString("c20601");
            this.c20602 = json.getString("c20602");
            this.c20603 = json.getString("c20603");
            this.c20604 = json.getString("c20604");
            this.c20605 = json.getString("c20605");
            this.c20606 = json.getString("c20606");
            this.c20607 = json.getString("c20607");
            this.c20608 = json.getString("c20608");
            this.c20697 = json.getString("c20697");
            this.c20696 = json.getString("c20696");
            this.c20696x = json.getString("c20696x");
            this.c207 = json.getString("c207");
            this.c208 = json.getString("c208");
            this.c209 = json.getString("c209");
            this.c20901 = json.getString("c20901");
            this.c20902 = json.getString("c20902");
            this.c20903 = json.getString("c20903");
            this.c20904 = json.getString("c20904");
            this.c20905 = json.getString("c20905");
            this.c20906 = json.getString("c20906");
            this.c20907 = json.getString("c20907");
            this.c20908 = json.getString("c20908");
            this.c20996 = json.getString("c20996");
            this.c20996x = json.getString("c20996x");
            this.c210 = json.getString("c210");
            this.c21001 = json.getString("c21001");
            this.c21001x = json.getString("c21001x");
            this.c21002 = json.getString("c21002");
            this.c21002x = json.getString("c21002x");
            this.c21096 = json.getString("c21096");
            this.c21096x = json.getString("c21096x");
            this.c211 = json.getString("c211");
            this.c212 = json.getString("c212");
            this.c213 = json.getString("c213");
            this.c214 = json.getString("c214");
            this.c215 = json.getString("c215");
            this.c21501 = json.getString("c21501");
            this.c21501x = json.getString("c21501x");
            this.c21502 = json.getString("c21502");
            this.c21502x = json.getString("c21502x");
            this.c21596 = json.getString("c21596");
            this.c21596x = json.getString("c21596x");
            this.c216 = json.getString("c216");
            this.c217 = json.getString("c217");
            this.c21701x = json.getString("c21701x");
            this.c21702x = json.getString("c21702x");
            this.c218 = json.getString("c218");
            this.c21896x = json.getString("c21896x");
            this.c219 = json.getString("c219");
            this.c220 = json.getString("c220");
            this.c221 = json.getString("c221");
            this.c221ax = json.getString("c221ax");
        }
    }

    public void sC3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c3na = json.getString("c3na");
            this.c301 = json.getString("c301");
            this.c30196x = json.getString("c30196x");
            this.c302 = json.getString("c302");
            this.c30204x = json.getString("c30204x");
            this.c30205x = json.getString("c30205x");
            this.c30296x = json.getString("c30296x");
            this.c303 = json.getString("c303");
            this.c304 = json.getString("c304");
            this.c305 = json.getString("c305");
            this.c306 = json.getString("c306");
            this.c30601x = json.getString("c30601x");
            this.c30602x = json.getString("c30602x");
            this.c307 = json.getString("c307");
            this.c308 = json.getString("c308");
            this.c309 = json.getString("c309");
            this.c310 = json.getString("c310");
            this.c310hx = json.getString("c310hx");
            this.c311 = json.getString("c311");
            this.c311hx = json.getString("c311hx");
            this.c311dx = json.getString("c311dx");
            this.c312 = json.getString("c312");
            this.c31301 = json.getString("c31301");
            this.c31302 = json.getString("c31302");
            this.c31303 = json.getString("c31303");
            this.c31304 = json.getString("c31304");
            this.c31305 = json.getString("c31305");
            this.c31306 = json.getString("c31306");
            this.c31396 = json.getString("c31396");
            this.c313998 = json.getString("c31301");
            this.c31396x = json.getString("c31396x");
            this.c314 = json.getString("c314");
            this.c31401x = json.getString("c31401x");
            this.c31402x = json.getString("c31402x");
            this.c31496x = json.getString("c31496x");
            this.c315 = json.getString("c315");
            this.c316 = json.getString("c316");
            this.c31601 = json.getString("c31601");
            this.c31602 = json.getString("c31602");
            this.c31603 = json.getString("c31603");
            this.c31604 = json.getString("c31604");
            this.c31605 = json.getString("c31605");
            this.c31606 = json.getString("c31606");
            this.c31607 = json.getString("c31607");
            this.c31608 = json.getString("c31608");
            this.c31696 = json.getString("c31696");
            this.c31696x = json.getString("c31696x");
            this.c317 = json.getString("c317");
            this.c317hx = json.getString("c317hx");
            this.c317dx = json.getString("c317dx");
            this.c317wx = json.getString("c317wx");
            this.c318 = json.getString("c318");
            this.c319 = json.getString("c319");
            this.c31901 = json.getString("c31901");
            this.c31902 = json.getString("c31902");
            this.c31903 = json.getString("c31903");
            this.c31904 = json.getString("c31904");
            this.c31905 = json.getString("c31905");
            this.c31906 = json.getString("c31906");
            this.c31907 = json.getString("c31907");
            this.c31908 = json.getString("c31908");
            this.c31909 = json.getString("c31909");
            this.c31996 = json.getString("c31996");
            this.c31996x = json.getString("c31996x");
            this.c320 = json.getString("c320");
            this.c321 = json.getString("c321");
            this.c32101 = json.getString("c32101");
            this.c32102 = json.getString("c32102");
            this.c32103 = json.getString("c32103");
            this.c32104 = json.getString("c32104");
            this.c32105 = json.getString("c32105");
            this.c32106 = json.getString("c32106");
            this.c32107 = json.getString("c32107");
            this.c32108 = json.getString("c32108");
            this.c32196 = json.getString("c32196");
            this.c32196x = json.getString("c32196x");
            this.c322 = json.getString("c322");
            this.c322hx = json.getString("c322hx");
            this.c322dx = json.getString("c322dx");
            this.c322wx = json.getString("c322wx");
            this.c323 = json.getString("c323");
            this.c324 = json.getString("c324");
            this.c32401 = json.getString("c32401");
            this.c32402 = json.getString("c32402");
            this.c32403 = json.getString("c32403");
            this.c32404 = json.getString("c32404");
            this.c32405 = json.getString("c32405");
            this.c32496 = json.getString("c32496");
            this.c32496x = json.getString("c32496x");
            this.c325 = json.getString("c325");
            this.c326 = json.getString("c326");
            this.c32601x = json.getString("c32601x");
            this.c32602x = json.getString("c32602x");
            this.c327 = json.getString("c327");
            this.c32701x = json.getString("c32701x");
            this.c32702x = json.getString("c32702x");
            this.c328 = json.getString("c328");
            this.c32896x = json.getString("c32896x");
            this.c329 = json.getString("c329");
            this.c330 = json.getString("c330");
            this.c331 = json.getString("c331");
            this.c33101 = json.getString("c33101");
            this.c33102 = json.getString("c33102");
            this.c33103 = json.getString("c33103");
            this.c33104 = json.getString("c33104");
            this.c33105 = json.getString("c33105");
            this.c33106 = json.getString("c33106");
            this.c33107 = json.getString("c33107");
            this.c33108 = json.getString("c33108");
            this.c33109 = json.getString("c33109");
            this.c33110 = json.getString("c33110");
            this.c33111 = json.getString("c33111");
            this.c33112 = json.getString("c33112");
            this.c33113 = json.getString("c33113");
            this.c33114 = json.getString("c33114");
            this.c33115 = json.getString("c33115");
            this.c33116 = json.getString("c33116");
            this.c33196 = json.getString("c33196");
            this.c33196x = json.getString("c33196x");
        }
    }

    public void sC4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c401 = json.getString("c401");
            this.c402 = json.getString("c402");
            this.c40296x = json.getString("c40296x");
            this.c403 = json.getString("c403");
            this.c40301 = json.getString("c40301");
            this.c40302 = json.getString("c40302");
            this.c40303 = json.getString("c40303");
            this.c40304 = json.getString("c40304");
            this.c40305 = json.getString("c40305");
            this.c40306 = json.getString("c40306");
            this.c40307 = json.getString("c40307");
            this.c40308 = json.getString("c40308");
            this.c40309 = json.getString("c40309");
            this.c40310 = json.getString("c40310");
            this.c40311 = json.getString("c40311");
            this.c40396 = json.getString("c40396");
            this.c40396x = json.getString("c40396x");
            this.c404 = json.getString("c404");
            this.c40401x = json.getString("c40401x");
            this.c405 = json.getString("c405");
            this.c406 = json.getString("c406");
            this.c40696x = json.getString("c40696x");
        }
    }

    public void sC5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c501 = json.getString("c501");
            this.c5011 = json.getString("c5011");
            this.c5012 = json.getString("c5012");
            this.c5013 = json.getString("c5013");
            this.c502 = json.getString("c502");
            this.c5021 = json.getString("c5021");
            this.c5022 = json.getString("c5022");
            this.c5023 = json.getString("c5023");
            this.c503 = json.getString("c503");
            this.c5031 = json.getString("c5031");
            this.c5032 = json.getString("c5032");
            this.c5033 = json.getString("c5033");
            this.c504 = json.getString("c504");
            this.c50496x = json.getString("c50496x");
            this.c5041 = json.getString("c5041");
            this.c5042 = json.getString("c5042");
            this.c5043 = json.getString("c5043");
            this.c505 = json.getString("c505");
            this.c50596x = json.getString("c50596x");
        }
    }

    public void sC6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c60101 = json.getString("c60101");
            this.c60102 = json.getString("c60102");
            this.c60103 = json.getString("c60103");
            this.c60104 = json.getString("c60104");
            this.c60105 = json.getString("c60105");
            this.c60106 = json.getString("c60106");
            this.c60107 = json.getString("c60107");
            this.c60197 = json.getString("c60197");
            this.c60201 = json.getString("c60201");
            this.c60202 = json.getString("c60202");
            this.c60203 = json.getString("c60203");
            this.c60204 = json.getString("c60204");
            this.c60205 = json.getString("c60205");
            this.c60206 = json.getString("c60206");
            this.c60207 = json.getString("c60207");
            this.c60297 = json.getString("c60297");
            this.c60301 = json.getString("c60301");
            this.c60302 = json.getString("c60302");
            this.c60303 = json.getString("c60303");
            this.c60304 = json.getString("c60304");
            this.c60305 = json.getString("c60305");
            this.c60306 = json.getString("c60306");
            this.c60307 = json.getString("c60307");
            this.c60397 = json.getString("c60397");
            this.c60401 = json.getString("c60401");
            this.c60402 = json.getString("c60402");
            this.c60403 = json.getString("c60403");
            this.c60404 = json.getString("c60404");
            this.c60405 = json.getString("c60405");
            this.c60406 = json.getString("c60406");
            this.c60407 = json.getString("c60407");
            this.c60497 = json.getString("c60497");
            this.c60501 = json.getString("c60501");
            this.c60502 = json.getString("c60502");
            this.c60503 = json.getString("c60503");
            this.c60504 = json.getString("c60504");
            this.c60505 = json.getString("c60505");
            this.c60506 = json.getString("c60506");
            this.c60507 = json.getString("c60507");
            this.c60597 = json.getString("c60597");
            this.c60601 = json.getString("c60601");
            this.c60602 = json.getString("c60602");
            this.c60603 = json.getString("c60603");
            this.c60604 = json.getString("c60604");
            this.c60605 = json.getString("c60605");
            this.c60606 = json.getString("c60606");
            this.c60607 = json.getString("c60607");
            this.c60697 = json.getString("c60697");
            this.c60701 = json.getString("c60701");
            this.c60702 = json.getString("c60702");
            this.c60703 = json.getString("c60703");
            this.c60704 = json.getString("c60704");
            this.c60705 = json.getString("c60705");
            this.c60706 = json.getString("c60706");
            this.c60707 = json.getString("c60707");
            this.c60797 = json.getString("c60797");
            this.c60801 = json.getString("c60801");
            this.c60802 = json.getString("c60802");
            this.c60803 = json.getString("c60803");
            this.c60804 = json.getString("c60804");
            this.c60805 = json.getString("c60805");
            this.c60806 = json.getString("c60806");
            this.c60807 = json.getString("c60807");
            this.c60897 = json.getString("c60897");
            this.c60901 = json.getString("c60901");
            this.c60902 = json.getString("c60902");
            this.c60903 = json.getString("c60903");
            this.c60904 = json.getString("c60904");
            this.c60905 = json.getString("c60905");
            this.c60906 = json.getString("c60906");
            this.c60907 = json.getString("c60907");
            this.c60997 = json.getString("c60997");
            this.c61001 = json.getString("c61001");
            this.c61002 = json.getString("c61002");
            this.c61003 = json.getString("c61003");
            this.c61004 = json.getString("c61004");
            this.c61005 = json.getString("c61005");
            this.c61006 = json.getString("c61006");
            this.c61007 = json.getString("c61007");
            this.c61097 = json.getString("c61097");
            this.cstaa = json.getString("cstaa");
            this.cstab = json.getString("cstab");
            this.cstab96x = json.getString("cstab96x");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.MwraTable.COLUMN_ID, this.id);
        json.put(TableContracts.MwraTable.COLUMN_UID, this.uid);
        json.put(TableContracts.MwraTable.COLUMN_PROJECT_NAME, this.projectName);

        json.put(TableContracts.MwraTable.COLUMN_UUID, this.uid);
        json.put(TableContracts.MwraTable.COLUMN_HHID, this.hhid);
        // json.put(TableContracts.MwraTable.COLUMN_MUID, this.muid);
        json.put(TableContracts.MwraTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.MwraTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.MwraTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.MwraTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.MwraTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.MwraTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.MwraTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.MwraTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.MwraTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.MwraTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.MwraTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(TableContracts.MwraTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.MwraTable.COLUMN_SC1, new JSONObject(sC1toString()));
        json.put(TableContracts.MwraTable.COLUMN_SC2, new JSONObject(sC2toString()));
        json.put(TableContracts.MwraTable.COLUMN_SC3, new JSONObject(sC3toString()));
        json.put(TableContracts.MwraTable.COLUMN_SC4, new JSONObject(sC4toString()));
        json.put(TableContracts.MwraTable.COLUMN_SC5, new JSONObject(sC5toString()));
        json.put(TableContracts.MwraTable.COLUMN_SC6, new JSONObject(sC6toString()));

        return json;
    }

    public String sC1toString() throws JSONException {
        Log.d(TAG, "sC1toString: ");
        JSONObject json = new JSONObject();
        json.put("c101", c101)
                .put("c102", c102)
                .put("c103", c103)
                .put("c104", c104)
                .put("c105", c105)
                .put("c10501x", c10501x)
                .put("c106", c106)
                .put("c107", c107)
                .put("c108", c108)
                .put("c109", c109)
                .put("c110", c110)
                .put("c111", c111)
                .put("c112wk", c112wk)
                .put("c112mm", c112mm)
                .put("c113dd", c113dd)
                .put("c113mm", c113mm)
                .put("c113yy", c113yy)
                .put("c114", c114)
                .put("c115", c115)
                .put("c11501", c11501)
                .put("c11502", c11502)
                .put("c11503", c11503)
                .put("c11504", c11504)
                .put("c11505", c11505)
                .put("c11506", c11506)
                .put("c11507", c11507)
                .put("c11508", c11508)
                .put("c11596", c11596)
                .put("c11596x", c11596x)
                .put("c116w", c116w)
                .put("c116m", c116m)
                .put("c116998", c116998)
                .put("c117", c117)
                .put("c11701", c11701)
                .put("c11702", c11702)
                .put("c11702x", c11702x)
                .put("c11703", c11703)
                .put("c11703x", c11703x)
                .put("c11796", c11796)
                .put("c11796x", c11796x)
                .put("c118", c118)
                .put("c119", c119)
                .put("c11996x", c11996x)
                .put("c119a", c119a)
                .put("c119b", c119b)
                .put("c119c", c119c)
                .put("c119d", c119d)
                .put("c119e", c119e)
                .put("c119f", c119f)
                .put("c119g", c119g)
                .put("c119h", c119h)
                .put("c11998", c11998)
                .put("c120", c120)
                .put("c121", c121)
                .put("c122", c122)
                .put("c12201", c12201)
                .put("c12202", c12202)
                .put("c12203", c12203)
                .put("c12204", c12204)
                .put("c12205", c12205)
                .put("c12206", c12206)
                .put("c12207", c12207)
                .put("c12208", c12208)
                .put("c12296", c12296)
                .put("c12296x", c12296x)
                .put("c123", c123)
                .put("c12301", c12301)
                .put("c12302", c12302)
                .put("c12396", c12396)
                .put("c12396x", c12396x)
                .put("c124", c124)
                .put("c125", c125)
                .put("c126", c126)
                .put("c127", c127)
                .put("c128", c128)
                .put("c12801", c12801)
                .put("c12802", c12802)
                .put("c12896", c12896)
                .put("c12896x", c12896x)
                .put("c129", c129)
                .put("c130", c130)
                .put("c130sx", c130sx)
                .put("c130cx", c130cx)
                .put("c131", c131)
                .put("c13196x", c13196x)
                .put("c132", c132)
                .put("c133", c133)
                .put("c133ax", c133ax);
        return json.toString();
    }

    public String sC2toString() throws JSONException {
        Log.d(TAG, "sC2toString: ");
        JSONObject json = new JSONObject();
        json.put("c2na", c2na)
                .put("c201", c201)
                .put("c202", c202)
                .put("c20201", c20201)
                .put("c20202", c20202)
                .put("c20203", c20203)
                .put("c20204", c20204)
                .put("c20205", c20205)
                .put("c20206", c20206)
                .put("c20207", c20207)
                .put("c20208", c20208)
                .put("c20296", c20296)
                .put("c20296x", c20296x)
                .put("c203", c203)
                .put("c20301", c20301)
                .put("c20302", c20302)
                .put("c20303", c20303)
                .put("c20304", c20304)
                .put("c20304x", c20304x)
                .put("c20305", c20305)
                .put("c20305x", c20305x)
                .put("c20396", c20396)
                .put("c20396x", c20396x)
                .put("c204m", c204m)
                .put("c204w", c204w)
                .put("c20498", c20498)
                .put("c205", c205)
                .put("c20501x", c20501x)
                .put("c20601", c20601)
                .put("c20602", c20602)
                .put("c20603", c20603)
                .put("c20604", c20604)
                .put("c20605", c20605)
                .put("c20606", c20606)
                .put("c20607", c20607)
                .put("c20608", c20608)
                .put("c20697", c20697)
                .put("c20696", c20696)
                .put("c20696x", c20696x)
                .put("c207", c207)
                .put("c208", c208)
                .put("c209", c209)
                .put("c20901", c20901)
                .put("c20902", c20902)
                .put("c20903", c20903)
                .put("c20904", c20904)
                .put("c20905", c20905)
                .put("c20906", c20906)
                .put("c20907", c20907)
                .put("c20908", c20908)
                .put("c20996", c20996)
                .put("c20996x", c20996x)
                .put("c210", c210)
                .put("c21001", c21001)
                .put("c21001x", c21001x)
                .put("c21002", c21002)
                .put("c21002x", c21002x)
                .put("c21096", c21096)
                .put("c21096x", c21096x)
                .put("c211", c211)
                .put("c212", c212)
                .put("c213", c213)
                .put("c214", c214)
                .put("c215", c215)
                .put("c21501", c21501)
                .put("c21501x", c21501x)
                .put("c21502", c21502)
                .put("c21502x", c21502x)
                .put("c21596", c21596)
                .put("c21596x", c21596x)
                .put("c216", c216)
                .put("c217", c217)
                .put("c21701x", c21701x)
                .put("c21702x", c21702x)
                .put("c218", c218)
                .put("c21896x", c21896x)
                .put("c219", c219)
                .put("c220", c220)
                .put("c221", c221)
                .put("c221ax", c221ax);
        return json.toString();
    }

    public String sC3toString() throws JSONException {
        Log.d(TAG, "sC3toString: ");
        JSONObject json = new JSONObject();
        json.put("c3na", c3na)
                .put("c301", c301)
                .put("c30196x", c30196x)
                .put("c302", c302)
                .put("c30204x", c30204x)
                .put("c30205x", c30205x)
                .put("c30296x", c30296x)
                .put("c303", c303)
                .put("c304", c304)
                .put("c305", c305)
                .put("c306", c306)
                .put("c30601x", c30601x)
                .put("c30602x", c30602x)
                .put("c307", c307)
                .put("c308", c308)
                .put("c309", c309)
                .put("c310", c310)
                .put("c310hx", c310hx)
                .put("c311", c311)
                .put("c311hx", c311hx)
                .put("c311dx", c311dx)
                .put("c312", c312)
                .put("c31301", c31301)
                .put("c31302", c31302)
                .put("c31303", c31303)
                .put("c31304", c31304)
                .put("c31305", c31305)
                .put("c31306", c31306)
                .put("c31396", c31396)
                .put("c31398", c313998)
                .put("c31396x", c31396x)
                .put("c314", c314)
                .put("c31401x", c31401x)
                .put("c31402x", c31402x)
                .put("c31496x", c31496x)
                .put("c315", c315)
                .put("c316", c316)
                .put("c31601", c31601)
                .put("c31602", c31602)
                .put("c31603", c31603)
                .put("c31604", c31604)
                .put("c31605", c31605)
                .put("c31606", c31606)
                .put("c31607", c31607)
                .put("c31608", c31608)
                .put("c31696", c31696)
                .put("c31696x", c31696x)
                .put("c317", c317)
                .put("c317hx", c317hx)
                .put("c317dx", c317dx)
                .put("c317wx", c317wx)
                .put("c318", c318)
                .put("c319", c319)
                .put("c31901", c31901)
                .put("c31902", c31902)
                .put("c31903", c31903)
                .put("c31904", c31904)
                .put("c31905", c31905)
                .put("c31906", c31906)
                .put("c31907", c31907)
                .put("c31908", c31908)
                .put("c31909", c31909)
                .put("c31996", c31996)
                .put("c31996x", c31996x)
                .put("c320", c320)
                .put("c321", c321)
                .put("c32101", c32101)
                .put("c32102", c32102)
                .put("c32103", c32103)
                .put("c32104", c32104)
                .put("c32105", c32105)
                .put("c32106", c32106)
                .put("c32107", c32107)
                .put("c32108", c32108)
                .put("c32196", c32196)
                .put("c32196x", c32196x)
                .put("c322", c322)
                .put("c322hx", c322hx)
                .put("c322dx", c322dx)
                .put("c322wx", c322wx)
                .put("c323", c323)
                .put("c324", c324)
                .put("c32401", c32401)
                .put("c32402", c32402)
                .put("c32403", c32403)
                .put("c32404", c32404)
                .put("c32405", c32405)
                .put("c32496", c32496)
                .put("c32496x", c32496x)
                .put("c325", c325)
                .put("c326", c326)
                .put("c32601x", c32601x)
                .put("c32602x", c32602x)
                .put("c327", c327)
                .put("c32701x", c32701x)
                .put("c32702x", c32702x)
                .put("c328", c328)
                .put("c32896x", c32896x)
                .put("c329", c329)
                .put("c330", c330)
                .put("c331", c331)
                .put("c33101", c33101)
                .put("c33102", c33102)
                .put("c33103", c33103)
                .put("c33104", c33104)
                .put("c33105", c33105)
                .put("c33106", c33106)
                .put("c33107", c33107)
                .put("c33108", c33108)
                .put("c33109", c33109)
                .put("c33110", c33110)
                .put("c33111", c33111)
                .put("c33112", c33112)
                .put("c33113", c33113)
                .put("c33114", c33114)
                .put("c33115", c33115)
                .put("c33116", c33116)
                .put("c33196", c33196)
                .put("c33196x", c33196x);
        return json.toString();
    }

    public String sC4toString() throws JSONException {
        Log.d(TAG, "sC4toString: ");
        JSONObject json = new JSONObject();
        json.put("c401", c401)
                .put("c402", c402)
                .put("c40296x", c40296x)
                .put("c403", c403)
                .put("c40301", c40301)
                .put("c40302", c40302)
                .put("c40303", c40303)
                .put("c40304", c40304)
                .put("c40305", c40305)
                .put("c40306", c40306)
                .put("c40307", c40307)
                .put("c40308", c40308)
                .put("c40309", c40309)
                .put("c40310", c40310)
                .put("c40311", c40311)
                .put("c40396", c40396)
                .put("c40396x", c40396x)
                .put("c404", c404)
                .put("c40401x", c40401x)
                .put("c405", c405)
                .put("c406", c406)
                .put("c40696x", c40696x);
        return json.toString();
    }

    public String sC5toString() throws JSONException {
        Log.d(TAG, "sC5toString: ");
        JSONObject json = new JSONObject();
        json.put("c501", c501)
                .put("c5011", c5011)
                .put("c5012", c5012)
                .put("c5013", c5013)
                .put("c502", c502)
                .put("c5021", c5021)
                .put("c5022", c5022)
                .put("c5023", c5023)
                .put("c503", c503)
                .put("c5031", c5031)
                .put("c5032", c5032)
                .put("c5033", c5033)
                .put("c504", c504)
                .put("c50496x", c50496x)
                .put("c5041", c5041)
                .put("c5042", c5042)
                .put("c5043", c5043)
                .put("c505", c505)
                .put("c50596x", c50596x);
        return json.toString();
    }

    public String sC6toString() throws JSONException {
        Log.d(TAG, "sC6toString: ");
        JSONObject json = new JSONObject();
        json.put("c60101", c60101)
                .put("c60102", c60102)
                .put("c60103", c60103)
                .put("c60104", c60104)
                .put("c60105", c60105)
                .put("c60106", c60106)
                .put("c60107", c60107)
                .put("c60197", c60197)
                .put("c60201", c60201)
                .put("c60202", c60202)
                .put("c60203", c60203)
                .put("c60204", c60204)
                .put("c60205", c60205)
                .put("c60206", c60206)
                .put("c60207", c60207)
                .put("c60297", c60297)
                .put("c60301", c60301)
                .put("c60302", c60302)
                .put("c60303", c60303)
                .put("c60304", c60304)
                .put("c60305", c60305)
                .put("c60306", c60306)
                .put("c60307", c60307)
                .put("c60397", c60397)
                .put("c60401", c60401)
                .put("c60402", c60402)
                .put("c60403", c60403)
                .put("c60404", c60404)
                .put("c60405", c60405)
                .put("c60406", c60406)
                .put("c60407", c60407)
                .put("c60497", c60497)
                .put("c60501", c60501)
                .put("c60502", c60502)
                .put("c60503", c60503)
                .put("c60504", c60504)
                .put("c60505", c60505)
                .put("c60506", c60506)
                .put("c60507", c60507)
                .put("c60597", c60597)
                .put("c60601", c60601)
                .put("c60602", c60602)
                .put("c60603", c60603)
                .put("c60604", c60604)
                .put("c60605", c60605)
                .put("c60606", c60606)
                .put("c60607", c60607)
                .put("c60697", c60697)
                .put("c60701", c60701)
                .put("c60702", c60702)
                .put("c60703", c60703)
                .put("c60704", c60704)
                .put("c60705", c60705)
                .put("c60706", c60706)
                .put("c60707", c60707)
                .put("c60797", c60797)
                .put("c60801", c60801)
                .put("c60802", c60802)
                .put("c60803", c60803)
                .put("c60804", c60804)
                .put("c60805", c60805)
                .put("c60806", c60806)
                .put("c60807", c60807)
                .put("c60897", c60897)
                .put("c60901", c60901)
                .put("c60902", c60902)
                .put("c60903", c60903)
                .put("c60904", c60904)
                .put("c60905", c60905)
                .put("c60906", c60906)
                .put("c60907", c60907)
                .put("c60997", c60997)
                .put("c61001", c61001)
                .put("c61002", c61002)
                .put("c61003", c61003)
                .put("c61004", c61004)
                .put("c61005", c61005)
                .put("c61006", c61006)
                .put("c61007", c61007)
                .put("c61097", c61097)
                .put("cstaa", cstaa)
                .put("cstab", cstab)
                .put("cstab96x", cstab96x);
        return json.toString();
    }

}
