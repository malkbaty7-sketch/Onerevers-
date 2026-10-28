package com.kaatibdocspro.network

import retrofit2.http.GET
import retrofit2.http.Query

data class ExtractionResponse(
    val text: String,
    val metadata: Map<String, String> = emptyMap()
)

interface DocumentApiService {
    @GET("extract")
    suspend fun extractText(@Query("fileName") fileName: String): ExtractionResponse

    @GET("convert")
    suspend fun convertPdfToWord(@Query("fileName") fileName: String): ConversionResponse
}

data class ConversionResponse(
    val status: String,
    val outputFile: String = ""
)
