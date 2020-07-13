package com.ioasys.dependencyinjectionwithhilt.ui

import android.view.View
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

fun View.show(){
    this.visibility = View.VISIBLE
}

fun View.hide(){
    this.visibility = View.INVISIBLE
}

fun Fragment.getColorCompat(@ColorRes colorRes: Int) =
    ContextCompat.getColor(requireContext(), colorRes)