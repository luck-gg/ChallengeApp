package com.example.challengeapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.challengeapp.data.model.MatchModel


@Composable
fun DetailScreen(
    navController: NavController,
    view_model: MatchModel
){
    var homeTeam: String = view_model.homeTeam

    Scaffold(topBar = {
        TopAppBar {
            androidx.compose.material.Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Volver",
            modifier = Modifier.clickable(){
                navController.popBackStack()
            })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Resultados de los Spurs")
        }
    }
    ) {
        BodyContentDetail(navController, homeTeam)
    }
}

@Composable
fun BodyContentDetail(navController: NavController, homeTeam: String) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Estos son los resultados de los San Antonio Spurs")
        Text(homeTeam)
    }
}
