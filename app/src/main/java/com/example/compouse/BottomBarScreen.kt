package com.example.compouse

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object MainScreen: BottomBarScreen(
        route = "mainScr",
        title = "Профіль",
        icon = Icons.Default.Home
    )
    object CalendarScreen: BottomBarScreen(
        route = "calendarScr",
        title = "Календар",
        icon = Icons.Default.DateRange
    )
    object ChatScreen: BottomBarScreen(
        route = "chatScr",
        title = "Чат",
        icon = Icons.Default.Email
    )
    object ProfileScreen: BottomBarScreen(
        route = "profileScr",
        title = "Профіль",
        icon = Icons.Default.Person
    )
    object AnyScreen: BottomBarScreen(
        route = "anyScr",
        title = "Інше",
        icon = Icons.Default.Menu
    )
}