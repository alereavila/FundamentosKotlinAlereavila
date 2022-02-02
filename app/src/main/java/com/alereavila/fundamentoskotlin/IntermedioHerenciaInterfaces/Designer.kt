package com.alereavila.fundamentoskotlin.IntermedioHerenciaInterfaces

class Designer(name:String ,val edad :Int,val softwares: Array<SoftwareClase>) : Person(name, edad)  {
    override fun work() {
        //super.work()
        println("Esta persona está diseñando")
    }
    fun sayDisenandoEn (){
        println("A la edad de $edad empezó a diseñar en: ")
        for (d in softwares){
            println(d)
        }
    }
}