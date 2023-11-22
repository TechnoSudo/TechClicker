package ui.components.texts

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.sp
import helpers.fontLoader
import ui.theme.KDEColorPalette
import ui.theme.ReadexProFamily

@Composable
fun TextMedium(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        text = text,
        color = KDEColorPalette.White,
        fontSize = 16.sp,
        fontFamily = ReadexProFamily
    )
}