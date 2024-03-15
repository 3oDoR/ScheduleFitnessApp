package com.practice.schedulefitnessapp.domain.repositories

import com.practice.schedulefitnessapp.domain.items.TrainerItem

interface TrainerListRepository {

    fun getTrainerItem(trainerItemId: String): TrainerItem

    fun getTrainerList(): List<TrainerItem>
}