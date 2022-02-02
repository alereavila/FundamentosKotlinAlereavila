package com.alereavila.fundamentoskotlin.MoureDev

public class Programmer (val name:String, val edad:Int, val lenguajes : Array<claseLenguaje>, val friends : Array<Programmer> ? = null ) {


    //con esto evito errores solo puedo llamar los lenguajes contenidos en la claseLenguaje
    enum class claseLenguaje{
        KOTLIN,
        SWIFT,
        JAVA,
        C
    }


    fun code (){
        for (lenguaje in lenguajes)
            println("Estoy programando en ${lenguaje}")
    }

}