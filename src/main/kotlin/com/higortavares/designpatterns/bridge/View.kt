package com.higortavares.designpatterns.bridge
//Abstraction
abstract class View (val windowManager: WindowManager){
    abstract fun draw();
    abstract fun reset();
}