package com.example.myapplication.Interface

open class Elma:Eatable,Squeezable {
    override fun howToEat() {
        println("ısırarak")

    }

    override fun howToSqueez() {
        println("daşla")

    }


}
class Amasya_Elmasi:Elma(){
    override fun howToEat() {
println("yıka ye")    }

    override fun howToSqueez() {
       println("sopaylan")
    }
}