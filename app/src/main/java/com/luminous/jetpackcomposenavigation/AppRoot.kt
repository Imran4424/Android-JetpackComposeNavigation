package com.luminous.jetpackcomposenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.luminous.jetpackcomposenavigation.login.LoginScreen
import kotlinx.serialization.Serializable
import kotlin.math.log

@Serializable
data object LoginDestination

@Composable
fun AppRoot() {
        val navController = rememberNavController()

        NavHost(
                navController = navController,
                startDestination = LoginDestination
        ) {
                loginScreen(
                        onNavigateToMain = { },
                        onNavigateToSignUp = { }
                )
        }
}

private  fun NavGraphBuilder.loginScreen(
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