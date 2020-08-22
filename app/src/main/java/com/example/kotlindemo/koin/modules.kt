package com.example.kotlindemo.koin

import com.example.kotlindemo.retrofit.ApiInterface
import com.example.kotlindemo.viewModels.MainActivityVM
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    factory { getRetrofit() }
    single { getApiInterface(get()) }
    }

fun getRetrofit(): Retrofit = Retrofit.Builder().baseUrl("https://api.github.com/")
    .addConverterFactory(GsonConverterFactory.create()).build()

fun getApiInterface(retrofit: Retrofit): ApiInterface = retrofit.create(ApiInterface::class.java)
