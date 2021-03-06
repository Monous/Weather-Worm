package com.example.android.weatherworm.app;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            List<String> forecastEntries = new ArrayList<>(Arrays.asList(
                    "Today - Sunny - 88/60",
                    "Tomorrow - Cloudy 89/66",
                    "Wednesday - Rainy - 77/67",
                    "Thursday - Sunny - 88/77",
                    "Friday - Cloudy - 88/98"
            ));

            WeatherDataAdapter weatherDataAdapter = new WeatherDataAdapter();
            WeatherData weatherData = weatherDataAdapter.getWeatherData("19808,us",
                    "json", "metric", "7", "d3bd4978566f7e7412cd800e5cb090ca");

            //forecastEntries.add(weatherData.getCity().getName());


            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            ArrayAdapter<String> forecastAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_forecast, forecastEntries);

            ListView forecastListView = (ListView) rootView.findViewById(R.id.listview_forecast);
            forecastListView.setAdapter(forecastAdapter);
            return rootView;
        }
    }
}
