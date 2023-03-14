package com.higortavares.designpatterns.iterrator

class ListArrayInvertedIterator(val listArray: ListArray): HtIterator<String>{
    var counter = 1;

    override fun hasNext(): Boolean {
        return listArray.list.size >= counter
    }

    override fun next(): String {
        val size = listArray.list.size
        val el = listArray.list[size - counter]
        counter ++
        return el;
    }
}