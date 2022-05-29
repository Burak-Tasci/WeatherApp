package com.tsci.weatherapp.data.remote.model

data class WeatherForecastResponse(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<HourlyWeather>,
    val message: Int
)