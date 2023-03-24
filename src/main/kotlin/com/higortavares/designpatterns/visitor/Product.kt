package com.higortavares.designpatterns.visitor

abstract class Product(val name: String, val price: Int){
    abstract fun getFinalPrice(visitor: TaxVisitor) : Int
}