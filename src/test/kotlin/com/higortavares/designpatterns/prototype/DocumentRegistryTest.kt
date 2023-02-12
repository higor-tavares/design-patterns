package com.higortavares.designpatterns.prototype

import org.junit.jupiter.api.Test

class DocumentRegistryTest {

    @Test
    fun testDinamicRegistryPrototype() {

        val registry = DocumentRegistry.registry

        val pdf = Document("document.pdf", DocumentType.PDF)
        val doc = Document("document.doc", DocumentType.DOC, false)

        registry.put(DocumentType.PDF, pdf)
        registry.put(DocumentType.DOC, doc)

        val pdfCopy = registry.get(DocumentType.PDF)?.copy() as Document
        val docCopy = registry.get(DocumentType.DOC)?.copy()
        pdfCopy.documentName = "minha_copia.pdf"

        println(pdfCopy)
        println(docCopy)
    }
}