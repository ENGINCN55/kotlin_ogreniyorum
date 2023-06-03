package com.example.myapplication.Collections

fun main(){
    val k1=Kisiler(1,"ahmet")
    val k2=Kisiler(2,"mehmet")
    val k3=Kisiler(3,"zeynep")

    val KisilerArrayList=ArrayList<Kisiler>()
     KisilerArrayList.add(k1)
    KisilerArrayList.add(k2)
    KisilerArrayList.add(k3)
    for (k in KisilerArrayList){
        println("${k.kisNO}--${k.KısıADı}")

    }
    println("sayısal küçükten büyüye sırlama")

    val siralamaArrayList1=KisilerArrayList.sortedWith(compareBy{it.kisNO})// yeni oluşturduğumuz listedeki elemanları kisNo'ya göre sıralayacak

    for (k in siralamaArrayList1){
        println("${k.kisNO}---${k.KısıADı}")
    }
    println("*******************************")

    val siralamaArrayList2=KisilerArrayList.sortedWith(compareByDescending{it.KısıADı})// sıralamayı harfe göre yapar
    for(k in siralamaArrayList2){
        println("${k.kisNO}---${k.KısıADı}")
    }


}