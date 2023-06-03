package com.example.myapplication.paket1

fun main(){

    fun Int.carpi(sayi:Int):Int{
        return this*sayi
    }
    val sonuc=5.carpi(4)
    println(sonuc)

    // fun dan sonra yazdığımız genişletmek istediğimiz türü belirler
    // sınıfları genişletmek için kullanılır
    // yukarıda int sınıfını genişletip içine bir metod yazdık
    //genişletmek istediğimiz sınıfı yazarız öncelikle ardından ismini verirriz
    // eğer infix haline getirirsek yazması daha kolay olur
    infix fun Int.toplam(sayi:Int):Int{
        return this+sayi
    }
    val sonuct=5 toplam  2//şeklinde basitleştirilebilir
    println(sonuct)




}