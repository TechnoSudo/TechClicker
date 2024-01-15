package utils.actions

import data.ActionData
import utils.Action
import java.awt.Robot
import java.awt.event.InputEvent

class ClickAction(
    private val x: Int,
    private val y: Int,
    private val inputEvent: Int,

    override var data: ActionData,
    override val robot: Robot
) : Action {

    override fun onStart() {
        robot.mouseMove(x, y)
        robot.mousePress(inputEvent)
        robot.mouseRelease(inputEvent)
    }
}