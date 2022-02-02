package com.alereavila.fundamentoskotlin.IntermedioClasesNESTEDINNER

class MyNestedAndInnerClass {
    //Clase Anidada ( Nested Class)
    private val One = 1
    fun sumBasica():Int{
        return 10
    }
    class  MyNestedClass {

        fun sum (first: Int, second: Int):Int{
            return first+ second
        }
    }
    inner class MyInnerClass{
        fun sumOne (number: Int) : Int{
            return number + One +sumBasica()
        }
    }
}