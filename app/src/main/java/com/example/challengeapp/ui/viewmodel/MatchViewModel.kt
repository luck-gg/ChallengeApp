package com.example.challengeapp.ui.viewmodel

/*
class MatchViewModel : ViewModel() {

    val matchModelLiveData: LiveData<MatchModel>
        get() = match

    private val match = MutableLiveData<MatchModel>()

    var getRandomModelUseCase = GetMatchUseCase()
    fun randomMatch() {
        getRandomModelUseCase()
    }
}
*/

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.challengeapp.data.model.MatchModel
import com.example.challengeapp.data.model.MatchProvider

class MatchViewModel:ViewModel()  {

    val matchModelLiveData: LiveData<MatchModel>
        get() = match

    private val match = MutableLiveData<MatchModel>()

    fun randomMatch() {
        val matches = MatchProvider.matches
        if(!matches.isNullOrEmpty()){
            val randomNumber = (matches.indices).random()
            match.value = matches[randomNumber]
        }
    }
}