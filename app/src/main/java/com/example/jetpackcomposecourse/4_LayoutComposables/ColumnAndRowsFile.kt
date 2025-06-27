package com.example.jetpackcomposecourse.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecourse.`3_CoreComponents`.ImageSample

@Composable

fun LazyColumnSample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Lazy Column is used for the Lists", color = Color.Yellow)

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(10.dp)
                .background(Color.LightGray)

        ) {
            items(100) { count ->
                Text(
                    "Item no : ${count + 1} in Lazy Column",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(Color.White)
                )
            }
        }
    }

}

@Composable
//@Preview(showSystemUi = true)
fun LazyRowSample() {


    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        items(100) { index ->
//            Text(
//                "item no : ${index + 1}", fontSize = 24.sp,
//                modifier = Modifier
//                    .padding(5.dp)
//                    .background(Color.White)
//            )


            ImageSample(index+1)


        }
    }
}



