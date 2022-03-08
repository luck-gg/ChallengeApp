package com.example.challengeapp.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.Observer
import com.example.challengeapp.ui.navigation.AppNavigation
import com.example.challengeapp.ui.theme.ChallengeAppTheme
import com.example.challengeapp.ui.viewmodel.MatchViewModel

class MainActivity2 : ComponentActivity() {

    private val matchViewModel1: MatchViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        var match :String = ""
        super.onCreate(savedInstanceState)
        matchViewModel1.matchModel.observe(this, Observer { currentMatch ->
            match = currentMatch.homeTeam
        })
        matchViewModel1.randomMatch()
        setContent {
            HelloApp(match)
        }
    }
}



@Composable
fun HelloApp(match: String) {
    ChallengeAppTheme {
        AppNavigation()
    }
}
