package com.example.myapplication.String_yapisi

fun main(){
    val str9="merhba"
    val str10="merhabba baba"
    val str6="helo"
    val str7="  dünya"
    val varA=10
    val varB=20
    val str4=""
    val str1="merhaba"
    println(str1.subSequence(0,5))//0'dan 5'üncü indise kadr 5 dahil değil yazar dizi gibi  davramasın sağlar
    if(str6.contains("er")){
        //"er" ifadesi girilen string deeğr içerisnde var mı yok mu diye kontrol eder
        println("içeriyor")
    }
    else{
        println("içermiyor")
    }
    println(str7.toUpperCase())
    println(str7.toLowerCase())
    val dizi=str10.split(" ")// ifadeyi boşluğa göre parçalayacak

    for (d in dizi){
        println(d)
    }
    val str5=" marhaba "
    println(str5.trim())// ifadenin sağındaki yada soluncaki buşlukları yok eder




}