package com.nemanjatozic.gw2buddy.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nemanjatozic.gw2buddy.db.dao.ApiTokenDao
import com.nemanjatozic.gw2buddy.db.entity.ApiTokenEntity

@Database(
    entities = [ApiTokenEntity::class],
    version = 1
)
abstract class AppDatabase protected constructor(): RoomDatabase() {
    abstract fun apiTokenDao(): ApiTokenDao

    companion object {
        private lateinit var INSTANCE: AppDatabase

        fun getInstance(context: Context) : AppDatabase {
            if (!this::INSTANCE.isInitialized) {
                INSTANCE = Room
                    .databaseBuilder(context.applicationContext, AppDatabase::class.java, "gw2_buddy.db")
                    .build()
            }
            return INSTANCE
        }
    }
}
