package com.example.myapplication.paket1

class Ödevler {
    fun donuşum(sayi1:Double):Double{
        var olcum=(sayi1*1.8)+32
        return olcum
    }
    fun AlanHesabi(kısaKenar:Int,uzunKenar:Int){
        var cevre_olcum=2*(kısaKenar+uzunKenar)
        var alan_olcum=kısaKenar*uzunKenar
        println("çevre: $cevre_olcum")
        println("alan: $alan_olcum")
    }
    fun faktöriyel(sayi:Int){
        var faktö=1
        for (i in 1..sayi) {
            faktö*=i
        }
        println("$sayi sayısının faktöriyeli: $faktö")

    }
    fun harf(kelime:String,harf:Char){
        var sonuc=0
        for(k in kelime){
            if (k==harf){
                sonuc=sonuc+1
            }
        }
        println("harf adeti: $sonuc")
    }
    fun ic_aci(kenar:Int):String{
        var sonuc=(kenar-2)*180
        return println("girilen çokkenarlı cismin iç açılar toplamı: $sonuc").toString()
    }
    fun maaş(gün_sayisi:Int):String{
        val ucret=10
        val mesai=20
        val maas:Int
        val mesai_gunu=gün_sayisi-20
        if (gün_sayisi<20){
           maas=ucret*8*gün_sayisi
        }
        else{
           maas=(20*ucret*8)+(mesai_gunu*20)
        }
        return println("maaşınız: $maas").toString()
    }
    fun Internet(kullanim:Int){
        val birim_fiyat:Int=2
        val asim_birim_fiyat:Int=4
        val kota:Int=50
        if (kota>kullanim){
            var ucret:Int=100
            println("interner-t kullanım ücretiniz: $ucret")
        }
        else{
            var ucret:Int=100+((kullanim-kota)*4)
            println("internet kullanım ücretiniz: $ucret")
        }


    }




}