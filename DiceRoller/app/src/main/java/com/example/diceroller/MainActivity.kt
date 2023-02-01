package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnroll: Button = findViewById(R.id.button)
        btnroll.setOnClickListener { rolldice()}
    }
    private fun rolldice() {
        val mydice = RoleDice(6)
        val diceimage: ImageView = findViewById(R.id.imageView)
        val rollResults:Int = mydice.rollDice()
        when(rollResults)
        {
            1->diceimage.setImageResource(R.drawable.dice_1)
            2->diceimage.setImageResource(R.drawable.dice_2)
            3->diceimage.setImageResource(R.drawable.dice_3)
            4->diceimage.setImageResource(R.drawable.dice_4)
            5->diceimage.setImageResource(R.drawable.dice_5)
            6->diceimage.setImageResource(R.drawable.dice_6)
        }
    }
}
class RoleDice(val numofSides: Int) {
    fun rollDice(): Int {
        return (1..numofSides).random()
    }
}