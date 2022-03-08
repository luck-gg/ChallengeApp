package com.example.challengeapp.ui.navigation

sealed class AppScreen(val route: String){
    object HomeScreen: AppScreen("home_screen")
    object DetailScreen: AppScreen("detail_screen")
}
