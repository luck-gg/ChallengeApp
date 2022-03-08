package com.example.challengeapp.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.lifecycle.Observer
import com.example.challengeapp.data.model.MatchModel
import com.example.challengeapp.ui.navigation.AppNavigation
import com.example.challengeapp.ui.theme.ChallengeAppTheme
import com.example.challengeapp.ui.viewmodel.MatchViewModel

class MainActivity2 : ComponentActivity() {

    private val matchVM: MatchViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            matchVM.matchModel.observe(this, Observer { currentMatch ->
            if (currentMatch != null) {

                setContent {
                    HelloApp(currentMatch)
                }
            }

            })

    }
}



@Composable
fun HelloApp(match_vm: MatchModel?) {
    ChallengeAppTheme {
        AppNavigation(match_vm)
    }
}
