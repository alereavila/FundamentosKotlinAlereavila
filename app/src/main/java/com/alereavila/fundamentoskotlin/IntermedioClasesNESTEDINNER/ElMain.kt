package com.alereavila.fundamentoskotlin.IntermedioClasesNESTEDINNER

fun main (){
//se instancia la nested class
    val myNestedClass = MyNestedAndInnerClass.MyNestedClass ()
    val sum = myNestedClass.sum(4,5)
    println("Desde la nested class; no es necesario declararla $sum")
    //se instancia la inner class
    val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
    val sumTwo : Int = myInnerClass.sumOne(5)
    println("Desde adentro de la inner class, si es necesario declarar la inner class" +
            "\nesto para poder usar variables o funciones de la clase principal $sumTwo")
}