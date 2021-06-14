package com.example.spacex

import com.example.spacex.entities.Company
import com.example.spacex.entities.Launch

interface Repository {
    suspend fun fetchLaunches():List<Launch>
    suspend fun fetchInfo():Company
}