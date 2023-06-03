package com.example.myapplication.paket1


fun main(){
    var str1:String?=null//str1 kullanılırken bu ifadenin null olabilceğinin bilgisini alacağız
    str1?.trim()// null olmasına rağmen çalıştı ancak hata almadı
    //str1!!.trim()// hata alsa bile çalıştır demek
    if (str1!=null){
        str1.trim()
        // null değilse çalıştır şeklinde if bloğu yazabiliriz

    }
    //var otobus:Otobus?=null// burada ? ve null yazmadan bu şekilde nesne oluşturamıyoruz bunun yerine;
    //lateinit var otobus: Otobus//şeklinde herhangi bir değer aktarmadan nesne tanımlayabiliriz
    //lateinit var sayi:Int// şeklinde de atama yapamayız çünkü primitiv tipler ilk atama almak zorundalar


}