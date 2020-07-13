package com.ioasys.dependencyinjectionwithhilt

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class App : Application(){

//    companion object {
//        private lateinit var instance: App
//
//
//
//        val remoteApi by lazy {
////            buildRemoteApi()
//        }
//    }

//    override fun onCreate() {
//        super.onCreate()
//        instance = this
//    }
}