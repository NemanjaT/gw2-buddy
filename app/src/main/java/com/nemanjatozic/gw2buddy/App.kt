package com.nemanjatozic.gw2buddy

import android.app.Application
import com.nemanjatozic.gw2buddy.di.DaggerAppComponent
import com.nemanjatozic.gw2buddy.di.module.AppModule

class App: Application() {
    val appComponent = DaggerAppComponent.builder()
        .appModule(AppModule(this))
        .build()
}
