package com.higortavares.designpatterns.flyweight

class FoodFactory {

    companion object {

        var cacheOfFood: MutableMap<String, Food> = mutableMapOf()

        fun getFood(name: String, price: Int, description: String): Food {
            val key = "$name-$price-$description"
            return if (cacheOfFood.containsKey(key)) cacheOfFood[key]!! else
            {
                val food = Food(name, price, description)
                cacheOfFood[key] = food
                return food
            }
        }
    }
}