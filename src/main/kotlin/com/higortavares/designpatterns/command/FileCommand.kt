package com.higortavares.designpatterns.command

interface FileCommand {
    fun execute(text: String) : Unit
    fun undo() : Unit
}