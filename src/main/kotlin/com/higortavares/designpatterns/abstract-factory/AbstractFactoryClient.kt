package com.higortavares.designpatterns.`abstract-factory`

class AbstractFactoryClient (private val storageProvider: StorageProvider) {

    fun uploadFile() : String {
        val data = byteArrayOf()
        return storageProvider.uploadFile(data)
    }
}