package com.example.androidapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 阿秋
 * @date 2020/11/27 15:18
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
