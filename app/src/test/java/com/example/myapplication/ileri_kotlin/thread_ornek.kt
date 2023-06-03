package com.example.myapplication.ileri_kotlin

fun main(){
val birinciThread=Thread_1()
    //birinciThread.run() bu şekilde çalıştırırsam metodu thread mantığı ile çalıştırmaz
    birinciThread.start()// thread mantiği ile çaliştirmak için bu şekilde kullanmak gerekir

    val ikinciThread=Thread(Thread_2())//interface de tanımlama bu şekilde yapılır
    ikinciThread.start()

    for (i in 900..999){
        println("Main thread: $i")
        Thread.sleep(100)
    }










}