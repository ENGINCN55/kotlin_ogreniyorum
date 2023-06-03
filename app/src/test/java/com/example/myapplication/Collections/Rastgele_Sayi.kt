package com.example.myapplication.Collections

import kotlin.random.Random

fun main(){
    val sayilar =ArrayList<Int>()
    for (i in 1..100){
        val RastgeleSAyi= Random.nextInt(0,101)
        sayilar.add(RastgeleSAyi)
    }
    sayilar.sort()
    for (s in sayilar){
        println(s)
    }
}