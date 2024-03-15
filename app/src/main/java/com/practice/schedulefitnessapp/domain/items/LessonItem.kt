package com.practice.schedulefitnessapp.domain.items

import com.google.gson.annotations.SerializedName
import java.util.Date

data class LessonItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("place")
    val place: String,
    @SerializedName("coach_id")
    val coachId: String,
    @SerializedName("startTime")
    val startTime: String,
    @SerializedName("endTime")
    val endTime: String,
    @SerializedName("date")
    val date: Date,
    @SerializedName("appointment_id")
    val appointmentId: Int,
    @SerializedName("service_id")
    val serviceId: Int,
    @SerializedName("available_slots")
    val availableSlots: Int,
    @SerializedName("commercial")
    val commercial: Boolean,
    @SerializedName("client_recorded")
    val clientRecorded: Boolean,
    @SerializedName("is_cancelled")
    val isCancelled: Boolean,
    @SerializedName("tab")
    val tab: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("tab_id")
    val tabId: Int
)