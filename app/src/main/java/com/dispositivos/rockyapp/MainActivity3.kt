package com.dispositivos.rockyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dispositivos.rockyapp.adapter.perroAdapter
import com.dispositivos.rockyapp.databinding.ActivityMain3Binding
import com.dispositivos.rockyapp.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }
     fun initRecyclerView(){

         binding.recyclerPerro.layoutManager = LinearLayoutManager(this)
         binding.recyclerPerro.adapter = perroAdapter(perroPro.perroList)

    }
}