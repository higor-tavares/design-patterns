package com.higortavares.designpatterns.decorator

class TransactionDecorator(method: Method, objectName: String) : MethodDecorator(method, objectName) {
    override fun execute() {
        println("Open transaction...")
        method.execute()
        println("Transaction committed!")
    }
}