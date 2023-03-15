package com.higortavares.designpatterns.mediator

class WindowManager(private val button: Button, private val inputs: List<InputText>) {

    fun enableButton() {
        this.button.enable()
    }
    fun disableButton() {
        this.button.disable()
    }
    fun clearInputs() {
        this.inputs.forEach(InputText::clear)
    }
}