package com.lucas.soccerchallenge.repository

import com.lucas.soccerchallenge.data.model.Match

interface SoccerRepository {

    suspend fun fetchFixture(): List<Match>

    suspend fun fetchMatchResults(): List<Match>
}