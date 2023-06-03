package com.example.myapplication.Collections

fun main(){
    val sayilar=ArrayList<Int>()
    sayilar.add(30)
    sayilar.add(40)
    /*sayilar.add(50)
    sayilar.add(100)
    sayilar.add(53245)
    sayilar.add(282417721)*/

     var toplam=0
    for(s in sayilar){
        toplam=toplam+s

    }
    println("ortlama: ${toplam/sayilar.size}")


}