package com.example.compouse.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compouse.R

@Composable
fun MainScreen(){
    val image = painterResource(R.drawable.football)
    val image1 = painterResource(R.drawable.krp)
    Column(modifier = Modifier
        .background(Color.White)) {
        Box(modifier = Modifier
            .fillMaxSize()
            .weight(0.5f)
        ) {
            Box(modifier = Modifier.fillMaxSize()){
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(shape = RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp))
                )
                Column() {
                    Box(modifier = Modifier.padding(start = 170.dp)){
                        Image(
                            painter = image1,
                            contentDescription = null
                        )
                    }
                }
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ){
                    Column() {
                        Text(color = Color.White, text = "Team")
                        Text(color = Color.White, text = " На сьогодні заплановано: ")
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Row(modifier = Modifier) {
                Button(onClick = { /*TODO*/ }) {

                }
                Button(onClick = { /*TODO*/ }) {

                }
            }
            Text(
                text = "MainScreen",
                color = Color.Black
            )
        }
    }
}

@Composable
@Preview
fun MainScreenPreview(){
    MainScreen()
}
