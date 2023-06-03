package com.example.myapplication.paket1

 class Kategoriler(var kategori_id:Int,var kategori_ad:String ){


 }
class Yonetmenler(var yonetmen_id:Int,var yonetmen_ad:String){

}
class Film(var film_id:Int,
           var film_adi:String,
           var film_yil:Int,
           var kategori: Kategoriler,
           var yonetmenler: Yonetmenler
)