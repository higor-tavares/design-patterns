package com.higortavares.designpatterns.builder

abstract class OrderBuilder {

    abstract fun addProduct(product: Product) : Unit
    abstract fun addClient(person: Person) : Unit
    abstract fun setPaymentMethod(paymentMethod: PaymentMethod) : Unit
    abstract fun get() : Any
}