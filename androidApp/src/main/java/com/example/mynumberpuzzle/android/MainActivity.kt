package com.example.mynumberpuzzle.android

import  android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            numberpuzzle()
        }
    }
}

<<<<<<< HEAD
=======
// commit change

>>>>>>> ca17aed78c3ba4f903572be2a6cf87dfd2e998ac
@Composable
@Preview
fun numberpuzzle() {
    Image(
        painter = painterResource(id = R.drawable.np1),
        contentDescription = null,
        contentScale = ContentScale.FillBounds
    )
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.6f)
                .background(color = rainbow.brown)
        ) {
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.1f)
                .background(color = rainbow.lightcream)
        ) {}

        Box(
            contentAlignment = Alignment.Center, modifier = Modifier
                .fillMaxSize()
                .weight(.8f)
        ) {
            Text(text = result.value, fontSize = 60.sp, color = rainbow.brown)
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.03f)
                .background(color = rainbow.brown)
        ) {}

        var tt = 0

        for (ii in 1..3) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {
                for (i in 1..3) {
                    square(rowScope = this, color = rainbow.cream, tt)
                    tt++
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.03f)
                .background(color = rainbow.brown)
        ) {
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1.2f)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1.3f), contentAlignment = Alignment.Center
            ) {
                button(text = "Restart")
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1.2f), contentAlignment = Alignment.Center
            ) {
                click(text = "Reset")
            }
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
                .weight(0.5f)
                .background(color = rainbow.brown)
        ) {
        }
    }
}

var list = mutableStateListOf<String>("1", "2", "3", "4", "5", "6", "", "7", "8")
var result = mutableStateOf("")

@Composable
fun square(rowScope: RowScope, color: Color, i: Int) {
    rowScope.apply {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .border(BorderStroke(1.1.dp, color = rainbow.brown)), color = color
        ) {
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(9.dp)
                    .background(color = rainbow.light)
                    .clickable {

                        // 01 03
                        if (result.value != "you are win!..") {
                            when (i) {
                                0 -> {
                                    change(first = 0, second = 1)
                                    change(first = 0, second = 3)
                                }

                                1 -> {
                                    change(first = 1, second = 2)
                                    change(first = 1, second = 0)
                                    change(first = 1, second = 4)
                                }

                                2 -> {

                                    change(first = 2, second = 5)
                                    change(first = 2, second = 1)
                                }

                                3 -> {
                                    change(first = 3, second = 0)
                                    change(first = 3, second = 4)
                                    change(first = 3, second = 6)
                                }

                                4 -> {
                                    change(first = 4, second = 1)
                                    change(first = 4, second = 3)
                                    change(first = 4, second = 5)
                                    change(first = 4, second = 7)
                                }

                                5 -> {
                                    change(first = 5, second = 2)
                                    change(first = 5, second = 4)
                                    change(first = 5, second = 8)
                                }

                                6 -> {
                                    change(first = 6, second = 3)
                                    change(first = 6, second = 7)
                                }

                                7 -> {
                                    change(first = 7, second = 6)
                                    change(first = 7, second = 4)
                                    change(first = 7, second = 8)
                                }

                                8 -> {
                                    change(first = 8, second = 5)
                                    change(first = 8, second = 7)
                                }
                            }

                            when (i) {
                                0 -> {
                                    cross(0, 1, 2)
                                    cross(0, 3, 6)
                                }

                                1 -> {
                                    cross(1, 4, 7)
                                }

                                2 -> {
                                    cross(2, 5, 8)
                                    cross(2, 1, 0)
                                }

                                3 -> {
                                    cross(3, 4, 5)
                                }

                                5 -> {
                                    cross(5, 4, 3)
                                }

                                6 -> {
                                    cross(6, 3, 0)
                                    cross(6, 7, 8)
                                }

                                7 -> {
                                    cross(7, 4, 1)
                                }

                                8 -> {
                                    cross(8, 7, 6)
                                    cross(8, 5, 2)
                                }
                            }

                            wincondition()
                        }
                    }) {
                Text(
                    text = list[i],
                    fontSize = 80.sp,
                    color = rainbow.brown,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

fun change(first: Int, second: Int) {

    if (list[second] == "") {
        list[second] = list[first]
        list[first] = ""
    }
}

fun cross(i1: Int, i2: Int, i3: Int) {
    if (list[i3] == "") {
        list[i3] = list[i2]
        list[i2] = list[i1]
        list[i1] = ""
    }
}

fun wincondition() {
    if (list[0] == "1" && list[1] == "2" && list[2] == "3" && list[3] == "4" && list[4] == "5" && list[5] == "6" && list[6] == "7" && list[7] == "8" && list[8] == "") {
        result.value = "you are win!.."
    } else {
        result.value = ""
    }
}

@Composable
fun button(text: String) {
    Button(
        onClick = {
            Log.d("==>", "Button : ")
            if (result.value == "you are win!..") {
                if (text == "Restart") {
                    list[0] = "1"
                    list[1] = "2"
                    list[2] = "3"
                    list[3] = "4"
                    list[4] = "5"
                    list[5] = "6"
                    list[6] = ""
                    list[7] = "7"
                    list[8] = "8"

                    result.value = ""
                }
            }
        },
        enabled = true,
        colors = ButtonDefaults.buttonColors(rainbow.brown),
        shape = RoundedCornerShape(50),
        modifier = Modifier.height(60.dp),
        border = BorderStroke(4.dp, color = rainbow.buttoncolor)
    ) {
        Text(
            text = text, fontSize = 35.sp, fontFamily = FontFamily.Serif, color = rainbow.cream
        )
    }
}

@Composable
fun click(text: String) {
    Button(
        onClick = {
            Log.d("-->", "button : ")
            if (result.value != "you are win!..") {
                if (text == "Reset") {
                    list.shuffle()
                }
            }
        },
        enabled = true,
        colors = ButtonDefaults.buttonColors(rainbow.brown),
        shape = RoundedCornerShape(50),
        modifier = Modifier.height(60.dp),
        border = BorderStroke(4.dp, color = rainbow.buttoncolor)
    ) {
        Text(
            text = text,
            fontSize = 35.sp,
            fontFamily = FontFamily.Serif,
            color = rainbow.cream
        )
    }
}
