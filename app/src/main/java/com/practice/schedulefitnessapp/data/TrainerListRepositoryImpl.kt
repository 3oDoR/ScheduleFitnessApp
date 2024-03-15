package com.practice.schedulefitnessapp.data

import com.practice.schedulefitnessapp.domain.items.TrainerItem
import com.practice.schedulefitnessapp.domain.repositories.TrainerListRepository

object TrainerListRepositoryImpl : TrainerListRepository {

    private val trainerList = mutableListOf<TrainerItem>()
    override fun getTrainerItem(trainerItemId: String): TrainerItem {
        return trainerList.find { it.id == trainerItemId }
            ?: throw RuntimeException("Element with id:$trainerItemId not found")

    }

    override fun getTrainerList(): List<TrainerItem> {
        return trainerList.toList()
    }


}
