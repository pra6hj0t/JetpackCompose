package com.example.jetpackcomposecourse.`3_CoreComponents`

import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecourse.R

@Composable
//@Preview(showSystemUi = true)
fun SimpleText() {

    val rainBow = listOf(
        Color.Red,
        Color.Cyan,
        Color.Yellow,
        Color.Green,
        Color.Blue,
        Color.Magenta,
    )

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {

//        Text(
//            "Hello Prabhjot",
//            color = Color.Red,
//            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold,
//            style = TextStyle(
//                shadow = Shadow(Color.Black, blurRadius = 10f)
//            )
//        )


//        Text(
//            text = buildAnnotatedString{
//                append("Hello")
//                withStyle(
//                    SpanStyle(
//                        brush = Brush.linearGradient(
//                            colors = rainBow
//                        )
//                    )
//                ) {
//                    append("\nPrabhjot")
//                }
//
//            }
//        )


        Text(
            "Hello Prabhjot Singh How are you What's going on today",
            fontSize = 32.sp,
            modifier = Modifier.basicMarquee()
        )
    }

}

@Composable
fun SimpleText2() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("J")
                }
                append("etpack ")

                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("C")
                }
                append("ompose")

            },
            fontSize = 32.sp,
            color = Color.White,
            fontFamily = FontFamily(Font(R.font.cursive_semibold, FontWeight.SemiBold)),
            textDecoration = TextDecoration.Underline

        )


    }

}