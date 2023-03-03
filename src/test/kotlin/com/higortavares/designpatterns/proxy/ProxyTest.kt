package com.higortavares.designpatterns.proxy

import org.junit.jupiter.api.Test

class ProxyTest {
    @Test
    fun testLazy() {
        val lazy = LazyUserService()
        val user = lazy.getUser()
        print(user)
    }
    @Test
    fun testLazyWithoutGet() {
        LazyUserService()
    }
    @Test
    fun testEagly() {
        val eagly = EaglyUserDB()
        val user = eagly.getUser()
        print(user)
    }
    @Test
    fun testEaglyWithoutGet() {
        EaglyUserDB()
    }
}