package com.higortavares.designpatterns.interpreter

import org.junit.jupiter.api.Test
import java.util.*

class IntepreterTest {
    @Test
    fun test() {
        val query = Select("name", From("people"))
        val ctx = Context()
        val result = query.evaluate(ctx)
        println(result)
        val query2 = Select(
            "*",
            From(
                "people",
                Where { name: String ->
                    name.lowercase(
                        Locale.getDefault(),
                    ).startsWith("m")
                },
            )
        )
        val result2: List<String> = query2.evaluate(ctx)
        println(result2)
    }
}