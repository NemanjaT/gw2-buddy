package com.nemanjatozic.gw2buddy.di.module

import android.app.Application
import android.content.Context
import com.nemanjatozic.gw2buddy.di.annotation.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(
    private val application: Application
) {
    @Provides
    @Singleton
    @ApplicationContext
    fun context(): Context {
        return application
    }
}