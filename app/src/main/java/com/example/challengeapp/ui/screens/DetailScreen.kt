package com.example.challengeapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
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


@Composable
fun DetailScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar {
            androidx.compose.material.Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Volver",
            modifier = Modifier.clickable{
                navController.popBackStack()
            })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Resultados de los Spurs")
        }
    }
    ) {
        BodyContentDetail(navController)
    }
}

@Composable
fun BodyContentDetail(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Estos son los resultados de los San Antonio Spurs")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Volver")
        }
    }
}
