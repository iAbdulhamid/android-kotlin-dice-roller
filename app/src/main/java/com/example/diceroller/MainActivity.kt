package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val rollButton : Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener {
            rollButton.text = "Roll Me!"
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.txt_result)
        val randomInt = Random.nextInt(6) + 1
        resultText.text = randomInt.toString()
    }
}