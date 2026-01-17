package com.luminous.jetpackcomposenavigation.main

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object MainDestination

fun NavGraphBuilder.mainScreen(
        onOpenEmailDetails: (emailId: Int) -> Unit,
        onComposeNewEmail: () -> Unit
) {
        composable<MainDestination> {
                MainScreen(
                        onOpenEmailDetails = onOpenEmailDetails,
                        onComposeNewEmail = onComposeNewEmail
                )
        }
}

fun NavController.navigateToMain() {
        navigate(MainDestination) {
                popUpTo(0) {
                        inclusive = true
                        saveState = true
                }
        }
}