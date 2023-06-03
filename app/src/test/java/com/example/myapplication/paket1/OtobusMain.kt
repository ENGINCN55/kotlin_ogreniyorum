package com.example.myapplication.paket1


fun main(){
    val kamilKoç= Otobus(50,"istanbul","düzce",42)

    println(kamilKoç.nerden)
    println(kamilKoç.nereye)
    println(kamilKoç.mevcutyolcu)
    println(kamilKoç.kapasite)

    kamilKoç.kapasite=100//şeklinde kapasite değişebilşr
    kamilKoç.nerden="ankara"
    kamilKoç.nereye="sakarya"
    kamilKoç.mevcutyolcu=15
    println(kamilKoç.nerden)
    println(kamilKoç.nereye)
    println(kamilKoç.mevcutyolcu)
    println(kamilKoç.kapasite)
    // yukarıda ayrı ayrı yazmak yerine
    kamilKoç.BilgiAl()//yaparız ve bilgiler gelir
    kamilKoç.yolcuAl(15)
    kamilKoç.yolcuBırak(24)
    kamilKoç.BilgiAl()
    val otobusFirması= Otobus(50,"adıyaman","kars",48)
    otobusFirması.BilgiAl()






}