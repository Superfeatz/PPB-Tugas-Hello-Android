package com.example.tugashelloandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HelloWorld()
                }
            }
        }
    }
}

@Composable
fun HelloWorld() {
    // Membuat gradient dengan kombinasi warna hitam
    val gradientBackground = Brush.linearGradient(
        colors = listOf(
            Color(0xFF000000), // Hitam pekat
            Color(0xFF2C2C2C),  // Abu-abu gelap
            Color(0xFF000000) // Warna hitam
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBackground),  // Menambahkan gradient sebagai background
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello Android!",
            color = Color.White,  // Warna teks putih agar kontras
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHelloWorld() {
    HelloWorld()
}
