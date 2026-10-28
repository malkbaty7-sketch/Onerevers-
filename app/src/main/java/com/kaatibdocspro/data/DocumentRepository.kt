package com.kaatibdocspro.data

import android.content.Context
import kotlinx.coroutines.flow.Flow

class DocumentRepository(private val context: Context) {
    private val database = DocumentDatabase.getDatabase(context)

    val documents: Flow<List<DocumentEntity>> = database.documentDao().getAll()

    suspend fun seedInitialDocuments() {
        if (database.documentDao().count() > 0) return

        val defaultDocs = listOf(
            DocumentEntity(name = "Invoice_2026.pdf", type = "PDF", size = "3.2 MB", status = "Recently opened"),
            DocumentEntity(name = "Contract_Arabic.docx", type = "DOCX", size = "1.7 MB", status = "Needs review"),
            DocumentEntity(name = "Sales_Report.xlsx", type = "XLSX", size = "942 KB", status = "Ready"),
            DocumentEntity(name = "Presentation.pptx", type = "PPTX", size = "5.8 MB", status = "Shared"),
            DocumentEntity(name = "Notes_Archive.pdf", type = "PDF", size = "8.4 MB", status = "Saved")
        )

        defaultDocs.forEach { database.documentDao().insert(it) }
    }

    suspend fun addDocument(name: String, type: String, size: String, status: String) {
        database.documentDao().insert(
            DocumentEntity(
                name = name,
                type = type,
                size = size,
                status = status
            )
        )
    }
}
