package edu.aku.hassannaqvi.wbcct_baseline.contracts;

import android.provider.BaseColumns;

public class TableContracts {


    public static abstract class FormsTable implements BaseColumns {
        public static final String TABLE_NAME = "FormHH";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_PROVINCE_CODE = "provinceCode";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_TEHSIL_CODE = "tehsilCode";
        public static final String COLUMN_UC_CODE = "ucCode";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_A105B = "a105B";
        public static final String COLUMN_A106 = "a106";
        public static final String COLUMN_A107 = "a107";
        public static final String COLUMN_SA1 = "sA1";
        public static final String COLUMN_SA3A = "sA3A";
        public static final String COLUMN_SA3B = "sA3B";
        public static final String COLUMN_SA4 = "sA4";
        public static final String COLUMN_SA5 = "sA5";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_ENTRY_TYPE = "entry_type";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class EntryLogTable implements BaseColumns {
        public static final String TABLE_NAME = "EntryLog";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_ENTRY_DATE = "entryDate";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNC_DATE = "sync_date";
        public static final String COLUMN_ENTRY_TYPE = "entry_type";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
    }

    public static abstract class FamilyMembersTable implements BaseColumns {
        public static final String TABLE_NAME = "FamilyMembers";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SA2 = "sA2";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class RecipientTable implements BaseColumns {
        public static final String TABLE_NAME = "Recipient";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_FMUID = "_fmuid";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SB1 = "sB1";
        public static final String COLUMN_SB2 = "sB2";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


    public static abstract class UsersTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_PASSWORD = "passwordenc";
        public static final String COLUMN_DISTRICT_CODE = "dist_id";
        public static final String COLUMN_FULLNAME = "full_name";
        public static final String COLUMN_DESIGNATION = "designation";
        public static final String COLUMN_ENABLED = "enabled";
        public static final String COLUMN_ISNEW_USER = "isNewUser";
        public static final String COLUMN_PWD_EXPIRY = "pwdExpiry";
        public static final String COLUMN_DIST_ID = "dist_id";
    }

    public static abstract class ClustersTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "clusters";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_PROVINCE_CODE = "provinceCode";
        public static final String COLUMN_PROVINCE_NAME = "provinceName";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_NAME = "districtName";
        public static final String COLUMN_TEHSIL_CODE = "tehsilCode";
        public static final String COLUMN_TEHSIL_NAME = "tehsilName";
        public static final String COLUMN_UC_CODE = "ucCode";
        public static final String COLUMN_UC_NAME = "ucName";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_VILLAGE_NAME = "villageName";
        public static final String COLUMN_CLUSTER_NO = "clusterNo";
    }


    public static abstract class VersionTable implements BaseColumns {
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String TABLE_NAME = "versionApp";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_VERSION_PATH = "elements";
        public static final String COLUMN_VERSION_CODE = "versionCode";
        public static final String COLUMN_VERSION_NAME = "versionName";
        public static final String COLUMN_PATH_NAME = "outputFile";
        public static final String SERVER_URI = "output-metadata.json";

    }


    public static abstract class MwraTable implements BaseColumns {
        public static final String TABLE_NAME = "MWRA";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_FMUID = "_fmuid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_SC1 = "sC1";
        public static final String COLUMN_SC2 = "sC2";
        public static final String COLUMN_SC3 = "sC3";
        public static final String COLUMN_SC4 = "sC4";
        public static final String COLUMN_SC5 = "sC5";
        public static final String COLUMN_SC6 = "sC6";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


    public static abstract class WEDMTable implements BaseColumns {
        public static final String TABLE_NAME = "WEDM";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SG1 = "sG1";
        public static final String COLUMN_SG2 = "sG2";
        public static final String COLUMN_SG3 = "sG3";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAG = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


    public static abstract class PregnancyTable implements BaseColumns {
        public static final String TABLE_NAME = "Pregnancy";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_FMUID = "_fmuid";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_SE1 = "sE1";
        public static final String COLUMN_SE2 = "sE2";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class ChildTable implements BaseColumns {
        public static final String TABLE_NAME = "Child";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_FMUID = "_fmuid";
        public static final String COLUMN_MUID = "_muid";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_INDEXED = "indexed";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_SD1 = "sD1";
        public static final String COLUMN_SD2 = "sD2";
        public static final String COLUMN_SD3 = "sD3";
        public static final String COLUMN_SD4 = "sD4";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class AnthroChildTable implements BaseColumns {
        public static final String TABLE_NAME = "AnthroChild";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_FMUID = "_fmuid";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_SF1 = "sF1";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }

    public static abstract class AnthroWRATable implements BaseColumns {
        public static final String TABLE_NAME = "AnthroWRA";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_FMUID = "_fmuid";
        public static final String COLUMN_VILLAGE_CODE = "villageCode";
        public static final String COLUMN_HHID = "hhid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_SF2 = "sF2";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_ISTATUS = "istatus";
    }


}
