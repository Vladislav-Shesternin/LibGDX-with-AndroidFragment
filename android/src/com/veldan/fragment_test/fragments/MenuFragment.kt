package com.veldan.fragment_test.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.veldan.fragment_test.R
import com.veldan.fragment_test.activityMainBinding
import com.veldan.fragment_test.databinding.FragmentMenuBinding
import com.veldan.fragment_test.navController

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMenuBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.imgLeft.setOnClickListener{
            navController.navigate(R.id.androidFragment)
        }
        binding.imgRight.setOnClickListener{
            navController.navigate(R.id.libGDXFragment)
            activityMainBinding.groupBack.visibility = View.VISIBLE
        }
    }

}