package com.higortavares.designpatterns.adapter

import org.junit.jupiter.api.Test
//client
class StorageAdapterTest {
    @Test
    fun test() {
        val storage: Storage = StorageAdapterAWS()
        storage.upload()
        storage.download()
    }
}