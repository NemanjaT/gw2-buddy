package com.nemanjatozic.gw2buddy.di

import android.content.Context
import com.nemanjatozic.gw2buddy.di.annotation.ApplicationContext
import com.nemanjatozic.gw2buddy.di.module.AppModule
import com.nemanjatozic.gw2buddy.di.module.DatabaseModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    DatabaseModule::class
])
interface AppComponent {
    @ApplicationContext
    fun context(): Context
}