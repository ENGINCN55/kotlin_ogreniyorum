package com.example.myapplication.pakeet2

import com.example.myapplication.paket1.A3

class B3: A3() {
    fun fonksiyon(){
        // open yaptıktan sonra A ya erişmek için A nesnesi şeklinde değilde direkt olarak çağırabiliriz
        //çünkü open yaptıktan sonra A'dan B'ye kalıtım kod alırız
        //val nesne=A3()
       /* println(nesne.varsayilanDegisken)
        println(nesne.PublicDegisken)
        println(nesne.internalDegisken)
        println(nesne.PrivateDegisken) //sadece oluşturulduğu sınıf içerisnde kullanılabilir
        println(nesne.ProtectedDegisken)//protected yi kullanmak için kullandığımız sınıftan türemiş olması lazım*/
        // yukarıdaki kodlar A dan kalıtım yapmasydık kullanacağımız kodlar
        // A3'ten kalıtım almak için de B3 sınıfınfa "B3:A3()" sytax'ı kullanılır

        println(varsayilanDegisken)
        println(PublicDegisken)
        println(internalDegisken)
        //println(PrivateDegisken) //sadece oluşturulduğu sınıf içerisnde kullanılabilir
        println(protectedDegisken)


    }
}