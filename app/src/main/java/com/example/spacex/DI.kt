package com.example.spacex

import com.example.spacex.network.Network
import com.example.spacex.network.SpacesXApi
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
    single<SpacesXApi> { Network.service }
}

val mainModule = module {
    single<Repository> { RepositoryImpl(get()) }
    viewModel { MainViewModel(get()) }
}