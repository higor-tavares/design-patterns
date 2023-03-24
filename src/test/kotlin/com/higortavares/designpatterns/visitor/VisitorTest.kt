package com.higortavares.designpatterns.visitor

import org.junit.jupiter.api.Test

class VisitorTest {

    @Test
    fun test() {
        val game = Game("The last of US", 10000)
        val book = Book("The lord of rings", 4000)
        val phone = Eletronic("Iphone 12 Pro MAX", 500000)
        val products = listOf(game, book, phone)
        products.forEach {
            println("The product ${it.name} final price is R$ ${it.getFinalPrice(BrazilTaxVisitor())/100.0}")
        }
        }
    }
