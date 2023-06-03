package com.example.myapplication.paket1

fun main (){
    val adres= Adres("istanbul","Küçükçekmece")
    val kisi= Kisiler1("engin",21,adres)
    println("kişi ad: ${kisi.ad}"+", kişinin yaşı: ${kisi.yas}"+", kişinin yaşadığı adres: ${kisi.adres.il}"+"  ${kisi.adres.ilce}")


}