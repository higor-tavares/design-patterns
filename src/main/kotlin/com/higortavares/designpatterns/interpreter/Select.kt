package com.higortavares.designpatterns.interpreter

class Select (private val column: String, private val from: From): SQLExpression {

    override fun evaluate(context: Context) : List<String> {
        context.column = column
        return from.evaluate(context)
    }
}