package com.example.kotlindemo.models

import com.google.gson.annotations.SerializedName

data class VenueModel(
    @SerializedName("name")
    val name: String,
    @SerializedName("id")
    val id: Int
)