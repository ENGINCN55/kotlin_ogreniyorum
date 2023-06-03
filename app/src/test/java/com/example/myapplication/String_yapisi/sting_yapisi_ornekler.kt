package com.example.myapplication.String_yapisi

fun main(){
    val str1="merhaba"
    println(str1)
    var str2=String()
    str2="ahmet"
    println(str2)
    val str3="""
        içerisine 
        pragraf 
        yazabilmemizi 
        sağlayan
        yöntem
        üç 
        kere
        çift
        tırnak'a
        basarak 
        yazıyoutz
    """.trimIndent()
    println(str3)
    val str4=""
    val str5=String()
    if(str4.isEmpty()){
        println("str4 boş")

    }
    else{
        println("str4 boş değildir")
    }
    val varA=10
    val varB=20
    println("$varA x $varB = ${varA*varB}")
    val str6="helo"
    val str7="  dünya"
    println(str6+str7)

    val str8="merhaba,kotlin é"
    println("$str8 boyutu ${str8.length}")
    val str9="merhba"
    val str10="merhabba baba"
    if (str10==str9){
        println("$str9 ve $str10 eşittir")
    }
    else{
        println("$str9 ve $str10 eşit değilidr")
    }
    val str11="merhaba"
    for(s in str11){
        println(s)
    }










}