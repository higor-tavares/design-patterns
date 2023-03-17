package com.higortavares.designpatterns.observer

class Button(val title: String, var enabled: Boolean? = true): Observer {

    override fun update(info: SubjectInfo) {
        if(info.notificationType == NotificationType.DISABLE) {
            this.enabled = false
        }
    }
}