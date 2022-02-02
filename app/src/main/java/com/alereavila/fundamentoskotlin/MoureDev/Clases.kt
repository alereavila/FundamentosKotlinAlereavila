package com.alereavila.fundamentoskotlin.MoureDev

fun main (){
    val alejandro = Programmer("Alejandro" , 32 , arrayOf(Programmer.claseLenguaje.KOTLIN,Programmer.claseLenguaje.C),null )
    println(alejandro.name)
    for (e in alejandro.lenguajes){
        println(e)
    }
    //println(alejandro.code())

    val hugo = Programmer("Hugo" , 32 , arrayOf(Programmer.claseLenguaje.KOTLIN), arrayOf(alejandro) )
println(hugo.name)
println("El amigo de ${hugo.name} es ${hugo.friends?.first()?.name}")

}