package com.practice.schedulefitnessapp.data

import com.practice.schedulefitnessapp.domain.items.LessonItem
import com.practice.schedulefitnessapp.domain.repositories.LessonListRepository

object LessonListRepositoryImpl : LessonListRepository {

    private val lessonList = mutableListOf<LessonItem>()
    override fun getLessonList(): List<LessonItem> {
        return lessonList
    }

    override fun getLessonItem(lessonItemId: Int): LessonItem {
        return lessonList.find {
            it.appointmentId == lessonItemId
        } ?: throw throw RuntimeException("Element with id:$lessonList not found")
    }
}