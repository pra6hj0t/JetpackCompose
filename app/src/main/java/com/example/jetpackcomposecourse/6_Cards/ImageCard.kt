package com.example.jetpackcomposecourse.`6_Cards`

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecourse.R


@Composable
@Preview(showSystemUi = true)
fun ImageCard() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Card(
            modifier = Modifier.width(200.dp),
            border = BorderStroke(2.dp, Color.Yellow)
        ) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.animated),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop
                )

                Box(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    contentAlignment = Alignment.BottomStart


                ) {
                    Text(
                        "This is Garuda Linux Wallpaper",
                        color = Color.Yellow,

                        )
                }
            }


        }


    }

}



