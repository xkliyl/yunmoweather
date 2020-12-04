package com.example.androidapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 阿秋
 * @date 2020/11/27 15:10
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
