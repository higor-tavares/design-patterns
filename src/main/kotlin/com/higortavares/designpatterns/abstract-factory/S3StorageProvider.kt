package com.higortavares.designpatterns.`abstract-factory`

class S3StorageProvider: StorageProvider {

    override fun uploadFile(data: ByteArray): String {
        println("upload data to s3 storage provider")
        return "s3-url"
    }

}