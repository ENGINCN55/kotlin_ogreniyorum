package com.example.myapplication.Collections

import android.location.GpsStatus.Listener


fun main(){
    val Liste=ArrayList<String>()
    // Liste adında array list yazdık
    // içerisine daha sonradan değer aktarması yapmayacağımızdan val şeklinde oluşturduk
    val Liste2: ArrayList<Int> = ArrayList<Int>()// şeklinde de atama yapabliriz
    val Meyveler=ArrayList<String>()
    Meyveler.add("elma")
    Meyveler.add("çilek")
    Meyveler.add("portakal")
    Meyveler.add("greyfurt")
    Meyveler.add("armut")
    Meyveler.add("ayva")
    Meyveler.add("muz")
    // şeklinde veri eklenebilir
    Meyveler[2]
    println(Meyveler.toString())// yazarsak listeyi yazdırabiliriz
    val meyve1=Meyveler[2]
    val meyve2=Meyveler[3]
    println(meyve1)
    println(meyve2)
    Meyveler[2]="ananas"// 2. indexteki elemanı ananas ile değiştiririz
    println(Meyveler.toString())

    Meyveler.add(3,"karpuz")// girilen veriyi 3. inxe kaydediyor ve ardından gelenleri sağa kaydırıyor
    println(Meyveler.toString())

    println(Meyveler.isEmpty())// false değeri döndürecek boş mu diye sorgu yapar
    println(Meyveler.count())// listenin boyutunu verir
    println(Meyveler.size)// listenin boyutunu verir
    println(Meyveler.first())// ilk index
    println(Meyveler.last())//son index
    println(Meyveler.contains("elma"))// veriler içerisinde var mı yokmu diye kontrol eder ve true/false çevirir
    println(Meyveler.max())//elemanlar harf sırasına göre işleme sokulup ona göre veriyor değeri
    println(Meyveler.min())
    Meyveler.sort()// listeyi harf sırasına göre sıralamaya yarar
    println(Meyveler.toString())//sıralanmış listeyi yazdırdık
    Meyveler.reverse()// listeyi tersine çevirir
    println(Meyveler.toString())
    Meyveler.removeAt(3)// 3. indexi siler
    println(Meyveler.toString())
    Meyveler.remove("elma")// belirtilen elemanı siler
    println(Meyveler.toString())
    Meyveler.clear()//listeyi temizler
    println(Meyveler.toString())











}