package com.practice.schedulefitnessapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.practice.schedulefitnessapp.R
import com.practice.schedulefitnessapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.lessonList.observe(this) {
            Log.d("MyLog", "onCreate: $it")
        }
        viewModel.getLessonList()

        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemReselectedListener {
            Log.d("MyLog", "${it.itemId}")
            when (it.itemId) {
                R.id.classroom -> setFragment(ClassroomFragment())
                R.id.request -> setFragment(RequestFragment())
                R.id.add -> setFragment(AddFragment())
                R.id.chat -> setFragment(ChatFragment())
                R.id.more -> setFragment(MoreFragment())
            }
        }
    }

    private fun setFragment(fragment: Fragment): Int {
        return supportFragmentManager.beginTransaction()
            .replace(binding.flFragment.id, fragment).commit()
    }
}