package com.luminous.jetpackcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.*
import com.luminous.jetpackcomposenavigation.ui.theme.JetPackComposeNavigationTheme
import com.luminous.jetpackcomposenavigation.ui.theme.NavSetupTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                enableEdgeToEdge()
                setContent {
                        NavSetupTheme {
                                AppRoot()
                        }
                }
        }
}

@Composable
private fun AppRoot() {
        val navController = rememberNavController()

        NavHost(
                navController = navController,
                startDestination = LoginDestination
        ) {
                composable<LoginDestination>(LoginDestination) {

                }
        }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
                text = "Hello $name!",
                modifier = modifier
        )
}

@Serializable
data object LoginDestination

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        JetPackComposeNavigationTheme {
                Greeting("Android")
        }
}