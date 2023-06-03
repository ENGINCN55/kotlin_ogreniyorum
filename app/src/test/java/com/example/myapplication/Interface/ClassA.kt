package com.example.myapplication.Interface

class ClassA:Interface1 {
    // ınterface daha önce hazırlanmış templates gibi çalışır
    // ve çağrıldığı yerde interface nin bütün özellikleri
    //kullanılması gerekir

    // eklemek için 1. yöntem hata verdiğin ampule tıklayıp members kısmından ctrl ile alayının seçip ok'a basarsak otomatik yazar
    /*override val degisken: Int
        get() = TODO("Not yet implemented")

    override fun metod1() {
        TODO("Not yet implemented")
    }

    override fun metod2(): String {
        TODO("Not yet implemented")
    }*/

    //2. yöntem ise elle direkt olrak yazmak
    override val degisken: Int=10


    override fun metod1() {
        println("Inter face merhaba")

    }

    override fun metod2(): String {
        return "Interface çalışması"

    }


}