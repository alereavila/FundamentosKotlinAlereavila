package com.alereavila.fundamentoskotlin.IntermedioHerenciaInterfaces
// para poder usar las variables que trae el constructor hay que ponerle val
class Programmer(val name:String ,val edad :Int,var arraylenguaje:Array<LenguajesClase>) : Person(name, edad) {
//lenguajesProgramacion: Array<LenguajesClase>
    override fun work() {
        //super.work()
        println("$name está programando ")
    }
    fun sayLenguajesHerencia (){
        println("Tiene experiencia en :")
        for (l in arraylenguaje){
            println(l)
        }
    }
}