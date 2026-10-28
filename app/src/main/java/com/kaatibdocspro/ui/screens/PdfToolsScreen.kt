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
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text("أدوات PDF", style = MaterialTheme.typography.headlineMedium)
        Text("دمج، تقسيم، ضغط، مسح، وتحرير وثائق PDF")

        Button(onClick = { navController.navigate("document_viewer") }) {
            Text("فتح المعاينة")
        }
        Button(onClick = { navController.navigate("extraction") }) {
            Text("استخراج النص")
        }
        Button(onClick = { navController.navigate("conversion") }) {
            Text("تحويل إلى Word")
        }
    }
}
