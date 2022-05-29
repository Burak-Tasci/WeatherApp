package com.tsci.weatherapp.presentation.common

import androidx.appcompat.app.AppCompatActivity
import com.tsci.weatherapp.presentation.ui.home.HomeActivity
import com.tsci.weatherapp.presentation.ui.maps.MapsActivity
import javax.inject.Inject

class ScreensNavigatorImpl @Inject constructor(private val activity: AppCompatActivity) :
    ScreensNavigator {

    override fun navigateBack() {
        activity.onBackPressed()
    }

    override fun toMapsActivity() {
        MapsActivity.start(activity)
    }

    override fun toHomeActivity() {
        HomeActivity.start(activity)
    }
}