package com.higortavares.designpatterns.iterrator

interface HtCollection<T> {
    fun getIterator() : HtIterator<T>
}