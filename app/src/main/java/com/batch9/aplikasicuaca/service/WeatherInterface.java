package com.batch9.aplikasicuaca.service;

import com.batch9.aplikasicuaca.entity.oncall.OneCallAPI;
import com.batch9.aplikasicuaca.entity.oncall.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherInterface {
//    @GET("weather")
//    Call<Weather> getCurrentWeatherByCity(@Query("q") String q, @Query("appid") String appid);

    @GET("onecall")
    Call<OneCallAPI> getOneCallWeather(@Query("lon") String lon, @Query("lat") String lat,@Query("exclude") String exclude, @Query("appid") String appid);

}

