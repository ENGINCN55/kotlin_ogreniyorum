package com.example.myapplication.Collections

fun main (){
    val sayilar = ArrayList<Int>()
    sayilar.add(25)
    sayilar.add(22)
    sayilar.add(8)
    sayilar.add(5)
    sayilar.add(89)
    sayilar.add(55)
    sayilar.add(62)
    sayilar.add(31)
    sayilar.add(41)
    val tekler =ArrayList<Int>()
    val ciftler=ArrayList<Int>()
    for (s in sayilar){
        val sonuc=s%2
        if(sonuc==0){
            ciftler.add(s)
        }
        if (sonuc==1){
            tekler.add(s)
        }
    }
    println("tekler")
    for (t in  tekler){
        println(t)
    }
    println("çiftler")
    for (c in  ciftler){
        println(c)
    }





}