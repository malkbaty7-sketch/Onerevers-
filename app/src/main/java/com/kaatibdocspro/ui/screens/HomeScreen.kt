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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "KaatibDocsPro",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(text = "منصة موحدة للوثائق والملفات")

        Card(modifier = Modifier.padding(top = 16.dp)) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Button(onClick = { navController.navigate("document_list") }) {
                    Text("المستندات")
                }
                Button(onClick = { navController.navigate("pdf_tools") }) {
                    Text("أدوات PDF")
                }
                Button(onClick = { navController.navigate("document_viewer") }) {
                    Text("عارض المستندات")
                }
                Button(onClick = { navController.navigate("extraction") }) {
                    Text("استخراج النص")
                }
                Button(onClick = { navController.navigate("conversion") }) {
                    Text("تحويل إلى Word")
                }
            }
        }
    }
}
