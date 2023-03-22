package com.higortavares.designpatterns.state

class Created: State {
    override fun nextState() {
        println("The next state is APPROVED")
    }
}