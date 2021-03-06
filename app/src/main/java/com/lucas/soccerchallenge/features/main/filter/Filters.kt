package com.lucas.soccerchallenge.features.main.filter

import com.lucas.soccerchallenge.data.model.Competition

object Filters {

    const val ALL_FILTER_ID = -1
    val allFilterCompetition = Competition(ALL_FILTER_ID, "All")

    val competitionFilter = listOf(
        allFilterCompetition,
        Competition(8, "Premier League"),
        Competition(2, "Carabao Cup"),
        Competition(6, "UEFA Europa League"),
        Competition(1, "FA Cup")
    )

}