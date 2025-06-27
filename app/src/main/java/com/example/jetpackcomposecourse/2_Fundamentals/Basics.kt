package com.example.jetpackcomposecourse.`2_Fundamentals`


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecourse.R


@Preview(showSystemUi = true)
@Composable
fun Greeting() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

//        Text(text = "Hello World", color = colorResource(R.color.purple_700))
        Image(painter = painterResource(R.drawable.animated), contentDescription = null)

    }
}