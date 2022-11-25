package com.dispositivos.rockyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class AsesoriaPrimerosP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asesoria_primeros_p)

        val botonatras1: ImageButton = findViewById(R.id.botonatras1)
        botonatras1.setOnClickListener {

            val intenta1: Intent = Intent(this, Asesoria::class.java)
            startActivity(intenta1)


        }
    }
}