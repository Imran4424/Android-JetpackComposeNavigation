package com.luminous.jetpackcomposenavigation.login

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.luminous.jetpackcomposenavigation.main.MainDestination
import com.luminous.jetpackcomposenavigation.signup.SignUpDestination
import kotlinx.serialization.Serializable

@Serializable
data object LoginDestination

fun NavGraphBuilder.loginScreen(
        onNavigateToMain: () -> Unit,
        onNavigateToSignUp: () -> Unit
) {
        composable<LoginDestination> {
                LoginScreen(
                        onNavigateToMain = onNavigateToMain,
                        onNavigateToSignUp = onNavigateToSignUp
                )
        }
}

fun NavController.navigateToMain() {
        navigate(MainDestination)
}