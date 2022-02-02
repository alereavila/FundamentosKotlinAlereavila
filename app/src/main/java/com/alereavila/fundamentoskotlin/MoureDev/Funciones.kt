package com.alereavila.fundamentoskotlin.MoureDev

fun main (){
    sayhellow()
    decirNombre("Alejandro")
    decirNombreEdad("Alex", 32)
    println(8+ operacionesMatematicas(8,7))
}
//función simple
fun sayhellow (){
    println("SAY HELLO")
}
//funcion parametro de entrada
fun decirNombre (nombre:String){
    println("Mi nombre es $nombre")
}
fun decirNombreEdad (nombre:String, edad :Int){
    println("Mi nombre es $nombre y tengo $edad años")
}

//funciones con retorno
fun operacionesMatematicas(numero1:Int, numero2:Int):Int{
    return numero1+numero2
}