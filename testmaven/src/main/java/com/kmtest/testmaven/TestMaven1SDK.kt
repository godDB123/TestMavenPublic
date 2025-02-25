package com.kmtest.testmaven

import android.content.Context
import android.widget.Toast
import com.kmtest.testmaven2.TestMaven2SDK
import kotlinx.coroutines.delay

object TestMaven1SDK {

    suspend fun initialized(context: Context) {
        Toast.makeText(context, "TestMaven1SDK initialized", Toast.LENGTH_SHORT).show()
        delay(3000)
        TestMaven2SDK.initialized(context)
    }
}