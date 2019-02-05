package com.example.recycleviewfortemprxjava.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.recycleviewfortemprxjava.API.APIService;
import com.example.recycleviewfortemprxjava.API.RetrofitInstance;
import com.example.recycleviewfortemprxjava.Adapter.EmployeeAdapter;
import com.example.recycleviewfortemprxjava.Model.TempSensorData;
import com.example.recycleviewfortemprxjava.Model.TempSensorDataList;
import com.example.recycleviewfortemprxjava.R;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EmployeeAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*we must first create an instance of the ApiService using the Retrofit object we get as returned from RetrofitInstance class.*/
        APIService apiService = RetrofitInstance.getRetrofitInstance().create(APIService.class);
        /*Make our http request by calling the service method with parameter in the interface to get the data*/
        Observable<TempSensorDataList> myObservable = apiService.getTempData();

        myObservable = new Observable<TempSensorDataList>() {
            @Override
            protected void subscribeActual(Observer<? super TempSensorDataList> observer) {
                
            }
        }


        /*Log the URL called*/

    }

    /*Method to generate List of employees using RecyclerView with custom adapter*/




}
