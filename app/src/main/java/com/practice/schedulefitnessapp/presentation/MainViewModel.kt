package com.practice.schedulefitnessapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.practice.schedulefitnessapp.data.LessonListRepositoryImpl
import com.practice.schedulefitnessapp.domain.items.LessonItem
import com.practice.schedulefitnessapp.domain.useCases.GetLessonListUseCase

class MainViewModel : ViewModel() {
    private val lessonListRepositoryImpl = LessonListRepositoryImpl
    private val getLessonListUseCase = GetLessonListUseCase(lessonListRepositoryImpl)
    val lessonList = MutableLiveData<List<LessonItem>>()


    fun getLessonList() {
        val list = getLessonListUseCase.getLessonList()
        lessonList.postValue(list)
    }
}