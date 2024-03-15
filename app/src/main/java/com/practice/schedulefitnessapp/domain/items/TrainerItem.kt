package com.practice.schedulefitnessapp.domain.items

import com.google.gson.annotations.SerializedName


data class TrainerItem(
    @SerializedName("id")
    val id: String,
    @SerializedName("full_name")
    val fullName: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("position")
    val position: String,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("img_url_small")
    val imageUrlSmall: String,
    @SerializedName("img_url_medium")
    val imageUrlMedium: String,
    @SerializedName("description")
    val description: String
)
