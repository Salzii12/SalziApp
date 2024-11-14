package com.example.frontendtask.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.frontendtask.R
import com.example.frontendtask.Route

@Composable
fun BottomBarNavigation(navController: NavController) {
    NavigationBar(
        containerColor = Color(0xFF8C2C2C)
    ) {
        NavigationBarItem(
            selected = navController.currentBackStackEntryAsState().value?.destination?.route == "Home",
            onClick = { navController.navigate(Route.HALAMAN2) },
            label = {
                Text(
                    "Home",
                    color = Color.White,
                    modifier = Modifier.padding(top = 4.dp)
                )
            },
            icon = {
                Icon(
                    Icons.Filled.Home,
                    modifier = Modifier.size(30.dp),
                    contentDescription = "Home",
                    tint = Color.White
                )
            }
        )
        NavigationBarItem(
            selected = navController.currentBackStackEntryAsState().value?.destination?.route == "List",
            onClick = { navController.navigate(Route.HALAMAN1) },
            label = {
                Text(
                    "Game List",
                    color = Color.White,
                    modifier = Modifier.padding(top = 8.dp)
                )
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.game_ic),
                    contentDescription = "Game List",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }
        )
        NavigationBarItem(
            selected = navController.currentBackStackEntryAsState().value?.destination?.route == "About",
            onClick = { navController.navigate(Route.HALAMAN3) },
            label = {
                Text(
                    "About",
                    color = Color.White,
                    modifier = Modifier.padding(top = 4.dp)
                )
            },
            icon = {
                Icon(
                    Icons.Filled.Person,
                    modifier = Modifier.size(30.dp),
                    contentDescription = "About",
                    tint = Color.White
                )
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    val navController = rememberNavController()
    BottomBarNavigation(navController = navController)
}