package com.nemanjatozic.gw2buddy.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nemanjatozic.gw2buddy.db.dao.ApiTokenDao
import com.nemanjatozic.gw2buddy.db.entity.ApiTokenEntity

private const val DB_FILE_NAME = "gw2_buddy.db"

@Database(
    entities = [ApiTokenEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase protected constructor(): RoomDatabase() {
    abstract fun apiTokenDao(): ApiTokenDao

    companion object {
        private lateinit var INSTANCE: AppDatabase

        fun getInstance(context: Context) : AppDatabase {
            if (!this::INSTANCE.isInitialized) {
                INSTANCE = Room
                    .databaseBuilder(context, AppDatabase::class.java, DB_FILE_NAME)
                    .build()
            }
            return INSTANCE
        }
    }
}
