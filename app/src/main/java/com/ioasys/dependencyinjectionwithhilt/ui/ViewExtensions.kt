package com.ioasys.dependencyinjectionwithhilt.ui

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.ioasys.dependencyinjectionwithhilt.App
import org.jetbrains.anko.find

fun View.show(){
    this.visibility = View.VISIBLE
}

fun View.hide(){
    this.visibility = View.INVISIBLE
}

fun Fragment.getColorCompat(@ColorRes colorRes: Int) =
    ContextCompat.getColor(requireContext(), colorRes)


fun Context.showToastMessage(string: String) {
    return Toast.makeText(this, string,Toast.LENGTH_SHORT).show()
}