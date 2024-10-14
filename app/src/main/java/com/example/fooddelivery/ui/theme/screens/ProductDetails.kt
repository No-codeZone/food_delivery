package com.example.fooddelivery.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.fooddelivery.ui.theme.screens.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(modifier: Modifier = Modifier) {
    val scrollableState= rememberScrollState()
    Column(
        modifier = modifier.verticalScroll(scrollableState)
    ){
        ProductPreviewSection()
    }
}