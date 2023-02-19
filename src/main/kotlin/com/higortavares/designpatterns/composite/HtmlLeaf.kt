package com.higortavares.designpatterns.composite
//Leaf
//representa objetos-folha na composião
class HtmlLeaf(tagName: String) : Tag(tagName) {
    override fun addChildren(tag: Tag) {
        throw IllegalArgumentException("Cannot call this operation on leaf object")
    }

    override fun removeChildren(tag: Tag) {
        throw IllegalArgumentException("Cannot call this operation on leaf object")
    }

    override fun getChild(index: Int) {
        throw IllegalArgumentException("Cannot call this operation on leaf object")
    }

    override fun printValue()  {
        println("<$tagName>$content</$tagName>")
    }
}