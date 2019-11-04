package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random


class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    //lateinit will create a field to access the data

    //Oncreate initializes the activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set Content View attaches the Activity to the designated layout
        //val is a read-only variable
        val rollButton: Button = findViewById(R.id.roll_button)
        //the id is a pointer hex address to point to the UI location
        rollButton.text = "Let's roll from main activity!!"
        rollButton.setOnClickListener {
            Toast.makeText(this,"button was clicked!!!", Toast.LENGTH_SHORT).show()
            rollDice()
        }

        //access diceImage since activity is located with setContentView
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        /*DUSTY CODE
        // val resultText : TextView = findViewById(R.id.result_text)
        // resultText.text = randomInt.toString() */
            val randomInt = Random().nextInt(6) + 1
              val drawableResource = when (randomInt) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
           // val diceImage : ImageView = findViewById(R.id.dice_image) //using findviewId uses a lot of memory!
            diceImage.setImageResource(drawableResource)

    }
}
