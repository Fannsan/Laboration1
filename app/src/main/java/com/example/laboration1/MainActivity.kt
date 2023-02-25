package com.example.laboration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laboration1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // Get references to the components in the layout
        val btnGoToSignIn: Button = binding.btnGoToSignIn

        val btnGoToAbout: Button = binding.btnAbout

        //Creating a onClick function for when the Go to sign in button is being clicked
        btnGoToSignIn.setOnClickListener{
            val navigateToSignIn = Intent(this, SignInActivity().javaClass)

            startActivity(navigateToSignIn)
        }

        //Creating a onClick function for when the go to About button is being clicked
        btnGoToAbout.setOnClickListener{
            val navigateToAbout = Intent(this, AboutActivity().javaClass)
            startActivity(navigateToAbout)
        }


    }
}