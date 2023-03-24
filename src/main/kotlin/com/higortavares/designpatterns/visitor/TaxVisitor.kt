package com.higortavares.designpatterns.visitor

interface TaxVisitor {
    fun calcBookFinalPrice(originalPrice: Int) : Int
    fun calcGameFinalPrice(originalPrice: Int) : Int
    fun calcEletronicFinalPrice(originalPrice: Int) : Int
}