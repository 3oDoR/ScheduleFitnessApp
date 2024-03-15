package com.practice.schedulefitnessapp.domain.repositories

import com.practice.schedulefitnessapp.domain.items.TabItem

interface TabListRepository {

    fun getTabItem(tabItemId: Int): TabItem

    fun getListTab(): List<TabItem>
}