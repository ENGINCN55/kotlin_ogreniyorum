package com.example.myapplication.Collections

fun main(){
    val sayilar=ArrayList<Int>()
    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(4)
    sayilar.add(5)//[1,2,3,4,5] ------>[2,4,6,8,10]
    for ((indeks,sayi)in sayilar.withIndex()){
        val sanuc=sayi*2
        sayilar[indeks]=sanuc
        // sayıları işlem yapmak için arraylistten ayrı olrak çağırdık
        //daha sonra üzerinde işlem yaptığımız sayıları listeden çağırdığımmız indeks numaralarına göre atadık


    }
    for (s in sayilar){
        println(s)
    }



}