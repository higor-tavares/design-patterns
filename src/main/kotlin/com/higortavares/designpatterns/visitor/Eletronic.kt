package com.higortavares.designpatterns.visitor

class Eletronic(name: String, price: Int) : Product(name, price) {

    override fun getFinalPrice(visitor: TaxVisitor): Int {
        return visitor.calcEletronicFinalPrice(this.price)
    }
}