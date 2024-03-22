package com.practice.schedulefitnessapp.domain.repositories

import com.practice.schedulefitnessapp.domain.items.GeneralItem
import com.practice.schedulefitnessapp.domain.items.LessonItem

interface LessonListRepository {

    suspend fun getGeneralItem(): GeneralItem
    suspend fun getLessonList(): GeneralItem

    fun getLessonItem(lessonItemId: Int): LessonItem
}