package com.kaatibdocspro.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kaatibdocspro.ui.navigation.AppDestinations
import com.kaatibdocspro.ui.screens.*

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppDestinations.HOME
    ) {
        composable(AppDestinations.HOME) { HomeScreen(navController) }
        composable(AppDestinations.DOCUMENT_LIST) { DocumentListScreen(navController) }
        composable(AppDestinations.PDF_TOOLS) { PdfToolsScreen(navController) }
        composable(AppDestinations.DOCUMENT_VIEWER) { DocumentViewerScreen(navController) }
        composable(AppDestinations.EXTRACTION) { ExtractionScreen(navController) }
        composable(AppDestinations.CONVERSION) { ConversionScreen(navController) }
        composable(AppDestinations.SETTINGS) { SettingsScreen(navController) }
    }
}
