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


class SignupAddressFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup_address, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val buttonSignUpNow = view.findViewById<Button>(R.id.buttonSignUpNow)

        buttonSignUpNow.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_fragmentSignUpSuccess,null)

            (activity as AuthActivity).toolbarSignUpSuccess()
        }
    }

}