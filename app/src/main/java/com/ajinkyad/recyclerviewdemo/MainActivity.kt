package com.ajinkyad.recyclerviewdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countriesList = Arrays.asList(*resources.getStringArray(R.array.countries_array))

        val listAdapter = CountriesListAdapter(this, countriesList)

        val linearLayoutManager = LinearLayoutManager(this)

        recyclerViewCountryList.layoutManager = linearLayoutManager

        recyclerViewCountryList.adapter = listAdapter
    }
}
