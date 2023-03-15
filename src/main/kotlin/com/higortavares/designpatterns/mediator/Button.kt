package com.higortavares.designpatterns.mediator

class Button {

    private lateinit var mediator: WindowManager

    private var state = false

    fun setMediator(mediator: WindowManager) {
        this.mediator = mediator
    }
    fun disable() {
        if(!this.state) return
        this.state = false
    }
    fun enable() {
        this.state = true
    }
    fun submit() {
        mediator?.clearInputs()
    }

    fun getStatus() : String {
        return if(this.state) "ENABLED" else "DISABLED"
    }
}