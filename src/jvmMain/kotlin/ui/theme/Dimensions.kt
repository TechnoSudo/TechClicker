package ui.theme

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun HeightSpacer(space: Dp) {
    Spacer(modifier = Modifier.height(space))
}

@Composable
fun WidthSpacer(space: Dp) {
    Spacer(modifier = Modifier.width(space))
}