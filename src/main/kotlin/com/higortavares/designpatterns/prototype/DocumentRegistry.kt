package com.higortavares.designpatterns.prototype

class DocumentRegistry {
    companion object {
        val registry: MutableMap<DocumentType, Document> = mutableMapOf()
    }
}