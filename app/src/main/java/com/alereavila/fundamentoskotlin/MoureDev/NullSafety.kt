package com.alereavila.fundamentoskotlin.MoureDev

import com.alereavila.fundamentoskotlin.sayHello

fun main (){
    sayHello("Null Safety")

    /*
    * */
    var myString : String= "Curso de Kotlin"
    println("$myString")
    var mySafetyString :String? = "variable NULL SAFETY"
    mySafetyString  = null
    mySafetyString="no nulo"
    //asegurarnos siempre
    sayHello("Garantizar que no sea nulo")
    if(mySafetyString!=null){
        println("Con !! garantizo que no sea null la variable $mySafetyString!!")
    }
    sayHello("Safe calls con el operador ?")
    /*Hay que revisar este bloque de código*/
    println(mySafetyString?.length)
    mySafetyString?.let {
        println(it)
    } ?: run {
        println(mySafetyString!!)
    }
}