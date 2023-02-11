package com.higortavares.designpatterns.builder

import org.junit.jupiter.api.Test
import java.util.*

class BuilderTest {

    @Test
    fun testSimpleOrder() {
        val person = Person("Paulo", "Rua 41, 1410", "858828282")
        val paymentMethod = PaymentMethod.PIX
        val products = listOf(
            Product(UUID.randomUUID(), "Teste 1", "Teste 1.1", 1800),
            Product(UUID.randomUUID(), "Teste 2", "Teste 2.2", 2489)
        )

        val director = Director(SimpleOrderBuilder())
        val order : SimpleOrder = director.createInstance(person, products, paymentMethod) as SimpleOrder
        println("Cliente: ${order.client.name}, Pagamento: ${order.paymentMethod}, Produtos: ${order.products.joinToString { it -> it.name }}")
    }

    @Test
    fun testSignatureOrder() {
        val person = Person("Paulo", "Rua 41, 1410", "858828282")
        val director = Director(SignatureOrderBuilder())
        val order: SignatureOrder = director.createInstance(person) as SignatureOrder
        println("Cliente: ${order.person.name}")
    }
}