package com.higortavares.designpatterns.memento

class BackupManager {

    private val mementos = mutableListOf<Memento>()

    fun save(user: User) {
        mementos.add(user.createMemento())
    }

    fun undo(user: User) {
        user.restore(mementos.removeLast())
    }

}