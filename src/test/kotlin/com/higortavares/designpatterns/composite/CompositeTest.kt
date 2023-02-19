package com.higortavares.designpatterns.composite

import org.junit.jupiter.api.Test

class CompositeTest {

    @Test
    fun testComposite() {
        val h1 = HtmlLeaf("h1")
        val p = HtmlLeaf("p")
        val p2 = HtmlLeaf("p")
        val div = HtmlComposite("div")
        h1.content = "Titulo Principal"
        p.content = "This is my paragraph"
        p2.content = "A big paragraph to test my sample of composite pattern"
        div.addChildren(h1)
        div.addChildren(p)
        div.addChildren(p2)
        div.printValue()
        p.printValue()
    }
}