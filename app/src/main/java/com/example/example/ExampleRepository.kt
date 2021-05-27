package com.example.example

import androidx.annotation.WorkerThread
import com.example.example.db.Example
import com.example.example.db.ExampleDao
import kotlinx.coroutines.flow.Flow

class ExampleRepository (
    private val exampleDao: ExampleDao
    )  {

    suspend fun allNames() = exampleDao.getUsername()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun add(item: Example) {
        exampleDao.insert(item)
    }
}