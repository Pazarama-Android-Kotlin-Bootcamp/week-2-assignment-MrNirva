package com.arcapp.kotlinweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {

    // Create visibility image, visibility status and sign up button
    private lateinit var imgVisibility:ImageView
    private var visibilityStatus = true

    private lateinit var btnSignUp:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // binding process
        imgVisibility = findViewById(R.id.imgVisibility)
        btnSignUp = findViewById(R.id.btnSignUp)

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

        // redirects to sign up page
        btnSignUp.setOnClickListener {

            val intent = Intent(this@LoginActivity, SignupActivity::class.java)
            startActivity(intent)

        }

    }

}