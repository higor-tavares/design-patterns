package com.higortavares.designpatterns.composite
//Composite
//define comportamento para componentes que tem filhos
class HtmlComposite(tagName: String) : Tag(tagName) {
    override fun addChildren(tag: Tag) {
        super.children.add(tag)
    }

    override fun removeChildren(tag: Tag) {
        super.children.remove(tag)
    }

    override fun getChild(index: Int) {
        super.children[index]
    }

    override fun printValue() {
        println("<$tagName>")
        super.children.forEach {it.printValue()}
        println("</$tagName>")
    }
}