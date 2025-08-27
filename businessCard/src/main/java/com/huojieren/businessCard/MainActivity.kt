package com.huojieren.businessCard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.huojieren.businessCard.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(210, 232, 212)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Overview()
        Contact()
    }
}

@Composable
fun Overview() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(
            bottom = 120.dp
        )
    ) {
        Photo()
        Profile()
    }

}

@Composable
fun Contact() {
    Column(
        verticalArrangement = Arrangement.Center,
    ) {
        Row {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = null,
                tint = Color(34, 127, 81),
                modifier = Modifier.padding(
                    end = 18.dp
                )
            )
            Text(
                text = "+86 13829288096",
                fontSize = 14.sp,
            )
        }
        Row {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = null,
                tint = Color(34, 127, 81),
                modifier = Modifier.padding(
                    end = 18.dp
                )
            )
            Text(
                text = "@HuoJieren",
                fontSize = 14.sp
            )
        }
        Row {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null,
                tint = Color(34, 127, 81),
                modifier = Modifier.padding(
                    end = 18.dp
                )
            )
            Text(
                text = "1956934061@qq.com",
                fontSize = 14.sp
            )
        }
    }
}

@Composable
fun Photo() {
    val image = painterResource(id = R.drawable.android_logo)
    Box(
        modifier = Modifier.background(Color(7, 48, 66))
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )
    }
}

@Composable
fun Profile() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Jieren Huo",
            fontSize = 48.sp,
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(34, 127, 81),
        )
    }
}


@Preview
@Composable
fun BusinessCardPreview() {
    MyApplicationTheme {
        BusinessCard()
    }
}

/*
* 永远都是先做了内容，再做样式
* 先考虑有内容，再考虑做漂亮
* 先把东西写出来，再考虑做规范
* 先动手
*/