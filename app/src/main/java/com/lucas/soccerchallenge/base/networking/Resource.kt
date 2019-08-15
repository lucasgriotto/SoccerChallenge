package com.lucas.soccerchallenge.base.networking

sealed class Resource<out T> {
    data class Success<out T>(val data: T) : Resource<T>()
    data class Loading<out T>(val partialData: T? = null) : Resource<T>()
    data class Error<out T>(val message: String) : Resource<T>()
}