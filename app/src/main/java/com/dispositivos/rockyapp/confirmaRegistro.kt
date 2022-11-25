package com.dispositivos.rockyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class confirmaRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirma_registro)

        val btn: Button = findViewById(R.id.btn_okReg)
        btn.setOnClickListener {

            val intent = Intent(this, LoginActivity2::class.java)
            startActivity(intent)

        }

    }
}