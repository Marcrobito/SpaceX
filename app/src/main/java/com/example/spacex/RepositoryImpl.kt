package com.example.spacex

import com.example.spacex.network.SpacesXApi

class RepositoryImpl(private val api: SpacesXApi):Repository {
    override suspend fun fetchLaunches() = api.getLaunches()

    override suspend fun fetchInfo() = api.getCompany()
}