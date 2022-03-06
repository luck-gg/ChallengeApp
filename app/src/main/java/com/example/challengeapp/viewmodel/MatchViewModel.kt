package com.example.challengeapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.challengeapp.model.MatchModel
import com.example.challengeapp.model.MatchProvider

class MatchViewModel:ViewModel()  {

    val matchModel = MutableLiveData<MatchModel>()

    fun randomMatch(){
        val currentMatch : MatchModel = MatchProvider.random()

        matchModel.postValue(currentMatch)
    }
}