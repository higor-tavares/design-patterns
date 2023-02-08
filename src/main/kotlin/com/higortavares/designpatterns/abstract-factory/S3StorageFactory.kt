package com.higortavares.designpatterns.`abstract-factory`

class S3StorageFactory : StorageFactory {

    override fun createStorage(): StorageProvider {
        return  S3StorageProvider()
    }
}