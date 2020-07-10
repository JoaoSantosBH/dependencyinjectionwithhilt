package com.ioasys.dependencyinjectionwithhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//TODO 04 - All apps that use Hilt must contain an Application class that is annotated with @HiltAndroidApp.
@HiltAndroidApp
open class App : Application()