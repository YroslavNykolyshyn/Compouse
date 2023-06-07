package com.example.compouse

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.compouse.screens.*

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomBarScreen.MainScreen.route){
        composable(route = BottomBarScreen.MainScreen.route){
            MainScreen()
        }
        composable(route = BottomBarScreen.CalendarScreen.route){
            CalendarScreen()
        }
        composable(route = BottomBarScreen.ChatScreen.route){
            ChatScreen()
        }
        composable(route = BottomBarScreen.ProfileScreen.route){
            ProfileScreen()
        }
        composable(route = BottomBarScreen.AnyScreen.route){
            AnyScreen()
        }
    }
}