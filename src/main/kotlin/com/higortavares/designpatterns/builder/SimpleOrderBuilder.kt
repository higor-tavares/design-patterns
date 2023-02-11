package com.higortavares.designpatterns.builder

class SimpleOrderBuilder: OrderBuilder() {

    private val simpleOrder = SimpleOrder()

    override fun addProduct(product: Product) {
        simpleOrder.products.add(product)
    }

    override fun addClient(person: Person) {
        simpleOrder.client = person
    }

    override fun setPaymentMethod(paymentMethod: PaymentMethod) {
        simpleOrder.paymentMethod = paymentMethod
    }

    override fun get(): Any {
        return simpleOrder
    }
}