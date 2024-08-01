package com.example.mynumberpuzzle.android

import android.os.Bundle
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

@Composable
@Preview
fun numberpuzzle() {

        Surface(modifier = Modifier.fillMaxSize())
        {
            Image(
                painter = painterResource(id = R.drawable.number),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
        }

    Column {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {

        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.5f)
        ) {

        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        )
        {
            for (i in 1..3) {
                square(rowScope = this, color = rainbow.cream)
            }

        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            for (i in 1..3) {
                square(rowScope = this, color = rainbow.cream)
            }

        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            for (i in 1..3) {
                square(rowScope = this, color = rainbow.cream)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(2f)
        ) {

        }
    }
        }



@Composable
fun square(rowScope: RowScope , color: Color) {
    rowScope.apply {
        Surface(modifier = Modifier.fillMaxSize().padding(20.dp))
        {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(.5f)
                    .border(BorderStroke(2.dp, color = rainbow.brown)), color = color
            )
            {
                Text(text = "")
            }
        }
    }
}