package com.higortavares.designpatterns.state

class Finished: State {
    override fun nextState() {
       println("This is the end!")
    }
}