package com.higortavares.designpatterns.composite

//Component
//Declara interface para os objetos na composião
open class Tag (val tagName: String){

    public lateinit var content: String
    public val children: MutableList<Tag> = mutableListOf()

    open fun addChildren(tag: Tag) {}
    open fun removeChildren(tag: Tag) {}
    open fun getChild(index: Int) {}
    open fun printValue() {}
}