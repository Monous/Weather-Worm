package com.example.android.weatherworm.app;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Moheem Ilyas on 7/25/2016.
 *
 * {
 "city":{
     "id":4143871,
     "name":"Newport",
     "coord":{
         "lon":-75.609367,
         "lat":39.713718
         },
     "country":"US",
     "population":0
 },
 "cod":"200",
 "message":0.0134,
 "cnt":7,
 "list":[
    {
     "dt":1469466000,
     "temp":{
     "day":22.2,
     "min":21.59,
     "max":22.2,
     "night":22.11,
     "eve":22.2,
     "morn":22.2
     },
     "pressure":1010.88,
     "humidity":100,
     "weather":[
     {
     "id":502,
     "main":"Rain",
     "description":"heavy intensity rain",
     "icon":"10d"
     }
     ],
     "speed":2.21,
     "deg":294,
     "clouds":36,
     "rain":14.07
    },
 */

public class WeatherData {
    @SerializedName("cod")
    private String cod;
    @SerializedName("message")
    private Double message;
    @SerializedName("cnt")
    private Integer cnt;
    @SerializedName("city")
    private City city;
    @SerializedName("list")
    private List<Days> list;

    public WeatherData() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Days> getList() {
        return list;
    }

    public void setList(List<Days> list) {
        this.list = list;
    }


    public static class City {
        @SerializedName("id")
        private Integer id;
        @SerializedName("name")
        private String name;
        @SerializedName("coord")
        private Coord coord;
        @SerializedName("country")
        private String country;
        @SerializedName("population")
        private Integer population;

        public City() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Coord getCoord() {
            return coord;
        }

        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Integer getPopulation() {
            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }

    }

    public static class Coord {
        @SerializedName("lon")
        private Double lon;
        @SerializedName("lat")
        private Double lat;

        public Coord() {
        }

        public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }
    }

    public static class Days {
        @SerializedName("dt")
        private Integer dt;
        @SerializedName("temp")
        private Temp temp;
        @SerializedName("pressure")
        private Double pressure;
        @SerializedName("humidity")
        private Integer humidity;
        @SerializedName("weather")
        private List<Weather> weather;
        @SerializedName("speed")
        private Double speed;
        @SerializedName("deg")
        private Integer deg;
        @SerializedName("clouds")
        private Integer clouds;

        public Days() {
        }

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Temp getTemp() {
            return temp;
        }

        public void setTemp(Temp temp) {
            this.temp = temp;
        }

        public Double getPressure() {
            return pressure;
        }

        public void setPressure(Double pressure) {
            this.pressure = pressure;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

        public List<Weather> getWeather() {
            return weather;
        }

        public void setWeather(List<Weather> weather) {
            this.weather = weather;
        }

        public Double getSpeed() {
            return speed;
        }

        public void setSpeed(Double speed) {
            this.speed = speed;
        }

        public Integer getDeg() {
            return deg;
        }

        public void setDeg(Integer deg) {
            this.deg = deg;
        }

        public Integer getClouds() {
            return clouds;
        }

        public void setClouds(Integer clouds) {
            this.clouds = clouds;
        }

    }
    public static class Temp {
        @SerializedName("day")
        private Double day;
        @SerializedName("min")
        private Double min;
        @SerializedName("max")
        private Double max;
        @SerializedName("night")
        private Double night;
        @SerializedName("eve")
        private Double eve;
        @SerializedName("morn")
        private Double morn;

        public Temp() {
        }

        public Double getDay() {
            return day;
        }

        public void setDay(Double day) {
            this.day = day;
        }

        public Double getMin() {
            return min;
        }

        public void setMin(Double min) {
            this.min = min;
        }

        public Double getMax() {
            return max;
        }

        public void setMax(Double max) {
            this.max = max;
        }

        public Double getNight() {
            return night;
        }

        public void setNight(Double night) {
            this.night = night;
        }

        public Double getEve() {
            return eve;
        }

        public void setEve(Double eve) {
            this.eve = eve;
        }

        public Double getMorn() {
            return morn;
        }

        public void setMorn(Double morn) {
            this.morn = morn;
        }
    }

    public static class Weather {
        @SerializedName("id")
        private Integer id;
        @SerializedName("main")
        private String main;
        @SerializedName("description")
        private String description;
        @SerializedName("icon")
        private String icon;

        public Weather() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
