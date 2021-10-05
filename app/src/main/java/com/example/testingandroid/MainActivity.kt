package com.example.testingandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var nameEditText: EditText
    lateinit var msgTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameE)
        msgTextView = findViewById(R.id.tv)
    }

    fun buttonClick(view: View) {
        val name = nameEditText.text.toString()
        if(name.isNotEmpty()) {
            msgTextView.text = "Hello $name"
            nameEditText.setText("")
            val i = Intent(this,DisplayActivity::class.java)
            i.putExtra("username",name)
            startActivity(i)
        }
        else {
            Toast.makeText(this, "Please enter name", Toast.LENGTH_SHORT).show()
            nameEditText.setError("Name should not be entered")
        }
    }

}