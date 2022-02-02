package com.alereavila.fundamentoskotlin.IntermedioHerenciaInterfaces
//una interfaz no puede contener constructores por eso no tiene parentesis
interface Game {
    //solo debe de declararse
    val game : String

    fun play ()

    fun stream (){
        println("Estoy haciendo stream de $game")
    }
}