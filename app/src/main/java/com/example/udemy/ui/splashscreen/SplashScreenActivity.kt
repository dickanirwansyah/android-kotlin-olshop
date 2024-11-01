package com.example.udemy.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.udemy.MainActivity
import com.example.udemy.R
import com.example.udemy.ui.authentication.AuthActivity

@Suppress("DEPRECATION") //deprecation handler
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            startActivity(Intent(this, AuthActivity::class.java))
        },3000)
    }
}