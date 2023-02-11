package com.higortavares.designpatterns.builder

class Director(private val builder: OrderBuilder) {

    fun createInstance(person: Person, products: List<Product>? = null, paymentMethod: PaymentMethod? = null) : Any {
        builder.addClient(person)
        products?.map { it -> builder.addProduct(it)}
        paymentMethod?.let {builder.setPaymentMethod(paymentMethod) }
        return builder.get()
    }
}