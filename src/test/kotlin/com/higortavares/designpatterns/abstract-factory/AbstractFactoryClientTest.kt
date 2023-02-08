package com.higortavares.designpatterns.`abstract-factory`

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AbstractFactoryClientTest {

    @Test
    fun  shouldUseS3() {
        val expectedPath = "s3-url"
        val storageFactory = S3StorageFactory()
        val abstractFactoryClient = AbstractFactoryClient(storageFactory.createStorage())
        val path = abstractFactoryClient.uploadFile()
        assertEquals(path, expectedPath)
    }
    @Test
    fun  shouldUseLocal() {
        val expectedPath = "local-path"
        val storageFactory = LocalStorageFactory()
        val abstractFactoryClient = AbstractFactoryClient(storageFactory.createStorage())
        val path = abstractFactoryClient.uploadFile()
        assertEquals(path, expectedPath)
    }
}