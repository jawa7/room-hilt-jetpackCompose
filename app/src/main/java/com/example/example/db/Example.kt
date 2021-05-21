package com.example.example.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "test_table")
data class Example(
    @PrimaryKey @ColumnInfo(name = "name") val name: String
)