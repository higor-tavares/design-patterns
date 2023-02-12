package com.higortavares.designpatterns.prototype

data class Document(var documentName: String, var type: DocumentType, var isPublic: Boolean = true) : Prototype() {


    override fun copy(): Prototype {
        return Document(this.documentName, this.type, this.isPublic)
    }
}