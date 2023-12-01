package com.example.assement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InstagramActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.instagram_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = mutableListOf<data_model>() // Isi data dengan item-feed yang sesuai
        // Tambahkan beberapa data dummy
        data.add(data_model(R.drawable.logo, "Manchestercity", R.drawable.gambar3, 12300, 34))
        data.add(data_model(R.drawable.logo, "Manchestercity", R.drawable.gambar5, 4500, 12))
        data.add(data_model(R.drawable.logo, "Manchestercity", R.drawable.gambar10, 8900, 56))

        val adapter = InstagramAdapte(data)
        recyclerView.adapter = adapter
    }
}