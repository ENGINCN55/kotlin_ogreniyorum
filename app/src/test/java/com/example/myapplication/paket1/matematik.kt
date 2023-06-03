package com.example.myapplication.paket1

class matematik {
    fun topla(sayi1:Int,sayi2:Int){
        val toplalam = sayi1+sayi2
        println("toplam:$toplalam")
    }
    fun cikar(sayi1: Double,sayi2: Double):Double{
        return sayi1-sayi2

    }
    fun carp(sayi1: Int,sayi2: Int,isim:String){
        val sonuc=sayi1*sayi2
        println("Çarpma yapan $isim Sonuc: $sonuc")
    }
    fun bol(sayi1: Double,sayi2: Double):String{

        return "bölme işlmei sonucu: ${sayi1/sayi2}"
    }
}