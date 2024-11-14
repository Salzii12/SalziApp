package com.example.frontendtask

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.frontendtask.component.BottomBarNavigation
import com.example.frontendtask.ui.theme.tugas.Detail
import com.example.frontendtask.ui.theme.tugas.LazyRowColumn
import com.example.frontendtask.ui.theme.tugas.TugasAbout
import com.example.frontendtask.ui.theme.tugas.TugasGrid

@Composable
fun SalziApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val title = when (currentRoute) {
        Route.HALAMAN1 -> "List"
        Route.HALAMAN2 -> "Home"
        Route.HALAMAN3 -> "About"
        "detail/{gameId}" -> "Detail"
        else -> "Salzi"
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.systemBars),

            bottomBar = { BottomBarNavigation(navController) },
        ) { contentPadding ->
            NavHost(
                navController = navController,
                startDestination = Route.HALAMAN2,
                modifier = modifier.padding(contentPadding)
            ) {
                composable(Route.HALAMAN2) {
                    LazyRowColumn(navController = navController)
                }
                composable(Route.HALAMAN1) {
                    TugasGrid(navController = navController)
                }
                composable(Route.HALAMAN3) {
                    TugasAbout()
                }
                composable("detail/{gameId}") { backStackEntry ->
                    val gameId = backStackEntry.arguments?.getString("gameId")?.toIntOrNull()
                    Detail(navController = navController, gameId = gameId)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SalziAppPreview() {
    SalziApp()
}
