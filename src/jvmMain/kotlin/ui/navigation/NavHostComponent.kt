package ui.navigation

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import ui.screens.addaction.AddActionScreen
import ui.screens.core.CoreScreen

class NavHostComponent(
    componentContext: ComponentContext
) : Component, ComponentContext by componentContext {
    private val navigation = StackNavigation<Screen>()
    private val stack = childStack(
        source = navigation,
        initialConfiguration = Screen.Core,
        childFactory = ::createScreenComponent
    )
    private fun createScreenComponent(
        screen: Screen,
        componentContext: ComponentContext
    ): Component {
        return when (screen) {

            is Screen.Core -> CoreScreen(
                componentContext = componentContext,
                navigation = navigation
            )
            is Screen.AddComponent -> AddActionScreen(
                componentContext = componentContext,
                navigation = navigation
            )
        }
    }

    @OptIn(ExperimentalDecomposeApi::class)
    @Composable
    override fun render() {
        Children(
            stack = stack,
            animation = stackAnimation(fade() + scale()),
        ) {
            it.instance.render()
        }
    }
}

