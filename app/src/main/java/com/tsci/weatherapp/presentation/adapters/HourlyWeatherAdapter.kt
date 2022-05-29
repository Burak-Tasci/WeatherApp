package com.tsci.weatherapp.presentation.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tsci.weatherapp.databinding.HourlyWeatherLayoutBinding

class HourlyWeatherAdapter :
    ListAdapter<Nothing, HourlyWeatherAdapter.WeatherViewHolder>(diffCallback) {

    inner class WeatherViewHolder(val binding: HourlyWeatherLayoutBinding, itemView: View) :
        RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


    companion object diffCallback : DiffUtil.ItemCallback<Nothing>() {
        override fun areItemsTheSame(oldItem: Nothing, newItem: Nothing): Boolean {
            TODO("Not yet implemented")
        }

        override fun areContentsTheSame(oldItem: Nothing, newItem: Nothing): Boolean {
            TODO("Not yet implemented")
        }

    }
}