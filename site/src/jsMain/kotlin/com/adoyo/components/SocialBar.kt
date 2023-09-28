package com.adoyo.components

import androidx.compose.runtime.Composable
import com.adoyo.style.SocialLinkStyle
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.FaTwitter
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar() {
    Column(
        modifier = Modifier.margin(right = 25.px).padding(topBottom = 25.px).minWidth(40.px).borderRadius(r = 20.px)
            .backgroundColor(Colors.White)
    ) {
        SocialLinks()
    }
}

@Composable
private fun SocialLinks() {
    Link(path = "https://twitter.com/omollo004") {
        FaTwitter(modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px), size = IconSize.LG)
    }
    Link(path = "https://github.com/AdoyoClifford") {
        FaGithub(modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px), size = IconSize.LG)
    }
    Link(path = "https://www.linkedin.com/in/clifford-adoyo-5b4625210/") {
        FaLinkedin(modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px), size = IconSize.LG)
    }
}