package com.adoyo.sections

import androidx.compose.runtime.Composable
import com.adoyo.models.Section
import com.adoyo.util.Constants
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px

@Composable
fun AboutSection() {
    Box(
        modifier = Modifier.id(Section.About.id).maxWidth(Constants.MAX_WIDTH.px).padding(topBottom = 150.px),
        contentAlignment = Alignment.Center
    ) {

    }
}