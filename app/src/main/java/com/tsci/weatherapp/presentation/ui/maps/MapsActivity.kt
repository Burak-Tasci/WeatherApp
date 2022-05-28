package com.tsci.weatherapp.presentation.ui.maps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tsci.weatherapp.databinding.ActivityMapsBinding
import dagger.hilt.android.AndroidEntryPoint

class MapsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
    }

}