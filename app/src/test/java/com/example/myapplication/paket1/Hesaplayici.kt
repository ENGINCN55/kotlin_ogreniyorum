package com.example.myapplication.paket1

class Hesaplayici {

    fun topla(sayi1:Int,sayi2: Int){
        println("toplam: ${sayi1+sayi2}")
    }
    fun topla(sayi1:Double,sayi2: Int){
        println("toplam: ${sayi1+sayi2}")
    }
    fun topla(sayi1:Int,sayi2: Double){
        println("toplam: ${sayi1+sayi2}")
    }
    fun topla(sayi1:Int,sayi2: Int,ad:String){
        println("yapan: $ad toplam: ${sayi1+sayi2}")
    }

}