package utils

import org.jnativehook.keyboard.NativeKeyEvent
import org.jnativehook.keyboard.NativeKeyListener

class GlobalKeyListener : NativeKeyListener {
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