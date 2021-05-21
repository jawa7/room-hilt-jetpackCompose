package com.example.example.di

import android.content.Context
import androidx.room.Room
import com.example.example.db.ExampleDao
import com.example.example.db.ExampleDatabase
import com.example.example.ExampleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule  {
    @Provides
    fun provideExampleDao(appDatabase: ExampleDatabase) : ExampleDao {
        return appDatabase.quizDao()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context):
            ExampleDatabase {
        return Room.databaseBuilder(
            appContext,
            ExampleDatabase::class.java,
            "test_database"
        ).build()
    }

    @Provides
    fun providesExampleRepository(exampleDao: ExampleDao) : ExampleRepository = ExampleRepository(exampleDao)
}