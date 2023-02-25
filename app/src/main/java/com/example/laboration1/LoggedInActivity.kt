package com.example.laboration1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Attributes ( var house: String, var level: Int , var points: Int, var wigglejuicePotions: Int)
class LoggedInActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        // Create a list of Attributes objects
        val listOfAttributes =
            arrayListOf(
                Attributes("Gryffindor",20,50,9,),
                Attributes("Slytherin",10,8,3,),
                Attributes("HufflePuff",30,60,15,),
                Attributes("Ravenclaw",32,50,5,)

            )

        // Get references to the TextViews in the layout
        val displayName : TextView = findViewById(R.id.tv_name)
        val tvHouse : TextView = findViewById(R.id.textView_House)
        val tvAttributes : TextView = findViewById(R.id.textView_Attributes)

        // Set the displayName based on the username passed in the intent
        displayName.text = intent.getStringExtra("Key_username").toString()

        // A when expression to determine which Attributes object to use based on the displayName
            when(displayName.text){
                     "Harry" ->{
                    //Getting the first index in listofAttributes
                    val harryAttribute = listOfAttributes[0]
                    // Set the text of tvHouse and tvAttributes based on the selected Attributes object
                    tvHouse.text = "Your house is:\n ${harryAttribute.house}!"
                    tvAttributes.text = "Your level is: ${harryAttribute.level} \n\nYour Points: ${harryAttribute.points} \n\nWigglejuice Potions: ${harryAttribute.wigglejuicePotions}"
                    }
                    "Draco" ->{
                        val dracoAttribute = listOfAttributes[1]

                        tvHouse.text = "Your house is:\n ${dracoAttribute.house}!"

                        tvAttributes.text = "Your level is: ${dracoAttribute.level} \n\nYour Points: ${dracoAttribute.points} \n\nWigglejuice Potions: ${dracoAttribute.wigglejuicePotions}"
                    }
                    "Cedric" ->{
                        val cedricAttribute = listOfAttributes[2]

                        tvHouse.text = "Your house is:\n ${cedricAttribute.house}!"

                        tvAttributes.text = "Your level is: ${cedricAttribute.level} \n\nYour Points: ${cedricAttribute.points} \n\nWigglejuice Potions: ${cedricAttribute.wigglejuicePotions}"
                    }
                    "Luna"-> {
                        val lunaAttribute = listOfAttributes[3]
                        tvHouse.text = "Your house is:\n ${lunaAttribute.house}!"
                        tvAttributes.text = "Your level is: ${lunaAttribute.level} \n\nYour Points: ${lunaAttribute.points} \n\nWigglejuice Positions: ${lunaAttribute.wigglejuicePotions}"
                    }

                }







    }





}