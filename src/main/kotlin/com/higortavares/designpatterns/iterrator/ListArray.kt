package com.higortavares.designpatterns.iterrator

class ListArray(val inverted: Boolean? = false): HtCollection<String> {

    var list = mutableListOf<String>()

    fun add(element: String) {
        list.add(element)
    }
    fun remove(element: String) {
        list.remove(element)
    }

    override fun getIterator(): HtIterator<String> {
        return if(inverted == true) ListArrayInvertedIterator(this) else ListArrayIterrator(this)
    }
}