package com.example.myapplication.Collections

import java.util.Scanner

fun main(){
    val girdi=Scanner(System.`in`)
    val isimler =ArrayList<String>()
    isimler.add("ahmet")
    isimler.add("ali")
    isimler.add("melih")
    println("aratmak için isim giriniz")
    val isim=girdi.next()
    for (i in isimler){
        if (i==isim){
            println("isim mevcut")
            break
        }
    }
}