package ui.screens.core

import data.ActionData
import data.ActionState

data class CoreUiState(
    val actionData: List<ActionData> = listOf(
        ActionData("Click", ActionState.Inactive, 0.0, 0)
    )
)
