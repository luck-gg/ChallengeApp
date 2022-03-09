package com.example.challengeapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.challengeapp.data.model.MatchModel
import com.example.challengeapp.domain.GetMatchUseCase

class MatchViewModel : ViewModel() {

    val matchModelLiveData: LiveData<MatchModel>
        get() = match
    var getRandomModelUseCase = GetMatchUseCase()

    private val match = MutableLiveData<MatchModel>()

    fun randomMatch(){
        val _match = getRandomModelUseCase()
    }
}

/*
class MatchViewModel: ViewModel()  {

    val matchModel = LiveData<MatchModel>()
        get()=match

    private val match = MutableLiveData<MatchModel>()

    var getRandomModelUseCase = GetMatchUseCase()

    fun randomMatch(){
        val match = getRandomModelUseCase()

        if(match!=null){
            matchModel.postValue(match)
        }

    }
}

*/