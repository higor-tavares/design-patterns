package com.higortavares.designpatterns.observer

import org.junit.jupiter.api.Test

class TestObserver {

    @Test
    fun test1() {
        var input = InputText("Olá mundo!")
        var anotherInput = InputText("Outro input")
        var subject = Subject()
        subject.subscribe(input, anotherInput)
        println("Input 1 : ${input.text}")
        println("Input 2 : ${anotherInput.text}")
        subject.notify(SubjectInfo(NotificationType.CHANGE_TEXT, "placeholderData"))
        println("Input 1 : ${input.text}")
        println("Input 2 : ${anotherInput.text}")
        subject.unsubscribe(input)
        subject.notify(SubjectInfo(NotificationType.CHANGE_TEXT, ""))
        println("Input 1 : ${input.text}")
        println("Input 2 : ${anotherInput.text}")
    }
}