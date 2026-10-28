package com.kaatibdocspro.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AppSettings(private val dataStore: DataStore<Preferences>) {
    companion object {
        val KEY_THEME = stringPreferencesKey("theme_mode")
        val KEY_OFFLINE_MODE = booleanPreferencesKey("offline_mode")
    }

    val themeMode: Flow<String> = dataStore.data.map { prefs ->
        prefs[KEY_THEME] ?: "system"
    }

    val offlineMode: Flow<Boolean> = dataStore.data.map { prefs ->
        prefs[KEY_OFFLINE_MODE] ?: false
    }

    suspend fun setTheme(theme: String) {
        dataStore.edit { prefs ->
            prefs[KEY_THEME] = theme
        }
    }

    suspend fun setOfflineMode(enabled: Boolean) {
        dataStore.edit { prefs ->
            prefs[KEY_OFFLINE_MODE] = enabled
        }
    }
}
