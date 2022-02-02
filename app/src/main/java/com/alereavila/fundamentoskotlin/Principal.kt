package com.alereavila.fundamentoskotlin

 fun main (){
    print("Hola Kotlin\n")
     nuevoTema("Variables y constantes")
     //constante
     val a= 2
     println("Voy a imprimir la constante a $a")

    //variable
    var b=8
     b=9
     //definicion del tipo
     var c: Int=5

     //la variable puede contener un dato nulo
    var objNull:String?
    objNull=null
     println(objNull)
    //declarar una variable como ANY
     var objAny : Any ?
     objAny = 6.34567834567
     println(objAny)


 }

fun nuevoTema(topic:String){
println("Se está llamando desde otro archivo $topic")
}