package com.higortavares.designpatterns.adapter
//Adaptee
class AwsSDK {
    fun uploadS3() {
        println("upload to s3")
    }
    fun downloadFile() {
        println("download file from s3")
    }
}