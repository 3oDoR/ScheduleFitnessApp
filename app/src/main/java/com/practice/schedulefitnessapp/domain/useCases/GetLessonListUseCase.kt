package com.practice.schedulefitnessapp.domain.useCases

import com.practice.schedulefitnessapp.domain.items.LessonItem
import com.practice.schedulefitnessapp.domain.repositories.LessonListRepository

class GetLessonListUseCase(private val lessonListRepository: LessonListRepository) {

    fun getLessonList(): List<LessonItem> {
        return lessonListRepository.getLessonList()
    }
}