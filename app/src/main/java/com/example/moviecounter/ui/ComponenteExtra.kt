package com.example.moviecounter.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ComponenteExtra() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Este es mi tercer componente en Compose.",
            fontSize = 22.sp // 👈 cambio de estilo
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponenteExtra() {
    ComponenteExtra()
}
