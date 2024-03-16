package com.practice.schedulefitnessapp.domain.items

import com.google.gson.annotations.SerializedName

data class GeneralItem(
    @SerializedName("lessons")
    val lessons: List<LessonItem>,
    @SerializedName("option")
    val option: OptionItem,
    @SerializedName("tabs")
    val tabs: List<TabItem>,
    @SerializedName("trainers")
    val trainers: List<TrainerItem>
)