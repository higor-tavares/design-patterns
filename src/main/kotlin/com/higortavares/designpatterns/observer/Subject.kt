package com.higortavares.designpatterns.observer

data class SubjectInfo(val notificationType: NotificationType, val data: Any)

class Subject {

    private var subscribers = mutableSetOf<Observer>()

    fun subscribe(vararg subscribers: Observer): Unit {
        this.subscribers.addAll(subscribers)
    }
    fun unsubscribe(subscriber: Observer){
        this.subscribers.remove(subscriber)
    }
    fun notify(info: SubjectInfo) {
        this.subscribers.forEach { it -> it.update(info)}
    }
}