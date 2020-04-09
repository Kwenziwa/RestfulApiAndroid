package com.example.restfulapiandroid.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APiClient {

    public static final String API_BASE_URL ="http://dummy.restapiexample.com/api/v1/";


    private static Retrofit.Builder getRetrofitInstance() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(API_BASE_URL);
    }


    public static ApiService getService() {
        return getRetrofitInstance().build().create(ApiService.class);
    }

}
