package com.example.myapplication.ileri_kotlin

class Thread_1: Thread(){
    // kalıtım kullandığımız thread
    override fun run() {
        for(i in 100..199){
            println("birinci thread:$i")
            Thread.sleep(100)
        }

    }

}