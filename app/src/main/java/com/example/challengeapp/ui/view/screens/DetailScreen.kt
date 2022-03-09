package com.example.challengeapp.ui.view.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.challengeapp.ui.viewmodel.MatchViewModel


@Composable
fun DetailScreen(
    navController: NavController,
    model: MatchViewModel = viewModel()
) {

    val matchData by model.matchModelLiveData.observeAsState()
    model.randomMatch()
    val homeTeam = matchData?.awayTeam

    Scaffold(topBar = {
        TopAppBar {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Volver",
            modifier = Modifier.clickable(){
                navController.popBackStack()
            })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Resultados de los Spurs")
        }
    }
    ) {
        if (homeTeam != null) {
            BodyContentDetail(homeTeam)
        }
    }
}

@Composable
fun BodyContentDetail(homeTeam: String) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Estos son los resultados de los San Antonio Spurs")
        Text(homeTeam)
    }
}
