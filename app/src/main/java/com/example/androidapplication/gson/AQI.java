package com.example.androidapplication.gson;

/**
 * @author 阿秋
 * @date 2020/11/27 15:15
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
