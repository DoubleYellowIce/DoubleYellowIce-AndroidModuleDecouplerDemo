package com.example.moduleb

import com.example.basemodule.ActivityScope
import com.example.basemodule.InterfaceB
import dagger.Module
import dagger.Provides


@Module
class ModuleB {

    @ActivityScope
    @Provides
    fun getInterfaceB(): InterfaceB{
        return ClassB()
    }
}