package com.khesya.idn.dzikirapp.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khesya.idn.dzikirapp.adapter.DzikirDoaAdapter
import com.khesya.idn.dzikirapp.model.DataDzikirDoa
import com.khesya.idn.dzikirapp.model.DzikirDoa

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khesya.idn.dzikirapp.R


class DzikirPetangActivity : AppCompatActivity() {

    private lateinit var rvDzikirPetang: RecyclerView

    private var listDzikirPetang: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_petang)

        rvDzikirPetang = findViewById(R.id.rv_dzikir_petang)

        listDzikirPetang.clear()
        listDzikirPetang.addAll(DataDzikirDoa.listDzikirPetang)

        rvDzikirPetang.layoutManager = LinearLayoutManager(this)
        rvDzikirPetang.adapter = DzikirDoaAdapter(listDzikirPetang)
        rvDzikirPetang.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}