package com.higortavares.designpatterns.state

class Approved: State {
    override fun nextState() {
        println("The next state is FINISHED")
    }
}