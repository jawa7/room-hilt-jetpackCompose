package com.example.example.db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Example::class], version = 1)
abstract class ExampleDatabase : RoomDatabase() {
    abstract fun quizDao(): ExampleDao
}