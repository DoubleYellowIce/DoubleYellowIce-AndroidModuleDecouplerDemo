package com.example.androidmoudledecouplerdemo.component

import com.example.modulea.component.ModuleAComponent
import com.example.moduleb.ModuleB
import com.example.androidmoudledecouplerdemo.MainActivity
import com.example.basemodule.ActivityScope
import dagger.Component

@ActivityScope
@Component(modules = [ModuleB::class])
interface ApplicationComponent{

    fun inject(mainActivity: MainActivity)

    fun moduleAComponent(): ModuleAComponent.Factory
}