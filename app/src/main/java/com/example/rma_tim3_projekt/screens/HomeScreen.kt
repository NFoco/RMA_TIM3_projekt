package com.example.rma_tim3_projekt.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PocetniEkran () {
    Surface(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        color = Color.LightGray
    ) {
        Text(
            text = "Hello, Jetpack Compose!",
            modifier = Modifier.padding(16.dp)
        )
    }
}