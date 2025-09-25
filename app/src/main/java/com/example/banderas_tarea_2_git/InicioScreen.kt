package com.example.banderas_tarea_2_git

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
private val AzulArg= Color(0xFF6CACE4)
@Composable
fun Blue(modifier: Modifier = Modifier){
    Box(
        modifier = modifier.background(AzulArg).fillMaxWidth()
    )
}
@Composable
fun White(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.background(Color.White).fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.argentinaaaa),
            contentDescription = "Argentina escudo",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun BanderaInsanotaArg(modifier: Modifier= Modifier){
Column (modifier = modifier.aspectRatio(3f/2f).fillMaxWidth()){
    Blue(
        modifier=modifier
            .fillMaxWidth()
            .weight(1f)
    )
    White(
        modifier=modifier
            .fillMaxWidth()
            .weight(1f)
    )
    Blue(
        modifier=modifier
            .fillMaxWidth()
            .weight(1f)
    )

}
}



@Preview
@Composable
fun BanderaPreview(){
    Box(
        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
    ){
        BanderaInsanotaArg(modifier = Modifier.fillMaxWidth(0.9f))
    }
}



