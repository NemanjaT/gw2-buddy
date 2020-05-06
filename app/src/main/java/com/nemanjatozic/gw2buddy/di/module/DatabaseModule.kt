package com.nemanjatozic.gw2buddy.di.module

import android.content.Context
import com.nemanjatozic.gw2buddy.db.AppDatabase
import com.nemanjatozic.gw2buddy.db.dao.ApiTokenDao
import com.nemanjatozic.gw2buddy.di.annotation.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun database(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun apiTokenDao(database: AppDatabase): ApiTokenDao {
        return database.apiTokenDao()
    }
}
