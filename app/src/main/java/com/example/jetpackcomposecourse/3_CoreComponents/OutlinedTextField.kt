package com.example.jetpackcomposecourse.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showSystemUi = true)
fun SimpleOutlinedTextField() {

    var Pass by rememberSaveable {
        mutableStateOf("")
    }

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

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
//        OutlinedTextField(
//            value = text,
//            onValueChange = {
//                text = it
//            },
//            label = {
//                Text("Enter Your Name")
//            }, textStyle = TextStyle(
//                brush = brush
//            )
//        )


        TextField(
            value = Pass, onValueChange = {
            Pass = it
        }, label = {
            Text("Enter Your Password")
        },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )
    }
}