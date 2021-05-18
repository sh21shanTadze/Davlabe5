package com.example.myapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.myapp.R

class MenuFragment : Fragment(R.layout.fragment_menu) {
    private lateinit var logOut : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        logOut = view.findViewById(R.id.logout)

        logOut.setOnClickListener{
            if (logOut is Button)
                activity?.finish()

        }

    }
}