package ui.components.texts

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import ui.theme.KDEColorPalette
import ui.theme.ReadexProFamily

@Composable
fun TextLarge(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        text = text,
        color = KDEColorPalette.White,
        fontSize = 24.sp,
        fontFamily = ReadexProFamily
    )
}