package com.example.jetpackcomposecourse.`10_States`

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random


@SuppressLint("UnrememberedMutableState")
@Composable
fun ColorBox() {

    val color = remember {
        mutableStateOf(Color.Yellow)
    }
    Box(modifier = Modifier
        .width(200.dp)
        .height(250.dp)
        .background(color.value)
        .clickable{
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )

        }
    )
}



