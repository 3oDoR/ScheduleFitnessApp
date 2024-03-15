package com.practice.schedulefitnessapp.domain.repositories

import com.practice.schedulefitnessapp.domain.items.LessonItem

interface LessonListRepository {
    fun getLessonList(): List<LessonItem>

    fun getLessonItem(lessonItemId: Int): LessonItem
}