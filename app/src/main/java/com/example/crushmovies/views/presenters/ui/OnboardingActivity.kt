package com.example.crushmovies.views.presenters.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crushmovies.R
import com.example.crushmovies.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_onboarding)
        configureOnSharedPreferences()
    }

    private fun configureOnSharedPreferences(){
        binding.root

    }
}