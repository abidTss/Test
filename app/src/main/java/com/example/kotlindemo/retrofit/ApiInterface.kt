package com.example.kotlindemo.retrofit

import com.example.kotlindemo.models.VenueModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiInterface {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Call<List<VenueModel>>

}