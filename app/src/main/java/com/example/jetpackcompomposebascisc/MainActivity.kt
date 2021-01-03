package com.example.jetpackcompomposebascisc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompomposebascisc.ui.JetpackcompomposebasciscTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MyScreenContent()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    JetpackcompomposebasciscTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}

@Composable
fun MyScreenContent(names: List<String> = listOf("Android", "there")) {
    Column {
        for (name in names) {
            Greeting(name)
            Divider(color = Color.Black)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Yellow) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
    }
}

@Preview(showBackground = true, name = "Text Preview")
@Composable
fun DefaultPreview() {
    MyApp {
        MyScreenContent()
    }
}