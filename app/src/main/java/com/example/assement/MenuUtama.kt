package com.example.assement

import ListItem
import ListItemAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ImageButton
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MenuUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)

        val homeButton = findViewById<ImageButton>(R.id.homeButton)
        val infoButton = findViewById<ImageButton>(R.id.InfoButton)
        val settingButton = findViewById<ImageButton>(R.id.settingButton)

        val listView = findViewById<ListView>(R.id.listview1)
        setListViewData(listView)

        homeButton.setOnClickListener {
            // Aksi untuk menu Home
            // Di sini, saya menganggap bahwa Anda ingin tetap di MenuUtama
            // Jika Anda ingin pindah ke aktivitas lain, gantilah MenuUtama::class.java dengan aktivitas yang diinginkan.
            startActivity(Intent(this, MenuUtama::class.java))
        }

        infoButton.setOnClickListener {
            // Aksi untuk menu Info (jika ingin pindah ke InfoActivity)
            startActivity(Intent(this, InstagramActivity::class.java))
        }

        settingButton.setOnClickListener {
            // Aksi untuk menu Setting (jika ingin pindah ke SettingActivity)
            startActivity(Intent(this, setting::class.java))
        }
    }

    private fun setListViewData(listView: ListView) {
        val listItems = listOf(
            ListItem("Phil Foden", "Midfielder, 2016", R.drawable.gambar1),
            ListItem("Jack Grealish", "Midfielder, 2021", R.drawable.gambar2),
            ListItem("Ruben Dias", "Defender, 2020", R.drawable.gambar3),
            ListItem("Bernardo Silva", "Midfielder, 2017", R.drawable.gambar4),
            ListItem("Kevin De Bruyne", "Midfielder, 2015", R.drawable.gambar5),
            ListItem("Julian Alvarez", "Forward, 2022", R.drawable.gambar6),
            ListItem("Erling Haaland", "Forward, 2023", R.drawable.gambar7),
            ListItem("Rodri", "Midfielder, 2018", R.drawable.gambar8),
            ListItem("John Stones", "Defender, 2016", R.drawable.gambar9),
            ListItem("Kyle Walker", "Defender, 2017", R.drawable.gambar10),
            ListItem("Ederson Moraes", "Goalkeeper, 2017", R.drawable.gambar11)
        )

        val adapter = ListItemAdapter(this, listItems)
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedItem = listItems[position]

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("itemName", selectedItem.name)
            intent.putExtra("itemDescription", selectedItem.description)
            intent.putExtra("itemImage", selectedItem.imageResource)
            startActivity(intent)
        }
    }
}
