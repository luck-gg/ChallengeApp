package com.example.challengeapp.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.Observer
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.challengeapp.ui.theme.ChallengeAppTheme
import com.example.challengeapp.viewmodel.MatchViewModel

class MainActivity : ComponentActivity() {

    private val matchViewModel1 : MatchViewModel by viewModels()
    private lateinit var match : Match

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloApp(match)
        }
        matchViewModel1.matchModel.observe(this, Observer { currentMatch ->
            match.name=currentMatch.homeTeam
        })
    }
}
//Test preview data
data class Match(var name :String, val age:Int)
/*
class SampleUserProvider: PreviewParameterProvider<Match> {
    override val values = sequenceOf(Match("Jens",31),Match("Jim",44))
}
*/

//End Test preview data
/*@Preview*/
@Composable
fun HelloApp(
    /*@PreviewParameter(SampleUserProvider::class)*/
    match : Match)
{
    ChallengeAppTheme {
        WelcomeTxt(match.name)
    }
}
@Composable
fun WelcomeTxt(name: String) {
    Text(text = "Hello $name!")
}
