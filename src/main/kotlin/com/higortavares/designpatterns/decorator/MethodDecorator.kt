package com.higortavares.designpatterns.decorator

abstract class MethodDecorator(val method: Method, objectName: String) : Method(objectName) {
}