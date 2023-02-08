package com.higortavares.designpatterns.`abstract-factory`

class LocalStorageProvider: StorageProvider {

    override fun uploadFile(data: ByteArray): String {
        println("upload the file to local storage provider")
        return "local-path"
    }
}