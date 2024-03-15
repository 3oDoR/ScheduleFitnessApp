package com.practice.schedulefitnessapp.domain.useCases

import com.practice.schedulefitnessapp.domain.items.TrainerItem
import com.practice.schedulefitnessapp.domain.repositories.TrainerListRepository

class GetTrainerListUseCase(private val trainerListRepository: TrainerListRepository) {

    fun getTrainerList(): List<TrainerItem> {
        return trainerListRepository.getTrainerList()
    }
}