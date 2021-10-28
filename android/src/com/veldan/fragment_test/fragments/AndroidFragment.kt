package com.veldan.fragment_test.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.veldan.fragment_test.databinding.FragmentAndroidBinding
import com.veldan.fragment_test.databinding.FragmentMenuBinding
import com.veldan.fragment_test.navController

class AndroidFragment : Fragment() {

    private lateinit var binding: FragmentAndroidBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAndroidBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.imgRight.setOnClickListener {
            navController.popBackStack()
        }
    }

}