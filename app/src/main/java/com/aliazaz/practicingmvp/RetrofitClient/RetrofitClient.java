package com.aliazaz.practicingmvp.RetrofitClient;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;
    private static API service;
    private static String baseURL = "https://jsonplaceholder.typicode.com/";

    public API createRetrofitInstance() {

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(2, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES)
                .build();

        retrofit = new Retrofit
                .Builder()
                .client(okHttpClient)
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(API.class);
    }
}
