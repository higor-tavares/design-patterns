package com.higortavares.designpatterns.facade

import org.junit.jupiter.api.Test

data class User(val name: String)

class FacadeTest {

    @Test
    fun testFacade() {
        val service = UserService()
        service.saveUser(User("test"), byteArrayOf())
    }
}