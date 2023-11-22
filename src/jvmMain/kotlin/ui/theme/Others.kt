package ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.dp

val ReadexProFamily = FontFamily(Font(
    resource = "font/ReadexPro.ttf",
    weight = FontWeight.Normal,
    style = FontStyle.Normal
))
val OpenSansFamily = FontFamily(Font(
    resource = "font/OpenSans.ttf",
    weight = FontWeight.Normal,
    style = FontStyle.Normal
))

object KDEBorders {
    val Normal = BorderStroke(1.dp, SolidColor(KDEColors.BorderNormal))
}