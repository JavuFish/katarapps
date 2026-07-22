package com.katarapps.mobile

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class KatarappsApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize app-wide dependencies
    }
}
