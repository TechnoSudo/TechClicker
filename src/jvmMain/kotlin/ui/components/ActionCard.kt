package ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.ActionData
import ui.components.texts.TextL
import ui.components.texts.TextXL
import ui.theme.KDEBorders
import ui.theme.KDEColors
import ui.theme.shapeScheme

@Composable
fun ActionCard(
    modifier: Modifier = Modifier,
    data: ActionData
) {
    Surface(
        modifier = modifier
            .padding(
                top = 10.dp,
                start = 10.dp,
                end = 10.dp
            ),
        shape = MaterialTheme.shapeScheme.medium,
        border = KDEBorders.Normal
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextL(
                text = "Action title"
            )
            Surface(
                modifier = Modifier
                    .padding(10.dp),
                shape = MaterialTheme.shapeScheme.medium,
                color = KDEColors.BackgroundDark,
                border = KDEBorders.Normal
            ) { NumberBox(value = 12.0) }
        }
    }
}

@Composable
private fun NumberBox(
    modifier: Modifier = Modifier,
    value: Double
) {
    TextXL(
        modifier = modifier
            .padding(
                top = 2.dp,
                bottom = 4.dp,
                start = 8.dp,
                end = 8.dp
            ),
        text = value.toString()
    )
}