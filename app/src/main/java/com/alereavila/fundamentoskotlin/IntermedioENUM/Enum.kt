package com.alereavila.fundamentoskotlin.IntermedioENUM

fun main (){

var userDirection : Direction ? = null
 println("Direccion $userDirection")
userDirection = Direction.East
    println("Propiedad name: ${userDirection.name}")
    println("Propiedad ordinal: ${userDirection.ordinal}")
    //ya se puede acceder a la función description
    println("también se pueden llamar funciones o comportamientos dentro de las clases enum --${userDirection.description()}--")
}