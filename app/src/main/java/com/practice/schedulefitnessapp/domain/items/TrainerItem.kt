package com.practice.schedulefitnessapp.domain.items

data class TrainerItem(
    val id: String,
    val fullName: String,
    val name: String,
    val lastName: String,
    val position: String,
    val imageUrl: String,
    val imageUrlSmall: String,
    val imageUrlMedium: String,
    val description: String
)
