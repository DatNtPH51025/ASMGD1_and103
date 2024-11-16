package com.example.ph51025_and103_assignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {

    String DOMAIN= "http://192.168.1.5:3000/";

    @GET("/api/list")
    Call<List<CarModel>> getCars();

    @POST("/api/add_xe")
    Call<List<CarModel>> addXe(@Body CarModel xe);

    @DELETE("/api/xoa_xe/{id}")
    Call<List<CarModel>> xoaXe(@Path("id") String id);

}
