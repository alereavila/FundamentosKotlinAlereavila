package com.alereavila.fundamentoskotlin.IntermedioHerenciaInterfaces
//para utilizar la herencia y las interfaces
open class Person (name:String ,edad :Int) : Work (), Game{
    //cualquier clase tiene una clase común llamada Any
    open fun work () {
        //println("Esta persona está trabajando")
    }
//a la de afuerza se debe de sobreescribir osea te obliga a implementar fun métodos
    override fun goToWork() {
        //TODO("Not yet implemented")
        println("Esta persona puede trabajar")
    }

    override val game: String
        get() = "Un juego de MODA"
//Es lo mismo que lo de arriba
//    override val game: String = "Un juego de MODA"

    override fun play() {
        println("Comenzó a jugar $game")
    }

}