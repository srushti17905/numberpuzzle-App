package com.example.mynumberpuzzle.android

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.pm.ShortcutInfoCompat.Surface
import com.example.mynumberpuzzle.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            numberpuzzle()
        }
    }
}

// github

// git pull project

@Composable
@Preview
fun numberpuzzle() {

    Image(
        painter = painterResource(id = R.drawable.np1),
        contentDescription = null,
        contentScale = ContentScale.FillBounds
    )
    Column {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.7f)
                .background(color = rainbow.brown)
        )
        {
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.1f)
                .background(color = rainbow.lightcream)
        ) {
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.6f)
        )
        {
        }
        Row(modifier = Modifier
            .fillMaxSize()
            .weight(0.02f)
            .background(color = rainbow.brown))
        {

        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        )
        {
            square(rowScope = this, color = rainbow.cream, text = "1")
            square(rowScope = this, color = rainbow.cream, text = "2")
            square(rowScope = this, color = rainbow.cream, text = "3")
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            square(rowScope = this, color = rainbow.cream, text = "4")
            square(rowScope = this, color = rainbow.cream, text = "5")
            square(rowScope = this, color = rainbow.cream, text = "6")
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            square(rowScope = this, color = rainbow.cream, text = "7")
            square(rowScope = this, color = rainbow.cream, text = "8")
            square(rowScope = this, color = rainbow.cream, text = "")
        }
        Row (modifier = Modifier.fillMaxSize().weight(0.02f).background(color = rainbow.brown)){

        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1.5f), contentAlignment = Alignment.Center
        )
        {
            button(text = "Restart")
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.1f)
                .background(color = rainbow.lightcream)
        )
        {

        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.4f)
                .background(color = rainbow.brown)
        ) {

        }
    }
}

@Composable
fun square(rowScope: RowScope, color: Color, text: String) {
    rowScope.apply {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .border(BorderStroke(1.1.dp, color = rainbow.brown)), color = color
        )
        {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(9.dp), color = rainbow.light
            ) {
                Text(
                    text = text,
                    fontSize = 80.sp,
                    color = rainbow.brown,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

var number = mutableStateOf("")

@Composable
fun button(text: String) {
    Button(
        onClick = { Log.d("==>", "Button : ") },
        enabled = true,
        colors = ButtonDefaults.buttonColors(rainbow.brown),
        shape = RoundedCornerShape(50),
        modifier = Modifier.height(60.dp),
        border = BorderStroke(4.dp, color = rainbow.buttoncolor)
    )
    {
        Text(
            text = text,
            fontSize = 35.sp,
            fontFamily = FontFamily.Serif,
            color = rainbow.cream
        )
    }
}
