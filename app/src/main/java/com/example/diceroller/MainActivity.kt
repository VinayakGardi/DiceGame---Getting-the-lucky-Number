package com.example.diceroller
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        roll.setOnClickListener {
           val luckNumber = (1..6).random()
            when(luckNumber){
                1->{
                    image.setImageResource(R.drawable.dice_1)
                }
                2->{
                    image.setImageResource(R.drawable.dice_2)
                }
                3->{
                    image.setImageResource(R.drawable.dice_3)
                }
                4->{
                    image.setImageResource(R.drawable.dice_4)
                }
                5->{
                    image.setImageResource(R.drawable.dice_5)
                }
                else->{
                    image.setImageResource(R.drawable.dice_6)
                }
            }
            Toast.makeText(this, "$luckNumber is the number ", Toast.LENGTH_SHORT).show()

        }

    }



}