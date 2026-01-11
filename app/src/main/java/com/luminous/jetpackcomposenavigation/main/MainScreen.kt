package com.luminous.jetpackcomposenavigation.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import com.luminous.jetpackcomposenavigation.ui.theme.NavSetupTheme

@Composable
fun MainScreen(
        onOpenEmailDetails: (emailId: Int) -> Unit,
        onComposeNewEmail: () -> Unit
) {

}

@Composable
fun MainBottomBar(
        hierarchy: Sequence<NavDestination>?,
        onNavigateToEmails: () -> Unit,
        onNavigateToProfile: () -> Unit
) {
        NavigationBar {
                NavigationBarItem(
                        selected = true,
                        onClick = onNavigateToEmails,
                        icon = { Icon(Icons.Default.Email, "Emails") }
                )

                NavigationBarItem(
                        selected = false,
                        onClick = onNavigateToProfile,
                        icon = { Icon(Icons.Default.Email, "Profile") }
                )
        }
}

@Preview
@Composable
private fun PreviewMainScreen() {
        NavSetupTheme {
                MainScreen(
                        onOpenEmailDetails = { },
                        onComposeNewEmail = { }
                )
        }
}
