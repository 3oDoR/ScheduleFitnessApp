package com.practice.schedulefitnessapp.domain.items

import com.google.gson.annotations.SerializedName


data class TabItem(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)
