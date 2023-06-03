package com.example.myapplication.Collections

import java.util.Scanner

fun main(){
    val ders_notları_listesi= ArrayList<DersNotlar>()
    val girdi=Scanner(System.`in`)
    while (true){
        println("dersin adını giriniz")
        val ders=girdi.next()
        println("dersin notunu girini")
        val not=girdi.nextInt()
        val yeni_not=DersNotlar(ders,not)
        ders_notları_listesi.add(yeni_not)
        println("çıkmak için (1, devam etmek için 1 dışındaki herhangi bir sayi)")
        val cikis=girdi.nextInt()
        if (cikis==1){println("çıkış yapıldı")
            var toplam=0
            for (dn in ders_notları_listesi){
                println("ders: ${dn.ders}   dersin notu: ${dn.not}")
                toplam=toplam+dn.not
            }
            println("***************")
            val ortlama=toplam/ders_notları_listesi.size
            println("ORTLAMA: $ortlama")
            if (ortlama>=50){
                println("geçtiniz")
            }
            else{
                println("kaldınız")
            }
            break
        }
    }
}