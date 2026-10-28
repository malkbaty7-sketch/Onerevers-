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
import com.kaatibdocspro.ui.navigation.AppDestinations

@Composable
fun BatchToolsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text("أدوات الدفعات", style = MaterialTheme.typography.headlineMedium)
        Text("معالجة متعددة للملفات: دمج، تقسيم، ضغط")

        Card(modifier = Modifier) {
            Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("1. دمج ملفات PDF")
                Text("2. تقسيم PDF")
                Text("3. ضغط ملفات PDF")
                Text("4. تحويل ملفات متعددة")
            }
        }

        Button(onClick = { navController.navigate(AppDestinations.DOCUMENT_LIST) }) {
            Text("عرض الملفات")
        }

        Button(onClick = { navController.popBackStack() }) {
            Text("رجوع")
        }
    }
}
