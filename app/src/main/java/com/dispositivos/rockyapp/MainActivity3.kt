package com.dispositivos.rockyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dispositivos.rockyapp.adapter.perroAdapter

class MainActivity3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        initRecyclerView()
    }
     fun initRecyclerView(){
     val recyclerView = findViewById<RecyclerView>(R.id.recyclerPerro)
         recyclerView.layoutManager = LinearLayoutManager(this)
         recyclerView.adapter = perroAdapter(perroPro.perroList)

    }
}