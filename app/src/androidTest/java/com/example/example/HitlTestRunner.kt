package com.example.example

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner

class HitlTestRunner : AndroidJUnitRunner() {

    override fun newApplication(
        cl: ClassLoader?,
        className: String?,
        context: Context?
    ): Application {
        return super.newApplication(cl, HiltTestApplication::class.java.name, context)
    }
}