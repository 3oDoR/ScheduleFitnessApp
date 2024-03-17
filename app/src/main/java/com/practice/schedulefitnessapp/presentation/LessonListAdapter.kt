package com.practice.schedulefitnessapp.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practice.schedulefitnessapp.databinding.ItemLessonBinding
import com.practice.schedulefitnessapp.domain.items.LessonItem

class LessonListAdapter : RecyclerView.Adapter<LessonListAdapter.LessonItemViewHolder>() {

    var lessonItemList = listOf<LessonItem>()
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
        return lessonItemList.size
    }

    override fun onBindViewHolder(holder: LessonItemViewHolder, position: Int) {
        val lessonItem = lessonItemList[position]
        holder.binding.tvStartTime.text = lessonItem.startTime
        holder.binding.tvLessonName.text = lessonItem.name
        holder.binding.tvDurationLesson.text // todo
        holder.binding.tvEndTime.text = lessonItem.endTime
        holder.binding.ivIconGroup // todo
        holder.binding.tvCoachName.text = lessonItem.coachId // todo
        holder.binding.ivLocation // todo
        holder.binding.tvLocation.text = lessonItem.place
    }

    class LessonItemViewHolder(val binding: ItemLessonBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}