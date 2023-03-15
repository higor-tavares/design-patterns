package com.higortavares.designpatterns.mediator

import org.junit.jupiter.api.Test

class MediatorTest {

    @Test
    fun test() {

        var submitButton = Button()
        var login = InputText("user@gmail.com")
        var password = InputText("*******")
        var formManager = WindowManager(submitButton, listOf(login, password))

        submitButton.setMediator(formManager)
        login.setMediator(formManager)
        password.setMediator(formManager)

        formManager.enableButton()

        println("The button is ${submitButton.getStatus()}")
        println("Login input: ${login.text}")
        println("Password input: ${password.text}")

        submitButton.submit()

        println("The button is ${submitButton.getStatus()}")
        println("Login input: ${login.text}")
        println("Password input: ${password.text}")
    }
}