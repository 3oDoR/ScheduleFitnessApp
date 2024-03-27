package com.practice.schedulefitnessapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.practice.schedulefitnessapp.data.LessonListRepositoryImpl
import com.practice.schedulefitnessapp.domain.items.GeneralItem
import com.practice.schedulefitnessapp.domain.useCases.GetGeneralUseCase
import com.practice.schedulefitnessapp.domain.useCases.GetLessonListUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

open class MainViewModel : ViewModel() {
    private val lessonListRepositoryImpl = LessonListRepositoryImpl
    private val getLessonListUseCase = GetLessonListUseCase(lessonListRepositoryImpl)
    private val getGeneralItemUseCase = GetGeneralUseCase(lessonListRepositoryImpl)
    val lessonItemList = MutableLiveData<GeneralItem>()


    fun getLessonList(): MutableLiveData<GeneralItem> {
        viewModelScope.launch {
            val list = withContext(Dispatchers.IO) {
                getLessonListUseCase.getLessonList()
            }
            lessonItemList.value = list
        }
        return lessonItemList
    }

    fun getGeneralItem(): MutableLiveData<GeneralItem> {
        viewModelScope.launch {
            val list = withContext(Dispatchers.IO) {
                getGeneralItemUseCase.getGeneralItem()
            }
            lessonItemList.value = list
        }
        return lessonItemList
    }


}
