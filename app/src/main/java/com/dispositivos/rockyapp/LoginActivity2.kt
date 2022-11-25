package com.dispositivos.rockyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)



        val btn: Button = findViewById(R.id.btn_registro)
        btn.setOnClickListener {

            val intent = Intent(this, RegisterActivity3::class.java)
            startActivity(intent)

        }


            val btn1: Button = findViewById(R.id.btn_Olvido)
            btn1.setOnClickListener {

            val intent = Intent(this, OlvidoActivity4::class.java)
            startActivity(intent)

             }

              val btn2: Button = findViewById(R.id.btn_inicio)
              btn2.setOnClickListener {

            val intent = Intent(this, Menu::class.java)
            startActivity(intent)

        }


    }
}