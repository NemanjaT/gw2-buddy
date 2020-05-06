package com.nemanjatozic.gw2buddy

import android.app.Application
import com.nemanjatozic.gw2buddy.di.AppComponent
import com.nemanjatozic.gw2buddy.di.DaggerAppComponent
import com.nemanjatozic.gw2buddy.di.module.AppModule

class App: Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
        appComponent.inject(this)
    }
}
