package com.example.myapplication.paket1

fun main(){
    val k1= Kategoriler(1,"dram")
    val k2= Kategoriler(2,"aksyon")
    val y1= Yonetmenler(1,"nuri bilge")
    val y2= Yonetmenler(2,"jack synayder")
    val f1= Film(1,"kutsal damacana",2010,k1,y2)

    println("film İd: ${f1.film_id}"+" filin adı: ${f1.film_adi}"+" türü: ${f1.kategori.kategori_ad}")

}