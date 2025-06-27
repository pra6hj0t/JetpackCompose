package com.example.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jetpackcomposecourse.`10_States`.ColorBox
import com.example.jetpackcomposecourse.`11_SnackBar`.SnackBarSample
import com.example.jetpackcomposecourse.`12_Lists`.ColumnExample
import com.example.jetpackcomposecourse.`12_Lists`.LazyColumnExample
import com.example.jetpackcomposecourse.`3_CoreComponents`.ImageSample
import com.example.jetpackcomposecourse.`3_CoreComponents`.SimpleText2
import com.example.jetpackcomposecourse.`4_LayoutComposables`.LazyRowSample
import com.example.jetpackcomposecourse.`5_BottomSheet`.ElevatedCardSample
import com.example.jetpackcomposecourse.`5_BottomSheet`.PartialBottomSheet
import com.example.jetpackcomposecourse.`7_CheckBox`.AdvanceCheckBoxExample
import com.example.jetpackcomposecourse.`7_CheckBox`.CheckBoxSample
import com.example.jetpackcomposecourse.`8_InputChips`.InputChipsExample

import com.example.jetpackcomposecourse.`9_AlertDialogBox`.DialogWithImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {





//                FillButtonSample()
//                TonalButtonSample()
//                OutlinedButtonSample()
//                ElevatedButtonSample()
//                TextButtonSample()
//                ImageSample()
//                LazyRowSample()
//                PartialBottomSheet()
//                ElevatedCardSample()
//                  CheckBoxSample()
//                AdvanceCheckBoxExample()
//                InputChipsExample()
//                    DialogWithImage()
//                SimpleText2()
//                ColorBox()
//                SnackBarSample()
//            ColumnExample()
            LazyColumnExample()





        }
    }
}
