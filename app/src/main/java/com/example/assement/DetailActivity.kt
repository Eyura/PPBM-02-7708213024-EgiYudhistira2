package com.example.assement

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailactivity)

        val itemName = intent.getStringExtra("itemName")
        val itemImage = intent.getIntExtra("itemImage", 0)
        val itemDescription = intent.getStringExtra("itemDescription")

        val detailImageView = findViewById<ImageView>(R.id.detailImageView)
        val detailTextView = findViewById<TextView>(R.id.detailTextView)
        val logoImageView = findViewById<ImageView>(R.id.logo)

        detailImageView.setImageResource(itemImage)
        detailTextView.text = itemDescription
        logoImageView.setImageResource(R.drawable.logo)
    }
}
