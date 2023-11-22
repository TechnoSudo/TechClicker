package ui.navigation

import com.arkivanov.essenty.parcelable.Parcelable

sealed class Screen : Parcelable {
//    object Input : ScreenConfig()
//    data class Greeting(val name: String) : ScreenConfig()
    object Core : Screen()
    object AddComponent : Screen()
}