package com.veldan.fragment_test.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.badlogic.gdx.backends.android.AndroidFragmentApplication
import com.veldan.fragment_test.FragmentTestGame
import com.veldan.fragment_test.activityMainBinding
import com.veldan.fragment_test.navController

class LibGDXFragment: AndroidFragmentApplication() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val conf = AndroidApplicationConfiguration().apply {
            useAccelerometer = false
            useCompass = false
        }
        return initializeForView(FragmentTestGame(), conf)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(activityMainBinding){
            imgLeft.setOnClickListener {
                navController.popBackStack()
                groupBack.visibility = View.INVISIBLE
            }
        }
    }

}