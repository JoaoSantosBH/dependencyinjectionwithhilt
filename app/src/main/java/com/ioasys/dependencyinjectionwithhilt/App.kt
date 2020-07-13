package com.ioasys.dependencyinjectionwithhilt

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class App : Application()