package com.alereavila.fundamentoskotlin

import java.util.*
import kotlin.math.abs
//contante global
//el const se asigna en tiempo de compilacion y no en tiempo de ejecucion como en val
const val simbolo ="======"
fun main(){

    sayHello("Llamar función de otra clase")
    nuevoTema(", es una función publica y \ncualquier clase puede acceder")
    //laSuma(8,8.741852963)
    //laResta(5,4.36)
    sayHello("Funciones")
    println("Aqui imprimiré la suma ${laSuma(8,9.78451)}")
    sayHello("Funciones con igualación sencilla ")
    println("La resta en la funcion definida es ${laResta(8,987.35152212)}")

    val c=-80
    sayHello("Funcion INFIX")
    println("${c.funcionPersonalizada(false)}")

    sayHello("SobreCarga de métodos")
    showProduct("Chesco")
    showProduct("Pan", "Carisimo")


}

fun laResta(c:Int, d:Double):Any =c-d

private fun laSuma(a:Int,b:Double) : Any{
    return a+b
}

//unicamente disponible a esta clase
fun sayHello(tema:String) {
    println("$simbolo Tema Nuevo: $tema$simbolo")
}
//Termino INFIX para llamar de otras clases
//solo podemos pasar un solo parametro
infix fun Int.funcionPersonalizada (parBooleano:Boolean)= abs(this)

fun showProduct (nombre : String){
    println("El nombre del producto es: $nombre")
}
fun showProduct(nombre : String, caracteristica:String){
    println("Aqui estamos utilizando la otra funcion y comprobando la SOBRECARGA \n" +
            "El nombre del producto es: $nombre y esta $caracteristica")
}