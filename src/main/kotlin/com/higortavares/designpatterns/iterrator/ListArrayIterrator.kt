package com.higortavares.designpatterns.iterrator

class ListArrayIterrator(val listArray: ListArray) : HtIterator<String> {

    var counter = 0;

    override fun hasNext(): Boolean {
        return listArray.list.size > counter
    }

    override fun next(): String {
        val el = listArray.list[counter]
        counter ++
        return el;
    }
}