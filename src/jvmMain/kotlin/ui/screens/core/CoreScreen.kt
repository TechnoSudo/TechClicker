package ui.screens.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.push
import data.ActionData
import data.ActionState
import ui.components.ActionCard
import ui.components.texts.TextM
import ui.navigation.Component
import ui.navigation.Screen
import ui.theme.HeightSpacer
import ui.theme.KDEBorders
import ui.theme.KDEColors
import ui.theme.shapeScheme

class CoreScreen(
    private val componentContext: ComponentContext,
    private val navigation: StackNavigation<Screen>
) : Component, ComponentContext by componentContext {

    @Composable
    override fun render() {
        CoreContent(navigation = navigation)
    }
}

@Composable
private fun CoreContent(navigation: StackNavigation<Screen>) {
    Row {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
        ) {
            item { Button(onClick = { navigation.push(Screen.AddComponent) }) {
                TextM(text = "Add action")
            } }
        }
        ActionList(
            modifier = Modifier
                .weight(1f),
            data = emptyList()
        )
    }
}

@Composable
private fun ActionList(
    data: List<ActionData>,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        color = KDEColors.BackgroundDark,
        shape = MaterialTheme.shapeScheme.medium,
        border = KDEBorders.Normal
    ) {
        LazyColumn(
            modifier = Modifier
        ) {
            items(listOf(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5)) {
                ActionCard(
                    modifier = Modifier.fillMaxWidth(),
                    data = ActionData("xdddd", 0.0, ActionState.Inactive, 0.4)
                )
            }
            item { HeightSpacer(10.dp) }
        }
    }
}