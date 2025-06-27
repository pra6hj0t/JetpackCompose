package com.example.jetpackcomposecourse.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
//@Preview(showSystemUi = true)
fun ColumnSample() {

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

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(brush),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Text 1")
        Text("Text 2")
        Text("Text 3")
        Text("Text 4")
        Text("Text 5")
        Text("Text 6")
        Text("Text 7")
        Text("Text 8")
        Text("Text 9")
        Text("Text 10")
    }
}


@Composable
//@Preview(showSystemUi = true)
fun RowExample() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
            .background(Color.Green),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text("Text 1")
        Text("Text 2")
        Text("Text 3")
        Text("Text 4")
        Text("Text 5")
        Text("Text 6")
        Text("Text 7")
        Text("Text 8")
        Text("Text 9")
        Text("Text 10")
    }
}


@Composable
//@Preview(showSystemUi = true)
fun BoxExample() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .size(300.dp)
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Blue)
                )
            }
        }


    }

}

@Composable
@Preview(showSystemUi = true)
fun ConstraintLayoutSample() {


    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)

            .padding(top = 50.dp)
            .background(Color.Gray)
    ) {

        val (text1, text2, text3) = createRefs()

        Text("Text 1", modifier = Modifier.constrainAs(text1) {
            bottom.linkTo(parent.bottom, margin = 10.dp)
            start.linkTo(parent.start, margin = 10.dp)
        })

        Text("Text 2", modifier = Modifier.constrainAs(text2) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)

        })
        Text("Text 3", modifier = Modifier.constrainAs(text3) {
            end.linkTo(parent.end, margin = 10.dp)
            top.linkTo(parent.top, margin = 10.dp)
        })

    }

//    ConstraintLayout {
//
//        val (button, text) = createRefs()
//
//        Button(onClick = {}, modifier = Modifier.constrainAs(button) {
//            top.linkTo(parent.top, margin = 150.dp)
//            start.linkTo(parent.start, margin = 150.dp)
//        }) {
//            Text("Button")
//        }
//
//
//        Text("Text", modifier = Modifier.constrainAs(text) {
//            top.linkTo(button.bottom, margin = 10.dp)
//            start.linkTo(parent.start, margin = 170.dp)
//        }, fontSize = 24.sp)
//    }
}



