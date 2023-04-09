package com.example.android

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter

@Composable
fun PreviewTest(param: String) {
    Text(param)
}

@Preview
@Composable
fun PreviewTestPreview(
    @PreviewParameter(PreviewProvider::class) param: String,
) {
    PreviewTest(param)
}
