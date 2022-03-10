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
import com.example.challengeapp.data.model.MatchModel
import com.example.challengeapp.ui.viewmodel.MatchViewModel


@Composable
fun DetailScreen(
    navController: NavController,
    model: MatchViewModel = viewModel()
) {
    model.randomMatch()
    val matchData by model.matchModelLiveData.observeAsState()


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
        BodyContentDetail(matchData)

    }
}

@Composable
fun BodyContentDetail(matchData: MatchModel?) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Estos son los resultados de los San Antonio Spurs")
        Row(horizontalArrangement = Arrangement.Center) {
            Text(text = "Local")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Visitante")
        }
        if (matchData != null) {
            Row(horizontalArrangement = Arrangement.Center) {
                Text(matchData.homeTeam)
                Spacer(modifier = Modifier.width(8.dp))
                Text(matchData.awayTeam)
            }
            Row(horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
                Text(matchData.homeScore.toString())
                Spacer(modifier = Modifier.width(8.dp))
                Text(matchData.awayScore.toString())
            }
        }
    }
}
