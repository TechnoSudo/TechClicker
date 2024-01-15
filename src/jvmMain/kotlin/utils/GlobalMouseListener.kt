package utils

import org.jnativehook.GlobalScreen
import org.jnativehook.mouse.NativeMouseEvent
import org.jnativehook.mouse.NativeMouseListener
import java.util.logging.Level
import java.util.logging.Logger


class GlobalMouseListener(
    val onClick: (Int, Int) -> Unit = { _, _ -> }
) : NativeMouseListener {

    init {
        val logger = Logger.getLogger(GlobalScreen::class.java.getPackage().name)
        logger.setLevel(Level.OFF);
    }

    override fun nativeMouseClicked(nativeEvent: NativeMouseEvent) {}
    override fun nativeMousePressed(nativeEvent: NativeMouseEvent) {
        val x = nativeEvent.x
        val y = nativeEvent.y
        onClick(x, y)
    }
    override fun nativeMouseReleased(nativeEvent: NativeMouseEvent) {}
}