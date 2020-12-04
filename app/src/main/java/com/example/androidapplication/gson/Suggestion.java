package com.example.androidapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author 阿秋
 * @date 2020/11/27 15:21
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CraWash craWash;
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CraWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
