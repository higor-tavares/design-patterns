package com.higortavares.designpatterns.memento

import java.time.LocalDate
import java.time.LocalDateTime

class User(private var name: String, private var phone: String, private var email: String) {

    fun changePhone(newPhone: String) {
        this.phone = newPhone
    }
    fun changeEmail(newEmail: String) {
        this.email = newEmail
    }

    fun createMemento() : Memento {
        val date = LocalDateTime.now().toString()
        println("backup created ${date}!")
        return ConcreteMemento(date, this.name, this.phone, this.email)
    }
    fun restore(memento: Memento) {
        println("restored backup ${memento.getName()}!")
        memento as ConcreteMemento
        this.name = memento.getUserName()
        this.phone = memento.getUserPhone()
        this.email = memento.getUserEmail()
    }

    override fun toString(): String {
       return "User: { name: $name, phone: $phone, email: $email }";
    }
}