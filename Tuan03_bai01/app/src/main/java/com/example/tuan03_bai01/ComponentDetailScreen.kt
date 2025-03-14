package com.example.tuan03_bai01

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComponentDetailScreen(componentName: String) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Chi tiết: $componentName",
            fontSize = 24.sp,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Mô tả về thành phần $componentName...",
            fontSize = 18.sp
        )
    }
}
