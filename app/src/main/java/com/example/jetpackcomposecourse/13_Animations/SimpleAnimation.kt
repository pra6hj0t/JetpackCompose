package com.example.jetpackcomposecourse.`13_Animations`

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.EaseInOutCirc
import androidx.compose.animation.core.EaseOutBounce
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SimpleAnimation() {

    var sizeState by remember {
        mutableStateOf(200.dp)
    }

    val sizeAnimate by animateDpAsState(
        targetValue = sizeState,
        tween(
            durationMillis = 3000,
            delayMillis = 300,
            easing = EaseOutBounce
        )
//        spring(
//            Spring.DampingRatioHighBouncy
//        )
    )

    val infiniteTransition = rememberInfiniteTransition()
    val color by infiniteTransition.animateColor(
        initialValue = Color.Red,
        targetValue = Color.Green,
        animationSpec = infiniteRepeatable(
            tween(durationMillis = 2000),
            repeatMode = RepeatMode.Reverse
        )
    )


    Box(
        modifier = Modifier
            .size(sizeAnimate)
            .background(color), contentAlignment = Alignment.Center
    ) {

        Column {

            Button(onClick = {
                sizeState += 20.dp
            }) {
                Text(text = "Increase Size")
            }
            Button(onClick = {
                sizeState -= 20.dp
            }) {
                Text(text = "Decrease Size")
            }

        }


    }
}



