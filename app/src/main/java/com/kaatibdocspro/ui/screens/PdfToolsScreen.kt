package com.kaatibdocspro.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun PdfToolsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text("PDF Tools", style = MaterialTheme.typography.headlineMedium)
        Text("Merge, split, compress, scan and edit documents")

        Button(onClick = { navController.navigate("document_viewer") }) {
            Text("Open PDF Viewer")
        }
        Button(onClick = { navController.navigate("extraction") }) {
            Text("Extract text")
        }
        Button(onClick = { navController.navigate("conversion") }) {
            Text("Convert to Word")
        }
    }
}
