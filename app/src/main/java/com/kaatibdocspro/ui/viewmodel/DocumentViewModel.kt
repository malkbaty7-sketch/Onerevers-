package com.kaatibdocspro.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.kaatibdocspro.data.DocumentRepository
import com.kaatibdocspro.data.DocumentEntity
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DocumentViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = DocumentRepository(application.applicationContext)

    private val _documents = MutableStateFlow<List<DocumentEntity>>(emptyList())
    val documents: StateFlow<List<DocumentEntity>> = _documents.asStateFlow()

    private val _extractedText = MutableStateFlow(
        "تم استخراج النص بنجاح.\n\nهذا نص تجريبي يظهر أنه تم ربط واجهة الاستخراج بنجاح مع خدمة Apache Tika."
    )
    val extractedText: StateFlow<String> = _extractedText.asStateFlow()

    private val _conversionStatus = MutableStateFlow("جاهز للتحويل")
    val conversionStatus: StateFlow<String> = _conversionStatus.asStateFlow()

    init {
        viewModelScope.launch {
            repository.seedInitialDocuments()
            repository.documents.collect { docs ->
                _documents.value = docs
            }
        }
    }

    fun addDocument(name: String, type: String = "PDF", size: String = "1.0 MB", status: String = "Added") {
        viewModelScope.launch {
            repository.addDocument(name, type, size, status)
        }
    }

    fun updateExtractionText(text: String) {
        _extractedText.value = text
    }

    fun setConversionStatus(status: String) {
        _conversionStatus.value = status
    }
}
