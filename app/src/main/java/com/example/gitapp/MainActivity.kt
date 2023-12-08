package com.example.gitapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var submitButton: Button
    private lateinit var submitButton2: Button
    private lateinit var submitButton3: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        submitButton  = findViewById(R.id.button) as Button
        submitButton2  = findViewById(R.id.button2) as Button
        submitButton3  = findViewById(R.id.button3) as Button

        //update 1 added a button
    }
}