package com.higortavares.designpatterns.decorator

import org.junit.jupiter.api.Test

class DecoratorTest {

    @Test
    fun testWithDecorator(){
        val db =  DatabaseMethod("person")
        val decorator =  LogDecorator(db,db.objectName)
        exec(decorator)
    }
    @Test
    fun testWithNestedDecorator(){
        val db =  DatabaseMethod("person")
        val log =  LogDecorator(db,db.objectName)
        val transaction =  TransactionDecorator(log, db.objectName)
        exec(transaction)
    }
    @Test
    fun testWithoutDecorator(){
        val db =  DatabaseMethod("another")
        exec(db)
    }

    private fun exec(method: Method) {
        method.execute()
    }

}
