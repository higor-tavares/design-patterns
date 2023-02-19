package com.higortavares.designpatterns.decorator

abstract class Method(public val objectName: String) {

    abstract fun execute(): Unit
    fun printItSelf() : Unit{
        println(objectName)
    }
}