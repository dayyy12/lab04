package com.example.moviecounter.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MovieCounter() {
    var count by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Películas agregadas: $count")
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = { count++ }) {
            Text("Agregar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMovieCounter() {
    MovieCounter()
}
