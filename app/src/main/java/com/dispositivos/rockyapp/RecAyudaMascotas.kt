package com.dispositivos.rockyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dispositivos.rockyapp.adapter.AyudaMascotasAdapter

class RecAyudaMascotas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_ayuda_mascotas)
        initRecyclerView()
    }

    private fun initRecyclerView(){
    val recyclerView = findViewById<RecyclerView>(R.id.RecyclerAyudaMascotas)
    recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = AyudaMascotasAdapter(AyudaMascotasProvider.CentresAdoptionList)

}

}