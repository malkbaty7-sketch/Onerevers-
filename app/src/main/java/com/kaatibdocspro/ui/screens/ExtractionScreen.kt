package com.kaatibdocspro.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.kaatibdocspro.ui.viewmodel.DocumentViewModel

@Composable
fun ExtractionScreen(navController: NavHostController) {
    val viewModel: DocumentViewModel = viewModel()
    val extractedText by viewModel.extractedText.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text("استخراج النص", style = MaterialTheme.typography.headlineMedium)
        Text("موقع Apache Tika: استخراج نصوص من ملفات PDF والمستندات المكتبية")

        Card(modifier = Modifier.padding(top = 8.dp)) {
            Text(
                text = extractedText,
                modifier = Modifier.padding(16.dp)
            )
        }

        Button(onClick = { navController.popBackStack() }) {
            Text("رجوع")
        }
    }
}
