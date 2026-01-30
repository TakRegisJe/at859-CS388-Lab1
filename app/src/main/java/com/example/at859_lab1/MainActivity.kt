package com.example.at859_lab1

import android.os.Bundle
import android.widget.TextView
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var counter = 0
    var incrementBy = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        val buttonTwo = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            counter = counter + incrementBy
            textView.text = counter.toString()

            if (counter==10) {
                buttonTwo.visibility = Button.VISIBLE

                buttonTwo.setOnClickListener {
                    incrementBy = 2
                    buttonTwo.visibility = Button.INVISIBLE

                    button.text = "ADD 2"
                }
            }
        }



        counter = counter + incrementBy
        textView.text = counter.toString()
    }
}