package com.example.swapplication.apis

import com.example.swapplication.models.Activity
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface BoredApi {
    @GET("api/activity")
    suspend fun getActivityAccessibility(
        @Query("minaccessibility") minAccessIbility: String,
        @Query("maxaccessibility") maxAccessIbility: String
    ): Activity

    @GET("api/activity")
    suspend fun getActivityParticipant(
        @Query("minparticipants") minparticipants: String,
        @Query("maxparticipants") maxparticipants: String
    ): Activity
}

var retrofit2 = Retrofit.Builder()
    .baseUrl("http://www.boredapi.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

var boredApi = retrofit2.create(BoredApi::class.java)