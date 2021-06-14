package com.example.spacex

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.spacex.entities.Company
import com.example.spacex.entities.Launch
import com.example.spacex.entities.Response
import com.example.spacex.entities.Response.Uninitialized
import com.example.spacex.entities.Response.Loading
import kotlinx.coroutines.launch

class MainViewModel(val repository: Repository): ViewModel() {

    private val _company = MutableLiveData<Response<Company>>(Uninitialized)
    val company: LiveData<Response<Company>> get() = _company

    private val _launches = MutableLiveData<Response<List<Launch>>>(Uninitialized)
    val launches: LiveData<Response<List<Launch>>> get() = _launches

    fun initData()  = viewModelScope.launch {
        _company.value = Loading
        _launches.value  = Loading
        _company.value = Response.Success(repository.fetchInfo())
        _launches.value = Response.Success(repository.fetchLaunches())
    }

}