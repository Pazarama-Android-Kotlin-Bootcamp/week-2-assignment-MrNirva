package com.arcapp.kotlinweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SignupActivity : AppCompatActivity() {

    private lateinit var imgBack:ImageView

    private lateinit var imgVisibility:ImageView
    private var visibilityStatus = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        imgBack = findViewById(R.id.imgBack)
        imgVisibility = findViewById(R.id.imgVisibility)

        imgBack.setOnClickListener{
            onBackPressed()
        }

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