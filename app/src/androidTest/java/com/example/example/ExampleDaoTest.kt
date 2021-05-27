package com.example.example

import androidx.test.filters.SmallTest
import org.junit.Rule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltAndroidRule
import androidx.arch.core.executor.testing.InstantTaskExecutorRule

@HiltAndroidTest
@SmallTest
class ExampleDaoTest {

    @get: Rule
    var hiltRule = HiltAndroidRule(this)

    @get: Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()
}