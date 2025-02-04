package com.example.fooddelivery.ui.theme

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@RequiresApi(Build.VERSION_CODES.Q)
private val UnboundedFontFamily =FontFamily(
    Font(R.font.unbounded_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.unbounded_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.unbounded_regular, FontWeight.Normal, FontStyle.Normal),
)

@Immutable
data class AppTypography(
    val headLine:TextStyle,
    val titleLarge:TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val body:TextStyle,
    val bodySmall:TextStyle,
    val label: TextStyle,
)

val LocalAppTypography= staticCompositionLocalOf {
    AppTypography(
        headLine = TextStyle.Default,
        titleLarge = TextStyle.Default,
        titleMedium = TextStyle.Default,
        titleSmall = TextStyle.Default,
        bodySmall = TextStyle.Default,
        body = TextStyle.Default,
        label = TextStyle.Default
    )
}

@RequiresApi(Build.VERSION_CODES.Q)
val ExtendedTypography=AppTypography(
    headLine = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 32.sp,
        fontWeight = FontWeight.Normal
    ),
    titleLarge = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.Normal
    ),
    titleMedium = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal
    ),
    titleSmall = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    ),
    body = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
    bodySmall = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    ), label = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontSize = 11.sp,
        fontWeight = FontWeight.Light
    )
)