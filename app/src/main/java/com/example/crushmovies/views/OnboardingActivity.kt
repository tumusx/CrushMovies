package com.example.crushmovies.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crushmovies.R

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        configureOnSharedPreferences()
    }

    private fun configureOnSharedPreferences(){

    }
}