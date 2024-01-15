package ui.screens.core

import data.ActionData
import data.ActionState
import dyorgio.runtime.jinputhook.JInputHook
import dyorgio.runtime.jinputhook.Shortcut
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.java.games.input.Component.Identifier.Key
import utils.Action
import utils.actions.ClickAction
import java.awt.Robot
import java.awt.event.InputEvent
import dyorgio.runtime.jinputhook.ShortcutListener
import org.jnativehook.GlobalScreen
import org.jnativehook.NativeHookException
import utils.GlobalKeyListener


class CoreViewModel {

    private val coroutine = CoroutineScope(Dispatchers.Main)
    private var isActive = false
    private var repeat = false
    private val robot = Robot()
    private var actions: List<Action> = listOf(
        ClickAction(450, 1070, InputEvent.BUTTON1_DOWN_MASK, ActionData(
            "ClickApp", ActionState.Inactive, 0.0, 300
        ), robot),
        ClickAction(100, 50, InputEvent.BUTTON1_DOWN_MASK, ActionData(
            "ClickApp", ActionState.Inactive, 0.0, 300
        ), robot),
        ClickAction(100, 380, InputEvent.BUTTON1_DOWN_MASK, ActionData(
            "ClickApp", ActionState.Inactive, 0.0, 300
        ), robot),
        ClickAction(850, 750, InputEvent.BUTTON1_DOWN_MASK, ActionData(
            "ClickApp", ActionState.Inactive, 0.0, 1500
        ), robot),
        ClickAction(850, 550, InputEvent.BUTTON1_DOWN_MASK, ActionData(
            "ClickApp", ActionState.Inactive, 0.0, 300
        ), robot),
        ClickAction(650, 500, InputEvent.BUTTON1_DOWN_MASK, ActionData(
            "ClickApp", ActionState.Inactive, 0.0, 200
        ), robot),
        ClickAction(1100, 600, InputEvent.BUTTON1_DOWN_MASK, ActionData(
            "ClickApp", ActionState.Inactive, 0.0, 200
        ), robot),
        ClickAction(960, 900, InputEvent.BUTTON1_DOWN_MASK, ActionData(
            "ClickApp", ActionState.Inactive, 0.0, 200
        ), robot)

    )

    init {
        try {
            GlobalScreen.registerNativeHook();
        } catch (ex: NativeHookException) {
            System.err.println("Failed to initialize JNativeHook");
            ex.printStackTrace();
        }

        // Add the listener
        GlobalScreen.addNativeKeyListener(GlobalKeyListener())

        coroutine.launch {
            while (true) {
                if (isActive) {
                    actions.forEachIndexed { index, action ->
                        action.onStart()
                        delay(action.data.timeDuration)
                        action.onStop()
                        delay(action.data.timeAfter)
                        if (!isActive)
                            return@forEachIndexed
                    }
                    if (!repeat)
                        isActive = false
                }
                delay(5)
            }
        }
    }

    fun start() {
        isActive = true
    }
    fun stop() { isActive = false }
}