package com.example.homework

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = arrayOf(4,45,234,234,23)

        val firstETInArray = findViewById<EditText>(R.id.firstETInArray)
        val secondETInArray = findViewById<EditText>(R.id.secondETInArray)
        val thirdETInArray = findViewById<EditText>(R.id.thirdETInArray)
        val fourthETInArray = findViewById<EditText>(R.id.fourthETInArray)
        val fifthETInArray = findViewById<EditText>(R.id.fifthETInArray)

        val firstTVInArray = findViewById<TextView>(R.id.firstTVInArray)
        val secondTVInArray = findViewById<TextView>(R.id.secondTVInArray)
        val thirdTVInArray = findViewById<TextView>(R.id.thirdTVInArray)
        val fourthTVInArray = findViewById<TextView>(R.id.fourthTVInArray)
        val fifthTVInArray = findViewById<TextView>(R.id.fifthTVInArray)

        val btnInArray = findViewById<Button>(R.id.btnInArray)


        firstETInArray.setText(array[0].toString())
        secondETInArray.setText(array[1].toString())
        thirdETInArray.setText(array[2].toString())
        fourthETInArray.setText(array[3].toString())
        fifthETInArray.setText(array[4].toString())

         
        }
    }
}