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
    @Test
    fun testWindowInAnotherView() {
        val view : View = AnotherConcreteView(WindowManagerImpl())
        view.draw()
        view.reset()
    }
    @Test
    fun testDarkWindowInAnotherView() {
        val view : View = AnotherConcreteView(DarkWindowManagerImpl())
        view.draw()
        view.reset()
    }
}