package com.example.myapplication.kalitim

open class Arac(var renk:String,var vites:String) {
}
open class Araba(var kasaTipi:String, renk: String, vites: String):Arac(renk, vites){

}
open class Nissan(var model:String,renk: String,vites: String,kasaTipi: String):Araba(renk,vites,kasaTipi,){


}
//open class şeklinde classlar arasında kalıtım yaptık
