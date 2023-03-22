package com.higortavares.designpatterns.strategy

class PIX: PaymentMethod {
    private val fee = 0
    override fun pay(amountInCents: Int) {
        val amount = amountInCents/100.0
        val finalAmount = amount + (amountInCents/100.0 * fee/100.0)
        println("Original amount: R$ $amount")
        println("Fee $fee%")
        println("Final amount: R$ $finalAmount")
    }
}