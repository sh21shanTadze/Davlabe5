package com.example.myapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapp.R

/*
 *  Created by shavleg  shabtadze on 12.05.21
 */

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.shavleg).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).amount.toString()

    }

}