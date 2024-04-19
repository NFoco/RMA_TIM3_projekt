package com.example.rma_tim3_projekt.navigation

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rma_tim3_projekt.screens.PocetniEkran
import com.example.rma_tim3_projekt.screens.PretrazivanjeScreen

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation(
    context: Context,
    lifecycleOwner: LifecycleOwner
){
    val navController = rememberNavController();

    NavHost(navController = navController, startDestination = Screen.PocetniEkran.route) {
        composable(
            route = Screen.PocetniEkran.route){
            PocetniEkran(
                navController = navController,
            )
        }
        composable(
            route = Screen.PretrazivanjeScreen.route){
            PretrazivanjeScreen(
                navController = navController,
            )
        }
}
}
