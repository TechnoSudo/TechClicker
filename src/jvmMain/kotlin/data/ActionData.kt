package data

data class ActionData(
    val title: String,
    val timeLeft: Double,
    val state: ActionState,
    val partFilled: Double
)

enum class ActionState {
    Inactive,
    Performing,
    Waiting
}
