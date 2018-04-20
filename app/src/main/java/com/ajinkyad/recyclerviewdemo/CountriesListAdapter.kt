package com.ajinkyad.recyclerviewdemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CountriesListAdapter(context: Context, private val arrlstData: List<String>) : RecyclerView.Adapter<CountriesListAdapter.CountryNameItemHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryNameItemHolder {
        return CountryNameItemHolder(inflater.inflate(R.layout.custom_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: CountryNameItemHolder, position: Int) {
        val currentData = arrlstData[position]
        holder.txtvwTitle.text = currentData
    }

    override fun getItemCount(): Int {
        return arrlstData.size
    }


    inner class CountryNameItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        var txtvwTitle: TextView = view.findViewById(R.id.txtvwTitle)
    }


}