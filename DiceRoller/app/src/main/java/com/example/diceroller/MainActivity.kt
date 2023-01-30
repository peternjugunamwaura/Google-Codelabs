package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        val rolloutput: TextView = findViewById(R.id.textView)
        rolloutput.text = mydice.rollDice().toString()
    }
}
class RoleDice(val numofSides: Int) {
    fun rollDice(): Int {
        return (1..numofSides).random()
    }
}