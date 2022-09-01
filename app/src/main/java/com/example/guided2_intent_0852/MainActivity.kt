package com.example.guided2_intent_0852

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(R.id.btnNextPage)

        btnNext.setOnClickListener{
            val intent = Intent( this, NextActivity::class.java)
            startActivity(intent)
        }
    }
}