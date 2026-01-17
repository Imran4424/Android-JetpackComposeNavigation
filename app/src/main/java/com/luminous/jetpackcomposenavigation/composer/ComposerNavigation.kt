package com.luminous.jetpackcomposenavigation.composer

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
private data object ComposerRootDestination

fun NavGraphBuilder.composerScreenRoot(
        onNavigateUp: () -> Unit
) {
        composable<ComposerRootDestination> {
                ComposerScreenRoot(
                        onNavigateUp = onNavigateUp
                )
        }
}