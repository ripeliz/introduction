package com.example.introductionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("Hello world", "button clicked")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}