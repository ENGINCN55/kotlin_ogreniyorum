package com.example.myapplication.Collections

import java.util.Scanner

fun main (){var sayac=1
    val ogrenciler=ArrayList<Ogrenci>()
    val girdi=Scanner(System.`in`)
    while (true){
        println("öğreci adı giriniz")
        val ad = girdi.next()
        println("öğrencinin sınıfını giriniz")
        val sinif = girdi.next()

        val yeni_ogrenci = Ogrenci(sayac, ad, sinif)
        sayac = sayac + 1
        ogrenciler.add(yeni_ogrenci)

        println("çıkmak için (1)  devam için herhangi bir sayı")
        val cikis = girdi.nextInt()
        if (cikis == 1) {
            for (ogrenci in ogrenciler){
                println("öğrenci adı: ${ogrenci.ad}")
                println("öğrenci sınıfı: ${ogrenci.Sınıf}")
                println("öğrenci no : ${ogrenci.no}")

            }
            break
        }

    }}
    //val kontrol=Scanner(System.`in`)
    //val girdi_01=kontrol.nextInt()
    //val Ogretim__gorevlisi=ArrayList<Ogretim_gorevlisi>()
    //val calisan__=ArrayList<Calisan>()
    //println("sisteme öğrenci kaydetmek için 1'e basın")
    /*println("sisteme öğretim görevlisi kaydetmek için 2'ye basın")
    println("sisteme çalışan eklemek için 3'e basın")
    println("sistemdeki öğrencileri okumak için 4'e basın")
    println("sistemdeki öğretim görevlilerini okumak için 5'e basın")
    println("sistemdeki çalışanları okumak için 6'ya basın")*/
    /*var sayac=1
    val ogrenciler=ArrayList<Ogrenci>()
    val girdi=Scanner(System.`in`)
    while (true){
        println("öğreci adı giriniz")
        val ad = girdi.next()
        println("öğrencinin sınıfını giriniz")
        val sinif = girdi.next()

        val yeni_ogrenci = Ogrenci(sayac, ad, sinif)
        sayac = sayac + 1

        println("çıkmak için (1)  devam için herhangi bir sayı")
        val cikis = girdi.nextInt()
        if (cikis == 1) {
            for (ogrenci in ogrenciler){
                println("öğrenci adı: ${ogrenci.ad}")
                println("öğrenci sınıfı: ${ogrenci.Sınıf}")
                println("öğrenci no : ${ogrenci.no}")

            }
        }

    }*/

   /* if (girdi_01==1) {
        while (true) {
            println("öğreci adı giriniz")
            val ad = girdi.next()
            println("öğrencinin sınıfını giriniz")
            val sinif = girdi.next()

            val yeni_ogrenci = Ogrenci(sayac, ad, sinif)
            sayac = sayac + 1

            println("çıkmak için (1)  devam için herhangi bir sayı")
            val cikis = girdi.nextInt()
            if (cikis == 1) {
                for (i in ogrenciler){
                    println("öğrenci adı: ${yeni_ogrenci.ad}")
                    println("öğrenci sınıfı: ${yeni_ogrenci.Sınıf}")
                    println("öğrenci no : ${yeni_ogrenci.no}")
                }
                break


            }
        }
    }
    if (girdi_01==2){
        while (true){
            println("öğretim görevlisinin adını giriniz")
            val ad_=girdi.next()
            println("öğreim görevlisinin bölümünü giriniz")
            val bolum_=girdi.next()
            println("öğretim görevlisinin rütbesini giriniz(doçent,profesör,araştırma görevlisi vb...")
            val rutbe_=girdi.next()
            val yeni_ogretim_gorevlisi=Ogretim_gorevlisi(ad_,bolum_,rutbe_)
            println("çıkmak için (1)  devam için herhangi bir sayı")
            val cikis = girdi.nextInt()
            if (cikis == 1) {
                break
            }

        }
    }
    if (girdi_01==3){
        while (true){
            println("çalışanın adını giriniz")
            val ad_=girdi.next()
            println("çalışanın çalıştığı mekanı giriniz")
            val yer_=girdi.next()
            println("çalışanın kıdemini giriniz(kaç yıldır çalıştığı bilgisi)")
            val yil_=girdi.nextInt()
            val yeni_calisan=Calisan(ad_,yer_,yil_)
            println("çıkmak için (1)  devam için herhangi bir sayı")
            val cikis = girdi.nextInt()
            if (cikis == 1) {
                break
            }

        }*/







