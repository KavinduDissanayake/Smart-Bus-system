package com.example.smart_bus_system.Conection;


import com.example.smart_bus_system.User.Screens.AvailableBuses.Model.Bus_info_model;
import com.example.smart_bus_system.User.Screens.Home.Model.Routes_Model;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API {


    @POST("User/getRoutes.php")
    Call<List<Routes_Model>> getRotues();


    @FormUrlEncoded
    @POST("User/getBusInfo.php")
    Call<List<Bus_info_model>> getBusInfo(@FieldMap Map<String,String> fields);



}
