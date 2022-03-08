package com.example.challengeapp.domain


import com.example.challengeapp.data.model.MatchModel
import com.example.challengeapp.data.model.MatchProvider

class GetMatchUseCase {

    operator fun invoke():MatchModel?{
        val quotes = MatchProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}
