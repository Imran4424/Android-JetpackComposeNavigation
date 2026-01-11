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

//fun NavController.onOpenEmailDetails(emailId: Int) {
//        navigate(MainDestination)
//}
//
//fun NavController.onComposeNewEmail() {
//
//}

fun NavController.navigateToMain() {
        navigate(MainDestination)
}