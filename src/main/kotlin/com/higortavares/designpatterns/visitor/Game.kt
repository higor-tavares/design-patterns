package com.higortavares.designpatterns.visitor

class Game(name: String, price: Int) : Product(name, price) {

    override fun getFinalPrice(visitor: TaxVisitor): Int {
        return visitor.calcGameFinalPrice(this.price)
    }
}