package com.higortavares.designpatterns.bridge
//RefinedAbstraction
class ConcreteView(windowManager: WindowManager) : View(windowManager) {
    override fun draw() {
        windowManager.drawPoligon()
    }

    override fun reset() {
        windowManager.setBackground()
        windowManager.drawSqueare()
    }
}