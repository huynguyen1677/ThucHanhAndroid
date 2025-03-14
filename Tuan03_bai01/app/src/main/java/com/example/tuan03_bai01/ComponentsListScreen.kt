package com.example.tuan03_bai01

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun ComponentsListScreen(navController: NavController) {
    val components = listOf("Text", "Image", "TextField", "PasswordField", "Column", "Row")

    LazyColumn {
        items(components) { component ->
            Button(
                onClick = { navController.navigate("component_detail/$component") },
                modifier = Modifier.fillMaxWidth().padding(8.dp)
            ) {
                Text(text = component)
            }
        }
    }
}
