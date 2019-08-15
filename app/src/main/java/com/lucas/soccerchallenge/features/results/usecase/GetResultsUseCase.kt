package com.lucas.soccerchallenge.features.results.usecase

import com.lucas.soccerchallenge.base.networking.Resource
import com.lucas.soccerchallenge.base.ui.LiveDataUseCase
import com.lucas.soccerchallenge.data.model.Match
import com.lucas.soccerchallenge.repository.SoccerRepository
import javax.inject.Inject

class GetResultsUseCase @Inject
constructor(private val repository: SoccerRepository) : LiveDataUseCase<Unit, Resource<List<Match>>>() {

    override suspend fun getData(params: Unit) {
        repository.getResults { response ->
            when (response) {
                is Resource.Loading -> result.postValue(Resource.Loading())
                is Resource.Error -> result.postValue(Resource.Error(response.message))
                is Resource.Success -> result.postValue(Resource.Success(response.data))
            }
        }
    }
}