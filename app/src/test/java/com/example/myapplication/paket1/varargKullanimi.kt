package com.example.myapplication.paket1

fun main (){
    fun toplam(vararg sayilar:Int):Int {
        var sonuc=0
        for(s in sayilar){
            sonuc=sonuc+s
        }
        return sonuc

    }
    // vararg aynı diziler gibi gönderdiğimiz verileri tutarak işlem yapar
    val t1=toplam(1,2,3,4,5,6,7,8)//girilen değerleri toplayacak
    println("toplam sonucu: $t1")
}