package com.example.moduleb

import android.util.Log
import com.example.basemodule.InterfaceB

class ClassB : InterfaceB {
    override fun printHelloWorld() {
        Log.d("ClassB", "Hello World!")
    }
}