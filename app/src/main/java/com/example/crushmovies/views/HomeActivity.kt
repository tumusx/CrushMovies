package com.example.crushmovies.views

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import com.example.crushmovies.R
import com.example.crushmovies.databinding.ActivityHomeBinding
import java.util.prefs.Preferences

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var sharedPreferenceSave : SharedPreferences

    companion object {
       const val PREF_USER = "SHARED_PREF"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        setContentView(R.layout.activity_home)
    }

}