package com.adoyo.components

import androidx.compose.runtime.Composable
import com.adoyo.models.Section
import com.adoyo.models.Theme
import com.adoyo.style.LogoStyle
import com.adoyo.style.NavigationStyle
import com.adoyo.util.Constants.FONT_FAMILY
import com.adoyo.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun Header() {
    val breakpoint = rememberBreakpoint()
    Row(
        modifier = Modifier.fillMaxWidth(if (breakpoint > Breakpoint.MD) 80.percent else 90.percent)
            .padding(topBottom = 50.px),
        horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically
    ) {
        LeftSide(breakpoint = breakpoint)
        if (breakpoint > Breakpoint.MD) {
            RightSide()
        }
    }
}

@Composable
fun LeftSide(breakpoint: Breakpoint) {
    if (breakpoint <= Breakpoint.MD) {
        FaBars()
    }
    Row {
        Image(modifier = LogoStyle.toModifier(), src = Res.Image.logo, desc = "logo")
    }
}

@Composable
fun RightSide() {
    Row(
        modifier = Modifier.fillMaxWidth().borderRadius(r = 50.px).backgroundColor(Theme.LighterGray.rgb)
            .padding(20.px),
        horizontalArrangement = Arrangement.End
    ) {
        Section.entries.toTypedArray().take(6).forEach { section ->
            Link(
                modifier = NavigationStyle.toModifier().padding(right = 30.px).fontFamily(FONT_FAMILY).fontSize(18.px)
                    .fontWeight(
                        FontWeight.Medium
                    ).textDecorationLine(TextDecorationLine.None), path = section.path, text = section.title
            )
        }
    }
}