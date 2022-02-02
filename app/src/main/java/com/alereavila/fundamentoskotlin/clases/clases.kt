package com.alereavila.fundamentoskotlin.clases

import com.alereavila.fundamentoskotlin.sayHello
import com.alereavila.fundamentoskotlin.simbolo

fun main (){
    sayHello("Clases")
    val phone : Phone = Phone("5528632681")
    phone.call()
    phone.showNumber()

    sayHello("Herencia Recuerda que debes de heredar con 'open'")
    val smartPhone=SmartPhone("5553704816",true)
    smartPhone.call()
    smartPhone.showNumber()

    sayHello("Data class para un correcto 'MODELO DE DATOS'")
    val myUser = User(1,"Carlos Alejandro", "Avila Rea", Group.FAMILY.ordinal)
    println("como ya es data class tiene a ccesos a otros métodos propios del manejo de datos")
    println(myUser.component1())
    println(myUser)

    val brother=myUser.copy(2,name = "Erik")
    println(brother)

    sayHello("Funciones de alcance")
    with(smartPhone){
        println("es privado $isPrivate")
        call()
    }

}