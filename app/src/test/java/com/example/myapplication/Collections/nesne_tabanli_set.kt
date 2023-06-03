package com.example.myapplication.Collections

fun main(){
    val o1=Ogrenci(15,"ahmet","12a")
    val o2=Ogrenci(15,"zeeynep","11b")
    val o3=Ogrenci(15,"kamil","11c")
    val o4=Ogrenci(1,"kamil","11c")
    val o5=Ogrenci(2,"kamil","11c")
    val o6=Ogrenci(3,"kamil","11c")

    val ogrenciler=HashSet<Ogrenci>()//bu hasset öğrenci sınıfından nesneleri tutacak
    // rastgele tuttuğu için çıktı rastgele geldi
    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)
    ogrenciler.add(o6)
    //Ogrenci sınıfına eklediğimiz yeni fonksiyonlar setin içerisine hangi kurallar ile kaydedilceğini gösteren fonksiyonlardır
    //o metodlar ile tekara çalıştırdığımızda aynı numaradaki öğrencileri eklemeyecektir
    for (o in ogrenciler){
        println("**********")
        println("Öğrenci no:${o.no}")
        println("Öğrenci ad: ${o.ad}")
        println("öğrenci sınıf: ${o.Sınıf}")

    }


}