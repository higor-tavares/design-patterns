package com.higortavares.designpatterns.observer

interface Observer {
    fun update(info: SubjectInfo) : Unit
}