package com.higortavares.designpatterns.builder

import java.time.LocalDateTime

class SignatureOrder {
    lateinit var person: Person
    val createdAt: LocalDateTime? = LocalDateTime.now()
}