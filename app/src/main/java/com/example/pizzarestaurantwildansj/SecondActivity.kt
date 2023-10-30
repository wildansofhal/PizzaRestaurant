package com.example.pizzarestaurantwildansj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textViewSelectedItem = findViewById<TextView>(R.id.city)
        val textViewName = findViewById<TextView>(R.id.text_user)

        val selectedItem = intent.getStringExtra("selectedItem")
        val name = intent.getStringExtra("name")

        textViewSelectedItem.text = "$selectedItem"
        textViewName.text = "Hello, $name"

        val buttonMenu = findViewById<Button>(R.id.button_menu)
        buttonMenu.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)

            intent.putExtra("name", name)
            intent.putExtra("selectedItem", selectedItem)

            startActivity(intent)
        }
    }

}