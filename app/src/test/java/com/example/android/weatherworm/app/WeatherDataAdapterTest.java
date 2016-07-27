package com.example.android.weatherworm.app;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Moheem Ilyas on 7/26/2016.
 */

//q=19808,us&mode=json&units=metric&cnt=7&appid=d3bd4978566f7e7412cd800e5cb090ca
public class WeatherDataAdapterTest extends TestCase {
    private final String ZIP_CODE = "19808,us";
    private final String MODE = "json";
    private final String UNITS = "metric";
    private final String CNT = "7";


    private static WeatherDataAdapter weatherDataAdapter;
    private static WeatherData weatherData;

    @Before
    public void setUp() throws Exception {

        weatherDataAdapter = new WeatherDataAdapter();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetWeatherData() throws Exception {
        weatherData = weatherDataAdapter.getWeatherData("19808,us",
                "json", "metric", "7", "d3bd4978566f7e7412cd800e5cb090ca");

        System.out.println(weatherData.getCnt());
    }
}