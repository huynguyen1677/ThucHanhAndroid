package com.example.tuan03_bai01

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "welcome") {
        composable("welcome") { WelcomeScreen(navController) }
        composable("components_list") { ComponentsListScreen(navController) }
        composable("component_detail/{componentName}") { backStackEntry ->
            val componentName = backStackEntry.arguments?.getString("componentName") ?: "Unknown"
            ComponentDetailScreen(componentName)
        }
    }
}
