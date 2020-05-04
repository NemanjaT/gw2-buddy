package com.nemanjatozic.gw2buddy.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "api_token",
    indices = [
        Index(value = ["name"], unique = true)
    ]
)
class ApiTokenEntity(
    @PrimaryKey @ColumnInfo(name = "id") var id: Int,
    @ColumnInfo(name = "token", index = true) var token: String,
    @ColumnInfo(name = "name") var name: String?
)
