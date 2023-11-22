package ui.components.texts

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import ui.theme.KDEColors
import ui.theme.ReadexProFamily

@Composable
fun TextXL(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        modifier = modifier,
        text = text,
        color = KDEColors.White,
        fontSize = 32.sp,
        fontFamily = ReadexProFamily
    )
}