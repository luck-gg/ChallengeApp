package com.example.challengeapp.model
//Reemplazar con busqueda a json
class MatchProvider {
    companion object {
        fun random(): MatchModel {
            val position = (0..10).random()
            return quotes[position]
        }
        private val quotes = listOf(
            MatchModel(
                homeTeam = "It’s not a bug. It’s an undocumented feature!",
                awayTeam = "Anonymous"
            ),
            MatchModel(
                homeTeam = "“Software Developer” – An organism that turns caffeine into software",
                awayTeam = "Anonymous"
            ),
            MatchModel(
                homeTeam = "If debugging is the process of removing software bugs, then programming must be the process of putting them in",
                awayTeam = "Edsger Dijkstra"
            ),
            MatchModel(
                homeTeam = "A user interface is like a joke. If you have to explain it, it’s not that good.",
                awayTeam = "Anonymous"
            ),
            MatchModel(
                homeTeam = "I don’t care if it works on your machine! We are not shipping your machine!",
                awayTeam = "Vidiu Platon"
            ),
            MatchModel(
                homeTeam = "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                awayTeam = "Bill Gates"
            ),
            MatchModel(
                homeTeam = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
                awayTeam = "Anonymous"
            ),
            MatchModel(homeTeam = "Things aren’t always #000000 and #FFFFFF", awayTeam = "Anonymous"),
            MatchModel(homeTeam = "Talk is cheap. Show me the code.", awayTeam = "Linus Torvalds"),
            MatchModel(
                homeTeam = "Software and cathedrals are much the same — first we build them, then we pray.",
                awayTeam = "Anonymous"
            ),
            MatchModel(homeTeam = "¿A que esperas?, suscríbete.", awayTeam = "AristiDevs")
        )
    }
}