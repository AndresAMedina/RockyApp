package com.dispositivos.rockyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class AsesoriaHigiene : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asesoria_higiene)

        val botonatras3: ImageButton = findViewById(R.id.botonatras3)
        botonatras3.setOnClickListener {

            val intenta3: Intent = Intent(this, Asesoria::class.java)
            startActivity(intenta3)

        }
      }
   }