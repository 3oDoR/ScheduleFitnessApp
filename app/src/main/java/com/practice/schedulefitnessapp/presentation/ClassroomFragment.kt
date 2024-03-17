package com.practice.schedulefitnessapp.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.practice.schedulefitnessapp.databinding.FragmentClassroomBinding


class ClassroomFragment : Fragment() {

    private lateinit var binding: FragmentClassroomBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var lessonListAdapter: LessonListAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("MyLog", "onCreateView: create")
        binding = FragmentClassroomBinding.inflate(inflater, container, false)
        setupRecyclerview()
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.getLessonList()
        viewModel.lessonItemList.observe(viewLifecycleOwner) {
            lessonListAdapter.lessonItemList = it
        }

        Log.d("MyLog", "onCreateView: ${lessonListAdapter.lessonItemList}")
        return binding.root
    }

    private fun setupRecyclerview() {
        lessonListAdapter = LessonListAdapter()
        binding.rvLessonsId.adapter = lessonListAdapter

    }

    companion object {
        @JvmStatic
        fun newInstance() = ClassroomFragment()
    }
}