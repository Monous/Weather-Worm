package com.example.android.weatherworm.app;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Moheem Ilyas on 7/22/2016.
 */

// http://api.openweathermap.org/data/2.5/forecast/daily?q=19808,us&mode=json&units=metric&cnt=7&appid=d3bd4978566f7e7412cd800e5cb090ca
public interface WeatherRequest {

    @GET("/data/2.5/forecast/daily")
    Call<WeatherData> getWeatherRequest(@Query("q") String q,
                                        @Query("mode") String mode,
                                        @Query("units") String units,
                                        @Query("cnt") String cnt,
                                        @Query("appid") String appid);
}
