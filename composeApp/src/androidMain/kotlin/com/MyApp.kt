package com

import android.app.Application
import data.KoinInitializer

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        KoinInitializer(applicationContext).init()
    }
}