package com.example.kotlindemo.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitObject() {
    companion object Factory {
        var apiInterfac: ApiInterface? = null
        var retrofit: Retrofit? = null
        fun getRetrofitInstance(): Retrofit? {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().baseUrl("https://api.github.com/")
                    .addConverterFactory(GsonConverterFactory.create()).build()
            }
            return retrofit
        }

        fun getApiInterface(): ApiInterface? {
            if (apiInterfac == null) {
                apiInterfac = getRetrofitInstance()?.create(ApiInterface::class.java)
            }
            return apiInterfac
        }
    }
}