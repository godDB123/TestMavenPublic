package com.kmtest.testmaven2

import android.content.Context
import android.widget.Toast
import kotlinx.coroutines.delay

object TestMaven2SDK {

    fun initialized(context: Context) {
        Toast.makeText(context, "TestMaven2SDK initialized", Toast.LENGTH_SHORT).show()
    }
}