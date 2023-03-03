package com.higortavares.designpatterns.proxy

open class UserDBImpl : UserDB{
    private var connected = false

    fun getConnection () {
        if (connected) return
        println("connecting to database...")
        Thread.sleep(3000L)
        println("successfully connected!")
        var connected = true
    }

    override fun getUser() : User {
        return User("Username", 31)
    }
}