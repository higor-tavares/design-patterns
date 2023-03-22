package com.higortavares.designpatterns.strategy

interface PaymentMethod {
    fun pay(amount: Int) : Unit
}