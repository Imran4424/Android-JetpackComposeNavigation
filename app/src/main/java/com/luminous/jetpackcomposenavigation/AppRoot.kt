package com.luminous.jetpackcomposenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.luminous.jetpackcomposenavigation.login.LoginScreen
import kotlinx.serialization.Serializable

@Serializable
data object LoginDestination

@Composable
fun AppRoot() {
        val navController = rememberNavController()

        NavHost(
                navController = navController,
                startDestination = LoginDestination
        ) {
                composable<LoginDestination> {
                        LoginScreen(
                                onNavigateToMain = { },
                                onNavigateToSignUp = { }
                        )
                }
        }
}