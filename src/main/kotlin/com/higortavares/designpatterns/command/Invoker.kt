package com.higortavares.designpatterns.command

class Invoker {
    private val mutableMap: MutableMap<String, FileCommand> = mutableMapOf();

    fun execute(key: String, text: String) {
        mutableMap[key]?.execute(text)
    }
    fun undo(key: String) {
        mutableMap[key]?.undo()
    }
    fun addCommand(key: String, command: FileCommand) {
        mutableMap[key] =  command
    }
}