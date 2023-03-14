package com.higortavares.designpatterns.interpreter

class From(var table: String, var where: Where? = null): SQLExpression{

    override fun evaluate(context: Context) : List<String> {
        context.table = table
        return if (where == null) {  context.search() } else {  where!!.evaluate(context) }
    }

}
