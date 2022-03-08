package com.example.challengeapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.challengeapp.data.model.MatchModel
import com.example.challengeapp.data.model.MatchProvider

class MatchViewModel:ViewModel()  {

    val matchModel = MutableLiveData<MatchModel>()

    fun randomMatch(){
        val getMatch : MatchModel = MatchProvider.quotes.random()

        matchModel.postValue(getMatch)
    }
}