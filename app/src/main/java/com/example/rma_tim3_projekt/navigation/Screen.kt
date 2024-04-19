package com.example.rma_tim3_projekt.navigation

sealed class Screen (val route : String){
    object PocetniEkran : Screen("PocetniEkran")
    object PretrazivanjeScreen : Screen("PretrazivanjeScreen")
    object ProizvodiScreen : Screen("ProizvodiScreen")

}