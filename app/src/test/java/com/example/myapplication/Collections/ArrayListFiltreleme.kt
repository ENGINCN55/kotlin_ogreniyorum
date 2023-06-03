package com.example.myapplication.Collections

fun main(){
    val o1=Ogrenci(1,"ahmet","1b")
    val o2=Ogrenci(2,"mehmet","2a")
    val o3=Ogrenci(3,"engin","1b")
    val o4=Ogrenci(4,"melih","1b")
    val o5=Ogrenci(5,"emre","1b")
    val ogrenciler=ArrayList<Ogrenci>()
    ogrenciler.add(o1)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)
    ogrenciler.add(o2)
    //val sonucListe=ogrenciler.filter { it.no>2  }// no'su 2 nin üzerinde olan veriyi listeler
    val sonucListe=ogrenciler.filter { (it.ad).contains("e") }// adında "e" harfi olanları listeler
     for (i in sonucListe){
         println("öğrenci no: ${i.no}**")
         println("öğrenci adı: ${i.ad}")
         println("öğreci sınıfı: ${i.Sınıf}")
         println("       ")
         println("       ")
     }












}