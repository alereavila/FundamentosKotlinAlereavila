package com.alereavila.fundamentoskotlin.IntermedioHerenciaInterfaces

import java.text.SimpleDateFormat
import java.util.*
//con ? le indicamos que puede ser null
//puede llegar un null y regresar un null
fun Date?.customDate():String ? {
    val formatter=SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ",Locale.getDefault())
    if(this==null){
        return null
    }else{
        return formatter.format(this)
    }

}
//se puede extenderpropiedades
//como puede regresar un null customDate() se le pone el ? y como length debe de regresar algo se hace esto ?: 0
//para que no falle
val Date?.formatSize:Int
get() = this.customDate()?.length ?: 0