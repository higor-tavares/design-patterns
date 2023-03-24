package com.higortavares.designpatterns.`template-method`

class IfoodDeliveryHandler: FoodDeliveryHandler() {
    override fun executePayment() {
       println("Pagamento pelo APP...")
    }

    override fun deliver() {
        println("Entrega via Ifood...")
    }
}