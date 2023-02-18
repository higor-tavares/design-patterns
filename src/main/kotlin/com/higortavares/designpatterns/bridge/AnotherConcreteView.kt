package com.higortavares.designpatterns.bridge

 class AnotherConcreteView(windowManager: WindowManager) : View(windowManager) {
     override fun draw() {
         windowManager.drawSqueare()
     }

     override fun reset() {
         windowManager.setBackground()
         windowManager.newMethod()
     }
 }