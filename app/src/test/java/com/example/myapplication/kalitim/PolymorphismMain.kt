package com.example.myapplication.kalitim

fun main(){
    //val hayvan:Hayvan=Kopek()
    //hayvan.sesCikar()
    // köpek sınınıfnınn fonksiyonunun çalıştırdı
    val ogretmen:Personel=Ogretmen()
    val isci:Personel=Isci()
    val mudur=Mudur()

    mudur.iseAl(ogretmen)
    mudur.iseAl(isci)
    mudur.terfiEttir(ogretmen)
    //mudur.terfiEttir(isci)// işçi clası için polymorphisim yapmadığımız için çalışmaz. öğretmen classı ile işçi clası arasında bir kalıtım olmadığından kaynaklı
    mudur.terfiEttir(isci)// müdür içerisine if bloğu ile tür karşılaştırması yaptıktan sonra başka bir dönüşüm alacağız






}