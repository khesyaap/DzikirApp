package com.khesya.idn.dzikirapp.UI
import com.khesya.idn.dzikirapp.adapter.DzikirDoaAdapter
import com.khesya.idn.dzikirapp.model.DataDzikirDoa
import com.khesya.idn.dzikirapp.model.DzikirDoa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khesya.idn.dzikirapp.R

class DzikirSetiapSaatActivity : AppCompatActivity() {
    private lateinit var rvDzikir: RecyclerView
    private var listDzikir: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_setiap_saat)
        rvDzikir = findViewById(R.id.rv_Dzikir_Setiap_Saat)

        listDzikir.clear()
        listDzikir.addAll(DataDzikirDoa.listDzikir)

        rvDzikir.layoutManager = LinearLayoutManager(this)
        rvDzikir.adapter = DzikirDoaAdapter(listDzikir)
        rvDzikir.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}