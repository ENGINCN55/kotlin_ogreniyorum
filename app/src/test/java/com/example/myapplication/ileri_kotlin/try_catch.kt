package com.example.myapplication.ileri_kotlin

fun main(){
    val x =10
    val y= 0
    val y1=5
    val dizi=Array<Int>(2){0}//{0,0}
    // böyle yazdığımızda 0'a bölme hatası alırız
    //println("sonuç: ${x/y}")
    try {
        println("sonuç: ${x/y1}")
        println("işlem taqmam")
        // burada diyelim ki ilk kod hatalı değil ama sonrakiler hatalı
        // ozmn hatalı olana kadar try çalışır hatayı buur bulmaz catch'a geçer ve onun hata çıktınısını verir
        dizi[4]=8
        // try içerisnde birden fazla hata olabilir bu hataları yönetmemiz gerekir


    }
    catch (e:Exception){
        //aşağıdaki if bolkları sayesinde hataları çeşitendirip yönetebiliriz
        if (e is ArithmeticException){
        println("ilk sayı sıfıra bölünemez")
        }
        if (e is ArrayIndexOutOfBoundsException){
            println(" dizinin boyutunu aştınız")
        }
    }
    // aşağıdaki şekilde de hata filtrelemesi yapabiliriz
    /*catch (e:ArithmeticException){
        println("ilk sayı sıfıra bölünemez 2. catch uyarı mesajı")

    }
    // yada başka bir catch yazarak ta yönetebiliriz
    catch (e: ArrayIndexOutOfBoundsException){
        println(" dizinin boyutunu aştınız 2. catch uyarı mesajı")
    }*/

















}