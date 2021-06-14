package com.example.spacex.entities

import java.lang.Exception

sealed class Response<out T>{
    object Uninitialized:Response<Nothing>()
    object Loading:Response<Nothing>()
    data class Success<out T>(val data:T):Response<T>()
    data class Fail(val exception: Exception):Response<Exception>()
}
