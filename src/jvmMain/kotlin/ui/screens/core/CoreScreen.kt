package ui.screens.core

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.ActionData
import data.ActionState
import ui.components.ActionCard

@Composable
fun CoreDisplay() {
    Row {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
        ) { }
        LazyColumn(
            modifier = Modifier
                .weight(1f)
        ) {
            items(listOf(1,2,3,2,3,2,3,2,3,2,3)) {
                ActionCard(
                    modifier = Modifier.fillMaxWidth(),
                    data = ActionData("xdddd", 0.0, ActionState.Inactive, 0.4)
                )
            }
        }
    }
}