package com.alereavila.fundamentoskotlin.Modificadores

class Visibility {
    var nombre :String? = null
    private var apellido : String? = null
    fun diMiNombre(){
        nombre?.let {
            println("Mi nombre es $it")
        }?: run {
            println("No tengo nombre :(")
        }
    }
    fun diMiApellido(){

    }
}