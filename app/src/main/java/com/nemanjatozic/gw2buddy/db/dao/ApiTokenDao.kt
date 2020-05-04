package com.nemanjatozic.gw2buddy.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.nemanjatozic.gw2buddy.db.entity.ApiTokenEntity

@Dao
interface ApiTokenDao {
    @Insert
    fun insertToken(apiToken: ApiTokenEntity)

    @Query("select * from api_token where token=:token")
    fun findByToken(token: String): ApiTokenEntity

    @Query("select count(*) from api_token")
    fun count(): Int
}