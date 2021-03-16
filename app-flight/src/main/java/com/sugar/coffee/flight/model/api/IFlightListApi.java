package com.sugar.coffee.flight.model.api;

import com.sugar.coffee.flight.model.businessmodel.FlightListModel;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IFlightListApi {
    @POST("product/getCarts")
    @FormUrlEncoded
    Observable<FlightListModel> getFlightListModel(@FieldMap HashMap<String, String> map);
}
