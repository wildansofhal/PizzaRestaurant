package com.example.pizzarestaurantwildansj

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var spinner: Spinner
    private lateinit var editName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)
        editName = findViewById(R.id.edit_name)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // Ambil data dari Spinner dan EditText
            val selectedSpinnerItem = spinner.selectedItem.toString()
            val name = editName.text.toString()

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("selectedItem", selectedSpinnerItem)
            intent.putExtra("name", name)

            startActivity(intent)
        }
    }
}
