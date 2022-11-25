package com.dispositivos.rockyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btn: Button = findViewById(R.id.btn_consejos)
        btn.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }

    }
}