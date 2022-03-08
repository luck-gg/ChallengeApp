package com.example.challengeapp.domain


import com.example.challengeapp.data.model.MatchModel
import com.example.challengeapp.data.model.MatchProvider

class GetMatchUseCase {

    operator fun invoke():MatchModel?{
        val matches = MatchProvider.matches
        if(!matches.isNullOrEmpty()){
            val randomNumber = (matches.indices).random()
            return matches[randomNumber]
        }
        return null
    }
}
