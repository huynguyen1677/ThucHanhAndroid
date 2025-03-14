package com.example.tuan03_bai01

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background), // Thay bằng icon của bạn
            contentDescription = "Jetpack Compose",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Jetpack Compose", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("components_list") }) {
            Text(text = "I'm ready")
        }
    }
}
