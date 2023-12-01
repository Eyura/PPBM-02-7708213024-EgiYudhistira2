package com.example.assement

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.assement.R

class setting : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val settingsList = findViewById<ListView>(R.id.settingsList)

        // Data untuk ditampilkan dalam ListView
        val settingsOptions = arrayOf("Profil", "About", "help", "Logout", "Option 5")

        // Adapter untuk menghubungkan data dengan ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, settingsOptions)

        // Mengatur adapter ke ListView
        settingsList.adapter = adapter

        // Menangani klik item dalam ListView
        settingsList.setOnItemClickListener { _, _, position, _ ->
            // Lakukan sesuatu berdasarkan item yang diklik
            val selectedOption = settingsOptions[position]
            // Misalnya, tampilkan pesan atau lakukan aksi sesuai dengan opsi yang dipilih
            // Di sini, kita hanya mencetak pesan ke logcat
            println("Selected option: $selectedOption")
        }
    }
}
