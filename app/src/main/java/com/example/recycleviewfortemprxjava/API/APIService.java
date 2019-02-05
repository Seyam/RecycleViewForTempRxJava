package com.example.recycleviewfortemprxjava.API;

import com.example.recycleviewfortemprxjava.Model.TempSensorData;
import com.example.recycleviewfortemprxjava.Model.TempSensorDataList;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;


public interface APIService {

    @GET("temp")
    Observable<TempSensorDataList> getTempData();
}
