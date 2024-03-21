package com.practice.schedulefitnessapp.domain.useCases

import com.practice.schedulefitnessapp.domain.items.GeneralItem
import com.practice.schedulefitnessapp.domain.repositories.LessonListRepository

class GetGeneralUseCase(private val lessonListRepository: LessonListRepository) {

    suspend fun getGeneralItem(): GeneralItem {
        return lessonListRepository.getGeneralItem()
    }
}