package com.higortavares.designpatterns.mediator

class InputText(var text: String) {

    private lateinit var mediator: WindowManager

    fun setMediator(mediator: WindowManager) {
        this.mediator = mediator
    }

    fun clear() {
        this.text = ""
        mediator?.disableButton();
    }

}