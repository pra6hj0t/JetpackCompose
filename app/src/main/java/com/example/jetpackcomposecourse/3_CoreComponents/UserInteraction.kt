package com.example.jetpackcomposecourse.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink

@Composable

fun SelectableText() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        SelectionContainer {
            Column {
                Text("one")
                Text("two")
                Text("three")
                Text("four")
                Text("five")
                Text("six")
                Text("seven")
                Text("eight")
                Text("nine")
                Text("ten\n\n\n")

                DisableSelection {
                    Text("one")
                    Text("two")
                    Text("three")
                    Text("four")
                    Text("five")
                }


            }
        }
    }
}

@Composable
//@Preview(showSystemUi = true)
fun TextWithLink() {

    val uriHandler = LocalUriHandler.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            buildAnnotatedString {

                append("hey Google ")
                val link = LinkAnnotation.Url(
                    url = "https://www.google.com",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Blue
                        )
                    )

                ){
                    val url = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(url)

                }

                withLink (link){
                    append("click me!")
                }

            }
        )
    }

}