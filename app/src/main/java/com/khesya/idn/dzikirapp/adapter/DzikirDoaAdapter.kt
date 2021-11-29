package com.khesya.idn.dzikirapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.khesya.idn.dzikirapp.R
import com.khesya.idn.dzikirapp.model.DzikirDoa

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>):
RecyclerView.Adapter<DzikirDoaAdapter.MyviewHolder>() {

    inner class MyviewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvDesc = view.findViewById<TextView>(R.id.tvDesc)
        val tvLafaz = view.findViewById<TextView>(R.id.tvLafaz)
        val tvTerjemah = view.findViewById<TextView>(R.id.tvTerjemah)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = MyviewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa, parent, false)
    )

    override fun onBindViewHolder(holder: DzikirDoaAdapter.MyviewHolder, position: Int) {
        val dzikir = listDzikirDoa[position]
        holder.tvDesc.text = dzikir.desc
        holder.tvLafaz.text = dzikir.lafaz
        holder.tvTerjemah.text = dzikir.terjemah
    }

    override fun getItemCount() = listDzikirDoa.size
}