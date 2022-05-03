package com.drake.softinput.example.base

import android.app.Application
import com.drake.brv.utils.BRV

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        BRV.modelId = com.drake.softinput.example.BR.m
    }
}