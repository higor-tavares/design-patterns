package com.higortavares.designpatterns.bridge

import org.junit.jupiter.api.Test
//Client
class BridgeTest {
    @Test
    fun testWindow() {
        val view : View = ConcreteView(WindowManagerImpl())
        view.draw()
        view.reset()
    }
    @Test
    fun testDarkWindow() {
        val view : View = ConcreteView(DarkWindowManagerImpl())
        view.draw()
        view.reset()
    }
}