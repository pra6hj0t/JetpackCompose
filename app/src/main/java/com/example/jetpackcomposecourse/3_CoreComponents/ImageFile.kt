package com.example.jetpackcomposecourse.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecourse.R

@Composable
//@Preview(showSystemUi = true)
fun ImageSample(count: Int) {
    val context = LocalContext.current

    val rainbowColors = listOf(
        Color.Red,
        Color.Cyan,
        Color.Yellow,
        Color.Green,
        Color.Blue,

        )

    val brush = remember {
        Brush.linearGradient(
            colors = rainbowColors
        )

    }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.animated),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
                .border(4.dp, brush, CircleShape)
                .clickable {
                    Toast.makeText(context, "Image Clicked", Toast.LENGTH_SHORT).show()
                }
        )

        Spacer(Modifier.height(10.dp))
        Text("$count")
    }



}