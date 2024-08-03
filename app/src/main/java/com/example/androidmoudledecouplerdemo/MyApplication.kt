package com.example.androidmoudledecouplerdemo

import android.app.Application
import com.example.modulea.component.ModuleAComponent
import com.example.modulea.component.ModuleAComponentProvider
import com.example.androidmoudledecouplerdemo.component.DaggerApplicationComponent

class MyApplication : Application(), ModuleAComponentProvider {

    val appComponent = DaggerApplicationComponent.create()

    override fun provideModuleAComponent(): ModuleAComponent {
        return appComponent.moduleAComponent().create()
    }
}