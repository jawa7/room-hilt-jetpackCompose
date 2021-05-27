package com.example.example.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "test_table")
data class Example (
    @PrimaryKey(autoGenerate = true)
    var ids: Long = 0L,
    val name: String?,
    val score: Double?,
)