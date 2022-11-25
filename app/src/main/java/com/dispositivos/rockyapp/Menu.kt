package com.dispositivos.rockyapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btn1img: ImageButton = findViewById(R.id.imageButton1)
        btn1img.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

            val btn2img: ImageButton = findViewById(R.id.imageButton4)
            btn2img.setOnClickListener {

                val intent: Intent = Intent(this, RecAyudaMascotas::class.java)
                startActivity(intent)
            }

        }
    }
}