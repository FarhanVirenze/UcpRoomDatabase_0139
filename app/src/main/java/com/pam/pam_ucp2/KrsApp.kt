package com.pam.pam_ucp2

import android.app.Application
import com.pam.pam_ucp2.dependenciesinjection.ContainerApp

class KrsApp : Application() {

    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()

        containerApp = ContainerApp(this)
    }
}