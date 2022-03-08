package com.example.challengeapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.challengeapp.data.model.MatchModel
import com.example.challengeapp.ui.navigation.AppScreen


@Composable
fun HomeScreen(navController: NavController, viewModel: MatchModel?){
    Scaffold(topBar = {
        TopAppBar {
            Text(text = "SpursApp")
        }
    }
    ) {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ver últimos resultados de los San Antonio Spurs")
        Button(onClick = {
            navController.navigate(route = AppScreen.DetailScreen.route)
        }) {
            Text("Ingresar")
        }
    }
}

