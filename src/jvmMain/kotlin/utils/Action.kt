package utils

import data.ActionData
import java.awt.Robot

interface Action {
    var data: ActionData;
    val robot: Robot;
    fun onStart()
    fun onStop() = run { }
}