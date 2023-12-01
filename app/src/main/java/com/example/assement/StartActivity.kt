package com.example.assement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        supportActionBar?.hide()  // Menggunakan elvis operator untuk menghindari NullPointerException

        val buttonStart = findViewById<Button>(R.id.Start)

        buttonStart.setOnClickListener {
            // Tindakan yang akan diambil saat tombol diklik
            val intent = Intent(this, loginatauregister::class.java)
            startActivity(intent)
        }
    }
}