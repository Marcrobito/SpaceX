package com.example.spacex.network

import com.example.spacex.entities.Company
import com.example.spacex.entities.Launch
import retrofit2.http.GET

interface SpacesXApi {
    @GET("info")
    suspend fun getCompany():Company

    @GET("launches")
    suspend fun getLaunches():List<Launch>
}