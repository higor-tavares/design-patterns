package com.higortavares.designpatterns.builder

import java.time.LocalDateTime
import java.util.UUID

class SimpleOrder {
    val id: UUID = UUID.randomUUID()
    var products: MutableList<Product> = mutableListOf<Product>()
    lateinit var client: Person
    lateinit var paymentMethod: PaymentMethod
    val createdAt: LocalDateTime? = LocalDateTime.now()
}