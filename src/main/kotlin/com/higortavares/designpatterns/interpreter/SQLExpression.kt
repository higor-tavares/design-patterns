package com.higortavares.designpatterns.interpreter

import java.util.function.Predicate
import java.util.stream.Collectors
import java.util.stream.Stream

interface SQLExpression {
    fun evaluate(context: Context) : List<String>
}
class Context {
    lateinit var column: String
    lateinit var table: String
    lateinit var filter: Predicate<String>

    companion object {

        var people = listOf(
            Row("higor", "26", "olx"),
            Row("marcos", "32", "gstart"),
            Row("gabriel", "24", "ifood")
        )

        var tables = mutableMapOf<String, List<Row>>(Pair("people", people))
    }

    fun search(): List<String> {
        if (filter != null) {
            return tables.entries
                .stream()
                .filter { it -> it.key == table }
                .flatMap { it -> Stream.of(it.value) }
                .map { it -> "$it" }
                .filter(filter)
                .collect(Collectors.toList());

        } else {
            return tables.entries
                .stream()
                .filter { it -> it.key == table }
                .flatMap { it -> Stream.of(it.value) }
                .map { it -> "$it" }
                .collect(Collectors.toList())
        }
    }
}
data class Row(val name: String, val age: String, val employeer: String)
