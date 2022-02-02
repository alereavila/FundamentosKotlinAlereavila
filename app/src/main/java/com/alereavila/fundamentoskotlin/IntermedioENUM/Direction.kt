package com.alereavila.fundamentoskotlin.IntermedioENUM
// no es necesario recibir dir esto ayudaría en robótica

enum class Direction ( val dir : Int){
    North (1), South(-1), East(1), West(-1);

    fun description (): String{
        return when (this){
           North-> "La direccion es norte"
            South-> "La direccion es sur"
            East-> "La dirección es este"
            West-> "La dirección es oeste"
            else -> "No sabemos la dirección"
        }
    }

    }

