package com.higortavares.designpatterns.decorator

class LogDecorator(method: Method, objectName: String) : MethodDecorator(method, objectName) {
    override fun execute() {
        println("Will excute method...")
        method.execute()
        println("It is like an Aspect")
    }
}