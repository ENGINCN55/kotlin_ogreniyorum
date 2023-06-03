package com.example.myapplication.Collections

fun main(){
    val o1=Ogrenci(1,"ahmet","11a")
    val o2=Ogrenci(3,"zeynep","11b")
    val o3=Ogrenci(2,"ali","11c")
    val ogrenciler=HashMap<Int,Ogrenci>()
    //burada integer değerler verip karşısınsa öğrenci classından ollşmuş nesneleri kayıt edeceğiz
    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)
    for ((ogrenci_no,nesne)in ogrenciler){
        println("******************")
        println("Ogrenci no: $ogrenci_no")
        println("ogrenci ad: ${nesne.ad}")
        println("ogrenci sinif: ${nesne.Sınıf}")

    }














}