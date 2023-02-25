package com.example.laboration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Get references to the components in the layout
        val btnBackToMain: Button = findViewById(R.id.btn_ToMain)

        //Creating a onClick function for when the button is being clicked
        btnBackToMain.setOnClickListener(){
            val backToMain = Intent(this, MainActivity().javaClass)
            startActivity(backToMain)
        }

    }



}