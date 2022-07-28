package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.EditText


// This Kotlin filre is where we'r going to be handling
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show 'Hello from {name}' - in the activity_main.xml
        // User can tap a button to change the text color of the label.
        // 1. Add a button to our layout - in the activity_main.xml

        // 2. Set up logic to know when user has tapped on button
        // Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handle button tap
            // 2. Change the color of the text
            Log.i("Qianyu", "Tapped on button")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Qianyu", "Tapped on button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.purple_700))

        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Qianyu", "Tapped on button")
            val strValue=findViewById<EditText>(R.id.et_simple).getText().toString()
            if (strValue==""){
                findViewById<TextView>(R.id.textView).setText("Hello from Qianyu")
            }
            else{
                findViewById<TextView>(R.id.textView).setText(strValue)
            }

        }
        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener {
            Log.i("Qianyu", "Tapped on button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.purple_200))
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(com.example.helloworld.R.color.black))

        }
    }
}