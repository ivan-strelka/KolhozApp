package com.example.swapplication.apis

import com.example.swapplication.models.Person
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface RestSwApi {
    @GET("api/people/{id}")
    suspend fun getPersonById(@Path("id") personId: String): Person
}

var retrofit = Retrofit.Builder()
    .baseUrl("https://swapi.dev/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

var restSwApi = retrofit.create(RestSwApi::class.java)