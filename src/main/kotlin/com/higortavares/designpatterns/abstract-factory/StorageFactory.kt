package com.higortavares.designpatterns.`abstract-factory`

interface StorageFactory {
    /**
     * Get a StorageProvider Instance implementing Abstract Factory Pattern
     */
    fun createStorage() : StorageProvider
}