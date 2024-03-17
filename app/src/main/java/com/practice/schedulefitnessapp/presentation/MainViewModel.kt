package com.practice.schedulefitnessapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.practice.schedulefitnessapp.data.LessonListRepositoryImpl
import com.practice.schedulefitnessapp.domain.items.GeneralItem
import com.practice.schedulefitnessapp.domain.items.LessonItem
import com.practice.schedulefitnessapp.domain.useCases.GetLessonListUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

open class MainViewModel : ViewModel() {
    private val lessonListRepositoryImpl = LessonListRepositoryImpl
    private val getLessonListUseCase = GetLessonListUseCase(lessonListRepositoryImpl)
    val lessonItemList = MutableLiveData<List<LessonItem>>()
    val generalItem = MutableLiveData<GeneralItem>()

    fun getLessonList(): MutableLiveData<List<LessonItem>> {
        viewModelScope.launch {
            val list = withContext(Dispatchers.IO) {
                getLessonListUseCase.getLessonList()
            }
            lessonItemList.value = list.lessons
        }
        return lessonItemList
    }

}
