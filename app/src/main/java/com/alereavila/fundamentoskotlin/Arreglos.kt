@file:Suppress("UNUSED_LAMBDA_EXPRESSION")

package com.alereavila.fundamentoskotlin

fun main(){

    sayHello("Arreglos")
    showPersons("Ale", "Sil", "Dante")
    showPersons("arreglo","numero", "1", "funciona","bien","pero vayase a la verga")

}
fun showPersons(p1:String, p2:String, p3:String){
println(p1)
    println(p2)
    println(p3)
}
//recibe un arreglo
fun showPersons(vararg arrayPersons:String){

    sayHello("Bucles for")
    for (person in arrayPersons) {
        println(person)
    }
    sayHello("Bucle while")
    var indice=0
    while (indice<arrayPersons.size){
        println(arrayPersons[indice])
        indice++
    }
    sayHello("Sentencia when")
    //esto es un rango
    var i =0
    while (i<100){

        indice=(0..arrayPersons.size-1).random()
        when(arrayPersons[indice]){
            "funciona"-> {
                println("encontró el funciona ")}
            "pero vayase a la verga"-> {
                println("el when es como un switch")
            }else -> {println("No cayó")}

        }
        //else -> println(i)
        i++
    }

}