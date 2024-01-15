package utils

import org.jnativehook.GlobalScreen
import org.jnativehook.keyboard.NativeKeyEvent
import org.jnativehook.keyboard.NativeKeyListener
import java.util.logging.Level
import java.util.logging.Logger

class GlobalKeyListener : NativeKeyListener {

    init {
        val logger = Logger.getLogger(GlobalScreen::class.java.getPackage().name)
        logger.setLevel(Level.OFF);
    }
    override fun nativeKeyTyped(p0: NativeKeyEvent?) {}
    override fun nativeKeyPressed(p0: NativeKeyEvent?) {
        p0?.let {
            println("Key Pressed: " + NativeKeyEvent.getKeyText(it.keyCode))
        }
    }
    override fun nativeKeyReleased(p0: NativeKeyEvent?) {
        p0?.let {
            println("Key Released: " + NativeKeyEvent.getKeyText(it.keyCode))
        }
    }
}