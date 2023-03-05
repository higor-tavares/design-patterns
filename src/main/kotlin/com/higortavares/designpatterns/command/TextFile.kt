package com.higortavares.designpatterns.command

import java.io.File
import java.io.FileWriter

// Receiver
open class TextFile(private val fileName: String) {

    private val file = File("$fileName.txt")

    fun write(text: String) {
        val fileWriter = FileWriter(file, true)
        fileWriter.write("$text\n")
        fileWriter.close()
    }

    fun deleteLastLine() {
        val lines = file.readLines().toMutableList()

        if (lines.isNotEmpty()) {
            lines.removeAt(lines.lastIndex)
        }
        file.writeText(lines.joinToString("\n"))
    }
}