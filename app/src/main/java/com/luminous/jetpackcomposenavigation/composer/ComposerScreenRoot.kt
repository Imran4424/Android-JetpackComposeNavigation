package com.luminous.jetpackcomposenavigation.composer

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.ui.tooling.preview.Preview
import com.luminous.jetpackcomposenavigation.ui.theme.NavSetupTheme

@Composable
fun ComposerScreenRoot(
        onNavigateUp: () -> Unit
) {

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