package com.higortavares.designpatterns.interpreter

import java.util.function.Predicate

class Where(val filter: Predicate<String>) : SQLExpression{
    override fun evaluate(context: Context) : List<String> {
        context.filter = filter;
        return context.search()
    }

}
