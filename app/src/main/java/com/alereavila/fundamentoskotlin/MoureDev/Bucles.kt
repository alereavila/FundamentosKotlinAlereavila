package com.alereavila.fundamentoskotlin.MoureDev

import com.alereavila.fundamentoskotlin.sayHello
import kotlin.io.println as println

fun main (){
    val myArray  = arrayListOf<String>("COCA","NESTLE","LALA","ALPURA","PEPSI","CORONA")

    var myMapMutable = mutableMapOf("Nombre" to 3,"Apellido" to 2 ,"edad" to 4,"codigo" to 5)

    //For
    sayHello("Bucle For")
    for (myString in myArray){
        print("$myString - ")
    }

    println()
    for (myElementMap  in myMapMutable){
        println("${myElementMap.key}--${myElementMap.value}")
    }
    for(x in -2..10){
        println(x)
    }
    for(y in 0  until 10){
        println(y)
    }
    sayHello("For con step")
    for (z in 0..20 step 3){
        println(z)
    }
    sayHello("For en forma descendente ")
    for (a in 40 downTo 0 step 4){
        println(a)
    }

    val myNumericArray:IntRange = (0..20)
    for (i in myNumericArray){
        println("$i "+ myNumericArray)
    }
    sayHello("Bucle while")
    var x=0
    while (x<10){
        println(x)
        x++
    }

}