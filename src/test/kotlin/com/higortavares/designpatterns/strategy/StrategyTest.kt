package com.higortavares.designpatterns.strategy

import org.junit.jupiter.api.Test

class StrategyTest {

    @Test
    fun test() {
        val payment1 : PaymentMethod = Card()
        val payment2: PaymentMethod = PIX()
        val value = 10000
        println("CARD STRATEGY:")
        payment1.pay(value)
        println("PIX STRATEGY:")
        payment2.pay(value)
    }
}