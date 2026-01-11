package com.luminous.jetpackcomposenavigation.emails

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EmailsListScreen(
        onOpenEmailDetails: (id: Int) -> Unit,
        onComposeNewEmail: () -> Unit
) {
        Scaffold(
                modifier = Modifier.fillMaxSize(),
                contentWindowInsets = WindowInsets(0.dp),
                topBar = {}

        ) { }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailsSearchBar() {
        SearchBar(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                expanded = false,
                windowInsets = WindowInsets(0.dp),
                inputField = {
                        SearchBarDefaults.InputField(
                                query = "",
                                onQueryChange = {},
                                onSearch = {},
                                leadingIcon = {
                                        Icon(imageVector = Icons.Default.Search, null)
                                },
                                placeholder = {
                                        Text(text = "Search emails")
                                },
                                expanded = false,
                                onExpandedChange = {}
                        )
                },
                onExpandedChange = {},
                content = {}
        )
}