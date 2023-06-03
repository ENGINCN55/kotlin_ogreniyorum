package com.example.myapplication.paket1

fun main(){
    fun selamla(){
        val sonuc="merhaba ahmet"
        println(sonuc)

    }
    selamla()

    fun selamla1():String{
        val sonuc="merhaba engin"
        return sonuc
    }
    val gelenSonuc=selamla1()
    println(gelenSonuc)


    fun selamla2(isiö:String){
        val sonuc="merhaba $isiö"
        println(sonuc)
    }
    selamla2("engin")

    fun toplama(){
        val toplam=30+40
        println("toplam:$toplam")
    }
    toplama()

    fun toplama2( sayi1:Int, sayi2:Int){
        var toplam=sayi1+sayi2
        println("toplam $toplam")
    }
    fun toplama3( sayi1:Int, sayi2:Int):Int{
        var toplam=sayi1+sayi2
        return toplam
    }
    toplama2(122,15)
    toplama3(15,22)


}