package com.adoyo.sections

import androidx.compose.runtime.Composable
import com.adoyo.components.Header
import com.adoyo.components.SocialBar
import com.adoyo.models.Section
import com.adoyo.models.Theme
import com.adoyo.style.MainButtonStyle
import com.adoyo.style.MainImageStyle
import com.adoyo.util.Constants.ABOUT
import com.adoyo.util.Constants.FONT_FAMILY
import com.adoyo.util.Constants.MAX_WIDTH
import com.adoyo.util.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSection() {
    val breakpoint by rememberBreakpoint()
    Box(
        modifier = Modifier.maxWidth(MAX_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
        MainContent(breakpoint)
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

@Composable
fun MainContent(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Header()
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SimpleGrid(
                modifier = Modifier.fillMaxWidth(if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent),
                numColumns = numColumns(base = 1, md = 2)
            ) {
                MainText(breakpoint)
                MainImage()
            }
        }
    }

}

@Composable
fun MainText(breakpoint: Breakpoint) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        if (breakpoint > Breakpoint.MD) {
            SocialBar()
        }
        Column {
            P(
                attrs = Modifier.margin(topBottom = 0.px).fontFamily(FONT_FAMILY).fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb).fontSize(if (breakpoint >= Breakpoint.LG)68.px else 20.px).toAttrs()
            ) {
                Text("Hello Iam")
            }

            P(
                attrs = Modifier.margin(top = 20.px, bottom = 0.px).fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Secondary.rgb).fontSize(if (breakpoint >= Breakpoint.LG)68.px else 45.px).toAttrs()
            ) {
                Text("Adoyo CLifford")
            }
            P(
                attrs = Modifier.margin(top = 10.px, bottom = 5.px).fontFamily(FONT_FAMILY).fontWeight(FontWeight.Bold)
                    .color(Theme.Secondary.rgb).fontSize(20.px).toAttrs()
            ) {
                Text("Mobile and DevOps Engineer")
            }
            P(
                attrs = Modifier.margin(bottom = 25.px).fontFamily(FONT_FAMILY).fontWeight(FontWeight.Light)
                    .maxWidth(400.px)
                    .fontStyle(FontStyle.Italic)
                    .color(Theme.Secondary.rgb).fontSize(15.px).toAttrs()
            ) {
                Text(ABOUT)
            }
            Button(
                attrs = MainButtonStyle.toModifier().height(40.px).borderRadius(r = 5.px).backgroundColor(Theme.Primary.rgb).border(width = 0.px)
                    .color(Colors.White).textDecorationLine(
                        TextDecorationLine.None
                    ).cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Link(
                    modifier = Modifier.color(Colors.White).textDecorationLine(TextDecorationLine.None),
                    text = "Hire Me",
                    path = Section.Contact.path
                )

            }
        }
    }
}

@Composable
fun MainImage() {
    Column (
        modifier = MainImageStyle.toModifier().fillMaxSize(80.percent).fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ){ Image(
        modifier = Modifier.fillMaxWidth(),
        src = Res.Image.mainImage,
        desc = "Main Image"
    ) }
}