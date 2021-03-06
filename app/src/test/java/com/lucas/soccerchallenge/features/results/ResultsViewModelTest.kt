package com.lucas.soccerchallenge.features.results

import com.lucas.soccerchallenge.features.results.usecase.FetchMatchResultsUseCase
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class ResultsViewModelTest {

    private lateinit var viewModel: ResultsViewModel

    @MockK(relaxed = true)
    private lateinit var fetchMatchResultsUseCase: FetchMatchResultsUseCase

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        viewModel = ResultsViewModel(fetchMatchResultsUseCase)
    }

    @Test
    fun `test fetchMatchResults observed and executed`() {
        verify { fetchMatchResultsUseCase.observe() }
        verify { fetchMatchResultsUseCase.execute(any()) }
    }

}