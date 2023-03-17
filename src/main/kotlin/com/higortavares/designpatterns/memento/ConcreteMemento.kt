package com.higortavares.designpatterns.memento

class ConcreteMemento(
    private val name: String,
    private val user_name: String,
    private val user_phone: String,
    private val user_email: String): Memento {

    override fun getName(): String {
        return this.name
    }
    fun getUserName() : String{
        return this.user_name
    }
    fun getUserPhone() : String{
        return this.user_phone
    }
    fun getUserEmail() : String{
        return this.user_email
    }
}