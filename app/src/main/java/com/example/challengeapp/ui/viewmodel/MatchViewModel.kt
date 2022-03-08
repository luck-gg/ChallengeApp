package com.example.challengeapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.challengeapp.data.model.MatchModel
import com.example.challengeapp.domain.GetMatchUseCase

class MatchViewModel: ViewModel()  {

    val matchModel = MutableLiveData<MatchModel?>()

    var getRandomModelUseCase = GetMatchUseCase()

    fun randomMatch(){
        val match = getRandomModelUseCase()

        if(match!=null){
            matchModel.postValue(match)
        }

    }
}

