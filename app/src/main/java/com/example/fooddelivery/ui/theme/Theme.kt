package com.example.fooddelivery.ui.theme

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        localAppColors provides extendedColors,
        LocalAppTypography provides ExtendedTypography
    ) {
        MaterialTheme(
            content = content
        )
    }
}

object AppTheme{
    val colors:AppColor
    @Composable
    get() = localAppColors.current
    val typography:AppTypography
        @Composable
        get() = LocalAppTypography.current
}