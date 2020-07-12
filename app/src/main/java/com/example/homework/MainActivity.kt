package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstETInArray = findViewById<EditText>(R.id.firstETInArray)
        val secondETInArray = findViewById<EditText>(R.id.secondETInArray)
        val thirdETInArray =findViewById<EditText>(R.id.thirdETInArray)
        val fourthETInArray = findViewById<EditText>(R.id.fourthETInArray)
        val fifthETInArray = findViewById<EditText>(R.id.fifthETInArray) 

    }
}