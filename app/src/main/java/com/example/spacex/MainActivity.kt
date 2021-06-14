package com.example.spacex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex.databinding.ActivityMainBinding
import com.example.spacex.entities.Response
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("StringFormatMatches")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        with(binding) {
            setContentView(root)

            recycler.layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)

            mainViewModel.initData()
            mainViewModel.company.observe(this@MainActivity) {
                when (it) {
                    is Response.Uninitialized -> {
                    }
                    is Response.Loading -> {
                    }
                    is Response.Success -> {
                        companyInfo.text= getString(
                            R.string.company_info,
                            it.data.name,
                            it.data.founder,
                            it.data.founded,
                            it.data.employees,
                            it.data.launchSites,
                            it.data.valuation
                        )
                    }
                    else -> {

                    }
                }
            }

            mainViewModel.launches.observe(this@MainActivity) {
                when (it) {
                    is Response.Uninitialized -> {
                    }
                    is Response.Loading -> {
                    }
                    is Response.Success -> recycler.adapter = LaunchesAdapter(it.data)
                    else -> {}
                }
            }
        }


    }
}