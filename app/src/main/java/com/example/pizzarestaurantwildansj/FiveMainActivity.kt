package com.example.pizzarestaurantwildansj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class FiveMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_main)

        val textViewSelectedItem = findViewById<TextView>(R.id.od_alamat)
        val textViewName = findViewById<TextView>(R.id.od_nama)

        val selectedItem = intent.getStringExtra("selectedItem")
        val name = intent.getStringExtra("name")

        textViewSelectedItem.text = "$selectedItem"
        textViewName.text = "$name"

        val layoutTY = findViewById<LinearLayout>(R.id.layoutTY)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            layoutTY.visibility = View.VISIBLE
        }

    }
}