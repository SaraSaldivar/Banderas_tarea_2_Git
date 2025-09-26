package com.example.banderas_tarea_2_git

import android.R.attr.top
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

val VerdeRaaah = Color(0xFF063828)
val rojoPatriaraah = Color(0xFFC81016)

@Preview
@Composable
fun BanderaMexicoConstraint(){
    ConstraintLayout (Modifier.fillMaxSize()){
        val(boxGreen, boxWhite, boxRed)=createRefs()
        Box(modifier = Modifier.fillMaxWidth().background(VerdeRaaah).constrainAs(boxGreen){
            top.linkTo(parent.top)
            bottom.linkTo(boxWhite.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.fillMaxWidth().background(Color.White).constrainAs(boxWhite){
            top.linkTo(boxGreen.bottom)
            bottom.linkTo(boxRed.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            height = Dimension.fillToConstraints
        }){
            ConstraintLayout (modifier = Modifier.fillMaxSize()){
            val (escudo)=createRefs()

                Image(
                    painter = painterResource(id=R.drawable.escudo_mexico),
                    contentDescription = "escudo insanote",
                    modifier = Modifier.size(200.dp)
                        .constrainAs(escudo){
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                )
            }
        }


        Box(modifier = Modifier.fillMaxWidth().background(rojoPatriaraah).constrainAs(boxRed){
            top.linkTo(boxWhite.bottom)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            height = Dimension.fillToConstraints
        })
    }
}
