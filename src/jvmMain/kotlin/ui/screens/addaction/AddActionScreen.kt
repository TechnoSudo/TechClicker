package ui.screens.addaction

import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import ui.components.texts.TextM
import ui.navigation.Component
import ui.navigation.Screen

class AddActionScreen(
    private val componentContext: ComponentContext,
    private val navigation: StackNavigation<Screen>
) : Component, ComponentContext by componentContext {

    @Composable
    override fun render() {
        AddActionContent(navigation = navigation)
    }
}

@Composable
private fun AddActionContent(navigation: StackNavigation<Screen>) {

    Button(onClick = { navigation.pop() }) {
        TextM(text = "Go back")
    }
}