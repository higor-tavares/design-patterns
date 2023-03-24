package com.higortavares.designpatterns.visitor

class BrazilTaxVisitor: TaxVisitor {

    override fun calcBookFinalPrice(originalPrice: Int): Int {
        return originalPrice + (originalPrice * 0.1).toInt()
    }

    override fun calcGameFinalPrice(originalPrice: Int): Int {
        return originalPrice + (originalPrice * 0.3).toInt()
    }

    override fun calcEletronicFinalPrice(originalPrice: Int): Int {
        return originalPrice + (originalPrice * 0.25).toInt()
    }
}