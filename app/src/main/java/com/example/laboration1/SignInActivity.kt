package com.example.laboration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.laboration1.databinding.ActivityMainBinding
import com.example.laboration1.databinding.ActivitySignInBinding


//Creating a new object User
class User ( var name: String , var password: String )

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        // Get references to the components in the layout
        val btnLoggIn: Button = findViewById(R.id.btn_SignIn)

        val inputUserName: EditText = findViewById(R.id.editText_userName)

        val inputPassword: EditText = findViewById(R.id.editText_Password)

        val tvWrongUsernamePassword: TextView = findViewById(R.id.tv_WrongUsernamePassword)

        //Setting the textView of the error meaasge to not visible until the user writes the wrong name or password
        tvWrongUsernamePassword.isVisible = false

        //Creating a Arraylist of User objects
        var listOfUsers =
            arrayListOf(
                User("Harry","GinnyLover"),
                User("Draco", "PowerSlytherin"),
                User("Cedric", "LoveAll"),
                User("Luna", "NifflerGoggles")

            )


        //Creating a onClick function for when the button is being clicked
        btnLoggIn.setOnClickListener{
            val userName:String = inputUserName.text.toString()

            val password:String = inputPassword.text.toString()

            //Going threw the list of Users in the ArrayList
            for ( user: User in listOfUsers) {

                //if statement to check if username an password excist in my ArrayList and is matching
                if (user.name == userName && user.password == password){

                    //Navigates to Logges in Acticity and brings the name of the User to the logged in Acticity
                    val navigateToLoggedIn = Intent(this, LoggedInActivity().javaClass).apply{
                             putExtra("Key_username", inputUserName.text.toString())
                          }

                         startActivity(navigateToLoggedIn)
                        break

                    }
                //else statement is running if the passwords are not matching or anything else
                else {

                     tvWrongUsernamePassword.isVisible = true

                }
            }





        }


    }
}