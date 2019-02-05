package com.example.recycleviewfortemprxjava.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TempSensorDataList {
    @Expose
    @SerializedName("outletId")
    private String outletId;
    @Expose
    @SerializedName("allTempSensorList")
    private ArrayList<TempSensorData> tempSensorDataList;



    public String getOutletId() {
        return outletId;
    }

    public ArrayList<TempSensorData> getTempSensorDataList() {
        return tempSensorDataList;
    }
}
