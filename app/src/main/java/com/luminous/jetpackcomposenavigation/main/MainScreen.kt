package com.luminous.jetpackcomposenavigation.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination

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
        
}