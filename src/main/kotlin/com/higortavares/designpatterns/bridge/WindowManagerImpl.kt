package com.higortavares.designpatterns.bridge
//ConcreteImplementor
class WindowManagerImpl : WindowManager() {
    override fun drawSqueare() {
        println("Drawing a square")
    }

    override fun setBackground() {
        println("Set white background")
    }

    override fun drawPoligon() {
        println("Drawing a poligon")
    }

    override fun newMethod() {
        println("You called a new method bro!")
    }
}