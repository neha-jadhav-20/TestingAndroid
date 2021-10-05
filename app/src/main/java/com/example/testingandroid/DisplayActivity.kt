package com.example.testingandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {

    lateinit var msgTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        msgTextView = findViewById(R.id.msgT)

        val name = intent.getStringExtra("username")
        msgTextView.text = name
    }
}