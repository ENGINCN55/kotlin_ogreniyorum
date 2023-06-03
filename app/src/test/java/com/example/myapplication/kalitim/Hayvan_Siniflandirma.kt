package com.example.myapplication.kalitim

open class Hayvan {
    open fun sesCikar(){
        println("sesim yok")
    }
    // open fun aynı open class gibi kalıtım yoluyla aktarılabilen fonksiyonlar için kullanılır

}
open class Memeli:Hayvan(){}
class Kedi:Memeli(){
    override fun sesCikar() {
        //super.sesCikar()
        println("miyav miyav")
    }
    // bu şekilde fonkisyon override edildi ve başka classtan çağırıldı
    // burada super.sesCikar() fonksiyonu olduğu gibi üst sınıftan kalıtıldığı gibi çalışır
    //ancak ben öyle olsun istemiyorum bu yüzden fonksiyonun içine kendi
    // yapmasını istediğim şeyi yazdırdım
}
class Kopek:Memeli(){
    override fun sesCikar() {
        println("hav hav")
    }
}