package com.example.chaun.codechalenge;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by chau.n on 22/06/2016.
 */
public class ServiceFactory {

    static <T> T createRetrofitService(final Class<T> clazz, final String endPoint) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(endPoint)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        T service = retrofit.create(clazz);

        return service;
    }
}
