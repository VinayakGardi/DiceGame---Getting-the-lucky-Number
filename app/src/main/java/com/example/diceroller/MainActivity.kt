package com.example.diceroller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll)
        val diceAnswer : TextView = findViewById(R.id.textView)
        val Message : TextView =findViewById(R.id.Message)


        rollButton.setOnClickListener {
           val luckNumber : String= (1..6).random().toString()
           diceAnswer.text=(1..6).random().toString()
            if(diceAnswer.text == luckNumber)
            {
                Message.setText("Got it !! \uD83E\uDD73")
            }
            else
            {
               Message.setText("Try again !!\uD83D\uDE15")
            }

        }

    }



}