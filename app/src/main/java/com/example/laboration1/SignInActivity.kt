package com.example.laboration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnLoggIn: Button = findViewById(R.id.btn_SignIn)

        val userName: Array <String> = arrayOf("Harry","Draco", "Cedric", "Luna")

        val inputUserName: EditText = findViewById(R.id.editText_userName)




        btnLoggIn.setOnClickListener{

            //println(inputUserName.text.toString())

            if (userName.contains(inputUserName.text.toString())){

                val navigateToLoggedIn = Intent(this, LoggedInActivity().javaClass).apply{
                    putExtra("Key_username", inputUserName.text.toString())
                }

                startActivity(navigateToLoggedIn)
            }




        }


    }
}