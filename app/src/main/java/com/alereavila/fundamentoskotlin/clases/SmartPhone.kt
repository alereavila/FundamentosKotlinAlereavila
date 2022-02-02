package com.alereavila.fundamentoskotlin.clases

class SmartPhone (number:String, val  isPrivate:Boolean):Phone(number) {

    override fun showNumber() {
        if(isPrivate){
            println("DESCONOCIDO ")

        }else{
            super.showNumber()
        }
    }
}