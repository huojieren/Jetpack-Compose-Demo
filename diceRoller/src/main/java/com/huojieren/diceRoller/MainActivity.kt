package com.huojieren.diceRoller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.huojieren.diceRoller.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                DiceRollerApp()
            }
        }
    }
}

@Preview
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
    /*
    * fillMaxSize() 方法会指定组件应填满可用空间。
    * wrapContentSize() 方法会指定可用空间应至少与其内部组件一样大。
    * 但是，由于使用了 fillMaxSize() 方法，因此如果布局内的组件小于可用空间，
    * 则可以将 Alignment 对象传递到 wrapContentSize() 方法，
    * 以指定组件应如何在可用空间内对齐。
    */
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }
    /*
    * 默认情况下，可组合函数（DiceWithButtonAndImage）是无状态的，
    * 这意味着它们不存储值（在内存中），并且可随时被系统重组，从而导致值被重置。
    * 不过，Compose 提供了一种避免这种情况的便捷方式。
    * 可组合函数可以使用 remember 可组合函数将对象存储在内存中。
    * mutableStateOf() 函数会返回一个可观察对象。
    * 这基本上意味着，当 result 变量的值变化时，系统会触发重组、反映结果值并刷新界面。
    */
    val imageResource = when (result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imageResource),
            contentDescription = result.toString()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..6).random() }) {
            /* lambda表达式 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
            * 将函数作为实参进行传递时，相应过程也可称为回调。
            */
            Text(stringResource(R.string.roll))
        }
    }
}
