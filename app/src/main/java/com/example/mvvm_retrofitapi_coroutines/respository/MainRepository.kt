package com.example.mvvm_retrofitapi_coroutines.respository

import com.example.mvvm_retrofitapi_coroutines.retrofit.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    suspend fun getAllMovies() = retrofitService.getAllMovies()

}