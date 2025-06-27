package com.example.jetpackcomposecourse.`8_InputChips`

import android.widget.Toast
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext


@Composable
fun InputChipsExample() {

    val context = LocalContext.current
    var enable by remember {
        mutableStateOf(false)
    }


    InputChip(
        onClick = {
            enable = !enable
            if (enable){
                Toast.makeText(context, "Enabled", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(context, "Disabled", Toast.LENGTH_SHORT).show()
            }
        },
        label = {
            Text("Input Chip")
        },
        selected = enable,
        avatar = {
            if (enable){
                Icon(
                    Icons.Default.Person, contentDescription = "Person",
                    Modifier.size(InputChipDefaults.AvatarSize)
                )
            }
        }, trailingIcon = {
           if (enable){
               Icon(
                   Icons.Default.Close, contentDescription = "Close",
                   Modifier.size(InputChipDefaults.AvatarSize)
               )
           }

        }
    )

}
