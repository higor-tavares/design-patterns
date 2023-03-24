package com.higortavares.designpatterns.`template-method`

class ChurrascariaDeliveryHandler: FoodDeliveryHandler() {
    override fun executePayment() {
        println("Pagamento via maquineta ou dinheiro")
    }

    override fun deliver() {
       println("O entregador saiu para rota")
    }

    override fun beforeAll() {
        println("Enviando mensagem de agradecimento...")
    }
}