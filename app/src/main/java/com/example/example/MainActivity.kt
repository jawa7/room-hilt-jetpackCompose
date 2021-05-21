package com.example.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import com.example.example.ui.theme.ExampleTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
     val viewModel: ExampleViewModel = viewModel()
    Column(
        verticalArrangement = Arrangement.Center
    ) {

    }
}
