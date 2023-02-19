package com.higortavares.designpatterns.decorator

class DatabaseMethod(objectName: String) : Method(objectName) {
    override fun execute() {
        println("Saving $objectName on database ...")
        println("Successfully saved!")
    }
}