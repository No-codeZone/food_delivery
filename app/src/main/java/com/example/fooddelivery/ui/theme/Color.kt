package com.example.fooddelivery.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

@Immutable
data class AppColor(
    val background:Color,
    val onBackground:Color,
    val surface:Color,
    val onSurface:Color,
    val secondarySurface:Color,
    val onSecondarySurface:Color,
    val regularSurface:Color,
    val onRegularSurface:Color,
    val actionSurface:Color,
    val onActionSurface:Color,
    val highlightSurface:Color,
    val onHighlightSurface:Color,
)

val localAppColors= staticCompositionLocalOf {
    AppColor(
        background = Color.Unspecified,
        onBackground = Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        regularSurface = Color.Unspecified,
        onRegularSurface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighlightSurface = Color.Unspecified
    )
}

val extendedColors = AppColor(
    background = Color.White,
    onBackground = Color.DarkGray,
    surface = Color.White,
    onSurface = Color.DarkGray,
    secondarySurface = Pink40,
    onSecondarySurface = Color.White,
    regularSurface = Color.Yellow,
    onRegularSurface = Color.DarkGray,
    actionSurface = Color.LightGray,
    onActionSurface = Color.Blue,
    highlightSurface = Color.Green,
    onHighlightSurface = Color.White
)