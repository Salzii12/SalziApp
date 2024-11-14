package com.example.frontendtask.ui.theme

data class Game(
    val id: Int,
    val title: String,
    val description: String,
    val imageResourceId: Int,
    val rating: String,
    val onClick: () -> Unit
)

data class Games(
    val id: Int,
    val title: String,
    val developer: String,
    val imageResourceId: Int,
    val rating: String,
    val onClick: () -> Unit
)

data class Grid(
    val id: Int,
    val title: String,
    val developer: String,
    val imageResourceId: Int,
    val rating: String,
    val onClick: () -> Unit
)

