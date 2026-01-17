package com.luminous.jetpackcomposenavigation.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.luminous.jetpackcomposenavigation.emails.EmailsListDestination
import com.luminous.jetpackcomposenavigation.emails.EmailsListScreen
import com.luminous.jetpackcomposenavigation.emails.emailsListScreen
import com.luminous.jetpackcomposenavigation.profile.profileScreen
import com.luminous.jetpackcomposenavigation.ui.theme.NavSetupTheme

@Composable
fun MainScreen(
        onOpenEmailDetails: (emailId: Int) -> Unit,
        onComposeNewEmail: () -> Unit
) {
        val navController = rememberNavController()

        Scaffold(
                bottomBar = {
                        MainBottomBar(
                                hierarchy = navController.currentBackStackEntryAsState().value?.destination?.hierarchy,
                                onNavigateToEmails = { },
                                onNavigateToProfile = { }
                        )
                }
        ) { paddingValues ->
                NavHost(
                        modifier = Modifier.padding(paddingValues),
                        navController = navController,
                        startDestination = EmailsListDestination
                ) {
                        emailsListScreen(
                                onOpenEmailDetails = onOpenEmailDetails,
                                onComposeNewEmail = onComposeNewEmail
                        )

                        profileScreen()
                }
        }
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
                        icon = { Icon(Icons.Default.Person, "Profile") }
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
