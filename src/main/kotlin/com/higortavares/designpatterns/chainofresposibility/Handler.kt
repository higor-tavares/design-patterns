package com.higortavares.designpatterns.chainofresposibility

data class Request(val email: String, val password: String, val role: String)

abstract class Handler {

    var next: Handler? = null;

    open fun handle(request: Request) {
        next?.handle(request)
    }

    fun addHandle(next: Handler) {
        this.next = next
    }
}