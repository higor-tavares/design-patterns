package com.higortavares.designpatterns.proxy

class LazyUserService : UserDB {

    private val concreteUserDB = UserDBImpl()

    override fun getUser(): User {
        concreteUserDB.getConnection()
        return concreteUserDB.getUser()
    }

}