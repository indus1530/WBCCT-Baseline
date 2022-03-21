package edu.aku.hassannaqvi.wbcct_baseline.models;

import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.PROJECT_NAME;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import edu.aku.hassannaqvi.wbcct_baseline.BR;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.RecipientTable;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;


public class Recipient extends BaseObservable implements Observable {

    private final String TAG = "Recipient";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
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
    private String indexed = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    private String entryType = _EMPTY_;
    private String iStatus = _EMPTY_;

    // FIELD VARIABLES
    private String b101 = _EMPTY_;
    private String b102 = _EMPTY_;
    private String b103 = _EMPTY_;
    private String b10398 = _EMPTY_;
    private String b10498 = _EMPTY_;
    private String b104y = _EMPTY_;
    private String b104m = _EMPTY_;
    private String b104w = _EMPTY_;
    private String b10598 = _EMPTY_;
    private String b105y = _EMPTY_;
    private String b105w = _EMPTY_;
    private String b105m = _EMPTY_;
    private String b106 = _EMPTY_;
    private String b10698 = _EMPTY_;
    private String b107 = _EMPTY_;
    private String b10796x = _EMPTY_;
    private String b108 = _EMPTY_;
    private String b10898 = _EMPTY_;
    private String b10901 = _EMPTY_;
    private String b10902 = _EMPTY_;
    private String b10903 = _EMPTY_;
    private String b10904 = _EMPTY_;
    private String b10996 = _EMPTY_;
    private String b10996x = _EMPTY_;
    private String b11001 = _EMPTY_;
    private String b11002 = _EMPTY_;
    private String b11003 = _EMPTY_;
    private String b11004 = _EMPTY_;
    private String b11096 = _EMPTY_;
    private String b11096x = _EMPTY_;
    private String b11101 = _EMPTY_;
    private String b11102 = _EMPTY_;
    private String b11103 = _EMPTY_;
    private String b11104 = _EMPTY_;
    private String b11196 = _EMPTY_;
    private String b11196x = _EMPTY_;
    private String b11201 = _EMPTY_;
    private String b11202 = _EMPTY_;
    private String b11203 = _EMPTY_;
    private String b11204 = _EMPTY_;
    private String b11205 = _EMPTY_;
    private String b11206 = _EMPTY_;
    private String b11296 = _EMPTY_;
    private String b11296x = _EMPTY_;
    private String b11298 = _EMPTY_;
    private String b113 = _EMPTY_;
    private String b11396x = _EMPTY_;
    private String b114 = _EMPTY_;
    private String b11496x = _EMPTY_;
    private String b11598 = _EMPTY_;
    private String b115h = _EMPTY_;
    private String b115m = _EMPTY_;
    private String b116 = _EMPTY_;
    private String b11601x = _EMPTY_;
    private String b117 = _EMPTY_;
    private String b118 = _EMPTY_;
    private String b119 = _EMPTY_;
    private String b120 = _EMPTY_;
    private String b201 = _EMPTY_;
    private String b20196x = _EMPTY_;
    private String b202 = _EMPTY_;
    private String b202998 = _EMPTY_;
    private String b202w = _EMPTY_;
    private String b202m = _EMPTY_;
    private String b202y = _EMPTY_;
    private String b203 = _EMPTY_;
    private String b204 = _EMPTY_;
    private String b204998 = _EMPTY_;
    private String b204w = _EMPTY_;
    private String b204m = _EMPTY_;
    private String b205a = _EMPTY_;
    private String b205b = _EMPTY_;
    private String b205c = _EMPTY_;
    private String b20601 = _EMPTY_;
    private String b20602 = _EMPTY_;
    private String b207a = _EMPTY_;
    private String b207b = _EMPTY_;
    private String b207c = _EMPTY_;
    private String b208a = _EMPTY_;
    private String b208b = _EMPTY_;
    private String b209 = _EMPTY_;
    private String b209a = _EMPTY_;
    private String b209b = _EMPTY_;
    private String b209c = _EMPTY_;
    private String b210 = _EMPTY_;
    private String b211 = _EMPTY_;
    private String b211998 = _EMPTY_;
    private String b21101 = _EMPTY_;
    private String b212 = _EMPTY_;
    private String b212998 = _EMPTY_;
    private String b21201 = _EMPTY_;
    private String b21202 = _EMPTY_;
    private String b213 = _EMPTY_;
    private String b21396x = _EMPTY_;
    private String b214 = _EMPTY_;
    private String b215 = _EMPTY_;
    private String b21501 = _EMPTY_;
    private String b21502 = _EMPTY_;
    private String b21503 = _EMPTY_;
    private String b21504 = _EMPTY_;
    private String b21596 = _EMPTY_;
    private String b21596x = _EMPTY_;
    private String b216 = _EMPTY_;
    private String b21601 = _EMPTY_;
    private String b21602 = _EMPTY_;
    private String b21603 = _EMPTY_;
    private String b21604 = _EMPTY_;
    private String b21696 = _EMPTY_;
    private String b21696x = _EMPTY_;
    private String b217 = _EMPTY_;
    private String b21701 = _EMPTY_;
    private String b21702 = _EMPTY_;
    private String b21703 = _EMPTY_;
    private String b21704 = _EMPTY_;
    private String b21796 = _EMPTY_;
    private String b21796x = _EMPTY_;
    private String b218 = _EMPTY_;
    private String b21801 = _EMPTY_;
    private String b21802 = _EMPTY_;
    private String b21803 = _EMPTY_;
    private String b21804 = _EMPTY_;
    private String b21805 = _EMPTY_;
    private String b21806 = _EMPTY_;
    private String b21896 = _EMPTY_;
    private String b21896x = _EMPTY_;
    private String b218998 = _EMPTY_;
    private String b219 = _EMPTY_;
    private String b21996x = _EMPTY_;
    private String b220 = _EMPTY_;
    private String b22096x = _EMPTY_;
    private String b221 = _EMPTY_;
    private String b221998 = _EMPTY_;
    private String b22101 = _EMPTY_;
    private String b222 = _EMPTY_;
    private String b222998 = _EMPTY_;
    private String b222h = _EMPTY_;
    private String b222m = _EMPTY_;
    private String b223 = _EMPTY_;
    private String b224 = _EMPTY_;
    private String bstaa = _EMPTY_;
    private String bstab = _EMPTY_;
    private String bstab96x = _EMPTY_;


    public Recipient() {

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
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setPsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);
        setFmuid(MainApp.familyMember.getUid());

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

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }

    @Bindable
    public String getPsuCode() {
        return psuCode;
    }

    public void setPsuCode(String psuCode) {
        this.psuCode = psuCode;
        notifyPropertyChanged(BR.psuCode);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
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

    @Bindable
    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String Indexed) {
        this.indexed = Indexed;
        notifyPropertyChanged(BR.indexed);
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
    public String getB101() {
        return b101;
    }

    public void setB101(String b101) {
        this.b101 = b101;
        notifyPropertyChanged(BR.b101);
    }

    @Bindable
    public String getB102() {
        return b102;
    }

    public void setB102(String b102) {
        this.b102 = b102;
        notifyPropertyChanged(BR.b102);
    }

    @Bindable
    public String getB103() {
        //return b103;
        if (b103.length() > 2) {
            String xString = new String(Base64.decode(new StringBuilder(b103).reverse().toString(), Base64.NO_WRAP));
            Log.d(TAG, "getB103: " + xString);
            return xString.substring(0, xString.length() - 2);
        } else {
            return b103;
        }
    }

    public void setB103(String b103) {
        this.b103 = b103 + "" + (new Random().nextInt(99 - 10 + 1) + 10);
        this.b103 = new StringBuilder(Base64.encodeToString(this.b103.getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP)).reverse().toString();
        Log.d(TAG, "setB103: " + this.b103);
        //this.b103 = b103;
        notifyPropertyChanged(BR.b103);
    }

    @Bindable
    public String getB10398() {
        return b10398;
    }

    public void setB10398(String b10398) {
        if (this.b10398.equals(b10398)) return;
        this.b10398 = b10398;
        setB103(b10398.equals("998") ? "" : this.b103);
        notifyPropertyChanged(BR.b10398);
    }

    @Bindable
    public String getB10498() {
        return b10498;
    }

    public void setB10498(String b10498) {
        if (this.b10498.equals(b10498)) return;
        this.b10498 = b10498;
        setB104y(b10498.equals("998") ? "" : this.b104y);
        setB104m(b10498.equals("998") ? "" : this.b104m);
        setB104w(b10498.equals("998") ? "" : this.b104w);
        notifyPropertyChanged(BR.b10498);
    }

    @Bindable
    public String getB104y() {
        return b104y;
    }

    public void setB104y(String b104y) {
        this.b104y = b104y;
        boolean b = b104y.length() > 0 && Integer.parseInt(b104y) > 0;
        setB106(b ? this.b106 : "");
        setB10698(b ? this.b10698 : "");
        notifyPropertyChanged(BR.b104y);
    }

    @Bindable
    public String getB104m() {
        return b104m;
    }

    public void setB104m(String b104m) {
        this.b104m = b104m;
        notifyPropertyChanged(BR.b104m);
    }

    @Bindable
    public String getB104w() {
        return b104w;
    }

    public void setB104w(String b104w) {
        this.b104w = b104w;
        notifyPropertyChanged(BR.b104w);
    }

    @Bindable
    public String getB10598() {
        return b10598;
    }

    public void setB10598(String b10598) {
        if (this.b10598.equals(b10598)) return;
        this.b10598 = b10598;
        setB105y(b10598.equals("998") ? "" : this.b105y);
        setB105w(b10598.equals("998") ? "" : this.b105w);
        setB105m(b10598.equals("998") ? "" : this.b105m);
        notifyPropertyChanged(BR.b10598);
    }

    @Bindable
    public String getB105y() {
        return b105y;
    }

    public void setB105y(String b105y) {
        this.b105y = b105y;
        notifyPropertyChanged(BR.b105y);
    }

    @Bindable
    public String getB105w() {
        return b105w;
    }

    public void setB105w(String b105w) {
        this.b105w = b105w;
        notifyPropertyChanged(BR.b105w);
    }

    @Bindable
    public String getB105m() {
        return b105m;
    }

    public void setB105m(String b105m) {
        this.b105m = b105m;
        notifyPropertyChanged(BR.b105m);
    }

    @Bindable
    public String getB106() {
        return b106;
    }

    public void setB106(String b106) {
        this.b106 = b106;
        notifyPropertyChanged(BR.b106);
    }

    @Bindable
    public String getB10698() {
        return b10698;
    }

    public void setB10698(String b10698) {
        if (this.b10698.equals(b10698)) return;
        this.b10698 = b10698;
        setB106(b10698.equals("998") ? "" : this.b106);
        notifyPropertyChanged(BR.b10698);
    }


    @Bindable
    public String getB107() {
        return b107;
    }

    public void setB107(String b107) {
        this.b107 = b107;
        setB10796x(b107.equals("96") ? this.b10796x : "");
        notifyPropertyChanged(BR.b107);
    }

    @Bindable
    public String getB10796x() {
        return b10796x;
    }

    public void setB10796x(String b10796x) {
        this.b10796x = b10796x;
        notifyPropertyChanged(BR.b10796x);
    }

    @Bindable
    public String getB108() {
        return b108;
    }

    public void setB108(String b108) {
        this.b108 = b108;
        notifyPropertyChanged(BR.b108);
    }

    @Bindable
    public String getB10898() {
        return b10898;
    }

    public void setB10898(String b10898) {
        if (this.b10898.equals(b10898)) return;
        this.b10898 = b10898;
        setB108(b10898.equals("998") ? "" : this.b108);
        notifyPropertyChanged(BR.b10898);
    }


    @Bindable
    public String getB10901() {
        return b10901;
    }

    public void setB10901(String b10901) {
        if (this.b10901.equals(b10901)) return;
        this.b10901 = b10901;
        notifyPropertyChanged(BR.b10901);
    }

    @Bindable
    public String getB10902() {
        return b10902;
    }

    public void setB10902(String b10902) {
        if (this.b10902.equals(b10902)) return;
        this.b10902 = b10902;
        notifyPropertyChanged(BR.b10902);
    }

    @Bindable
    public String getB10903() {
        return b10903;
    }

    public void setB10903(String b10903) {
        if (this.b10903.equals(b10903)) return;
        this.b10903 = b10903;
        notifyPropertyChanged(BR.b10903);
    }

    @Bindable
    public String getB10904() {
        return b10904;
    }

    public void setB10904(String b10904) {
        if (this.b10904.equals(b10904)) return;
        this.b10904 = b10904;
        notifyPropertyChanged(BR.b10904);
    }

    @Bindable
    public String getB10996() {
        return b10996;
    }

    public void setB10996(String b10996) {
        if (this.b10996.equals(b10996)) return;
        this.b10996 = b10996;
        setB10996x(b10996.equals("96") ? this.b10996x : "");
        notifyPropertyChanged(BR.b10996);
    }

    @Bindable
    public String getB10996x() {
        return b10996x;
    }

    public void setB10996x(String b10996x) {
        this.b10996x = b10996x;
        notifyPropertyChanged(BR.b10996x);
    }


    @Bindable
    public String getB11001() {
        return b11001;
    }

    public void setB11001(String b11001) {
        if (this.b11001.equals(b11001)) return;
        this.b11001 = b11001;
        notifyPropertyChanged(BR.b11001);
    }

    @Bindable
    public String getB11002() {
        return b11002;
    }

    public void setB11002(String b11002) {
        if (this.b11002.equals(b11002)) return;
        this.b11002 = b11002;
        notifyPropertyChanged(BR.b11002);
    }

    @Bindable
    public String getB11003() {
        return b11003;
    }

    public void setB11003(String b11003) {
        if (this.b11003.equals(b11003)) return;
        this.b11003 = b11003;
        notifyPropertyChanged(BR.b11003);
    }

    @Bindable
    public String getB11004() {
        return b11004;
    }

    public void setB11004(String b11004) {
        if (this.b11004.equals(b11004)) return;
        this.b11004 = b11004;
        notifyPropertyChanged(BR.b11004);
    }

    @Bindable
    public String getB11096() {
        return b11096;
    }

    public void setB11096(String b11096) {
        if (this.b11096.equals(b11096)) return;
        this.b11096 = b11096;
        setB11096x(b11096.equals("96") ? this.b11096x : "");
        notifyPropertyChanged(BR.b11096);
    }

    @Bindable
    public String getB11096x() {
        return b11096x;
    }

    public void setB11096x(String b11096x) {
        this.b11096x = b11096x;
        notifyPropertyChanged(BR.b11096x);
    }


    @Bindable
    public String getB11101() {
        return b11101;
    }

    public void setB11101(String b11101) {
        if (this.b11101.equals(b11101)) return;
        this.b11101 = b11101;
        notifyPropertyChanged(BR.b11101);
    }

    @Bindable
    public String getB11102() {
        return b11102;
    }

    public void setB11102(String b11102) {
        if (this.b11102.equals(b11102)) return;
        this.b11102 = b11102;
        notifyPropertyChanged(BR.b11102);
    }

    @Bindable
    public String getB11103() {
        return b11103;
    }

    public void setB11103(String b11103) {
        if (this.b11103.equals(b11103)) return;
        this.b11103 = b11103;
        notifyPropertyChanged(BR.b11103);
    }

    @Bindable
    public String getB11104() {
        return b11104;
    }

    public void setB11104(String b11104) {
        if (this.b11104.equals(b11104)) return;
        this.b11104 = b11104;
        notifyPropertyChanged(BR.b11104);
    }

    @Bindable
    public String getB11196() {
        return b11196;
    }

    public void setB11196(String b11196) {
        if (this.b11196.equals(b11196)) return;
        this.b11196 = b11196;
        setB11196x(b11196.equals("96") ? this.b11196x : "");
        notifyPropertyChanged(BR.b11196);
    }

    @Bindable
    public String getB11196x() {
        return b11196x;
    }

    public void setB11196x(String b11196x) {
        this.b11196x = b11196x;
        notifyPropertyChanged(BR.b11196x);
    }


    @Bindable
    public String getB11201() {
        return b11201;
    }

    public void setB11201(String b11201) {
        if (this.b11201.equals(b11201)) return;
        this.b11201 = b11201;
        notifyPropertyChanged(BR.b11201);
    }

    @Bindable
    public String getB11202() {
        return b11202;
    }

    public void setB11202(String b11202) {
        if (this.b11202.equals(b11202)) return;
        this.b11202 = b11202;
        notifyPropertyChanged(BR.b11202);
    }

    @Bindable
    public String getB11203() {
        return b11203;
    }

    public void setB11203(String b11203) {
        if (this.b11203.equals(b11203)) return;
        this.b11203 = b11203;
        notifyPropertyChanged(BR.b11203);
    }

    @Bindable
    public String getB11204() {
        return b11204;
    }

    public void setB11204(String b11204) {
        if (this.b11204.equals(b11204)) return;
        this.b11204 = b11204;
        notifyPropertyChanged(BR.b11204);
    }

    @Bindable
    public String getB11205() {
        return b11205;
    }

    public void setB11205(String b11205) {
        if (this.b11205.equals(b11205)) return;
        this.b11205 = b11205;
        notifyPropertyChanged(BR.b11205);
    }

    @Bindable
    public String getB11206() {
        return b11206;
    }

    public void setB11206(String b11206) {
        if (this.b11206.equals(b11206)) return;
        this.b11206 = b11206;
        setB11201(b11206.equals("6") ? "" : this.b11201);
        setB11202(b11206.equals("6") ? "" : this.b11202);
        setB11203(b11206.equals("6") ? "" : this.b11203);
        setB11204(b11206.equals("6") ? "" : this.b11204);
        setB11205(b11206.equals("6") ? "" : this.b11205);
        setB11298(b11206.equals("6") ? "" : this.b11298);
        setB11296(b11206.equals("6") ? "" : this.b11296);
        setB113(b11206.equals("6") ? "" : this.b113);
        notifyPropertyChanged(BR.b11206);
    }

    @Bindable
    public String getB11296() {
        return b11296;
    }

    public void setB11296(String b11296) {
        if (this.b11296.equals(b11296)) return;
        this.b11296 = b11296;
        setB11296x(b11296.equals("96") ? this.b11296x : "");
        notifyPropertyChanged(BR.b11296);
    }

    @Bindable
    public String getB11296x() {
        return b11296x;
    }

    public void setB11296x(String b11296x) {
        this.b11296x = b11296x;
        notifyPropertyChanged(BR.b11296x);
    }

    @Bindable
    public String getB11298() {
        return b11298;
    }

    public void setB11298(String b11298) {
        if (this.b11298.equals(b11298)) return;
        this.b11298 = b11298;
        setB11201(b11298.equals("998") ? "" : this.b11201);
        setB11202(b11298.equals("998") ? "" : this.b11202);
        setB11203(b11298.equals("998") ? "" : this.b11203);
        setB11204(b11298.equals("998") ? "" : this.b11204);
        setB11205(b11298.equals("998") ? "" : this.b11205);
        setB11206(b11298.equals("998") ? "" : this.b11206);
        setB11296(b11298.equals("998") ? "" : this.b11296);

        setB113(b11298.equals("998") ? "" : this.b113);
        notifyPropertyChanged(BR.b11298);
    }

    @Bindable
    public String getB113() {
        return b113;
    }

    public void setB113(String b113) {
        this.b113 = b113;
        setB11396x(b113.equals("96") ? this.b11396x : "");
        notifyPropertyChanged(BR.b113);
    }

    @Bindable
    public String getB11396x() {
        return b11396x;
    }

    public void setB11396x(String b11396x) {
        this.b11396x = b11396x;
        notifyPropertyChanged(BR.b11396x);
    }

    @Bindable
    public String getB114() {
        return b114;
    }

    public void setB114(String b114) {
        this.b114 = b114;
        setB11496x(b114.equals("96") ? this.b11496x : "");
        setB11598(b114.equals("6") ? "" : this.b11598);
        setB115h(b114.equals("6") ? "" : this.b115h);
        setB115m(b114.equals("6") ? "" : this.b115m);
        setB116(b114.equals("6") ? "" : this.b116);
        setB117(b114.equals("6") ? "" : this.b117);
        setB118(b114.equals("6") ? "" : this.b118);
        notifyPropertyChanged(BR.b114);
    }

    @Bindable
    public String getB11496x() {
        return b11496x;
    }

    public void setB11496x(String b11496x) {
        this.b11496x = b11496x;
        notifyPropertyChanged(BR.b11496x);
    }

    @Bindable
    public String getB11598() {
        return b11598;
    }

    public void setB11598(String b11598) {
        this.b11598 = b11598;
        setB115h(b11598.equals("998") ? "" : this.b115h);
        setB115m(b11598.equals("998") ? "" : this.b115m);
        notifyPropertyChanged(BR.b11598);
    }

    @Bindable
    public String getB115h() {
        return b115h;
    }

    public void setB115h(String b115h) {
        this.b115h = b115h;
        notifyPropertyChanged(BR.b115h);
    }

    @Bindable
    public String getB115m() {
        return b115m;
    }

    public void setB115m(String b115m) {
        this.b115m = b115m;
        notifyPropertyChanged(BR.b115m);
    }

    @Bindable
    public String getB116() {
        return b116;
    }

    public void setB116(String b116) {
        this.b116 = b116;
        setB11601x(b116.equals("1") ? this.b11601x : "");
        notifyPropertyChanged(BR.b116);
    }

    @Bindable
    public String getB11601x() {
        return b11601x;
    }

    public void setB11601x(String b11601x) {
        this.b11601x = b11601x;
        notifyPropertyChanged(BR.b11601x);
    }

    @Bindable
    public String getB117() {
        return b117;
    }

    public void setB117(String b117) {
        this.b117 = b117;
        setB118(b117.equals("2") ? "" : this.b118);
        notifyPropertyChanged(BR.b117);
    }

    @Bindable
    public String getB118() {
        return b118;
    }

    public void setB118(String b118) {
        this.b118 = b118;
        notifyPropertyChanged(BR.b118);
    }

    @Bindable
    public String getB119() {
        return b119;
    }

    public void setB119(String b119) {
        this.b119 = b119;
        setB120(b119.equals("1") ? this.b120 : "");
        notifyPropertyChanged(BR.b119);
    }

    @Bindable
    public String getB120() {
        return b120;
    }

    public void setB120(String b120) {
        this.b120 = b120;
        notifyPropertyChanged(BR.b120);
    }

    @Bindable
    public String getB201() {
        return b201;
    }

    public void setB201(String b201) {
        this.b201 = b201;
        setB20196x(b201.equals("96") ? this.b20196x : "");
        notifyPropertyChanged(BR.b201);
    }

    @Bindable
    public String getB20196x() {
        return b20196x;
    }

    public void setB20196x(String b20196x) {
        this.b20196x = b20196x;
        notifyPropertyChanged(BR.b20196x);
    }

    @Bindable
    public String getB202() {
        return b202;
    }

    public void setB202(String b202) {
        this.b202 = b202;
        notifyPropertyChanged(BR.b202);
    }

    @Bindable
    public String getB202998() {
        return b202998;
    }

    public void setB202998(String b202998) {
        if (this.b202998.equals(b202998)) return;
        this.b202998 = b202998;
        setB202w(b202998.equals("998") ? "" : this.b202w);
        setB202m(b202998.equals("998") ? "" : this.b202m);
        setB202y(b202998.equals("998") ? "" : this.b202y);
        notifyPropertyChanged(BR.b202998);
    }

    @Bindable
    public String getB202w() {
        return b202w;
    }

    public void setB202w(String b202w) {
        this.b202w = b202w;
        notifyPropertyChanged(BR.b202w);
    }

    @Bindable
    public String getB202m() {
        return b202m;
    }

    public void setB202m(String b202m) {
        this.b202m = b202m;
        notifyPropertyChanged(BR.b202m);
    }

    @Bindable
    public String getB202y() {
        return b202y;
    }

    public void setB202y(String b202y) {
        this.b202y = b202y;
        notifyPropertyChanged(BR.b202y);
    }

    @Bindable
    public String getB203() {
        return b203;
    }

    public void setB203(String b203) {
        this.b203 = b203;
        setB204w(b203.equals("3") ? "" : this.b204w);
        setB204m(b203.equals("3") ? "" : this.b204m);
        setB204998(b203.equals("3") ? "" : this.b204998);
        setB205a(b203.equals("3") ? "" : this.b205a);
        setB205b(b203.equals("3") ? "" : this.b205b);
        setB205c(b203.equals("3") ? "" : this.b205c);
        setB20601(b203.equals("1") ? "" : this.b20601);
        setB20602(b203.equals("1") ? "" : this.b20602);
        setB209(b203.equals("1") ? "" : this.b209);
        setB209a(b203.equals("1") ? "" : this.b209a);
        setB209b(b203.equals("1") ? "" : this.b209b);
        setB209c(b203.equals("1") ? "" : this.b209c);
        setB210(b203.equals("1") ? "" : this.b210);
        notifyPropertyChanged(BR.b203);
    }

    @Bindable
    public String getB204() {
        return b204;
    }

    public void setB204(String b204) {
        this.b204 = b204;
        notifyPropertyChanged(BR.b204);
    }

    @Bindable
    public String getB204998() {
        return b204998;
    }

    public void setB204998(String b204998) {
        if (this.b204998.equals(b204998)) return;
        this.b204998 = b204998;
        setB204w(b204998.equals("998") ? "" : this.b204w);
        setB204m(b204998.equals("998") ? "" : this.b204m);
        notifyPropertyChanged(BR.b204998);
    }

    @Bindable
    public String getB204w() {
        return b204w;
    }

    public void setB204w(String b204w) {
        this.b204w = b204w;
        notifyPropertyChanged(BR.b204w);
    }

    @Bindable
    public String getB204m() {
        return b204m;
    }

    public void setB204m(String b204m) {
        this.b204m = b204m;
        notifyPropertyChanged(BR.b204m);
    }

    @Bindable
    public String getB205a() {
        return b205a;
    }

    public void setB205a(String b205a) {
        this.b205a = b205a;
        notifyPropertyChanged(BR.b205a);
    }

    @Bindable
    public String getB205b() {
        return b205b;
    }

    public void setB205b(String b205b) {
        this.b205b = b205b;
        notifyPropertyChanged(BR.b205b);
    }

    @Bindable
    public String getB205c() {
        return b205c;
    }

    public void setB205c(String b205c) {
        this.b205c = b205c;
        notifyPropertyChanged(BR.b205c);
    }

    @Bindable
    public String getB20601() {
        return b20601;
    }

    public void setB20601(String b20601) {
        this.b20601 = b20601;
        notifyPropertyChanged(BR.b20601);
    }

    @Bindable
    public String getB20602() {
        return b20602;
    }

    public void setB20602(String b20602) {
        this.b20602 = b20602;
        notifyPropertyChanged(BR.b20602);
    }

    @Bindable
    public String getB207a() {
        return b207a;
    }

    public void setB207a(String b207a) {
        this.b207a = b207a;
        notifyPropertyChanged(BR.b207a);
    }

    @Bindable
    public String getB207b() {
        return b207b;
    }

    public void setB207b(String b207b) {
        this.b207b = b207b;
        notifyPropertyChanged(BR.b207b);
    }

    @Bindable
    public String getB207c() {
        return b207c;
    }

    public void setB207c(String b207c) {
        this.b207c = b207c;
        notifyPropertyChanged(BR.b207c);
    }

    @Bindable
    public String getB208a() {
        return b208a;
    }

    public void setB208a(String b208a) {
        this.b208a = b208a;
        notifyPropertyChanged(BR.b208a);
    }

    @Bindable
    public String getB208b() {
        return b208b;
    }

    public void setB208b(String b208b) {
        this.b208b = b208b;
        notifyPropertyChanged(BR.b208b);
    }

    @Bindable
    public String getB209() {
        return b209;
    }

    public void setB209(String b209) {
        if (this.b209.equals(b209)) return;
        this.b209 = b209;
        setB209a(b209.equals("998") ? "" : this.b209a);
        setB209b(b209.equals("998") ? "" : this.b209b);
        setB209c(b209.equals("998") ? "" : this.b209c);
        notifyPropertyChanged(BR.b209);
    }

    @Bindable
    public String getB209a() {
        return b209a;
    }

    public void setB209a(String b209a) {
        this.b209a = b209a;
        notifyPropertyChanged(BR.b209a);
    }

    @Bindable
    public String getB209b() {
        return b209b;
    }

    public void setB209b(String b209b) {
        this.b209b = b209b;
        notifyPropertyChanged(BR.b209b);
    }

    @Bindable
    public String getB209c() {
        return b209c;
    }

    public void setB209c(String b209c) {
        this.b209c = b209c;
        notifyPropertyChanged(BR.b209c);
    }

    @Bindable
    public String getB210() {
        return b210;
    }

    public void setB210(String b210) {
        this.b210 = b210;
        notifyPropertyChanged(BR.b210);
    }

    @Bindable
    public String getB211() {
        return b211;
    }

    public void setB211(String b211) {
        this.b211 = b211;
        notifyPropertyChanged(BR.b211);
    }

    @Bindable
    public String getB211998() {
        return b211998;
    }

    public void setB211998(String b211998) {
        if (this.b211998.equals(b211998)) return;
        this.b211998 = b211998;
        setB21101(b211998.equals("998") ? "" : this.b21101);
        notifyPropertyChanged(BR.b211998);
    }

    @Bindable
    public String getB21101() {
        return b21101;
    }

    public void setB21101(String b21101) {
        this.b21101 = b21101;
        notifyPropertyChanged(BR.b21101);
    }

    @Bindable
    public String getB212() {
        return b212;
    }

    public void setB212(String b212) {
        this.b212 = b212;
        notifyPropertyChanged(BR.b212);
    }

    @Bindable
    public String getB212998() {
        return b212998;
    }

    public void setB212998(String b212998) {
        if (this.b212998.equals(b212998)) return;
        this.b212998 = b212998;
        setB21201(b212998.equals("998") ? "" : this.b21201);
        setB21202(b212998.equals("998") ? "" : this.b21202);
        notifyPropertyChanged(BR.b212998);
    }

    @Bindable
    public String getB21201() {
        return b21201;
    }

    public void setB21201(String b21201) {
        this.b21201 = b21201;
        notifyPropertyChanged(BR.b21201);
    }

    @Bindable
    public String getB21202() {
        return b21202;
    }

    public void setB21202(String b21202) {
        this.b21202 = b21202;
        notifyPropertyChanged(BR.b21202);
    }

    @Bindable
    public String getB213() {
        return b213;
    }

    public void setB213(String b213) {
        this.b213 = b213;
        setB21396x(b213.equals("96") ? this.b21396x : "");
        notifyPropertyChanged(BR.b213);
    }

    @Bindable
    public String getB21396x() {
        return b21396x;
    }

    public void setB21396x(String b21396x) {
        this.b21396x = b21396x;
        notifyPropertyChanged(BR.b21396x);
    }

    @Bindable
    public String getB214() {
        return b214;
    }

    public void setB214(String b214) {
        this.b214 = b214;
        notifyPropertyChanged(BR.b214);
    }

    @Bindable
    public String getB215() {
        return b215;
    }

    public void setB215(String b215) {
        this.b215 = b215;
        notifyPropertyChanged(BR.b215);
    }

    @Bindable
    public String getB21501() {
        return b21501;
    }

    public void setB21501(String b21501) {
        if (this.b21501.equals(b21501)) return;
        this.b21501 = b21501;
        notifyPropertyChanged(BR.b21501);
    }

    @Bindable
    public String getB21502() {
        return b21502;
    }

    public void setB21502(String b21502) {
        if (this.b21502.equals(b21502)) return;
        this.b21502 = b21502;
        notifyPropertyChanged(BR.b21502);
    }

    @Bindable
    public String getB21503() {
        return b21503;
    }

    public void setB21503(String b21503) {
        if (this.b21503.equals(b21503)) return;
        this.b21503 = b21503;
        notifyPropertyChanged(BR.b21503);
    }

    @Bindable
    public String getB21504() {
        return b21504;
    }

    public void setB21504(String b21504) {
        if (this.b21504.equals(b21504)) return;
        this.b21504 = b21504;
        notifyPropertyChanged(BR.b21504);
    }

    @Bindable
    public String getB21596() {
        return b21596;
    }

    public void setB21596(String b21596) {
        if (this.b21596.equals(b21596)) return;
        this.b21596 = b21596;
        setB21596x(b21596.equals("96") ? this.b21596x : "");
        notifyPropertyChanged(BR.b21596);
    }

    @Bindable
    public String getB21596x() {
        return b21596x;
    }

    public void setB21596x(String b21596x) {
        this.b21596x = b21596x;
        notifyPropertyChanged(BR.b21596x);
    }

    @Bindable
    public String getB216() {
        return b216;
    }

    public void setB216(String b216) {
        this.b216 = b216;
        notifyPropertyChanged(BR.b216);
    }

    @Bindable
    public String getB21601() {
        return b21601;
    }

    public void setB21601(String b21601) {
        if (this.b21601.equals(b21601)) return;
        this.b21601 = b21601;
        notifyPropertyChanged(BR.b21601);
    }

    @Bindable
    public String getB21602() {
        return b21602;
    }

    public void setB21602(String b21602) {
        if (this.b21602.equals(b21602)) return;
        this.b21602 = b21602;
        notifyPropertyChanged(BR.b21602);
    }

    @Bindable
    public String getB21603() {
        return b21603;
    }

    public void setB21603(String b21603) {
        if (this.b21603.equals(b21603)) return;
        this.b21603 = b21603;
        notifyPropertyChanged(BR.b21603);
    }

    @Bindable
    public String getB21604() {
        return b21604;
    }

    public void setB21604(String b21604) {
        if (this.b21604.equals(b21604)) return;
        this.b21604 = b21604;
        notifyPropertyChanged(BR.b21604);
    }

    @Bindable
    public String getB21696() {
        return b21696;
    }

    public void setB21696(String b21696) {
        if (this.b21696.equals(b21696)) return;
        this.b21696 = b21696;
        setB21696x(b21696.equals("96") ? this.b21696x : "");
        notifyPropertyChanged(BR.b21696);
    }

    @Bindable
    public String getB21696x() {
        return b21696x;
    }

    public void setB21696x(String b21696x) {
        this.b21696x = b21696x;
        notifyPropertyChanged(BR.b21696x);
    }

    @Bindable
    public String getB217() {
        return b217;
    }

    public void setB217(String b217) {
        this.b217 = b217;
        notifyPropertyChanged(BR.b217);
    }

    @Bindable
    public String getB21701() {
        return b21701;
    }

    public void setB21701(String b21701) {
        if (this.b21701.equals(b21701)) return;
        this.b21701 = b21701;
        notifyPropertyChanged(BR.b21701);
    }

    @Bindable
    public String getB21702() {
        return b21702;
    }

    public void setB21702(String b21702) {
        if (this.b21702.equals(b21702)) return;
        this.b21702 = b21702;
        notifyPropertyChanged(BR.b21702);
    }

    @Bindable
    public String getB21703() {
        return b21703;
    }

    public void setB21703(String b21703) {
        if (this.b21703.equals(b21703)) return;
        this.b21703 = b21703;
        notifyPropertyChanged(BR.b21703);
    }

    @Bindable
    public String getB21704() {
        return b21704;
    }

    public void setB21704(String b21704) {
        if (this.b21704.equals(b21704)) return;
        this.b21704 = b21704;
        notifyPropertyChanged(BR.b21704);
    }

    @Bindable
    public String getB21796() {
        return b21796;
    }

    public void setB21796(String b21796) {
        if (this.b21796.equals(b21796)) return;
        this.b21796 = b21796;
        setB21796x(b21796.equals("96") ? this.b21796x : "");
        notifyPropertyChanged(BR.b21796);
    }

    @Bindable
    public String getB21796x() {
        return b21796x;
    }

    public void setB21796x(String b21796x) {
        this.b21796x = b21796x;
        notifyPropertyChanged(BR.b21796x);
    }

    @Bindable
    public String getB218() {
        return b218;
    }

    public void setB218(String b218) {
        this.b218 = b218;
        notifyPropertyChanged(BR.b218);
    }

    @Bindable
    public String getB21801() {
        return b21801;
    }

    public void setB21801(String b21801) {
        if (this.b21801.equals(b21801)) return;
        this.b21801 = b21801;
        notifyPropertyChanged(BR.b21801);
    }

    @Bindable
    public String getB21802() {
        return b21802;
    }

    public void setB21802(String b21802) {
        if (this.b21802.equals(b21802)) return;
        this.b21802 = b21802;
        notifyPropertyChanged(BR.b21802);
    }

    @Bindable
    public String getB21803() {
        return b21803;
    }

    public void setB21803(String b21803) {
        if (this.b21803.equals(b21803)) return;
        this.b21803 = b21803;
        notifyPropertyChanged(BR.b21803);
    }

    @Bindable
    public String getB21804() {
        return b21804;
    }

    public void setB21804(String b21804) {
        if (this.b21804.equals(b21804)) return;
        this.b21804 = b21804;
        notifyPropertyChanged(BR.b21804);
    }

    @Bindable
    public String getB21805() {
        return b21805;
    }

    public void setB21805(String b21805) {
        if (this.b21805.equals(b21805)) return;
        this.b21805 = b21805;
        notifyPropertyChanged(BR.b21805);
    }

    @Bindable
    public String getB21806() {
        return b21806;
    }

    public void setB21806(String b21806) {
        if (this.b21806.equals(b21806)) return;
        this.b21806 = b21806;
        setB21801(b21806.equals("6") ? "" : this.b21801);
        setB21802(b21806.equals("6") ? "" : this.b21802);
        setB21803(b21806.equals("6") ? "" : this.b21803);
        setB21804(b21806.equals("6") ? "" : this.b21804);
        setB21805(b21806.equals("6") ? "" : this.b21805);
        setB218998(b21806.equals("6") ? "" : this.b218998);
        setB21896(b21806.equals("6") ? "" : this.b21896);
        setB219(b21806.equals("6") ? "" : this.b219);
        notifyPropertyChanged(BR.b21806);
    }

    @Bindable
    public String getB21896() {
        return b21896;
    }

    public void setB21896(String b21896) {
        if (this.b21896.equals(b21896)) return;
        this.b21896 = b21896;
        setB21896x(b21896.equals("96") ? this.b21896x : "");
        notifyPropertyChanged(BR.b21896);
    }

    @Bindable
    public String getB21896x() {
        return b21896x;
    }

    public void setB21896x(String b21896x) {
        this.b21896x = b21896x;
        notifyPropertyChanged(BR.b21896x);
    }

    @Bindable
    public String getB218998() {
        return b218998;
    }

    public void setB218998(String b218998) {
        if (this.b218998.equals(b218998)) return;
        this.b218998 = b218998;
        setB21801(b218998.equals("998") ? "" : this.b21801);
        setB21802(b218998.equals("998") ? "" : this.b21802);
        setB21803(b218998.equals("998") ? "" : this.b21803);
        setB21804(b218998.equals("998") ? "" : this.b21804);
        setB21805(b218998.equals("998") ? "" : this.b21805);
        setB21806(b218998.equals("998") ? "" : this.b21806);
        setB21896(b218998.equals("998") ? "" : this.b21896);
        setB219(b218998.equals("998") ? "" : this.b219);
        notifyPropertyChanged(BR.b218998);
    }

    @Bindable
    public String getB219() {
        return b219;
    }

    public void setB219(String b219) {
        this.b219 = b219;
        setB21996x(b219.equals("96") ? this.b21996x : "");
        notifyPropertyChanged(BR.b219);
    }

    @Bindable
    public String getB21996x() {
        return b21996x;
    }

    public void setB21996x(String b21996x) {
        this.b21996x = b21996x;
        notifyPropertyChanged(BR.b21996x);
    }

    @Bindable
    public String getB220() {
        return b220;
    }

    public void setB220(String b220) {
        this.b220 = b220;
        setB22096x(b220.equals("96") ? this.b22096x : "");
        setB22101(b220.equals("6") ? "" : this.b22101);
        setB221998(b220.equals("6") ? "" : this.b221998);
        setB222h(b220.equals("6") ? "" : this.b222h);
        setB222m(b220.equals("6") ? "" : this.b222m);
        setB222998(b220.equals("6") ? "" : this.b222998);
        setB223(b220.equals("6") ? "" : this.b223);
        setB224(b220.equals("6") ? "" : this.b224);
        notifyPropertyChanged(BR.b220);
    }

    @Bindable
    public String getB22096x() {
        return b22096x;
    }

    public void setB22096x(String b22096x) {
        this.b22096x = b22096x;
        notifyPropertyChanged(BR.b22096x);
    }

    @Bindable
    public String getB221() {
        return b221;
    }

    public void setB221(String b221) {
        this.b221 = b221;
        notifyPropertyChanged(BR.b221);
    }

    @Bindable
    public String getB221998() {
        return b221998;
    }

    public void setB221998(String b221998) {
        if (this.b221998.equals(b221998)) return;
        this.b221998 = b221998;
        setB22101(b221998.equals("998") ? "" : this.b22101);
        notifyPropertyChanged(BR.b221998);
    }

    @Bindable
    public String getB22101() {
        return b22101;
    }

    public void setB22101(String b22101) {
        this.b22101 = b22101;
        notifyPropertyChanged(BR.b22101);
    }

    @Bindable
    public String getB222() {
        return b222;
    }

    public void setB222(String b222) {
        this.b222 = b222;
        notifyPropertyChanged(BR.b222);
    }

    @Bindable
    public String getB222998() {
        return b222998;
    }

    public void setB222998(String b222998) {
        if (this.b222998.equals(b222998)) return;
        this.b222998 = b222998;
        setB222h(b222998.equals("998") ? "" : this.b222h);
        setB222m(b222998.equals("998") ? "" : this.b222m);
        notifyPropertyChanged(BR.b222998);
    }

    @Bindable
    public String getB222h() {
        return b222h;
    }

    public void setB222h(String b222h) {
        this.b222h = b222h;
        notifyPropertyChanged(BR.b222h);
    }

    @Bindable
    public String getB222m() {
        return b222m;
    }

    public void setB222m(String b222m) {
        this.b222m = b222m;
        notifyPropertyChanged(BR.b222m);
    }

    @Bindable
    public String getB223() {
        return b223;
    }

    public void setB223(String b223) {
        this.b223 = b223;
        setB224(b223.equals("2") ? "" : this.b224);
        notifyPropertyChanged(BR.b223);
    }

    @Bindable
    public String getB224() {
        return b224;
    }

    public void setB224(String b224) {
        this.b224 = b224;
        notifyPropertyChanged(BR.b224);
    }


    @Bindable
    public String getBstaa() {
        return bstaa;
    }

    public void setBstaa(String bstaa) {
        this.bstaa = bstaa;
        setBstab(bstaa.equals("2") ? this.bstab : "");
        notifyPropertyChanged(BR.bstaa);
    }

    @Bindable
    public String getBstab() {
        return bstab;
    }

    public void setBstab(String bstab) {
        this.bstab = bstab;
        setBstab96x(bstab.equals("96") ? this.bstab96x : "");
        notifyPropertyChanged(BR.bstab);
    }

    @Bindable
    public String getBstab96x() {
        return bstab96x;
    }

    public void setBstab96x(String bstab96x) {
        this.bstab96x = bstab96x;
        notifyPropertyChanged(BR.bstab96x);
    }


    public Recipient Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_SNO));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_INDEXED));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_SYNCED_DATE));

        sB1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_SB1)));
        sB2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(RecipientTable.COLUMN_SB2)));
        return this;
    }

    public void sB1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.b101 = json.getString("b101");
            this.b102 = json.getString("b102");
            this.b103 = json.getString("b103");
            this.b10398 = json.getString("b10398");
            this.b104y = json.getString("b104y");
            this.b104m = json.getString("b104m");
            this.b104w = json.getString("b104w");
            this.b10498 = json.getString("b10498");
            this.b105y = json.getString("b105y");
            this.b105w = json.getString("b105w");
            this.b105m = json.getString("b105m");
            this.b10598 = json.getString("b10598");
            this.b106 = json.getString("b106");
            this.b10698 = json.getString("b10698");
            this.b107 = json.getString("b107");
            this.b10796x = json.getString("b10796x");
            this.b108 = json.getString("b108");
            this.b10898 = json.getString("b10898");
            this.b10901 = json.getString("b10901");
            this.b10902 = json.getString("b10902");
            this.b10903 = json.getString("b10903");
            this.b10904 = json.getString("b10904");
            this.b10996 = json.getString("b10996");
            this.b10996x = json.getString("b10996x");
            this.b11001 = json.getString("b11001");
            this.b11002 = json.getString("b11002");
            this.b11003 = json.getString("b11003");
            this.b11004 = json.getString("b11004");
            this.b11096 = json.getString("b11096");
            this.b11096x = json.getString("b11096x");
            this.b11101 = json.getString("b11101");
            this.b11102 = json.getString("b11102");
            this.b11103 = json.getString("b11103");
            this.b11104 = json.getString("b11104");
            this.b11196 = json.getString("b11196");
            this.b11196x = json.getString("b11196x");
            this.b11201 = json.getString("b11201");
            this.b11202 = json.getString("b11202");
            this.b11203 = json.getString("b11203");
            this.b11204 = json.getString("b11204");
            this.b11205 = json.getString("b11205");
            this.b11206 = json.getString("b11206");
            this.b11296 = json.getString("b11296");
            this.b11296x = json.getString("b11296x");
            this.b11298 = json.getString("b11298");
            this.b113 = json.getString("b113");
            this.b11396x = json.getString("b11396x");
            this.b114 = json.getString("b114");
            this.b11496x = json.getString("b11496x");
            this.b11598 = json.getString("b11598");
            this.b115h = json.getString("b115h");
            this.b115m = json.getString("b115m");
            this.b116 = json.getString("b116");
            this.b11601x = json.getString("b11601x");
            this.b117 = json.getString("b117");
            this.b118 = json.getString("b118");
            this.b119 = json.getString("b119");
            this.b120 = json.getString("b120");
        }
    }

    public void sB2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.b201 = json.getString("b201");
            this.b20196x = json.getString("b20196x");
            this.b202 = json.getString("b202");
            this.b202998 = json.getString("b202998");
            this.b202w = json.getString("b202w");
            this.b202m = json.getString("b202m");
            this.b202y = json.getString("b202y");
            this.b203 = json.getString("b203");
            this.b204 = json.getString("b204");
            this.b204998 = json.getString("b204998");
            this.b204w = json.getString("b204w");
            this.b204m = json.getString("b204m");
            this.b205a = json.getString("b205a");
            this.b205b = json.getString("b205b");
            this.b205c = json.getString("b205c");
            this.b20601 = json.getString("b20601");
            this.b20602 = json.has("b20602") ? json.getString("b20602") : "";
            this.b207a = json.getString("b207a");
            this.b207b = json.getString("b207b");
            this.b207c = json.getString("b207c");
            this.b208a = json.getString("b208a");
            this.b208b = json.getString("b208b");
            this.b209 = json.getString("b209");
            this.b209a = json.getString("b209a");
            this.b209b = json.getString("b209b");
            this.b209c = json.getString("b209c");
            this.b210 = json.getString("b210");
            this.b211 = json.getString("b211");
            this.b211998 = json.getString("b211998");
            this.b21101 = json.getString("b21101");
            this.b212 = json.getString("b212");
            this.b212998 = json.getString("b212998");
            this.b21201 = json.getString("b21201");
            this.b21202 = json.getString("b21202");
            this.b213 = json.getString("b213");
            this.b21396x = json.getString("b21396x");
            this.b214 = json.getString("b214");
            this.b215 = json.getString("b215");
            this.b21501 = json.getString("b21501");
            this.b21502 = json.getString("b21502");
            this.b21503 = json.getString("b21503");
            this.b21504 = json.getString("b21504");
            this.b21596 = json.getString("b21596");
            this.b21596x = json.getString("b21596x");
            this.b216 = json.getString("b216");
            this.b21601 = json.getString("b21601");
            this.b21602 = json.getString("b21602");
            this.b21603 = json.getString("b21603");
            this.b21604 = json.getString("b21604");
            this.b21696 = json.getString("b21696");
            this.b21696x = json.getString("b21696x");
            this.b217 = json.getString("b217");
            this.b21701 = json.getString("b21701");
            this.b21702 = json.getString("b21702");
            this.b21703 = json.getString("b21703");
            this.b21704 = json.getString("b21704");
            this.b21796 = json.getString("b21796");
            this.b21796x = json.getString("b21796x");
            this.b218 = json.getString("b218");
            this.b21801 = json.getString("b21801");
            this.b21802 = json.getString("b21802");
            this.b21803 = json.getString("b21803");
            this.b21804 = json.getString("b21804");
            this.b21805 = json.getString("b21805");
            this.b21806 = json.getString("b21806");
            this.b21896 = json.getString("b21896");
            this.b21896x = json.getString("b21896x");
            this.b218998 = json.getString("b218998");
            this.b219 = json.getString("b219");
            this.b21996x = json.getString("b21996x");
            this.b220 = json.getString("b220");
            this.b22096x = json.getString("b22096x");
            this.b221 = json.getString("b221");
            this.b221998 = json.getString("b221998");
            this.b22101 = json.getString("b22101");
            this.b222 = json.getString("b222");
            this.b222998 = json.getString("b222998");
            this.b222h = json.getString("b222h");
            this.b222m = json.getString("b222m");
            this.b223 = json.getString("b223");
            this.b224 = json.getString("b224");
            this.bstaa = json.getString("bstaa");
            this.bstab = json.getString("bstab");
            this.bstab96x = json.getString("bstab96x");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(RecipientTable.COLUMN_ID, this.id);
        json.put(RecipientTable.COLUMN_UID, this.uid);
        json.put(RecipientTable.COLUMN_UUID, this.uuid);
        json.put(RecipientTable.COLUMN_FMUID, this.fmuid);
        json.put(RecipientTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(RecipientTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(RecipientTable.COLUMN_HHID, this.hhid);
        json.put(RecipientTable.COLUMN_INDEXED, this.indexed);
        json.put(RecipientTable.COLUMN_SNO, this.sno);
        json.put(RecipientTable.COLUMN_USERNAME, this.userName);
        json.put(RecipientTable.COLUMN_SYSDATE, this.sysDate);
        json.put(RecipientTable.COLUMN_DEVICEID, this.deviceId);
        json.put(RecipientTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(RecipientTable.COLUMN_ISTATUS, this.iStatus);
        json.put(RecipientTable.COLUMN_SYNCED, this.synced);
        json.put(RecipientTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(RecipientTable.COLUMN_APPVERSION, this.appver);

        json.put(RecipientTable.COLUMN_SB1, new JSONObject(sB1toString()));
        json.put(RecipientTable.COLUMN_SB2, new JSONObject(sB2toString()));
        return json;
    }

    public String sB1toString() throws JSONException {
        Log.d(TAG, "sB1toString: ");
        JSONObject json = new JSONObject();
        json.put("b101", b101)
                .put("b102", b102)
                .put("b103", b103)
                .put("b10398", b10398)
                .put("b104y", b104y)
                .put("b104m", b104m)
                .put("b104w", b104w)
                .put("b10498", b10498)
                .put("b105y", b105y)
                .put("b105w", b105w)
                .put("b105m", b105m)
                .put("b10598", b10598)
                .put("b106", b106)
                .put("b10698", b10698)
                .put("b107", b107)
                .put("b10796x", b10796x)
                .put("b108", b108)
                .put("b10898", b10898)
                .put("b10901", b10901)
                .put("b10902", b10902)
                .put("b10903", b10903)
                .put("b10904", b10904)
                .put("b10996", b10996)
                .put("b10996x", b10996x)
                .put("b11001", b11001)
                .put("b11002", b11002)
                .put("b11003", b11003)
                .put("b11004", b11004)
                .put("b11096", b11096)
                .put("b11096x", b11096x)
                .put("b11101", b11101)
                .put("b11102", b11102)
                .put("b11103", b11103)
                .put("b11104", b11104)
                .put("b11196", b11196)
                .put("b11196x", b11196x)
                .put("b11201", b11201)
                .put("b11202", b11202)
                .put("b11203", b11203)
                .put("b11204", b11204)
                .put("b11205", b11205)
                .put("b11206", b11206)
                .put("b11296", b11296)
                .put("b11296x", b11296x)
                .put("b11298", b11298)
                .put("b113", b113)
                .put("b11396x", b11396x)
                .put("b114", b114)
                .put("b11496x", b11496x)
                .put("b11598", b11598)
                .put("b115h", b115h)
                .put("b115m", b115m)
                .put("b116", b116)
                .put("b11601x", b11601x)
                .put("b117", b117)
                .put("b118", b118)
                .put("b119", b119)
                .put("b120", b120);
        return json.toString();
    }

    public String sB2toString() throws JSONException {
        Log.d(TAG, "sB2toString: ");
        JSONObject json = new JSONObject();
        json.put("b201", b201)
                .put("b20196x", b20196x)
                .put("b202", b202)
                .put("b202998", b202998)
                .put("b202w", b202w)
                .put("b202m", b202m)
                .put("b202y", b202y)
                .put("b203", b203)
                .put("b204", b204)
                .put("b204998", b204998)
                .put("b204w", b204w)
                .put("b204m", b204m)
                .put("b205a", b205a)
                .put("b205b", b205b)
                .put("b205c", b205c)
                .put("b20601", b20601)
                .put("b20602", b20602)
                .put("b207a", b207a)
                .put("b207b", b207b)
                .put("b207c", b207c)
                .put("b208a", b208a)
                .put("b208b", b208b)
                .put("b209", b209)
                .put("b209a", b209a)
                .put("b209b", b209b)
                .put("b209c", b209c)
                .put("b210", b210)
                .put("b211", b211)
                .put("b211998", b211998)
                .put("b21101", b21101)
                .put("b212", b212)
                .put("b212998", b212998)
                .put("b21201", b21201)
                .put("b21202", b21202)
                .put("b213", b213)
                .put("b21396x", b21396x)
                .put("b214", b214)
                .put("b215", b215)
                .put("b21501", b21501)
                .put("b21502", b21502)
                .put("b21503", b21503)
                .put("b21504", b21504)
                .put("b21596", b21596)
                .put("b21596x", b21596x)
                .put("b216", b216)
                .put("b21601", b21601)
                .put("b21602", b21602)
                .put("b21603", b21603)
                .put("b21604", b21604)
                .put("b21696", b21696)
                .put("b21696x", b21696x)
                .put("b217", b217)
                .put("b21701", b21701)
                .put("b21702", b21702)
                .put("b21703", b21703)
                .put("b21704", b21704)
                .put("b21796", b21796)
                .put("b21796x", b21796x)
                .put("b218", b218)
                .put("b21801", b21801)
                .put("b21802", b21802)
                .put("b21803", b21803)
                .put("b21804", b21804)
                .put("b21805", b21805)
                .put("b21806", b21806)
                .put("b21896", b21896)
                .put("b21896x", b21896x)
                .put("b218998", b218998)
                .put("b219", b219)
                .put("b21996x", b21996x)
                .put("b220", b220)
                .put("b22096x", b22096x)
                .put("b221", b221)
                .put("b221998", b221998)
                .put("b22101", b22101)
                .put("b222", b222)
                .put("b222998", b222998)
                .put("b222h", b222h)
                .put("b222m", b222m)
                .put("b223", b223)
                .put("b224", b224)
                .put("bstaa", bstaa)
                .put("bstab", bstab)
                .put("bstab96x", bstab96x);
        return json.toString();
    }


}
