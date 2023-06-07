package com.example.compouse.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.compouse.BottomBarScreen

@Composable
fun AnyScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "AnyScreen",
            color = Color.White
        )
    }
}

@Composable
@Preview
fun AnyScreenPrewie(){
    AnyScreen()
}