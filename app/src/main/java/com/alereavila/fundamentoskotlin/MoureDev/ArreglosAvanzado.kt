package com.alereavila.fundamentoskotlin.MoureDev

import com.alereavila.fundamentoskotlin.sayHello

fun main (){
    val nombre = "Carlos"
    val apellido= "Avila"
    val edad = "32"
    val company = "Everis"
    sayHello("Como se declara un array")
    sayHello("val myArray  = arrayListOf<String>()")
val myArray  = arrayListOf<String>()
    //Añadir
    sayHello("Añadir datos uno por uno ")
    myArray.add(nombre)
    myArray.add(apellido)
    myArray.add(edad)
    myArray.add(company)
    myArray.add(nombre)
    myArray.add(apellido)
    myArray.add(edad)
    myArray.add(company)
    println(myArray)
    sayHello("Añadir un conjunto de datos")
    myArray.addAll(listOf("añadir","mas","datos","con","addAll"))
    println(myArray)
    sayHello("Modifica algún dato del array")
    println(myArray)
    myArray[3]="Dato modificado"
    println(myArray)
    sayHello("Remover datos")
    myArray.removeAt(3)
    println(myArray)

    sayHello("Recorrer el arreglo con un foreach ")
    myArray.forEach { print(it + " ") }
    println()
    sayHello("operaciones para array")
    println(myArray.count())
    println(myArray.clear())
    println(myArray)


}