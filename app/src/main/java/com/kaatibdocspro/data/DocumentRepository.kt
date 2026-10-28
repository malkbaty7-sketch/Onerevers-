package com.kaatibdocspro.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class DocumentRepository {
    private val sampleDocuments = listOf(
        DocumentItem("Invoice_2026.pdf", "PDF", "34 MB", "Recently opened"),
        DocumentItem("Contract_Arabic.docx", "DOCX", "2.8 MB", "Needs review"),
        DocumentItem("Report.xlsx", "XLSX", "1.1 MB", "Export ready"),
        DocumentItem("Manual.pdf", "PDF", "7.4 MB", "Shared"),
        DocumentItem("ProjectSummary.pptx", "PPTX", "5.2 MB", "Presentation")
    )

    fun getDocuments(): Flow<List<DocumentItem>> = flowOf(sampleDocuments)
}

data class DocumentItem(
    val name: String,
    val type: String,
    val size: String,
    val status: String
)
