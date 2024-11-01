package com.example.udemy.ui.authentication.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.udemy.R
import com.example.udemy.ui.authentication.AuthActivity


class SignupFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val continuButtonToFragmentSignUpAddress = view.findViewById<Button>(R.id.buttonContinue)

        continuButtonToFragmentSignUpAddress.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signup_address, null)

            (activity as AuthActivity).toolbarSignUpAddress()
        }
    }
}