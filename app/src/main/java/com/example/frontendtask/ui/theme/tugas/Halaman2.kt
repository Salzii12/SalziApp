package com.example.frontendtask.ui.theme.tugas

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.frontendtask.R
import com.example.frontendtask.component.TopBarComponents
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.frontendtask.component.Card3
import com.example.frontendtask.component.Card4
import com.example.frontendtask.component.SearchBar
import com.example.frontendtask.ui.theme.Game
import com.example.frontendtask.ui.theme.Games
import com.example.frontendtask.ui.theme.Grid

@Composable
fun LazyRowColumn(navController: NavController) {
    var query by remember { mutableStateOf("") }

    val allGames = listOf(
        Games(1, "Minecraft", "Mojang Developer", R.drawable.minecraft, "4.5") {},
        Games(2, "Clash Of Clan", "Supercell", R.drawable.coc, "4.2") {},
        Games(3, "Hay Day", "Supercell", R.drawable.hayday, "4.8") {},
        Games(4, "Clash Royale", "Supercell", R.drawable.clashroyale, "4.6") {},
        Games(5, "Boom Beach", "Supercell", R.drawable.bombbeach, "3.9") {},
        Games(6, "Mobile Legend", "Moonton", R.drawable.mobilelegend, "4.7") {},
        Games(7, "PUBG", "Tencent", R.drawable.pubg, "4.1") {},
        Games(8, "Growtopia", "Ubisoft", R.drawable.growtopia, "3.5") {},
        Games(9, "Dragon City", "Social Point", R.drawable.dragoncity, "3.8") {},
        Games(10, "Brawl Star", "Supercell", R.drawable.brawlstar, "4.2") {}
    )

    val filteredGames = allGames.filter { game ->
        game.title.contains(query, ignoreCase = true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF232348))
    ) {
        TopBarComponents(title = "Home")

        SearchBar(query = query, onQueryChange = { query = it })

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
        ) {
            item {
                Text(
                    text = "Popular",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(horizontal = 20.dp, vertical = 12.dp)
                )
            }

            item {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(240.dp)
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    contentPadding = PaddingValues(horizontal = 5.dp)
                ) {
                    items(filteredGames) { game ->
                        Card3(
                            imageResourceId = game.imageResourceId,
                            title = game.title,
                            developer = game.developer,
                            rating = game.rating,
                            onClick = {
                                navController.navigate("detail/${game.id}")
                            }
                        )
                    }
                }
            }

            item {
                Text(
                    text = "Other Game",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, top = 12.dp, bottom = 12.dp)
                )
            }

            val otherGames = listOf(
                Game(4, "Clash Royale", "Game ini adalah Game yang seru dan menyenangkan", R.drawable.clashroyale, "4.2") {},
                Game(5, "Boom Beach", "Game ini adalah Game yang seru dan menyenangkan", R.drawable.bombbeach, "3.9") {},
                Game(6, "Mobile Legend", "Game ini adalah Game yang seru dan menyenangkan", R.drawable.mobilelegend, "4.5") {},
                Game(7, "PUBG", "Game ini adalah Game yang seru dan menyenangkan", R.drawable.pubg, "4.1") {},
                Game(8, "Growtopia", "Game ini adalah Game yang seru dan menyenangkan", R.drawable.growtopia, "3.5") {},
                Game(9, "Dragon City", "Game ini adalah Game yang seru dan menyenangkan", R.drawable.dragoncity, "3.8") {},
                Game(10, "Brawl Star", "Game ini adalah Game yang seru dan menyenangkan", R.drawable.brawlstar, "4.2") {},
                Game(11, "Pou", "Game ini adalah yang Game seru dan menyenangkan", R.drawable.pou, "4.8") {},
                Game(12, "Subway Surfer", "Game ini adalah Game yang seru dan menyenangkan", R.drawable.subwaysurfer, "4.3") {},
                Game(13, "Free Fire", "Game ini adalah Game yang seru dan menyenangkan", R.drawable.freefire, "4.5") {}
            )

            val filteredOtherGames = otherGames.filter { game ->
                game.title.contains(query, ignoreCase = true)
            }

            items(filteredOtherGames) { game ->
                Card4(
                    imageResourceId = game.imageResourceId,
                    title = game.title,
                    deskripsi = game.description,
                    rating = game.rating,
                    onClick = {
                        navController.navigate("detail/${game.id}")
                    }
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyRowColumnPreview() {
    val navController = rememberNavController()
    LazyRowColumn(navController = navController)
}

