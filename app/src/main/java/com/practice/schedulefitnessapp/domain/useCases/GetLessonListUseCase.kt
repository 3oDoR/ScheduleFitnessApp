package com.practice.schedulefitnessapp.domain.useCases

import com.practice.schedulefitnessapp.domain.items.GeneralItem
import com.practice.schedulefitnessapp.domain.repositories.LessonListRepository

class GetLessonListUseCase(private val lessonListRepository: LessonListRepository) {

    suspend fun getLessonList(): GeneralItem {
        return lessonListRepository.getLessonList()
    }
}