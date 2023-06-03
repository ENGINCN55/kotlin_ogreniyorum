package com.example.myapplication.Collections

import java.util.Scanner

fun main (){
    val girdi=Scanner(System.`in`)
    val personeller=ArrayList<Personel>()
    for (i in 1..5){
        println("$i. Personel AD: ")
        val isim =girdi.next()
        println("$i. Personel Adres il : ")
        val il=girdi.next()
        println("$i. Personel Adres ilçe: ")
        val ilçe=girdi.next()
        val adres=Adres(il,ilçe)
        val personel=Personel(i,isim, adres)
        personeller.add(personel)



        //val adres=Adres("bursa","osmangazi")
        //val personel=Personel(i,"ahmet",adres)// burada adres bilgisinii diğer sınıfa ait nesneden çektik
        /*personel.no
        personel.adres.il
        personel.adres.ilce
        personel.isim*/ // bu şekilde personel nesnesi ile adres adrese ait verilere de erişebiliyoruz

    }

    for (p in personeller){
        println("****************00")
        println("personel no: ${p.no}")
        println("personel ad: ${p.isim}")
        println("personel adres: ${p.adres.il}   ${p.adres.ilce}")
    }
}