package com.example.modulea.component

import com.example.modulea.ModuleActivity
import dagger.Subcomponent

@Subcomponent
interface ModuleAComponent {


    @Subcomponent.Factory
    interface Factory {
        fun create(): ModuleAComponent
    }

    fun inject(moduleActivity: ModuleActivity)
}