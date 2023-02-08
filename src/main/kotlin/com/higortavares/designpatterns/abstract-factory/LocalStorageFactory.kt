package com.higortavares.designpatterns.`abstract-factory`

class LocalStorageFactory : StorageFactory {

    override fun createStorage(): StorageProvider {
       return LocalStorageProvider()
    }
}