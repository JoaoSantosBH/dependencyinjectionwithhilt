package com.ioasys.dependencyinjectionwithhilt.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.navigation.NavigationView
import com.ioasys.dependencyinjectionwithhilt.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle??) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
    }
}