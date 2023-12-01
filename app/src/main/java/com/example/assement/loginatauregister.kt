package com.example.assement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginatauregister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginatauregister)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        val buttonlogin = findViewById<Button>(R.id.login)
        val buttonRegistrasi = findViewById<Button>(R.id.register)

        buttonlogin.setOnClickListener {
            // Tindakan yang akan diambil saat tombol diklik
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        buttonRegistrasi.setOnClickListener {
            val intent = Intent(this, Registrasi::class.java)
            startActivity(intent)
        }
    }
}