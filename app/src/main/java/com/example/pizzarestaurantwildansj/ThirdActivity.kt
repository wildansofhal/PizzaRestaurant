package com.example.pizzarestaurantwildansj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val textViewName = findViewById<TextView>(R.id.username)
        val name = intent.getStringExtra("name")
        val selectedItem = intent.getStringExtra("selectedItem")

        textViewName.text = "Hello, $name"


        val textKlikable1 = findViewById<TextView>(R.id.label_pizza_detail)
        textKlikable1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent(this@ThirdActivity, FourthActivity::class.java)
                intent.putExtra("name", name)
                intent.putExtra("selectedItem", selectedItem)
                startActivity(intent)
            }
        })

        val textKlikable2 = findViewById<TextView>(R.id.label_pizza)
        textKlikable2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent(this@ThirdActivity, FourthActivity::class.java)
                intent.putExtra("name", name)
                intent.putExtra("selectedItem", selectedItem)
                startActivity(intent)
            }
        })

    }

}