package com.example.jetpackcomposecourse.`7_CheckBox`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState

@Composable
fun CheckBoxSample() {

    var checked by remember { mutableStateOf(false) }


    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text("Minimal Checkbox")
        Checkbox(
            checked = checked,
            onCheckedChange = {
                checked = it
            }
        )
    }

    Text(
        if (checked) {
            "Checkbox is checked"
        } else {
            "Checkbox is not checked"
        }
    )
}

@Composable
fun AdvanceCheckBoxExample() {


    // Initialize states for the child checkboxes
    var childCheckedStates = remember {
        mutableStateListOf(false, false, false)
    }

    // Compute the parent state based on children's states

    val parentState = when {
        childCheckedStates.all { it } -> ToggleableState.On
        childCheckedStates.none { it } -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }


    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        // Parent TriStateCheckbox
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Select All")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    // Determine new state based on current state
                    val newState = parentState != ToggleableState.On
                    childCheckedStates.forEachIndexed { index, _ ->
                        childCheckedStates[index] = newState
                    }

                }
            )
        }

        // Child Checkboxes

        childCheckedStates.forEachIndexed { index, isChecked ->
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Text("Option ${index+1}")
                Checkbox(
                    checked = isChecked,
                    onCheckedChange = {
                        childCheckedStates[index] = it
                    }
                )
            }
        }

        if (childCheckedStates.all { it }) {
            Text("All options selected")
        }else{
            Text("Some options not selected")
        }
    }


}



