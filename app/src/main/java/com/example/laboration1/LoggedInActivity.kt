package com.example.laboration1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoggedInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        val displayName : TextView = findViewById(R.id.tv_name)

        displayName.text = intent.getStringExtra("Key_username").toString()
    }
}