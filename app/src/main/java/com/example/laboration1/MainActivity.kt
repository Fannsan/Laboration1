package com.example.laboration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoToSignIn: Button = findViewById(R.id.btn_GoToSignIn)

        btnGoToSignIn.setOnClickListener{
            val navigateToSignIn = Intent(this, SignInActivity().javaClass)

            startActivity(navigateToSignIn)
        }
    }
}