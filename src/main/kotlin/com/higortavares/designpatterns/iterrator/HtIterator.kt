package com.higortavares.designpatterns.iterrator

interface HtIterator<T> {
    fun hasNext() : Boolean
    fun next() : T
}