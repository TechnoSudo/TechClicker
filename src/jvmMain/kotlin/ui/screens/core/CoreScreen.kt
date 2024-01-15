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
import androidx.compose.runtime.remember
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

    private val viewModel = CoreViewModel()
    private val uiState = CoreUiState()

    @Composable
    override fun render() {
        CoreContent(
            viewModel = viewModel,
            uiState = uiState,
            navigation = navigation
        )
    }
}

@Composable
private fun CoreContent(
    viewModel: CoreViewModel,
    uiState: CoreUiState,
    navigation: StackNavigation<Screen>
) {
    Row {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
        ) {
            item {
                Button(onClick = { viewModel.start() }) {
                    TextM(text = "Start")
                }
                Button(onClick = { viewModel.stop() }) {
                    TextM(text = "Stop")
                }
                Button(onClick = { navigation.push(Screen.AddComponent) }) {
                    TextM(text = "Add action")
                }
            }
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
            items(data) {
                ActionCard(
                    modifier = Modifier.fillMaxWidth(),
                    data = it
                )
            }
            item { HeightSpacer(10.dp) }
        }
    }
}