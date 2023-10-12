package com.choo.boxlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.choo.boxlayout.ui.theme.BoxLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
//    Box(contentAlignment = Alignment.CenterEnd,
//    modifier = Modifier.size(400.dp, 400.dp)) {
//        val height = 200.dp
//        val width = 200.dp
//
//        TextCell("1", Modifier.size(width, height))
//        TextCell("2", Modifier.size(width, height))
//        TextCell("3", Modifier.size(width, height))
//    }

//    Box(modifier = Modifier.size(290.dp, 90.dp)) {
//        Text("TopStart", modifier = Modifier.align(Alignment.TopStart))
//        Text("TopCenter", modifier = Modifier.align(Alignment.TopCenter))
//        Text("TopEnd", modifier = Modifier.align(Alignment.TopEnd))
//
//        Text("CenterStart", modifier = Modifier.align(Alignment.CenterStart))
//        Text("Center", modifier = Modifier.align(Alignment.Center))
//        Text("CenterEnd", modifier = Modifier.align(Alignment.CenterEnd))
//
//        Text("BottomStart", modifier = Modifier.align(Alignment.BottomStart))
//        Text("BottomCenter", modifier = Modifier.align(Alignment.BottomCenter))
//        Text("BottomEnd", modifier = Modifier.align(Alignment.BottomEnd))
//    }
//    Box(Modifier.size(200.dp).clip(CircleShape).background(Color.Blue))
//    Box(Modifier.size(200.dp).clip(RoundedCornerShape(30.dp)).background(Color.Blue))
    Box(Modifier.size(200.dp).clip(CutCornerShape(30.dp)).background(Color.Blue))
}

@Composable
fun TextCell(text: String, modifier: Modifier = Modifier, fontSize: Int = 150) {
    val cellModifier = Modifier
        .padding(4.dp)
        .border(width = 4.dp, color = Color.Black)

    Surface() {
        Text(
            text = text, cellModifier.then(modifier),
            fontSize = fontSize.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BoxLayoutTheme {
        MainScreen()
    }
}