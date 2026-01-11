package com.luminous.jetpackcomposenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.luminous.jetpackcomposenavigation.login.LoginDestination
import com.luminous.jetpackcomposenavigation.login.LoginScreen
import com.luminous.jetpackcomposenavigation.login.loginScreen
import com.luminous.jetpackcomposenavigation.signup.navigateToSignUp
import kotlinx.serialization.Serializable
import kotlin.math.log

@Composable
fun AppRoot() {
        val navController = rememberNavController()

        NavHost(
                navController = navController,
                startDestination = LoginDestination
        ) {
                loginScreen(
                        onNavigateToMain = { },
                        onNavigateToSignUp = { navController.navigateToSignUp() }
                )
        }
}