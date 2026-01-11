package com.luminous.jetpackcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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