package com.tsci.weatherapp.presentation.ui.maps

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tsci.weatherapp.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
    }


    companion object {
        fun start(context: Context) {
            val intent = Intent(context, MapsActivity::class.java)
            context.startActivity(intent)
        }
    }
}