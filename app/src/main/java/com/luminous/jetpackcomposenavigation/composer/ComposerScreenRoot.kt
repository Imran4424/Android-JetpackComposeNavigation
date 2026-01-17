package com.luminous.jetpackcomposenavigation.composer

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.luminous.jetpackcomposenavigation.ui.theme.NavSetupTheme
import kotlinx.serialization.Serializable

@Serializable
private data object ComposerDestination

@Composable
fun ComposerScreenRoot(
        onNavigateUp: () -> Unit
) {
        val navController = rememberNavController()

        NavHost(
                navController = navController,
                startDestination = ComposerDestination
        ) {
                composable<ComposerDestination> {
                        ComputerScreen(
                                onNavigateUp = onNavigateUp,
                                onOpenSettings = { navController.navigateToComposerSettings() }
                        )
                }
        }
}

@Preview
@Composable
private fun PreviewComposerScreenRoot() {
        NavSetupTheme {
                ComposerScreenRoot(
                        onNavigateUp = { }
                )
        }
}