package com.appdev.base

import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.navGraphViewModels

inline fun <reified T : ViewModel> Fragment.createSharedVIewModel(
    fragmentId: Int,
    factory: ViewModelProvider.Factory
) = navGraphViewModels<T>(fragmentId) { factory }.value

fun View.setVisible() {
    this.visibility = View.VISIBLE
}


fun View.setInvisible() {
    this.visibility = View.INVISIBLE
}
