package com.alereavila.fundamentoskotlin.clases

open class Phone (protected val number: String){

    fun call (){
        println("Llamando...")
    }
    open fun showNumber(){
        println(number)
    }
}