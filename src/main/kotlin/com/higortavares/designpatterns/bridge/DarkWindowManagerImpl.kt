package com.higortavares.designpatterns.bridge
//ConcreteImplementor
class DarkWindowManagerImpl: WindowManager() {
    override fun drawSqueare() {
        println("Drawing a square")
    }

    override fun setBackground() {
        println("Set dark background")
    }

    override fun drawPoligon() {
        println("Drawing a poligon")
    }

    override fun newMethod() {
        //Do nothing
    }
}