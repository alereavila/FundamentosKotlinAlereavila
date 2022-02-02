package com.alereavila.fundamentoskotlin

fun main(){

    sayHello("Colecciones")
    sayHello("recuerda que solo es de lectura")
    val frutList = listOf<String>("manzana", "banana","uva","tuna")
    println(frutList.get((0..frutList.size-1).random()))
    println("Index de uva: ${frutList.indexOf("uva")}")
}