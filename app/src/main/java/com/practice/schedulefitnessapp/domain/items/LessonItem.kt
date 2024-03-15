package com.practice.schedulefitnessapp.domain.items

import java.util.Date

data class LessonItem(
    val name: String,
    val description: String,
    val place: String,
    val coachId: String,
    val startTime: String,
    val endTime: String,
    val date: Date,
    val appointmentId: Int,
    val serviceId: Int,
    val availableSlots: Int,
    val commercial: Boolean,
    val clientRecorded: Boolean,
    val isCancelled: Boolean,
    val tab: String,
    val color: String,
    val tabId: Int
)