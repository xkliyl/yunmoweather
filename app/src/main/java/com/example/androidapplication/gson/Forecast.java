package com.example.androidapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 阿秋
 * @date 2020/11/27 15:26
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
