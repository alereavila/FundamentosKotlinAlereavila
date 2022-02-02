package com.alereavila.fundamentoskotlin.IntermedioHerenciaInterfaces

import android.R
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

typealias nombredelAlias = MutableMap<Int,ArrayList<String>>
fun main (){
    val persona = Person("Sara", 18)
    persona.work()
    persona.goToWork()
    val programador =Programmer  ("Alejandro",32, arrayOf(LenguajesClase.Kotlin,LenguajesClase.Java,LenguajesClase.C))
    programador.work()
    programador.sayLenguajesHerencia()
    programador.goToWork()
    //println("El programador conoce los siguientes lenguajes ${programador.sayLenguajes()}")
    val disenador = Designer ("Silvia", 30, arrayOf(SoftwareClase.Autocad,SoftwareClase.SolidWorks))
    disenador.work()
    disenador.sayDisenandoEn()
    disenador.goToWork()

    //utilizando interfaces
    val gammer = Person("UnGammer", 16)
    gammer.play()

    val alejandro = Worker("Charly",50, "Programados")
    //en data class se puede usar el equals y hashcode
    val silvia= Worker()
    val erik = Worker()
    //componeneteN destructuracion
    val (a,b)=alejandro
    println(a)
    println(b)
//tema nuevo type alias
    //esta variable es compleja y se puede sustituir por un typealias
    //debe de ser global
    var myMap:MutableMap<Int,ArrayList<String>>  = mutableMapOf()
    var myNewMap :nombredelAlias = mutableMapOf()
    myNewMap[1]= arrayListOf("ALVAREZ", "AVILA")
    myNewMap[2]= arrayListOf("BERNAL","BRAIS")
    myNewMap[3]= arrayListOf("CHAVEZ","CORRAL")
    //es la misma variable compleja
    myMap = myNewMap
    println(myMap)
    //destructuracion, se puede usar cuando la variable o la funcion tiene el component
    for (elemento in myMap){
        println(elemento)
    }
    //forma de destructuracion
    for ((id,apellidos) in myMap){
        println("$id -- $apellidos")
    }
//aqui instanciamos un objeto complejo de tipo Date donde podemos utilizar
    //la extension de la clase Date
    val fecha = Date()
    //se utiliza la funcionalidad creada en el archivo Extensions
    println(fecha.customDate())
    println(fecha.formatSize)
    var dateNulleable:Date?=null
    println(dateNulleable?.customDate())
    println(dateNulleable.formatSize)

    //Lamdas
    println("Lambdas")
    val  myIntList = arrayListOf<Int>(0,1,2,3,4,5,6,7,8,9,10)

    val myfilterIntList=myIntList.filter {
        it<5
    }
    println(myfilterIntList)
    //tambien se puede hacer así y para comprender el ir
    //siempre se regresa la ultima linea de un lamda en este caso el myInt>2
    //pero hay excepciones por ejemplo con ese if
    val filtradoMyIntList=myIntList.filter { myInt->
        if(myInt==1){
            //osea que si regresara el 1 porque lo vuelve true
            return@filter  true
        }
    myInt>6
    }
    println(filtradoMyIntList)

    //una manera de hacerlo
    val mySumFun=fun (x:Int,y:Int):Int{
        return x+y
    }
    //otra manera de hacerlo
    val myMultFun=fun(x:Int,y:Int):Int=x*y
    println("llamndo a una funcion compleja ${myComplexFun(6,12,mySumFun)}")
    println(myComplexFun(6,10,myMultFun))

    //sobreescribiendo la funcion o creando lamdas
    myComplexFun(10,4,){x,y->
    x-y
    }

    myAsyncFun("Alejandro"){
        println("${it} el print del la funcion Asyncrona")
    }

}
//la declaracion de una funcion compleja
//primero declaramos otras funciones las que sean
private fun myComplexFun (x:Int, y:Int, cualquierFuncion:(Int,Int)->Int):Int{
    return cualquierFuncion(x,y)
}
//funciones asincronas
private fun myAsyncFun (nombreIsincronFun:String, unaFuncion:(String)->Unit){
    val myNewString="Hello $nombreIsincronFun"
    for (z in 0..15 step 3){
        print("${z}-")

    }
    //inicializa un hilo
    thread {
        Thread.sleep(8000)

        unaFuncion(myNewString)
    }
}
