package com.nemanjatozic.gw2buddy

import android.app.Application
import com.nemanjatozic.gw2buddy.di.DaggerAppComponent

class App: Application() {
    val appComponent = DaggerAppComponent.builder().build()
}
