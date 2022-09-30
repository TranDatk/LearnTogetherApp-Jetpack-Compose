package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LearnTogether()
                }
            }
        }
    }
}

@Composable
fun LearnTogether() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth())
        Text(
            text = stringResource(R.string.s1),
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
        )
        Text(
            text = stringResource(R.string.s2),

            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.s3),

            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {
        LearnTogether()
    }
}