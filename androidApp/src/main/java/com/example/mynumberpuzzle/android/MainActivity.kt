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

@Composable
@Preview
fun numberpuzzle() {
    Image(
        painter = painterResource(id = R.drawable.np1),
        contentDescription = null,
        contentScale = ContentScale.FillBounds
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
    )
    {
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
        )
        {
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(.6f)
        )
        {
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.03f)
                .background(color = rainbow.brown)
        )
        {
        }

        var tt = 0

        for (ii in 1..3) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
            {
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

var list = mutableStateListOf<String>("1","2","3","4","5","6","7","8","")
var number = mutableStateOf("")

@Composable
fun square(rowScope: RowScope, color: Color , i : Int ) {
    rowScope.apply {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .border(BorderStroke(1.1.dp, color = rainbow.brown)), color = color
        )
        {
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(9.dp)
                    .background(color = rainbow.light)
                    .clickable {

                            if (list[i] == "8" && list[8] == "") {
                                list[7] = ""
                                list[8] = "8"
                            } else if (list[i] == "8" && list[7] == "") {
                                list[8] = ""
                                list[7] = "8"
                            } else if (list[i] == "7" && list[7] == "") {
                                list[6] = ""
                                list[7] = "7"
                            } else if (list[i] == "7" && list[6] == "") {
                                list[7] = ""
                                list[6] = "7"
                            } else if (list[i] == "6" && list[8] == "") {
                                list[5] = ""
                                list[8] = "6"
                            } else if (list[i] == "6" && list[5] == "") {
                                list[8] = ""
                                list[5] = "6"
                            } else if (list[i] == "5" && list[5] == "") {
                                list[4] = ""
                                list[5] = "5"
                            } else if (list[i] == "5" && list[4] == "") {
                                list[5] = ""
                                list[4] = "5"
                            } else if(list[i] == "5" && list[1] == "")
                            {
                                list[4] = ""
                                list[1] = "5"
                            }
                            else if (list[i] == "4" && list[4] == "") {
                                list[3] = ""
                                list[4] = "4"
                            } else if (list[i] == "4" && list[3] == "") {
                                list[4] = ""
                                list[3] = "4"
                            } else if (list[i] == "3" && list[5] == "") {
                                list[2] = ""
                                list[5] = "3"
                            } else if (list[i] == "3" && list[2] == "") {
                                list[5] = ""
                                list[2] = "3"
                            } else if (list[i] == "2" && list[2] == "") {
                                list[1] = ""
                                list[2] = "2"
                            } else if (list[i] == "2" && list[1] == "") {
                                list[2] = ""
                                list[1] = "2"
                            } else if (list[i] == "1" && list[1] == "") {
                                list[0] = ""
                                list[1] = "1"
                            } else if (list[i] == "1" && list[0] == "") {
                                list[1] = ""
                                list[0] = "1"
                            } else if (list[i] == "1" && list[2] == "") {
                                list[1] = ""
                                list[2] = "1"
                            } else if (list[i] == "1" && list[1] == "") {
                                list[2] = ""
                                list[1] = "1"
                            } else if (list[i] == "1" && list[5] == "") {
                                list[2] = ""
                                list[5] = "1"
                            }
                    }
            ) {
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

@Composable
fun button(text: String) {
    Button(
        onClick = { Log.d("==>", "Button : ")
                  },
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
