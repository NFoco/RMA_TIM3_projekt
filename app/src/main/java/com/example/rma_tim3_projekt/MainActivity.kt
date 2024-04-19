package com.example.rma_tim3_projekt

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.rma_tim3_projekt.navigation.Navigation
import com.example.rma_tim3_projekt.screens.PocetniEkran
//import com.example.rma_tim3_projekt.screens.PretrazivanjeScreen
import com.example.rma_tim3_projekt.ui.theme.RMA_TIM3_projektTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RMA_TIM3_projektTheme {
// A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val lifecycleOwner = this
                    Navigation(applicationContext, lifecycleOwner = lifecycleOwner)
                }
            }
        }
    }
}