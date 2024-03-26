package com.practice.schedulefitnessapp.presentation

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practice.schedulefitnessapp.databinding.ItemLessonBinding
import com.practice.schedulefitnessapp.domain.items.GeneralItem
import com.practice.schedulefitnessapp.domain.items.OptionItem

class LessonListAdapter : RecyclerView.Adapter<LessonListAdapter.LessonItemViewHolder>() {


    var training =
        GeneralItem(emptyList(), OptionItem("", "", "", "", ""), emptyList(), emptyList())
        set(value) {
            field = value
            notifyDataSetChanged()
        }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemLessonBinding.inflate(inflater, parent, false)
        return LessonItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        Log.d("Adapter", "getItemCount: ${training.lessons.size}")
        return training.lessons.size
    }

    private fun getTrainerName(coachId: String): String {
        return training.trainers.find { t -> t.id == coachId }?.name ?: "Неизвестно"
    }

    private fun getLessonTime(sTime: String, eTime: String): String {
        val startTime = sTime.split(":").toTypedArray()
        val endTime = eTime.split(":").toTypedArray()
        val sTime = (startTime[0].toInt() * 60) + (startTime[1].toInt())
        val eTime = (endTime[0].toInt() * 60) + (endTime[1].toInt())
        val hours = Math.abs(eTime - sTime) / 60
        val minutes = Math.abs(eTime - sTime) % 60
        return "%02d".format(hours) + ":" + "%02d".format(minutes)
    }

    override fun onBindViewHolder(holder: LessonItemViewHolder, position: Int) {
        val lessonItem = training.lessons[position]
        holder.binding.tvDate.text = lessonItem.date.toString()
        holder.binding.tvStartTime.text = lessonItem.startTime
        holder.binding.tvLessonName.text = lessonItem.name
        holder.binding.tvDurationLesson.text =
            getLessonTime(lessonItem.startTime, lessonItem.endTime)
        holder.binding.tvEndTime.text = lessonItem.endTime
        holder.binding.ivIconGroup // todo
        holder.binding.tvCoachName.text = getTrainerName(lessonItem.coachId)
        holder.binding.ivLocation // todo
        holder.binding.tvLocation.text = lessonItem.place
        getLessonTime(lessonItem.startTime, lessonItem.endTime)
    }

    class LessonItemViewHolder(val binding: ItemLessonBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}