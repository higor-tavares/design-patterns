package com.higortavares.designpatterns.prototype

class HttpConnection(var url: String, var port: Int) : Prototype() {

    override fun copy(): Prototype {
        return  HttpConnection(url, port)
    }

}