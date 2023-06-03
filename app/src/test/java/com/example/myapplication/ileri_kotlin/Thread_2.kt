package com.example.myapplication.ileri_kotlin

class Thread_2:Runnable {
    // interface kullandığmız thread
    override fun run() {
        for(i in 200..299){
            println("ikinci thread:$i")
            Thread.sleep(100)// gecikme verir
        }

    }
}