package com.veldan.fragment_test

import android.app.Activity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.badlogic.gdx.backends.android.AndroidFragmentApplication
import com.veldan.fragment_test.databinding.ActivityMainBinding

lateinit var activity: Activity private set
lateinit var navController: NavController private set
lateinit var activityMainBinding: ActivityMainBinding private set

class AndroidLauncher : FragmentActivity(), AndroidFragmentApplication.Callbacks {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activity = this
        navController = findNavController(R.id.nav_host_fragment)

        setStartDestination(navController, R.id.menuFragment)

    }

    private fun setStartDestination(
        navController: NavController,
        @IdRes destinationId: Int,
        args: Bundle? = null
    ) {
        navController.apply {
            val graph = navInflater.inflate(R.navigation.nav_graph).apply {
                startDestination = destinationId
            }
            setGraph(graph, args)
        }
    }

    override fun exit() {}

}