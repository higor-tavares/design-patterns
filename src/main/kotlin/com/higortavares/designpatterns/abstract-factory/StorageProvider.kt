package com.higortavares.designpatterns.`abstract-factory`

interface StorageProvider {
    /**
     * Upload a file and returns the path
     */
    fun uploadFile(data: ByteArray) : String
}