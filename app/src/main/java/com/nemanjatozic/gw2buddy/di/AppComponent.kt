package com.nemanjatozic.gw2buddy.di

import android.app.Application
import android.content.Context
import com.nemanjatozic.gw2buddy.di.annotation.ApplicationContext
import com.nemanjatozic.gw2buddy.di.module.AppModule
import com.nemanjatozic.gw2buddy.di.module.DatabaseModule
import com.nemanjatozic.gw2buddy.ui.home.HomeFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    DatabaseModule::class
])
interface AppComponent {
    fun inject(application: Application)
    fun inject(homeFragment: HomeFragment)

    @ApplicationContext
    fun context(): Context
}