package com.batch9.aplikasicuaca.service;

import com.batch9.aplikasicuaca.entity.Weather;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

public interface WeatherInterface {
    @GET("weather")
    Call<Weather> getCurrentWeatherByCity(@Query("q") String q, @Query("appid") String appid);
}

