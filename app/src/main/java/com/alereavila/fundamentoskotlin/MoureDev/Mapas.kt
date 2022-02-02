package com.alereavila.fundamentoskotlin.MoureDev

fun main (){
    //Se llaman mapas o diccionarios
    //debe de tener clave y valor
    var myMap : Map <String,Int> = mapOf()
    println(myMap)
    myMap = mapOf("aVILA" to 1)
    println(myMap)
    myMap= mapOf("rea" to 2)
    println(myMap)
    //si queremos añadir elementos sin destruir al map original
    //se tiene que crear un mutable Map, no se debe declarar como MAP
    //var myMapMutable:Map = mutableMapOf("Nombre" to 3,"edad" to 4)
    var myMapMutable = mutableMapOf("Nombre" to 3,"edad" to 4)
    myMapMutable["apellido"]=7
    myMapMutable.put("()L",5)
    println(myMapMutable)

    val map  = mutableMapOf<Int, Any?>()
    println("map.isEmpty() is ${map.isEmpty()}") // true

    map[1] = "x"
    map[2] = 1.05
// Now map contains something:
    println(map) // {1=x, 2=1.05}

    //Acceder a datos
    println(map[1])
    //eliminar datos
    map.remove(2)
    println(map)

}