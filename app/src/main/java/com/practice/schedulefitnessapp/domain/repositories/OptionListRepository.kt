package com.practice.schedulefitnessapp.domain.repositories

import com.practice.schedulefitnessapp.domain.items.OptionItem

interface OptionListRepository {

    fun getOptionItem(optionItemId: Int): OptionItem

    fun getListOption(): List<OptionItem>
}