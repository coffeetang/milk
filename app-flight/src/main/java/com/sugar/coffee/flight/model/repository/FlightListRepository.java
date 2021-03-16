package com.sugar.coffee.flight.model.repository;

import com.sugar.coffee.flight.model.api.IFlightListApi;
import com.sugar.coffee.http.RetrofitUtil;

public class FlightListRepository {

    public IFlightListApi getFlightListApi(){
        IFlightListApi flightListApi = RetrofitUtil.getInstance().getRetrofit().create(IFlightListApi.class);
        return flightListApi;
    }
}
