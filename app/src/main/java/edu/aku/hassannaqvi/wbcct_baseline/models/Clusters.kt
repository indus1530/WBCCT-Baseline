package edu.aku.hassannaqvi.wbcct_baseline.models

import android.database.Cursor
import edu.aku.hassannaqvi.wbcct_baseline.contracts.TableContracts.ClustersTable
import edu.aku.hassannaqvi.wbcct_baseline.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class Clusters {
    var ID: Long = 0
    var provinceCode: String = _EMPTY_
    var provinceName: String = _EMPTY_
    var districtCode: String = _EMPTY_
    var districtName: String = _EMPTY_
    var tehsilCode: String = _EMPTY_
    var tehsilName: String = _EMPTY_
    var ucCode: String = _EMPTY_
    var ucName: String = _EMPTY_
    var villageCode: String = _EMPTY_
    var villageName: String = _EMPTY_
    var clusterNo: String = _EMPTY_


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Clusters {
        provinceCode = jsonObject.getString(ClustersTable.COLUMN_PROVINCE_CODE)
        provinceName = jsonObject.getString(ClustersTable.COLUMN_PROVINCE_NAME)
        districtCode = jsonObject.getString(ClustersTable.COLUMN_DISTRICT_CODE)
        districtName = jsonObject.getString(ClustersTable.COLUMN_DISTRICT_NAME)
        tehsilCode = jsonObject.getString(ClustersTable.COLUMN_TEHSIL_CODE)
        tehsilName = jsonObject.getString(ClustersTable.COLUMN_TEHSIL_NAME)
        ucCode = jsonObject.getString(ClustersTable.COLUMN_UC_CODE)
        ucName = jsonObject.getString(ClustersTable.COLUMN_UC_NAME)
        villageCode = jsonObject.getString(ClustersTable.COLUMN_VILLAGE_CODE)
        villageName = jsonObject.getString(ClustersTable.COLUMN_VILLAGE_NAME)
        clusterNo = jsonObject.getString(ClustersTable.COLUMN_CLUSTER_NO)
        return this
    }

    fun hydrate(cursor: Cursor): Clusters {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_ID))
        provinceCode =
            cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_PROVINCE_CODE))
        provinceName =
            cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_PROVINCE_NAME))
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_DISTRICT_CODE))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_DISTRICT_NAME))
        tehsilCode =
            cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_TEHSIL_CODE))
        tehsilName =
            cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_TEHSIL_NAME))
        ucCode = cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_UC_CODE))
        ucName = cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_UC_NAME))
        villageCode =
            cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_VILLAGE_CODE))
        villageName =
            cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_VILLAGE_NAME))
        clusterNo = cursor.getString(cursor.getColumnIndexOrThrow(ClustersTable.COLUMN_CLUSTER_NO))

        return this
    }


}