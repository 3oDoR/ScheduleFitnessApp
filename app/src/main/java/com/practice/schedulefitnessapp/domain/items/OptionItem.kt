package com.practice.schedulefitnessapp.domain.items

import com.google.gson.annotations.SerializedName


data class OptionItem(
    @SerializedName("club_name")
    val clubName: String,
    @SerializedName("link_android")
    val linkAndroid: String,
    @SerializedName("link_ios")
    val linkIOS: String,
    @SerializedName("primary_color")
    val primaryColor: String,
    @SerializedName("secondary_color")
    val secondaryColor: String
)
