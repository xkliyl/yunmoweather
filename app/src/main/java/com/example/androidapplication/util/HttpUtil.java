package com.example.androidapplication.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author 阿秋
 * @date 2020/11/20 14:56
 */
public class HttpUtil {
    public static void sendOkHttpRequset(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
