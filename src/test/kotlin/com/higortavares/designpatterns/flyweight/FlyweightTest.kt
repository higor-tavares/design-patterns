package com.higortavares.designpatterns.flyweight

import org.junit.jupiter.api.Test

class FlyweightTest {

    @Test
    fun test() {
        val foodName = "Salada de alface"
        val price = 500
        val description = "Salada de alface com tomate e cebola"
        val foodName2 = "Torta de frango"
        val price2 = 1000
        val description2 = "Torta de frango com milho e azeitona"
        val order1 = Order("Paulo Higor", FoodFactory.getFood(foodName, price, description))
        val order2 = Order("Ana Clara", FoodFactory.getFood(foodName, price, description))
        val order3 = Order("Ana Clara", FoodFactory.getFood(foodName2, price2, description2))
        println(order1)
        println(order2)
        println(order3)
        FoodFactory.cacheOfFood.entries.forEach { it -> println(it.value) }
    }
}