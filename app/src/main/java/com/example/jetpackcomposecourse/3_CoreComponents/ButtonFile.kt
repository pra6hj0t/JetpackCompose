package com.example.jetpackcomposecourse.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@Composable
fun FillButtonSample(){
    val context = LocalContext.current

    Button(onClick = {
        Toast.makeText(context, "Filled Button is clicked", Toast.LENGTH_SHORT).show()
    }, modifier = Modifier.width(150.dp)) {
        Text("Filled Button")
    }


}


@Composable
fun TonalButtonSample(){
    val context = LocalContext.current
    FilledTonalButton(onClick = {
        Toast.makeText(context, "Tonal Button is clicked", Toast.LENGTH_SHORT).show()
    }, modifier = Modifier.width(150.dp)) {
        Text("Tonal Button")

    }
}

@Composable
fun OutlinedButtonSample(){
    val context = LocalContext.current

    OutlinedButton(onClick = {
        Toast.makeText(context, "Outlined Button is clicked", Toast.LENGTH_SHORT).show()
    }, modifier = Modifier.width(150.dp)) {
        Text("Outlined Button")

    }
}

@Composable
fun ElevatedButtonSample(){
    val context = LocalContext.current

    ElevatedButton(onClick = {
        Toast.makeText(context, "Elevated Button is clicked", Toast.LENGTH_SHORT).show()
    }) {
        Text("Elevated Button")

    }
}

@Composable
fun TextButtonSample(){
    val context = LocalContext.current

    TextButton(onClick = {
        Toast.makeText(context, "Text Button is clicked", Toast.LENGTH_SHORT).show()
    }, modifier = Modifier.width(150.dp)) {
        Text("Text Button")

    }
}