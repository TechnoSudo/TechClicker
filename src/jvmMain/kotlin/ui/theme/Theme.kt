package ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.Font

private val DarkColors = darkColors(
    primary = Color(48, 163, 230),
    secondary = Color(24, 25, 29),
    background = KDEColors.BackgroundNormal,
    surface = KDEColors.SurfaceGrey,
    onPrimary = Color.White,
    onSecondary = Color.White
)

@Composable
fun DecomposeDesktopExampleTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = DarkColors,
        typography = Typography(
            defaultFontFamily = FontFamily(Font("OpenSans.ttf"))
        )
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            content()
        }
    }
}
//val KDEColors = darkColors(
//    primary = Color(0xFF007ACC),
//    onPrimary = Color(0xFFFCFCFC),
//    primaryVariant = Color(0xFF558CAA),
//    secondary = Color(0xFFBB86FC),
//    secondaryVariant = Color(0xFF3700B3),
//    onSecondary = Color(0xFFFCFCFC),
//    background = Color(0xFF2A2E3),
//    onBackground = Color(0xFFFCFCFC),
//    surface = Color(0xFF31363B), // Darker gray surface
//    onSurface = Color(0xFFFCFCFC),
//    error = Color(0xFFCF6679), // Error color
//    onError = Color.Black,
//)

object KDEColors {

    val White = Color(0xFFFCFCFC)
    val Blue = Color(0xFF3DAEE9)

    val BorderNormal = Color(0xFF6E7175)
    val BorderCyan = Color(0xFF5388A5)
    val BorderBlue = Color(0xFF3CA6DE)

    val BackgroundNormal = Color(0xFF2A2E32)
    val BackgroundDark = Color(0xFF1B1E20)

    val SurfaceGrey = Color(0xFF31363B)
    val SurfaceCyan = Color(0xFF334E5E)

    val ColorPerforming = Color(0xFFEE00FF)
    val ColorPerformingBackground = Color(0xFFEE00FF)

    val ColorWaiting = Color(0xFFFFDD00)
    val ColorWaitingBackground = Color(0xFFFFDD00)
}