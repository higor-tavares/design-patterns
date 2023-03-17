package com.higortavares.designpatterns.memento

import org.junit.jupiter.api.Test

class TestMemento {

    @Test
    fun test() {
        val u1 = User("Paulo Higor", "992791256", "higortavares.ifce@gmail.com")
        val backupManager = BackupManager()
        backupManager.save(u1)
        println("$u1")
        u1.changeEmail("htfreire@gmail.com")
        u1.changePhone("992883882833")
        println("$u1")
        backupManager.undo(u1)
        println("$u1")
    }
}