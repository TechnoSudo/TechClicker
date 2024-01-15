package data

data class ActionData(
    val title: String,
    val state: ActionState,
    val partFilled: Double,
    val timeAfter: Long,
    val timeDuration: Long = 0
)

enum class ActionState {
    Inactive,
    Performing,
    Waiting
}
