package com.higortavares.designpatterns.`template-method`

import org.junit.jupiter.api.Test

class TemplateMethodTest {
    @Test
    fun testIfood() {
        val deliveryHandler = IfoodDeliveryHandler()
        deliveryHandler.exec()
    }

    @Test
    fun testChurrascaria() {
        val deliveryHandler = ChurrascariaDeliveryHandler()
        deliveryHandler.exec()
    }
}