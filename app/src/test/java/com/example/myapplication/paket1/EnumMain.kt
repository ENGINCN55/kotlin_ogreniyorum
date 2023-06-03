package com.example.myapplication.paket1


fun main(){
    fun ucretA(boyut: KonserveBoyut){
        when(boyut){
            KonserveBoyut.Kucuk -> println(20*30)
            KonserveBoyut.Orta -> println(30*30)
            KonserveBoyut.Buyuk -> println(40*30)
            // büyük dosyalarda işlem yaptığımız yerlerde değerleri bilmediğimizden bir
            //bir enum class'ı oluştururz ve fonksiyona gönderdiğimiz boyuta göre when'döngüsüne gireck ve
            //ona göre sonuç çıkaracak
            // kesin sayısal terimlerden kaçınarak katagorisel kodlama yapabiliriz


        }
    }
    ucretA(KonserveBoyut.Kucuk)



}





