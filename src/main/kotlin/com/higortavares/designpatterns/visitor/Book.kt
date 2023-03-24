package com.higortavares.designpatterns.visitor

class Book(name: String, price: Int) : Product(name, price) {

    override fun getFinalPrice(visitor: TaxVisitor): Int {
        return visitor.calcBookFinalPrice(this.price)
    }
}