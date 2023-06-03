package com.example.myapplication.kalitim

open class Personel {
     fun iseAlindi(){
        println("personle mutlu")
    }
}
class Ogretmen:Personel(){
    fun maasArttri(){
        println("maaş arttı öğretmen mutlu")
    }

}
class Isci:Personel(){

}
class Mudur:Personel(){
    fun iseAl(p:Personel){
        p.iseAlindi()
        // bu fonksiyona personel sınıfnından bir nesne gönder dedik bu sytax ile
        //bir üst sınıftan nesne göndererek kapsamını genişlettik


    }
    fun terfiEttir(p:Personel){
        //(p as Ogretmen).maasArttri()
        // burada öğretmen classı alt sınıf olduğundan kaynaklı öğretmen clasından fonksiyon çağıramıyorduk
        // çağırabilmeyi mümkün kılmak için personel clasını downcasting yaptık ve erişebildk
        // bunu da "(p as Ogretmen).maas..." kodu ile sağladık
        if (p is Ogretmen){
            p.maasArttri()

        }
        if (p is Isci ){
            println("işçiler terfi alamaz ")
        }



    }
}