package com.example.androidapplication.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author 阿秋
 * @date 2020/11/27 15:29
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastsList;
}
