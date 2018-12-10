package com.example.roca486.prac2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    public static DibaAPI getDibaAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DibaService.API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DibaAPI dibaAPI = retrofit.create((DibaAPI.class));
        return dibaAPI;
    }
}
