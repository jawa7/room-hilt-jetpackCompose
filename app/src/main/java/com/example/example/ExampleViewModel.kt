package com.example.example

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.example.db.Example
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel @Inject constructor (
    private val repository: ExampleRepository
        ) : ViewModel() {


    fun addName(name: Example) = viewModelScope.launch {
        repository.add(name)
    }
}


