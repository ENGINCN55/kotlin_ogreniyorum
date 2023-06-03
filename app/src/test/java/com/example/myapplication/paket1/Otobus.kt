package com.example.myapplication.paket1

class Otobus(var kapasite:Int , var nerden:String , var nereye:String , var mevcutyolcu:Int) {
    fun BilgiAl(){
        println("kapasite:$kapasite")
        println("nereye:$nereye")
        println("nerden:$nerden")
        println("yolcu sayısı:$mevcutyolcu")

    }
    fun yolcuAl(yolcu:Int){
        mevcutyolcu=mevcutyolcu+yolcu
    }
    fun yolcuBırak(yolcu: Int){
        mevcutyolcu=mevcutyolcu-yolcu
    }
    //var otobus:Otobus?=null// burada ? ve null yazmadan bu şekilde nesne oluşturamıyoruz bunun yerine;
    //lateinit var otobus: Otobus//şeklinde herhangi bir değer aktarmadan nesne tanımlayabiliriz
    //lateinit var sayi:Int// şeklinde de atama yapamayız çünkü primitiv tipler ilk atama almak zorundalar


}