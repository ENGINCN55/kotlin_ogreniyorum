package com.example.myapplication.Collections

import java.util.Scanner

fun main(){
    // "set","hashset","mutableSetOf", yapıları aynı array listler gibi çalışır ancak içerisindeki veriler yazılıdığı şekilde sıralamazlar
    val meyveler= setOf<String>("çilek","armut","karpuz")
    val iller= mutableSetOf<String>("istanul","ankara","muş","uşak")
    val sayiler =HashSet<Int>()// karışık liste
    sayiler.add(153)
    sayiler.add(185)
    sayiler.add(155)
    sayiler.add(15)
    sayiler.add(55)
    sayiler.add(48)
    println(sayiler.toString())// sayilar listesini yazdırdık
    println(meyveler)
    println(iller)
    // yazdırdığımızda görülecek ki karışık olarak yazmıştır
    // aynı veri gönderilirse eğer kaydetmez örenğin  sayılar listesinde 15 varken .add metodu ile tarkrar 15 yazmaya çalışırsak yazmayacaktır
    println(sayiler.elementAt(2))//2. indeksteki veriyi getirir
    println(sayiler.size)
    println(sayiler.count())
    println(sayiler.isEmpty())// boş mu dolu mu diye sorgular
    println(sayiler.contains(25))//25 sayısı var mı diye sorgular

    for (s in sayiler){
        println(s)
        // şeklinde öngüler ile setlere erişim sağlayabilirz

    }
    for ((i,s) in sayiler.withIndex()){
        //burada i elemanlara s ise indekslere erişir
    }




}