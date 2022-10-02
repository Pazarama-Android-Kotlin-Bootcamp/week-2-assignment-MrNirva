package com.arcapp.kotlinweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SignupActivity : AppCompatActivity() {

    // Create visibility image, visibility status and back button
    private lateinit var imgBack:ImageView

    private lateinit var imgVisibility:ImageView
    private var visibilityStatus = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // binding process
        imgBack = findViewById(R.id.imgBack)
        imgVisibility = findViewById(R.id.imgVisibility)

        // back button call onBackPressed()
        imgBack.setOnClickListener{
            onBackPressed()
        }

        // switch between visibility states by pressing the eye sign
        imgVisibility.setOnClickListener {

            if(visibilityStatus){
                visibilityStatus = false
                imgVisibility.setImageResource(R.drawable.ic_visibility_on)
            }else{
                visibilityStatus = true
                imgVisibility.setImageResource(R.drawable.ic_visibility_off)
            }

        }

    }
}