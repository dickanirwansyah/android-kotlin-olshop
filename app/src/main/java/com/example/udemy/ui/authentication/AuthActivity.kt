package com.example.udemy.ui.authentication

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.udemy.R

@Suppress("DEPRECATION") //onBackPressed()
class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_auth)

        val pageRequest = intent.getIntExtra("page_request", 0)
        if (pageRequest == 2) {
            toolbarSignUp()
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignIn, true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_signup, null, navOptions)

        }
    }

    fun toolbarSignUp() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Sign Up"
            subtitle = "Register and eat"
        }
        toolbar.setNavigationIcon(R.drawable.arrow_back_ios_24px)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    fun toolbarSignUpAddress() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Address"
            subtitle = "Make sure it's valid"
        }
        toolbar.setNavigationIcon(R.drawable.arrow_back_ios_24px)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
            supportActionBar?.apply {
                title = "Sign Up"
                subtitle = "Register and eat"
            }
        }
    }

    fun toolbarSignUpSuccess() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.visibility = View.GONE
    }

}