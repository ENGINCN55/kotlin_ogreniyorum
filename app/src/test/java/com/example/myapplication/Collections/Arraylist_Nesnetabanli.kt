package com.example.myapplication.Collections


fun main(){
    val u1=urun(1,"saat",15.5)
    val u2=urun(2,"bisiklet",1150.0)
    val u3=urun(3,"tabanca",10119.0)
    val urunler=ArrayList<urun>()// normalde arraylist içersisinde depolanacak verilerin cinsine göre sınıflandırılır ancak bizim oluşturuduğumuz nesnelerde
    // hem ınt değer hemde string  değer olduğunundan listenin cinsini belirttiğimiz yere
    // nesneleri oluşturduğumuz sınıfının adını yazarız
    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)


    for(urun in urunler){
        println("**************")
        println("ürünler no: ${urun.urunNo}")
        println("ürün ad : ${urun.urunAd}")
        println("ürün Fiyat: ${urun.urunFiyat}")
    }






}