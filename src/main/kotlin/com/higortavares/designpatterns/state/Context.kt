package com.higortavares.designpatterns.state

class Context: State {

    private lateinit var state: State

    fun setState(state: State) {
        this.state = state
    }

    fun getState() : State {
        return this.state
    }

    override fun nextState() {
        this.state.nextState()
    }
}