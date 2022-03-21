package edu.aku.hassannaqvi.wbcct_baseline.database;


import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.IBAHC;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.wbcct_baseline.core.MainApp.child;
import static edu.aku.hassannaqvi.wbcct_baseline.core.UserAuth.checkPassword;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.util.Log;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteOpenHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.AnthroChildTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.AnthroWRATable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.ChildTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.ClustersTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.EntryLogTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.FamilyMembersTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.MwraTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.PregnancyTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.RecipientTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.UsersTable;
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.VersionTable;
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp;
import edu.aku.hassannaqvi.wbcct_baseline.models.AnthroChild;
import edu.aku.hassannaqvi.wbcct_baseline.models.AnthroWRA;
import edu.aku.hassannaqvi.wbcct_baseline.models.Child;
import edu.aku.hassannaqvi.wbcct_baseline.models.Clusters;
import edu.aku.hassannaqvi.wbcct_baseline.models.EntryLog;
import edu.aku.hassannaqvi.wbcct_baseline.models.FamilyMembers;
import edu.aku.hassannaqvi.wbcct_baseline.models.Form;
import edu.aku.hassannaqvi.wbcct_baseline.models.MWRA;
import edu.aku.hassannaqvi.wbcct_baseline.models.Pregnancy;
import edu.aku.hassannaqvi.wbcct_baseline.models.Recipient;
import edu.aku.hassannaqvi.wbcct_baseline.models.Users;
import edu.aku.hassannaqvi.wbcct_baseline.models.VersionApp;



/*import edu.aku.hassannaqvi.naunehal.models.Immunization;*/

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = PROJECT_NAME + ".db";
    public static final String DATABASE_COPY = PROJECT_NAME + "_copy.db";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_PASSWORD = IBAHC;
    private final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateTable.SQL_CREATE_USERS);
        db.execSQL(CreateTable.SQL_CREATE_CLUSTERS);
        //db.execSQL(SQL_CREATE_RANDOM);
        db.execSQL(CreateTable.SQL_CREATE_FORMS);
        db.execSQL(CreateTable.SQL_CREATE_FAMILYMEMBERS);
        db.execSQL(CreateTable.SQL_CREATE_RECIPIENT);
        db.execSQL(CreateTable.SQL_CREATE_MWRA);
        db.execSQL(CreateTable.SQL_CREATE_ANTHROWRA);
        db.execSQL(CreateTable.SQL_CREATE_CHILD);
        db.execSQL(CreateTable.SQL_CREATE_ANTHROCHILD);
        db.execSQL(CreateTable.SQL_CREATE_ENTRYLOGS);
        db.execSQL(CreateTable.SQL_CREATE_PREGNANCY);

        db.execSQL(CreateTable.SQL_CREATE_VERSIONAPP);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
            case 2:
        }
    }


    //ADDITION in DB
    public Long addForm(Form form) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsTable.COLUMN_UID, form.getUid());
        values.put(FormsTable.COLUMN_PSU_CODE, form.getPsuCode());
        values.put(FormsTable.COLUMN_HHID, form.getHhid());
        values.put(FormsTable.COLUMN_SNO, form.getSno());
        values.put(FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(FormsTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(FormsTable.COLUMN_PROVINCE_CODE, form.getProvinceCode());
        values.put(FormsTable.COLUMN_DISTRICT_CODE, form.getTehsilCode());
        values.put(FormsTable.COLUMN_TEHSIL_CODE, form.getProvinceCode());
        values.put(FormsTable.COLUMN_UC_CODE, form.getProvinceCode());
        values.put(FormsTable.COLUMN_VILLAGE_CODE, form.getProvinceCode());
        values.put(FormsTable.COLUMN_A105B, form.getA105b());
        values.put(FormsTable.COLUMN_A106, form.getA106());
        values.put(FormsTable.COLUMN_A107, form.getA107());
        values.put(FormsTable.COLUMN_SA1, form.sA1toString());
        values.put(FormsTable.COLUMN_SA3A, form.sA3AtoString());
        values.put(FormsTable.COLUMN_SA3B, form.sA3BtoString());
        values.put(FormsTable.COLUMN_SA4, form.sA4toString());
        values.put(FormsTable.COLUMN_SA5, form.sA5toString());
        values.put(FormsTable.COLUMN_ISTATUS, form.getiStatus());
        values.put(FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(FormsTable.COLUMN_ENTRY_TYPE, form.getEntryType());
        values.put(FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(FormsTable.COLUMN_APPVERSION, form.getAppver());
        values.put(FormsTable.COLUMN_SYNCED, form.getSynced());
        values.put(FormsTable.COLUMN_SYNCED_DATE, form.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                FormsTable.TABLE_NAME,
                FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addEntryLog(EntryLog entryLog) throws SQLiteException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_PROJECT_NAME, entryLog.getProjectName());
        values.put(EntryLogTable.COLUMN_UUID, entryLog.getUuid());
        values.put(EntryLogTable.COLUMN_PSU_CODE, entryLog.getPsuCode());
        values.put(EntryLogTable.COLUMN_HHID, entryLog.getHhid());
        values.put(EntryLogTable.COLUMN_USERNAME, entryLog.getUserName());
        values.put(EntryLogTable.COLUMN_SYSDATE, entryLog.getSysDate());
        values.put(EntryLogTable.COLUMN_ISTATUS, entryLog.getiStatus());
        values.put(EntryLogTable.COLUMN_ISTATUS96x, entryLog.getiStatus96x());
        values.put(EntryLogTable.COLUMN_ENTRY_TYPE, entryLog.getEntryType());
        values.put(EntryLogTable.COLUMN_ENTRY_DATE, entryLog.getEntryDate());
        values.put(EntryLogTable.COLUMN_DEVICEID, entryLog.getDeviceId());
        values.put(EntryLogTable.COLUMN_SYNCED, entryLog.getSynced());
        values.put(EntryLogTable.COLUMN_SYNC_DATE, entryLog.getSyncDate());
        values.put(EntryLogTable.COLUMN_APPVERSION, entryLog.getAppver());

        long newRowId;
        newRowId = db.insertOrThrow(
                EntryLogTable.TABLE_NAME,
                EntryLogTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addMWRA(MWRA mwra) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MwraTable.COLUMN_PROJECT_NAME, mwra.getProjectName());
        values.put(MwraTable.COLUMN_UID, mwra.getUid());
        values.put(MwraTable.COLUMN_UUID, mwra.getUuid());
        values.put(MwraTable.COLUMN_FMUID, mwra.getFmuid());
        //  values.put(MwraTable.COLUMN_MUID, mwra.getMuid());
        values.put(MwraTable.COLUMN_SNO, mwra.getSno());
        values.put(MwraTable.COLUMN_PSU_CODE, mwra.getpsuCode());
        values.put(MwraTable.COLUMN_HHID, mwra.getHhid());
        values.put(MwraTable.COLUMN_USERNAME, mwra.getUserName());
        values.put(MwraTable.COLUMN_SYSDATE, mwra.getSysDate());
        values.put(MwraTable.COLUMN_SC1, mwra.sC1toString());
        values.put(MwraTable.COLUMN_SC2, mwra.sC2toString());
        values.put(MwraTable.COLUMN_SC3, mwra.sC3toString());
        values.put(MwraTable.COLUMN_SC4, mwra.sC4toString());
        values.put(MwraTable.COLUMN_SC5, mwra.sC5toString());
        values.put(MwraTable.COLUMN_SC6, mwra.sC6toString());
        values.put(MwraTable.COLUMN_ISTATUS, mwra.getiStatus());
        values.put(MwraTable.COLUMN_DEVICETAGID, mwra.getDeviceTag());
        values.put(MwraTable.COLUMN_DEVICEID, mwra.getDeviceId());
        values.put(MwraTable.COLUMN_APPVERSION, mwra.getAppver());
        values.put(MwraTable.COLUMN_SYNCED, mwra.getSynced());
        values.put(MwraTable.COLUMN_SYNCED_DATE, mwra.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                MwraTable.TABLE_NAME,
                MwraTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addWAnthro(AnthroWRA anthw) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(TableContracts.AnthroWRATable.COLUMN_PROJECT_NAME, anthw.getProjectName());
        values.put(TableContracts.AnthroWRATable.COLUMN_UID, anthw.getUid());
        values.put(TableContracts.AnthroWRATable.COLUMN_UUID, anthw.getUuid());
        values.put(TableContracts.AnthroWRATable.COLUMN_FMUID, anthw.getFmuid());
        //  values.put(AnthroWRATable.COLUMN_MUID, anthw.getMuid());
        values.put(TableContracts.AnthroWRATable.COLUMN_SNO, anthw.getSno());
        values.put(TableContracts.AnthroWRATable.COLUMN_PSU_CODE, anthw.getpsuCode());
        values.put(AnthroWRATable.COLUMN_HHID, anthw.getHhid());
        values.put(TableContracts.AnthroWRATable.COLUMN_USERNAME, anthw.getUserName());
        values.put(TableContracts.AnthroWRATable.COLUMN_SYSDATE, anthw.getSysDate());
        values.put(TableContracts.AnthroWRATable.COLUMN_SF2, anthw.sF2toString());
        values.put(TableContracts.AnthroWRATable.COLUMN_ISTATUS, anthw.getiStatus());
        values.put(TableContracts.AnthroWRATable.COLUMN_DEVICETAGID, anthw.getDeviceTag());
        values.put(TableContracts.AnthroWRATable.COLUMN_DEVICEID, anthw.getDeviceId());
        values.put(TableContracts.AnthroWRATable.COLUMN_APPVERSION, anthw.getAppver());
        values.put(TableContracts.AnthroWRATable.COLUMN_SYNCED, anthw.getSynced());
        values.put(TableContracts.AnthroWRATable.COLUMN_SYNCED_DATE, anthw.getSyncDate());

        long newRowId;
        newRowId = db.insert(
                TableContracts.AnthroWRATable.TABLE_NAME,
                TableContracts.AnthroWRATable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addChild(Child child) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(ChildTable.COLUMN_PROJECT_NAME, child.getProjectName());
        values.put(ChildTable.COLUMN_UID, child.getUid());
        values.put(ChildTable.COLUMN_UUID, child.getUuid());
        values.put(ChildTable.COLUMN_FMUID, child.getFmuid());
        values.put(ChildTable.COLUMN_MUID, child.getMuid());
        values.put(ChildTable.COLUMN_SNO, child.getSno());
        values.put(ChildTable.COLUMN_PSU_CODE, child.getpsuCode());
        values.put(ChildTable.COLUMN_HHID, child.getHhid());
        values.put(ChildTable.COLUMN_USERNAME, child.getUserName());
        values.put(ChildTable.COLUMN_SYSDATE, child.getSysDate());
        values.put(ChildTable.COLUMN_SD1, child.sD1toString());
        values.put(ChildTable.COLUMN_SD2, child.sD2toString());
        values.put(ChildTable.COLUMN_SD3, child.sD3toString());
        values.put(ChildTable.COLUMN_SD4, child.sD4toString());
        values.put(ChildTable.COLUMN_ISTATUS, child.getiStatus());
        values.put(ChildTable.COLUMN_DEVICETAGID, child.getDeviceTag());
        values.put(ChildTable.COLUMN_DEVICEID, child.getDeviceId());
        values.put(ChildTable.COLUMN_APPVERSION, child.getAppver());
        values.put(ChildTable.COLUMN_SYNCED, child.getSynced());
        values.put(ChildTable.COLUMN_SYNCED_DATE, child.getSyncDate());
        long newRowId;
        newRowId = db.insert(
                ChildTable.TABLE_NAME,
                ChildTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addCAnthro(AnthroChild anthc) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(AnthroChildTable.COLUMN_PROJECT_NAME, anthc.getProjectName());
        values.put(AnthroChildTable.COLUMN_UID, anthc.getUid());
        values.put(AnthroChildTable.COLUMN_UUID, anthc.getUuid());
        values.put(AnthroChildTable.COLUMN_FMUID, anthc.getFmuid());
        values.put(AnthroChildTable.COLUMN_SNO, anthc.getSno());
        values.put(AnthroChildTable.COLUMN_PSU_CODE, anthc.getpsuCode());
        values.put(AnthroChildTable.COLUMN_HHID, anthc.getHhid());
        values.put(AnthroChildTable.COLUMN_USERNAME, anthc.getUserName());
        values.put(AnthroChildTable.COLUMN_SYSDATE, anthc.getSysDate());
        values.put(AnthroChildTable.COLUMN_SF1, anthc.sF1toString());
        values.put(AnthroChildTable.COLUMN_ISTATUS, anthc.getiStatus());
        values.put(AnthroChildTable.COLUMN_DEVICETAGID, anthc.getDeviceTag());
        values.put(AnthroChildTable.COLUMN_DEVICEID, anthc.getDeviceId());
        values.put(AnthroChildTable.COLUMN_APPVERSION, anthc.getAppver());
        values.put(AnthroChildTable.COLUMN_SYNCED, anthc.getSynced());
        values.put(AnthroChildTable.COLUMN_SYNCED_DATE, anthc.getSyncDate());
        long newRowId;
        newRowId = db.insert(
                AnthroChildTable.TABLE_NAME,
                AnthroChildTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public Long addPregnancy(Pregnancy preg) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(PregnancyTable.COLUMN_PROJECT_NAME, preg.getProjectName());
        values.put(PregnancyTable.COLUMN_UID, preg.getUid());
        values.put(PregnancyTable.COLUMN_UUID, preg.getUuid());
        values.put(PregnancyTable.COLUMN_FMUID, preg.getFmuid());
        values.put(PregnancyTable.COLUMN_PSU_CODE, preg.getpsuCode());
        values.put(PregnancyTable.COLUMN_HHID, preg.getHhid());
        values.put(PregnancyTable.COLUMN_SNO, preg.getSno());
        values.put(PregnancyTable.COLUMN_USERNAME, preg.getUserName());
        values.put(PregnancyTable.COLUMN_SYSDATE, preg.getSysDate());
        values.put(PregnancyTable.COLUMN_SE1, preg.sE1toString());
        //     values.put(PregnancyTable.COLUMN_SE2, preg.sE2toString());
        values.put(PregnancyTable.COLUMN_ISTATUS, preg.getiStatus());
        values.put(PregnancyTable.COLUMN_DEVICETAGID, preg.getDeviceTag());
        values.put(PregnancyTable.COLUMN_DEVICEID, preg.getDeviceId());
        values.put(PregnancyTable.COLUMN_APPVERSION, preg.getAppver());
        values.put(PregnancyTable.COLUMN_SYNCED, preg.getSynced());
        values.put(PregnancyTable.COLUMN_SYNCED_DATE, preg.getSyncDate());

        long newRowId;
        newRowId = db.insertOrThrow(
                PregnancyTable.TABLE_NAME,
                PregnancyTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addFamilyMembers(FamilyMembers members) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FamilyMembersTable.COLUMN_PROJECT_NAME, members.getProjectName());
        values.put(FamilyMembersTable.COLUMN_UID, members.getUid());
        values.put(FamilyMembersTable.COLUMN_UUID, members.getUuid());
        values.put(FamilyMembersTable.COLUMN_PSU_CODE, members.getpsuCode());
        values.put(FamilyMembersTable.COLUMN_HHID, members.getHhid());
        values.put(FamilyMembersTable.COLUMN_USERNAME, members.getUserName());
        values.put(FamilyMembersTable.COLUMN_SYSDATE, members.getSysDate());
        values.put(FamilyMembersTable.COLUMN_INDEXED, members.getIndexed());
        values.put(FamilyMembersTable.COLUMN_SA2, members.sA2toString());

        values.put(FamilyMembersTable.COLUMN_ISTATUS, members.getiStatus());

        values.put(FamilyMembersTable.COLUMN_DEVICETAGID, members.getDeviceTag());
        values.put(FamilyMembersTable.COLUMN_DEVICEID, members.getDeviceId());
        values.put(FamilyMembersTable.COLUMN_APPVERSION, members.getAppver());
        values.put(FamilyMembersTable.COLUMN_SYNCED, members.getSynced());
        values.put(FamilyMembersTable.COLUMN_SYNCED_DATE, members.getSyncDate());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FamilyMembersTable.TABLE_NAME,
                FamilyMembersTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addRecipient(Recipient rcpt) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(RecipientTable.COLUMN_PROJECT_NAME, rcpt.getProjectName());
        values.put(RecipientTable.COLUMN_UID, rcpt.getUid());
        values.put(RecipientTable.COLUMN_UUID, rcpt.getUuid());
        values.put(RecipientTable.COLUMN_FMUID, rcpt.getFmuid());
        values.put(RecipientTable.COLUMN_PSU_CODE, rcpt.getPsuCode());
        values.put(RecipientTable.COLUMN_HHID, rcpt.getHhid());
        values.put(RecipientTable.COLUMN_USERNAME, rcpt.getUserName());
        values.put(RecipientTable.COLUMN_SYSDATE, rcpt.getSysDate());
        values.put(RecipientTable.COLUMN_INDEXED, rcpt.getIndexed());
        values.put(RecipientTable.COLUMN_SB1, rcpt.sB1toString());
        values.put(RecipientTable.COLUMN_SB2, rcpt.sB2toString());

        values.put(RecipientTable.COLUMN_ISTATUS, rcpt.getiStatus());

        values.put(RecipientTable.COLUMN_DEVICETAGID, rcpt.getDeviceTag());
        values.put(RecipientTable.COLUMN_DEVICEID, rcpt.getDeviceId());
        values.put(RecipientTable.COLUMN_APPVERSION, rcpt.getAppver());
        values.put(RecipientTable.COLUMN_SYNCED, rcpt.getSynced());
        values.put(RecipientTable.COLUMN_SYNCED_DATE, rcpt.getSyncDate());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                RecipientTable.TABLE_NAME,
                RecipientTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    //UPDATE in DB
    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesEntryLogColumn(String column, String value, String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = EntryLogTable._ID + " =? ";
        String[] selectionArgs = {id};

        return db.update(EntryLogTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updatesChildColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = ChildTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(child.getId())};

        return db.update(ChildTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesPregnancyColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = PregnancyTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.pregnancy.getId())};

        return db.update(PregnancyTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesMWRAColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = MwraTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.mwra.getId())};

        return db.update(MwraTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesRecipientColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = RecipientTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.recipient.getId())};

        return db.update(RecipientTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesWAnthroColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = TableContracts.AnthroWRATable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.anthw.getId())};

        return db.update(TableContracts.AnthroWRATable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updatesCAnthroColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = AnthroChildTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.anthc.getId())};

        return db.update(AnthroChildTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_ISTATUS, MainApp.form.getiStatus());

        // Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    //Functions that dealing with table data
    //Functions that dealing with table data
    public boolean doLogin(String username, String password) throws InvalidKeySpecException, NoSuchAlgorithmException, IllegalArgumentException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = UsersTable.COLUMN_USERNAME + "=? ";
        String[] whereArgs = {username};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = new Users();
        c = db.query(
                UsersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            loggedInUser = new Users().hydrate(c);

        }

        c.close();

        db.close();
        if (c.getCount() > 0 && checkPassword(password, loggedInUser.getPassword())) {
            MainApp.user = loggedInUser;
            //  MainApp.selectedDistrict = loggedInUser.getDist_id();
            return true;
        } else {
            return false;
        }
    }


    public ArrayList<Form> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                FormsTable._ID,
                FormsTable.COLUMN_UID,
                FormsTable.COLUMN_SYSDATE,
                FormsTable.COLUMN_USERNAME,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form forms = new Form();
                forms.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                forms.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                forms.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                forms.setUserName(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME)));
                allForms.add(forms);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }


    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }


    public int syncVersionApp(JSONObject VersionList) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(VersionTable.TABLE_NAME, null, null);
        long count = 0;
        try {
            JSONObject jsonObjectCC = ((JSONArray) VersionList.get(VersionTable.COLUMN_VERSION_PATH)).getJSONObject(0);
            VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectCC);

            ContentValues values = new ContentValues();

            values.put(VersionTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return (int) count;
    }

    public int syncUser(JSONArray userList) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < userList.length(); i++) {

                JSONObject jsonObjectUser = userList.getJSONObject(i);

                Users user = new Users();
                user.sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
                values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
                values.put(UsersTable.COLUMN_FULLNAME, user.getFullname());
                values.put(UsersTable.COLUMN_ENABLED, user.getEnabled());
                values.put(UsersTable.COLUMN_ISNEW_USER, user.getNewUser());
                values.put(UsersTable.COLUMN_PWD_EXPIRY, user.getPwdExpiry());
                values.put(UsersTable.COLUMN_DESIGNATION, user.getDesignation());
                values.put(UsersTable.COLUMN_DIST_ID, user.getDist_id());
                long rowID = db.insert(UsersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncUser(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public int syncClusters(JSONArray clusterList) {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(ClustersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < clusterList.length(); i++) {

                JSONObject json = clusterList.getJSONObject(i);

                Clusters clusters = new Clusters();
                clusters.sync(json);
                ContentValues values = new ContentValues();

                values.put(ClustersTable.COLUMN_PROVINCE_CODE, clusters.getProvinceCode());
                values.put(ClustersTable.COLUMN_PROVINCE_NAME, clusters.getProvinceName());
                values.put(ClustersTable.COLUMN_DISTRICT_CODE, clusters.getDistrictCode());
                values.put(ClustersTable.COLUMN_DISTRICT_NAME, clusters.getDistrictName());
                values.put(ClustersTable.COLUMN_TEHSIL_CODE, clusters.getTehsilCode());
                values.put(ClustersTable.COLUMN_TEHSIL_NAME, clusters.getTehsilName());
                values.put(ClustersTable.COLUMN_UC_CODE, clusters.getUcCode());
                values.put(ClustersTable.COLUMN_UC_NAME, clusters.getUcName());
                values.put(ClustersTable.COLUMN_VILLAGE_CODE, clusters.getVillageCode());
                values.put(ClustersTable.COLUMN_VILLAGE_NAME, clusters.getVillageName());
                values.put(ClustersTable.COLUMN_CLUSTER_NO, clusters.getClusterNo());


                long rowID = db.insert(ClustersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncClusters(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    //get UnSyncedTables
    public JSONArray getUnsyncedFormHH() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        //whereClause = null;
        whereClause = FormsTable.COLUMN_SYNCED + " = '' AND " +
                FormsTable.COLUMN_ISTATUS + "!= ''";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*Form fc = new Form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedFormHH: " + c.getCount());
            Form form = new Form();
            allForms.put(form.Hydrate(c).toJSONObject());


        }

        c.close();
        db.close();

        Log.d(TAG, "getUnsyncedFormHH: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedFormHH: " + allForms);
        return allForms;
    }

    public JSONArray getUnsyncedEntryLog() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = EntryLogTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = EntryLogTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                EntryLogTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedEntryLog: " + c.getCount());
            EntryLog entryLog = new EntryLog();
            all.put(entryLog.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedEntryLog: " + all.toString().length());
        Log.d(TAG, "getUnsyncedEntryLog: " + all);
        return all;
    }

    public JSONArray getUnsyncedFamilyMembers() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                FamilyMembersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedFamilyMembers: " + c.getCount());
            FamilyMembers fm = new FamilyMembers();
            all.put(fm.Hydrate(c).toJSONObject());
        }

        c.close();

        db.close();

        Log.d(TAG, "getUnsyncedFamilyMembers: " + all.toString().length());
        Log.d(TAG, "getUnsyncedFamilyMembers: " + all);
        return all;
    }

    public JSONArray getUnsyncedRecipient() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = RecipientTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = RecipientTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                RecipientTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedRecipient: " + c.getCount());
            Recipient rcpt = new Recipient();
            all.put(rcpt.Hydrate(c).toJSONObject());
        }

        c.close();

        Log.d(TAG, "getUnsyncedRecipient: " + all.toString().length());
        Log.d(TAG, "getUnsyncedRecipient: " + all);
        return all;
    }

    public JSONArray getUnsyncedMWRA() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = MwraTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = MwraTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                MwraTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedMWRA: " + c.getCount());
            MWRA mwra = new MWRA();
            all.put(mwra.Hydrate(c).toJSONObject());
        }

        c.close();

        Log.d(TAG, "getUnsyncedMWRA: " + all.toString().length());
        Log.d(TAG, "getUnsyncedMWRA: " + all);
        return all;
    }

    public JSONArray getUnsyncedPregnancy() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = PregnancyTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = PregnancyTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                PregnancyTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedPregnancy: " + c.getCount());
            Pregnancy preg = new Pregnancy();
            all.put(preg.Hydrate(c).toJSONObject());
        }

        c.close();

        Log.d(TAG, "getUnsyncedPregnancy: " + all.toString().length());
        Log.d(TAG, "getUnsyncedPregnancy: " + all);
        return all;
    }

    public JSONArray getUnsyncedChild() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = ChildTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = ChildTable.COLUMN_ID + " ASC";

        JSONArray allChild = new JSONArray();
        c = db.query(
                ChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedChild: " + c.getCount());
            Child ch = new Child();
            allChild.put(ch.Hydrate(c).toJSONObject());
        }

        Log.d(TAG, "getUnsyncedChild: " + allChild.toString().length());
        Log.d(TAG, "getUnsyncedChild: " + allChild);
        return allChild;
    }

    public JSONArray getUnsyncedAnthroChild() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = AnthroChildTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = AnthroChildTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                AnthroChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedAnthroChild: " + c.getCount());
            AnthroChild anc = new AnthroChild();
            all.put(anc.Hydrate(c).toJSONObject());
        }

        Log.d(TAG, "getUnsyncedAnthroChild: " + all.toString().length());
        Log.d(TAG, "getUnsyncedAnthroChild: " + all);
        return all;
    }

    public JSONArray getUnsyncedAnthroWRA() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = AnthroWRATable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = AnthroWRATable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                AnthroWRATable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedAnthroWRA: " + c.getCount());
            AnthroWRA wra = new AnthroWRA();
            all.put(wra.Hydrate(c).toJSONObject());
        }

        Log.d(TAG, "getUnsyncedAnthroWRA: " + all.toString().length());
        Log.d(TAG, "getUnsyncedAnthroWRA: " + all);
        return all;
    }


    //update SyncedTables
    public void updateSyncedFormHH(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_SYNCED, true);
        values.put(FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedEntryLog(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_SYNCED, true);
        values.put(EntryLogTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = EntryLogTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                EntryLogTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedFamilyMembers(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FamilyMembersTable.COLUMN_SYNCED, true);
        values.put(FamilyMembersTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = FamilyMembersTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                FamilyMembersTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedRecipient(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(RecipientTable.COLUMN_SYNCED, true);
        values.put(RecipientTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = RecipientTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                RecipientTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedMWRA(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(MwraTable.COLUMN_SYNCED, true);
        values.put(MwraTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = MwraTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                MwraTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedPregnancy(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(PregnancyTable.COLUMN_SYNCED, true);
        values.put(PregnancyTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = PregnancyTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                PregnancyTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedChild(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(ChildTable.COLUMN_SYNCED, true);
        values.put(ChildTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = ChildTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                ChildTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedAnthroChild(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(AnthroChildTable.COLUMN_SYNCED, true);
        values.put(AnthroChildTable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = AnthroChildTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                AnthroChildTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedAnthroWRA(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(AnthroWRATable.COLUMN_SYNCED, true);
        values.put(AnthroWRATable.COLUMN_SYNCED_DATE, new Date().toString());
        String where = AnthroWRATable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                AnthroWRATable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {
            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    /*public RandomHH checkHousehold(String cluster_no, String hh_no) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String selection = RandomTable.COLUMN_ENUM_BLOCK_CODE + "= ? AND "
                + RandomTable.COLUMN_HH_NO + "= ? ";
        String[] selectionArgs = {cluster_no, hh_no};

        int cCount;
        RandomHH hh = null;
        try {
            c = db.query(
                    RandomTable.TABLE_NAME,
                    columns,
                    selection,
                    selectionArgs,
                    null,
                    null,
                    null
            );
            while (c.moveToNext()) {

                hh = new RandomHH().hydrate(c);

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }

        return hh;

    }*/

    public Form getFormByPsuHHNo(String psuCode, String hhid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_PSU_CODE + "=? AND " +
                FormsTable.COLUMN_HHID + " =? ";

        String[] whereArgs = {psuCode, hhid};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Form form = null;
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                form = new Form().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return form;
    }


    public Collection<Form> getFormsByCluster(String cluster) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_PSU_CODE + " = ? ";
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setPsuCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_PSU_CODE)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
                fc.setSno(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SNO)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<Form> getTodayForms(String sysdate) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setPsuCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_PSU_CODE)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Collection<Form> getPendingForms() {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_ISTATUS + " = ?";
        String[] whereArgs = new String[]{""};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setPsuCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_PSU_CODE)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
                fc.setSno(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SNO)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public Clusters getVillagesByCode(String psucode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause = ClustersTable.COLUMN_CLUSTER_NO + " = ?";

        String[] whereArgs = {psucode};

        String groupBy = null;
        String having = null;

        String orderBy = ClustersTable.COLUMN_CLUSTER_NO + " ASC";

        Clusters e = new Clusters();
        try {
            c = db.query(
                    ClustersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy
            );
            while (c.moveToNext()) {
                e = new Clusters().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return e;

    }

    /*public RandomHH getHHbyEnumBlocks(String psuCode, String hhno) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = RandomTable.COLUMN_ENUM_BLOCK_CODE + " = ? AND " +
                RandomTable.COLUMN_HH_NO + " = ?";

        String[] whereArgs = {psuCode, hhno};

        String groupBy = null;
        String having = null;

        String orderBy = RandomTable.COLUMN_HH_NO + " ASC";

        String limit = "5000";

        RandomHH randHH = new RandomHH();
        try {
            c = db.query(true,
                    RandomTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy,
                    limit
                    // The sort order
            );
            while (c.moveToNext()) {
                randHH = new RandomHH().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return randHH;
    }*/

    public List<FamilyMembers> getMemberBYUID(String uid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_UUID + "=?";

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        ArrayList<FamilyMembers> membersByUID = new ArrayList<>();
        try {
            c = db.query(
                    FamilyMembersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FamilyMembers mwra = new FamilyMembers().Hydrate(c);

                membersByUID.add(mwra);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return membersByUID;
    }

    public FamilyMembers getSelectedMemberBYUID(String uid, String index) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FamilyMembersTable.COLUMN_UUID + "=? AND "
                + FamilyMembersTable.COLUMN_INDEXED + " like ? ";

        String[] whereArgs = {uid, "%" + index + "%"};

        String groupBy = null;
        String having = null;

        String orderBy = FamilyMembersTable.COLUMN_ID + " ASC";

        FamilyMembers membersByUID = new FamilyMembers();
        try {
            c = db.query(
                    FamilyMembersTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                membersByUID = new FamilyMembers().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return membersByUID;
    }

    /*public List<FoodConsumption> getFoodConsumptionBYUID(String uid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FoodConsumptionTable.COLUMN_UUID + "=? ";

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FoodConsumptionTable.COLUMN_ID + " ASC";

        List<FoodConsumption> foodConsumption = new ArrayList<>();
        try {
            c = db.query(
                    FoodConsumptionTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                foodConsumption.add(new FoodConsumption().Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return foodConsumption;
    }*/

    public int updatesfamilyListColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FamilyMembersTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.familyMember.getId())};

        return db.update(FamilyMembersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public Collection<Clusters> getAllProvinces() {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = ClustersTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = ClustersTable.COLUMN_PROVINCE_NAME;
        String having = null;
        String orderBy = ClustersTable.COLUMN_PROVINCE_NAME + " ASC";
        String limitRows = "9999";

        Collection<Clusters> all = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {
                all.add(new Clusters().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public Collection<Clusters> getDistrictsByProvince(String provinceCode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = ClustersTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = ClustersTable.COLUMN_PROVINCE_CODE + "= ?";
        String[] whereArgs = {provinceCode};
        String groupBy = ClustersTable.COLUMN_DISTRICT_NAME;
        String having = null;
        String orderBy = ClustersTable.COLUMN_DISTRICT_NAME + " ASC";
        String limitRows = "9999";

        Collection<Clusters> all = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {
                all.add(new Clusters().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public Collection<Clusters> getTehsilsByDistrict(String provinceCode, String districtCode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = ClustersTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = ClustersTable.COLUMN_PROVINCE_CODE + "= ? AND " +
                ClustersTable.COLUMN_DISTRICT_CODE + "= ? ";
        String[] whereArgs = {provinceCode, districtCode};
        String groupBy = ClustersTable.COLUMN_TEHSIL_NAME;
        String having = null;
        String orderBy = ClustersTable.COLUMN_TEHSIL_NAME + " ASC";
        String limitRows = "9999";

        Collection<Clusters> all = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {

                all.add(new Clusters().hydrate(c));

            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public Collection<Clusters> getUcsByTehsil(String districtCode, String tehsilCode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = ClustersTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = ClustersTable.COLUMN_DISTRICT_CODE + "= ? AND " +
                ClustersTable.COLUMN_TEHSIL_CODE + "= ? ";
        String[] whereArgs = {districtCode, tehsilCode};
        String groupBy = ClustersTable.COLUMN_UC_NAME;
        String having = null;
        String orderBy = ClustersTable.COLUMN_UC_NAME + " ASC";
        String limitRows = "9999";

        Collection<Clusters> all = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {
                all.add(new Clusters().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }


    public Collection<Clusters> getVillagesByUc(String tehsilCode, String ucCode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = ClustersTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = ClustersTable.COLUMN_TEHSIL_CODE + "= ? AND " +
                ClustersTable.COLUMN_UC_CODE + "= ? ";
        String[] whereArgs = {tehsilCode, ucCode};
        String groupBy = ClustersTable.COLUMN_VILLAGE_NAME;
        String having = null;
        String orderBy = ClustersTable.COLUMN_VILLAGE_NAME + " ASC";
        String limitRows = "9999";

        Collection<Clusters> all = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {
                all.add(new Clusters().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public Collection<Clusters> getClusterByUc(String ucCode) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = ClustersTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = ClustersTable.COLUMN_UC_CODE + "= ? ";
        String[] whereArgs = {ucCode};
        String groupBy = ClustersTable.COLUMN_CLUSTER_NO;
        String having = null;
        String orderBy = ClustersTable.COLUMN_CLUSTER_NO + " ASC";
        String limitRows = "9999";

        Collection<Clusters> all = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {
                all.add(new Clusters().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public Collection<Clusters> getVillagesByDistrict(String districtCode, String tehsilCode, String ucCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = true;
        String tableName = ClustersTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = ClustersTable.COLUMN_DISTRICT_CODE + "= ? AND " +
                ClustersTable.COLUMN_TEHSIL_CODE + "= ? AND " +
                ClustersTable.COLUMN_UC_CODE + "= ? ";
        String[] whereArgs = {districtCode, tehsilCode, ucCode};
        String groupBy = ClustersTable.COLUMN_VILLAGE_CODE;
        String having = null;
        String orderBy = ClustersTable.COLUMN_VILLAGE_CODE + " ASC";
        String limitRows = "9999";

        Collection<Clusters> all = new ArrayList<>();
        try {
            c = db.query(
                    distinct,       // Distinct values
                    tableName,      // The table to query
                    columns,        // The columns to return
                    whereClause,    // The columns for the WHERE clause
                    whereArgs,      // The values for the WHERE clause
                    groupBy,        // don't group the rows
                    having,         // don't filter by row groups
                    orderBy,
                    limitRows
            );
            while (c.moveToNext()) {
                all.add(new Clusters().hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return all;
    }

    public Form getFormByPSUHHNo(String psuCode, String hhid) throws JSONException {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;

        Boolean distinct = false;
        String tableName = FormsTable.TABLE_NAME;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_PSU_CODE + "= ? AND " +
                FormsTable.COLUMN_HHID + "= ? ";
        String[] whereArgs = {psuCode, hhid};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_SYSDATE + " ASC";
        String limitRows = "1";

        c = db.query(
                distinct,       // Distinct values
                tableName,      // The table to query
                columns,        // The columns to return
                whereClause,    // The columns for the WHERE clause
                whereArgs,      // The values for the WHERE clause
                groupBy,        // don't group the rows
                having,         // don't filter by row groups
                orderBy,
                limitRows
        );

        Form form = new Form();
        while (c.moveToNext()) {
            form = (new Form().Hydrate(c));
        }

        c.close();
        db.close();
        return form;

    }


    public MWRA getMwraByUUid() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = MwraTable.COLUMN_UUID + "=? ";

        String[] whereArgs = {MainApp.form.getUid()};

        String groupBy = null;
        String having = null;

        String orderBy = MwraTable.COLUMN_ID + " ASC";

        MWRA mwra = new MWRA();

        c = db.query(
                MwraTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            mwra = new MWRA().Hydrate(c);
        }

        db.close();

        return mwra;
    }

    public Pregnancy getPregByFmUID(String fmuid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = PregnancyTable.COLUMN_UUID + "=? AND " +
                PregnancyTable.COLUMN_FMUID + "=? "
        ;

        String[] whereArgs = {MainApp.form.getUid(), fmuid};

        String groupBy = null;
        String having = null;

        String orderBy = PregnancyTable.COLUMN_ID + " ASC";

        Pregnancy pregnancy = new Pregnancy();  // Pregnancies can never be null.

        c = db.query(
                PregnancyTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            pregnancy = new Pregnancy().Hydrate(c);
        }

        db.close();

        return pregnancy;
    }

    public Child getChildByUUid() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = ChildTable.COLUMN_UUID + "=? ";

        String[] whereArgs = {MainApp.form.getUid()};

        String groupBy = null;
        String having = null;

        String orderBy = ChildTable.COLUMN_ID + " ASC";

        Child child = new Child();  // Pregnancies can never be null.

        c = db.query(
                ChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            child = new Child().Hydrate(c);
        }

        db.close();

        return child;
    }

    public Recipient getRecipientByFMID(String fmuid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = RecipientTable.COLUMN_UUID + "=? AND " +
                RecipientTable.COLUMN_FMUID + "=?";

        String[] whereArgs = {MainApp.form.getUid(), fmuid};

        String groupBy = null;
        String having = null;

        String orderBy = RecipientTable.COLUMN_ID + " ASC";

        Recipient recipient = new Recipient();  // Pregnancies can never be null.

        c = db.query(
                RecipientTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                   // The sort order
        );
/*        if (c.getCount() >= ecdNo) {
            c.moveToPosition(ecdNo);
            ecdInfo = new ECDInfo().Hydrate(c);
        }*/
        while (c.moveToNext()) {
            recipient = new Recipient().Hydrate(c);
        }

        db.close();

        return recipient;
    }

    public MWRA getMWRAByFMUID(String fmuid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = MwraTable.COLUMN_UUID + "=? AND " +
                MwraTable.COLUMN_FMUID + "=?";

        String[] whereArgs = {MainApp.form.getUid(), fmuid};

        String groupBy = null;
        String having = null;

        String orderBy = MwraTable.COLUMN_ID + " ASC";

        MWRA mwra = new MWRA();  // Pregnancies can never be null.

        c = db.query(
                MwraTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                   // The sort order
        );
/*        if (c.getCount() >= ecdNo) {
            c.moveToPosition(ecdNo);
            ecdInfo = new ECDInfo().Hydrate(c);
        }*/
        while (c.moveToNext()) {
            mwra = new MWRA().Hydrate(c);
        }

        db.close();

        return mwra;
    }

    public Child getChildByFMUID(String fmuid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = ChildTable.COLUMN_UUID + "=? AND " +
                ChildTable.COLUMN_FMUID + "=?";

        String[] whereArgs = {MainApp.form.getUid(), fmuid};

        String groupBy = null;
        String having = null;

        String orderBy = ChildTable.COLUMN_ID + " ASC";

        Child child = new Child();  // Pregnancies can never be null.

        c = db.query(
                ChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                   // The sort order
        );
/*        if (c.getCount() >= ecdNo) {
            c.moveToPosition(ecdNo);
            ecdInfo = new ECDInfo().Hydrate(c);
        }*/
        while (c.moveToNext()) {
            child = new Child().Hydrate(c);
        }

        db.close();

        return child;
    }


    public AnthroChild getAnthroChilByFmUID(String fmuid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = AnthroChildTable.COLUMN_UUID + "=? AND " +
                AnthroChildTable.COLUMN_FMUID + "=?";

        String[] whereArgs = {MainApp.form.getUid(), fmuid};

        String groupBy = null;
        String having = null;

        String orderBy = AnthroChildTable.COLUMN_ID + " ASC";

        AnthroChild anthroc = new AnthroChild();  // Pregnancies can never be null.

        c = db.query(
                AnthroChildTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                   // The sort order
        );
/*        if (c.getCount() >= ecdNo) {
            c.moveToPosition(ecdNo);
            ecdInfo = new ECDInfo().Hydrate(c);
        }*/
        while (c.moveToNext()) {
            anthroc = new AnthroChild().Hydrate(c);
        }

        db.close();

        return anthroc;
    }

    public AnthroWRA getAnthroWRAByFmUID(String fmuid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause;
        whereClause = AnthroWRATable.COLUMN_UUID + "=? AND " +
                AnthroWRATable.COLUMN_FMUID + "=?";

        String[] whereArgs = {MainApp.form.getUid(), fmuid};

        String groupBy = null;
        String having = null;

        String orderBy = AnthroWRATable.COLUMN_ID + " ASC";

        AnthroWRA anthrow = new AnthroWRA();  // Pregnancies can never be null.

        c = db.query(
                AnthroWRATable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                   // The sort order
        );
/*        if (c.getCount() >= ecdNo) {
            c.moveToPosition(ecdNo);
            ecdInfo = new ECDInfo().Hydrate(c);
        }*/
        while (c.moveToNext()) {
            anthrow = new AnthroWRA().Hydrate(c);
        }

        db.close();

        return anthrow;
    }

    public int updatePassword(String hashedPassword) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(UsersTable.COLUMN_PASSWORD, hashedPassword);
        values.put(UsersTable.COLUMN_ISNEW_USER, "");

        String selection = UsersTable.COLUMN_USERNAME + " =? ";
        String[] selectionArgs = {MainApp.user.getUserName()};

        return db.update(UsersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }
}
