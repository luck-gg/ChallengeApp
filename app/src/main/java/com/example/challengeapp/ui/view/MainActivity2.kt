package com.example.challengeapp.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.challengeapp.ui.navigation.AppNavigation
import com.example.challengeapp.ui.theme.ChallengeAppTheme

class MainActivity2 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloApp()
        }
    }
}


@Composable
fun HelloApp() {
    ChallengeAppTheme {
        AppNavigation()
    }
}
