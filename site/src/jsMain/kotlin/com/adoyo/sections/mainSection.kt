package com.adoyo.sections

import androidx.compose.runtime.Composable
import com.adoyo.components.Header
import com.adoyo.util.Constants.MAX_WIDTH
import com.adoyo.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection() {
    Box(
        modifier = Modifier.maxWidth(MAX_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
    }
}

@Composable
fun MainBackground() {
    Image(
        src = Res.Image.background,
        desc = "background image",
        modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Cover)
    )
}