package com.example.android

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class PreviewProvider : PreviewParameterProvider<String> {
    override val values = sequenceOf("1", "2")
}
