package com.example.recycleviewfortemprxjava.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TempSensorData {
    @Expose
    @SerializedName("location")
    private String location;
    @Expose
    @SerializedName("value")
    private Double tempValue;
    @Expose
    @SerializedName("timestamp")
    private String timestamp;

    public TempSensorData(String location, Double value, String timestamp) {
        this.location = location;
        this.tempValue = value;
        this.timestamp = timestamp;
    }

    public String getLocation() {
        return location;
    }


    public Double getTempValue() {
        return tempValue;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
