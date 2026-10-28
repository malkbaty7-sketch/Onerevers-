package com.kaatibdocspro.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun SettingsScreen(navController: NavHostController) {
    var offlineMode by remember { mutableStateOf(false) }
    var darkMode by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text("الإعدادات", style = MaterialTheme.typography.headlineMedium)
        Text("إعدادات التطبيق العامة")

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Text("الوضع غير المتصل")
            Switch(
                checked = offlineMode,
                onCheckedChange = { offlineMode = it }
            )

            Text("الوضع الداكن")
            Switch(
                checked = darkMode,
                onCheckedChange = { darkMode = it }
            )
        }

        Button(onClick = { navController.popBackStack() }) {
            Text("رجوع")
        }
    }
}
