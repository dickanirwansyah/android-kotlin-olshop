package com.example.udemy.ui.authentication.signin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.udemy.R
import com.example.udemy.ui.authentication.AuthActivity

class SigninFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val signInButton = view.findViewById<Button>(R.id.btnSignIn)
        val signUpButton = view.findViewById<Button>(R.id.btnSignUp)

        signInButton.setOnClickListener {
            Toast.makeText(requireContext(), "Sign In Clicked", Toast.LENGTH_LONG).show()
        }

        signUpButton.setOnClickListener {
            val signUpNextPage = Intent(activity, AuthActivity::class.java)
            signUpNextPage.putExtra("page_request", 2)
            startActivity(signUpNextPage)
        }
    }
}