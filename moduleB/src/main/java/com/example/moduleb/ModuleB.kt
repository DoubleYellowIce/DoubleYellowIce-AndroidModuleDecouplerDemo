package com.example.moduleb

import com.example.basemodule.InterfaceB
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ModuleB {

    @Provides
    fun getInterfaceB(): InterfaceB{
        return ClassB()
    }
}