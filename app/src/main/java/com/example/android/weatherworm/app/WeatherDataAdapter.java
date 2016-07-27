package com.example.android.weatherworm.app;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Moheem Ilyas on 7/25/2016.
 */
public class WeatherDataAdapter {
    private final String mBaseUrl = "http://api.openweathermap.org";
    protected WeatherRequest mWeatherRequest;
    protected Retrofit mRetrofit;
    protected Call<WeatherData> mWeatherDataCall;
    protected WeatherData mWeatherData;

    public WeatherDataAdapter(){

        mWeatherData = new WeatherData();
        mRetrofit = new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mWeatherRequest = mRetrofit.create(WeatherRequest.class);
    }

    public WeatherData getWeatherData(String q, String mode, String units, String cnt, String appid) {
        mWeatherDataCall = mWeatherRequest.getWeatherRequest(q, mode, units, cnt, appid);
        /*try {
            Response<WeatherData> response = mWeatherDataCall.execute();
            mWeatherData = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        mWeatherDataCall.enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                mWeatherData = response.body();
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {
                t.printStackTrace();
            }
        });

        return mWeatherData;
    }
}
