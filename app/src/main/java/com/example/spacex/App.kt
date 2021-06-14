package com.example.spacex

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class App: Application(){
    val modules = listOf(mainModule, networkModule)
    companion object{
        lateinit var baseURL:String
    }

    override fun onCreate() {
        super.onCreate()
        baseURL = resources.getString(R.string.base_url)
        startKoin{
            //androidLogger()
            androidContext(this@App)
            modules(modules)
        }
    }



}