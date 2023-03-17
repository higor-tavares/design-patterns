package com.higortavares.designpatterns.observer

class InputText(var text: String): Observer {

    override fun update(info: SubjectInfo) {
        if (info.notificationType == NotificationType.CHANGE_TEXT) {
            this.text = (info.data as String)
        }
    }

}