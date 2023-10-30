package com.example.pizzarestaurantwildansj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val buttonAdd = findViewById<Button>(R.id.btn_order)
        val buttonBack = findViewById<Button>(R.id.btn_back)

        val name = intent.getStringExtra("name")
        val selectedItem = intent.getStringExtra("selectedItem")

        buttonAdd.setOnClickListener {
            val intent = Intent(this, FiveMainActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("selectedItem", selectedItem)
            startActivity(intent)
        }

        buttonBack.setOnClickListener {
            finish()
        }
    }
}