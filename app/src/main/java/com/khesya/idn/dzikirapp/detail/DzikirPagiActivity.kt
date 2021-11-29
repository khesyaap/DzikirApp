package com.khesya.idn.dzikirapp.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khesya.idn.dzikirapp.R
import com.khesya.idn.dzikirapp.adapter.DzikirDoaAdapter
import com.khesya.idn.dzikirapp.model.DataDzikirDoa
import com.khesya.idn.dzikirapp.model.DzikirDoa


import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class DzikirPagiActivity : AppCompatActivity() {

    private lateinit var rvDzikirPagi: RecyclerView

    private var listDzikirPagi: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_pagi)

        rvDzikirPagi = findViewById(R.id.rv_dzikir_pagi)

        listDzikirPagi.clear()
        listDzikirPagi.addAll(DataDzikirDoa.listDzikirPagi)

        rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        rvDzikirPagi.adapter = DzikirDoaAdapter(listDzikirPagi)
        rvDzikirPagi.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}