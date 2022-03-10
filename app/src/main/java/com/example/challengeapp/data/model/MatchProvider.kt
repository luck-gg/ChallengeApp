package com.example.challengeapp.data.model

class MatchProvider {
    companion object {
        val matches = listOf(
            MatchModel(
                homeTeam = "San Antonio Spurs",
                awayTeam = "New York Knicks",
                homeScore   =   120,
                awayScore   =   111
            ),
            MatchModel(
                homeTeam = "San Antonio Spurs",
                awayTeam = "Portland Trail Blazers",
                homeScore   =   124,
                awayScore   =   122
            ),
            MatchModel(
                homeTeam = "San Antonio Spurs",
                awayTeam = "Washington Wizards",
                homeScore   =   113,
                awayScore   =   110
            ),
            MatchModel(
                homeTeam = "LA Clippers",
                awayTeam = "San Antonio Spurs",
                homeScore   =   103,
                awayScore   =   97
            ),
            MatchModel(
                homeTeam = "Golden State Warriors",
                awayTeam = "San Antonio Spurs",
                homeScore   =   110,
                awayScore   =   127
            )
        )
    }
}