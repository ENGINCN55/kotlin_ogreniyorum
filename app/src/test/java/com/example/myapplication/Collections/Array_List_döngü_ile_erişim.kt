package com.example.myapplication.Collections

fun main(){
    val Meyveler=ArrayList<String>()
    Meyveler.add("elma")
    Meyveler.add("çilek")
    Meyveler.add("portakal")
    Meyveler.add("greyfurt")
    Meyveler.add("armut")
    Meyveler.add("ayva")
    Meyveler.add("muz")
    for (Meyve in Meyveler ){
        println("Sonuç: $Meyve")
    }
    for ((index,meyve)in Meyveler.withIndex()){
        println("sonuç: $index $meyve")
    }

}