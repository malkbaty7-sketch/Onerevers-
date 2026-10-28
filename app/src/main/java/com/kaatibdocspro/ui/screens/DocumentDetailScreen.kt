package com.kaatibdocspro.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
fun DocumentDetailScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text("تفاصيل المستند", style = MaterialTheme.typography.headlineMedium)

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("اسم الملف: Contract_Arabic.docx")
                Text("النوع: DOCX")
                Text("الحجم: 1.7 MB")
                Text("الحالة: Needs review")
                Text("تاريخ التعديل: اليوم")
            }
        }

        Button(onClick = { navController.navigate(AppDestinations.EXTRACTION) }) {
            Text("استخراج النص")
        }

        Button(onClick = { navController.navigate(AppDestinations.CONVERSION) }) {
            Text("تحويل إلى Word")
        }

        Button(onClick = { navController.popBackStack() }) {
            Text("رجوع")
        }
    }
}
