package com.example.myapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapp.R

/*
 *  Created by shavleg shantadze on 12.05.21
 */

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var editText: EditText
    private lateinit var button: Button

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button)
        editText = view.findViewById(R.id.editTextAMount)

        navController = Navigation.findNavController(view)

        button.setOnClickListener {

            var amount = -21

            if (editText.text.isNotEmpty()) {
                amount = editText.text.toString().toInt()
            }

            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)

            navController.navigate(action)


        }


    }

}