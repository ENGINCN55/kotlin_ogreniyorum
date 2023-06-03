package com.example.myapplication.Collections
class Ogrenci(var no:Int,var ad:String,var Sınıf:String) {
    override fun hashCode(): Int {
        return this.no
    }

    override fun equals(other: Any?): Boolean {
        if(this.no==(other as Ogrenci).no)
            return true
        else
            return false
    }
}
class Ogretim_gorevlisi( var ad: String,var bolum:String,var rütbe:String,)
class Calisan(var ad: String,var yer:String,var kıdem:Int)

