package com.example.frontendtask.ui.theme.tugas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.frontendtask.R
import com.example.frontendtask.component.TopBarComponents
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.frontendtask.component.Card
import com.example.frontendtask.component.SearchBar
import com.example.frontendtask.ui.theme.Grid

@Composable
fun TugasGrid(navController: NavController) {
    var query by remember { mutableStateOf("") }

    val allGames = listOf(
        Grid(1, "Minecraft", "Mojang Developer", R.drawable.minecraft, "4.5") {},
        Grid(2, "Clash Of Clan", "Supercell", R.drawable.coc, "4.2") {},
        Grid(3, "Hay Day", "Supercell", R.drawable.hayday, "4.8") {},
        Grid(4, "Clash Royale", "Supercell", R.drawable.clashroyale, "4.6") {},
        Grid(5, "Boom Beach", "Supercell", R.drawable.bombbeach, "3.9") {},
        Grid(6, "Mobile Legend", "Moonton", R.drawable.mobilelegend, "4.7") {},
        Grid(7, "PUBG", "Tencent", R.drawable.pubg, "4.1") {},
        Grid(8, "Growtopia", "Ubisoft", R.drawable.growtopia, "3.5") {},
        Grid(9, "Dragon City", "Social Point", R.drawable.dragoncity, "3.8") {},
        Grid(10, "Brawl Star", "Supercell", R.drawable.brawlstar, "4.2") {},
        Grid(11, "Pou", "Zakeh", R.drawable.pou, "4.8") {},
        Grid(12, "Subway Surfer", "SYBO Games", R.drawable.subwaysurfer, "4.3") {},
        Grid(13, "Free Fire", "Garena", R.drawable.freefire, "4.5") {}
    )

    val filteredGames = allGames.filter { game ->
        game.title.contains(query, ignoreCase = true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF232348))
    ) {
        TopBarComponents(title = "Game List")

        SearchBar(query = query, onQueryChange = { query = it })

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalArrangement = Arrangement.spacedBy(25.dp)
            ) {
                items(filteredGames) { game ->
                    Card(
                        imageResourceId = game.imageResourceId,
                        title = game.title,
                        developer = game.developer,
                        onClick = {navController.navigate("detail/${game.id}")}
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TugasGridPreview() {
    val navController = rememberNavController()
    TugasGrid(navController = navController)
}
