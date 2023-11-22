import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.lifecycle.LifecycleController
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import ui.navigation.NavHostComponent
import ui.theme.DecomposeDesktopExampleTheme
import javax.swing.SwingUtilities

@OptIn(ExperimentalDecomposeApi::class)
fun main() {
    val windowState = WindowState()
    val lifecycle = LifecycleRegistry()
    val root = runOnMainThreadBlocking {  NavHostComponent(DefaultComponentContext(lifecycle)) }

    singleWindowApplication(
        state = windowState,
        title = "TechClicker",
    ) {
        LifecycleController(lifecycle, windowState)

        DecomposeDesktopExampleTheme {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
            ) { root.render() }
        }
    }
}

private inline fun <T : Any> runOnMainThreadBlocking(crossinline block: () -> T): T {
    lateinit var result: T
    SwingUtilities.invokeAndWait { result = block() }
    return result
}