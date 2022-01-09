package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.button)
        val flip : Button = findViewById(R.id.button2)
        val dice : ImageView = findViewById(R.id.imageView)
        val coin : ImageView = findViewById(R.id.imageView2)
        rollbutton.setOnClickListener{
            var c:Int =(1..6).random()
            Toast.makeText(applicationContext, "Your output is ${c}", Toast.LENGTH_SHORT).show()
            when(c){
                1-> dice.setImageResource(R.drawable.dice_1)
                2-> dice.setImageResource(R.drawable.dice_2)
                3-> dice.setImageResource(R.drawable.dice_3)
                4-> dice.setImageResource(R.drawable.dice_4)
                5-> dice.setImageResource(R.drawable.dice_5)
                6-> dice.setImageResource(R.drawable.dice_6)
            }

        }
        flip.setOnClickListener{
            var c:Int = (1..2).random()
            when(c){
                1-> Toast.makeText(applicationContext, "It's Head", Toast.LENGTH_SHORT).show()
                2-> Toast.makeText( applicationContext,"It's Tails", Toast.LENGTH_SHORT).show()
            }
            when(c){
                1-> coin.setImageResource(R.drawable.head)
                2-> coin.setImageResource(R.drawable.tails)
            }
        }

    }
}