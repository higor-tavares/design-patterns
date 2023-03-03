package com.higortavares.designpatterns.proxy

class EaglyUserDB: UserDB{
    private val concreteUserDB = UserDBImpl()
    init {
        concreteUserDB.getConnection()
    }
    override fun getUser(): User {
        return concreteUserDB.getUser()
    }
}