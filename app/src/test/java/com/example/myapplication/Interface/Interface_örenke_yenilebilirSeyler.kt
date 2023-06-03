package com.example.myapplication.Interface

fun main(){
    val aslan=Aslan()
    val amasyaElmasi:Elma=Amasya_Elmasi()
    val elma=Elma()
    val tavuk:Eatable=Tavuk()
    val nesneler= arrayOf(aslan,amasyaElmasi,elma,tavuk)

    for (nesne in nesneler){
        if (nesne is Eatable){
            nesne.howToEat()
        }
        if (nesne is Squeezable){
            nesne.howToSqueez()
        }
    }
}