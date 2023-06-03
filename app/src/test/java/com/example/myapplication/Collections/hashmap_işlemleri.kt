package com.example.myapplication.Collections

fun main(){
    val sayılar= mapOf<Int,String>(1 to "bir",2 to "iki")
    val oranlar= mutableMapOf<Double,String>(1.5 to "oran1",3.4 to  "oran 2")
    val iller=HashMap<Int,String>()
    iller.put(34,"istanbul")//put atama yapmamızı sağlar
    iller.put(55,"samsun")
    println(iller.toString())
    iller.put(55,"yeni Samsun")
    println(iller.toString())
    println(iller.get(34))//istanbulu getirecek
    println(iller.size)
    println(iller.count())
    println(iller.isEmpty())

    //girilen key değeri var mı yok mu diye sorgular
    println(iller.containsKey(16))
    println(iller.containsValue("istanbul"))
    for ((anahtar,deger) in iller)
    {
        println("$anahtar: $deger")
    }
    iller.remove(34)//girilen değeri siler
    println(iller.toString())

    iller.clear()
    println(iller.toString())






    
}