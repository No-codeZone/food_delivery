package com.example.fooddelivery.ui.theme.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.AppTheme

@Composable
fun ProductPreviewSection(modifier: Modifier = Modifier) {
    
}

@Composable
private fun ActionBar(
    modifier: Modifier = Modifier,
    headline:String
    ) {
    Row(
        modifier=modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = headline,
            style = AppTheme.typography.headLine,
            color = AppTheme.colors.onSecondarySurface
        )
    }
}

@Composable
private fun CloseButton(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        color = AppTheme.colors.actionSurface,
        contentColor = AppTheme.colors.secondarySurface
    ){
        Box(
            modifier=Modifier.fillMaxSize()
        ){
            Icon(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = null,
                modifier=Modifier.size(24.dp),
            )
        }
    }
}
