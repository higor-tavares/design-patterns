package com.higortavares.designpatterns.adapter
//Adapter
class StorageAdapterAWS: Storage() {
    val sdk =  AwsSDK()

    override fun upload() {
        sdk.uploadS3()
    }

    override fun download() {
       sdk.downloadFile()
    }
}