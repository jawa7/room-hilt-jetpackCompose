package com.example.example.db

import androidx.room.*
import com.example.example.db.Example
import kotlinx.coroutines.flow.Flow

@Dao
interface ExampleDao {
    @Query("SELECT * FROM test_table")
    fun getUsername(): Flow<List<Example>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item : Example)

}