package com.practice.schedulefitnessapp.data

import android.util.Log
import com.google.gson.Gson
import com.practice.schedulefitnessapp.domain.items.GeneralItem
import com.practice.schedulefitnessapp.domain.items.LessonItem
import com.practice.schedulefitnessapp.domain.repositories.LessonListRepository
import java.net.URL

object LessonListRepositoryImpl : LessonListRepository {

    private val lessonList = mutableListOf<GeneralItem>()
    private val url = "https://olimpia.fitnesskit-admin.ru/schedule/get_v3/?club_id=2"
    fun getResponse(url: String): String {
        TODO()
    }

    override suspend fun getGeneralItem(): GeneralItem {
        val text = URL(url).readText()
        val gson = Gson()
        val parser = gson.fromJson(text, GeneralItem::class.java)
        Log.d("MyLog", "getGeneralItem(parser): $parser")
        return parser
    }

    override suspend fun getLessonList(): GeneralItem {
        val text = URL(url).readText()
        val gson = Gson()
//        Log.d("MyLog", "getLessonList MY_STRING: $text")
        val parser = gson.fromJson(text, GeneralItem::class.java)
//        Log.d("MyLog", "getResponse: gson ${parser}")
        return parser
    }

    override fun getLessonItem(lessonItemId: Int): LessonItem {
        TODO()
    }
}