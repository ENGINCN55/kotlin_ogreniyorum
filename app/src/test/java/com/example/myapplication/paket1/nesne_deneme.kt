package com.example.myapplication.paket1

class araba(var renk :String, var hiz:Int, var durum:Boolean){
    fun bilgiAl(){
        println("renk=$renk")
        println("hız=$hiz")
        println("durumu=$durum")
    }
    fun calistir(){
        durum=true

    }
    fun durdur(){
        durum=false
        hiz=0
    }
    fun hizlan(kacKm:Int){
        hiz=hiz + kacKm
    }
    fun yavasla(kacKm: Int){
        hiz=hiz - kacKm
    }


}