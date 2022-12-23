package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll)
        val diceAnswer : TextView = findViewById(R.id.textView)


        rollButton.setOnClickListener {
            diceAnswer.text = (1..6).random().toString()
            Toast.makeText(this, "Changed Number" , Toast.LENGTH_LONG).show()
        }

    }



}