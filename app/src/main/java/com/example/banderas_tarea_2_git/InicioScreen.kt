package com.example.banderas_tarea_2_git

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource


@Composable
fun Blue(modifier: Modifier = Modifier){
    Box(
        modifier = modifier.background(Color.Blue).fillMaxWidth()
    )
}
@Composable
fun White(modifier: Modifier = Modifier){
    Box(
        modifier = modifier.background(Color.White).fillMaxWidth()
    )
}


