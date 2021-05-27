package com.example.example.db

import androidx.room.*
import com.example.example.db.Example
import kotlinx.coroutines.flow.Flow

@Dao
interface ExampleDao {
    @Query("SELECT * FROM test_table WHERE name")
    suspend fun getUsername(): Example

    @Query("SELECT EXISTS (SELECT name FROM test_table LIMIT 1)")
    suspend fun exists() : Boolean

    @Query("SELECT score FROM test_table")
    suspend fun scoreOfKz() : Double

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item : Example)

}