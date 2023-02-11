package com.higortavares.designpatterns.builder

import java.util.UUID

class SignatureOrderBuilder: OrderBuilder() {

    private val signatureOrder = SignatureOrder()

    override fun addProduct(product: Product) {
        print("do nothing")
    }

    override fun addClient(person: Person) {
        signatureOrder.person = person
    }

    override fun setPaymentMethod(paymentMethod: PaymentMethod) {
        print("do nothing")
    }

    override fun get(): Any {
        return signatureOrder
    }
}