package com.higortavares.designpatterns.state

import org.junit.jupiter.api.Test

class StateTest {

    @Test
    fun test() {
        val context = Context()
        val created = Created()
        context.setState(created)
        context.nextState()
        context.setState(Approved())
        context.nextState()
        context.setState(Finished())
        context.nextState()
    }
}