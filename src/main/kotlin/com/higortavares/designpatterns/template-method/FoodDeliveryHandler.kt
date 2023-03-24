package com.higortavares.designpatterns.`template-method`

abstract class FoodDeliveryHandler {
    abstract fun executePayment()
    abstract fun deliver()
    open fun beforeAll() {}

    fun exec() {
        beforeAll()
        executePayment()
        deliver()
    }
}