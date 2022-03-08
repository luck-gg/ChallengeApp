package com.example.challengeapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.challengeapp.ui.screens.DetailScreen
import com.example.challengeapp.ui.screens.HomeScreen

@Composable
fun AppNavigation() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.HomeScreen.route){
        composable(route = AppScreen.HomeScreen.route){
            HomeScreen(navController)
        }
        composable(route = AppScreen.DetailScreen.route){
            DetailScreen(navController)
        }
    }

}