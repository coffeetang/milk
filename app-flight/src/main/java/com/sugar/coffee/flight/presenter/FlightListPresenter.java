package com.sugar.coffee.flight.presenter;

import android.util.Log;

import com.sugar.coffee.flight.model.businessmodel.FlightListModel;
import com.sugar.coffee.flight.model.repository.FlightListRepository;
import com.sugar.coffee.http.RetrofitUtil;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class FlightListPresenter {
    private FlightListRepository flightListRepository;
    public FlightListPresenter(){
        flightListRepository = new FlightListRepository();
    }
    public void getFlightList(HashMap<String,String> map){
        Observable<FlightListModel> observable = flightListRepository.getFlightListApi().getFlightListModel(map);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<FlightListModel>() {
                    @Override
                    public void accept(FlightListModel javaBean) throws Exception {
                        Log.e("getDataFromServer","");
                    }
                });

    }
}
