package com.higortavares.designpatterns.iterator

import com.higortavares.designpatterns.iterrator.ListArray
import org.junit.jupiter.api.Test

class IterratorTest {

    @Test
    fun test(){

        val lista = ListArray()

        lista.add("Primeiro")
        lista.add("Segundo")
        lista.add("Terceiro")
        lista.add("Quarto")
        lista.add("Quinto")

        val iterator = lista.getIterator()

        while(iterator.hasNext()) {
            println(iterator.next())
        }
    }

    @Test
    fun tset(){
        val lista = ListArray(inverted = true)

        lista.add("Primeiro")
        lista.add("Segundo")
        lista.add("Terceiro")
        lista.add("Quarto")
        lista.add("Quinto")

        val iterator = lista.getIterator()

        while(iterator.hasNext()) {
            println(iterator.next())
        }
    }
}