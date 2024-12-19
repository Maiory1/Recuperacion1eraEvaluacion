package com.example.examenrecuperacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examenrecuperacion.ui.theme.ExamenRecuperacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@Preview (showBackground = true, showSystemUi = true)

@Composable
fun App() {

    ExamenRecuperacionTheme {
        Column (
            Modifier.background(Color.Cyan).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Primera fila
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp, end = 40.dp, start = 40.dp )
                    .fillMaxHeight(0.15f),
                horizontalArrangement = Arrangement.Center
            ){
                //Columna izquiera de la primera fila
                Column (
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxHeight()
                        .fillMaxWidth(0.5f),
                    verticalArrangement = Arrangement.Center
                ){
                    Text("Hello Android!",
                        modifier = Modifier
                            .background(Color.Red)
                            .align(Alignment.CenterHorizontally)
                    )
                }
                Column (
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxHeight()
                        .fillMaxWidth(0.8f),
                    verticalArrangement = Arrangement.Center
                ){
                    Text("Hello Android!",
                        modifier = Modifier
                            .background(Color.Cyan)
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
            //Segunda Fila Gris
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 40.dp, start = 40.dp )
                    .fillMaxHeight(0.30f),
                horizontalArrangement = Arrangement.Center
            ){
                Column (
                    modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxHeight()
                        .fillMaxWidth(0.9f),
                    verticalArrangement = Arrangement.Center
                ){
                    Text("Hello Android!",
                        modifier = Modifier
                            .background(Color.Yellow)
                            .align(Alignment.CenterHorizontally)
                    )
                    Text("Hello Android!",
                        modifier = Modifier
                            .background(Color.Red)
                            .padding(top = 40.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                    Text("Hello Android!",
                        modifier = Modifier
                            .background(Color.White)
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
            //Tercera Fila para los botones
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 40.dp, start = 40.dp )
                    .fillMaxHeight(0.38f),
                horizontalArrangement = Arrangement.Center
            ){
                Column (
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxHeight()
                        .fillMaxWidth(0.9f),
                    verticalArrangement = Arrangement.Center
                ){
                    //Primera fila para los botones 1, 2 y 3
                    Row (
                        modifier = Modifier
                            .align(Alignment.End)
                    ){
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .background(Color.Blue)
                                .size(60.dp)
                        ) {
                            Text("1")
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .background(Color.Blue)
                                .padding()
                                .size(60.dp)
                        ) {
                            Text("2")
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .background(Color.Blue)
                                .size(60.dp)
                        ) {
                            Text("3")
                        }
                    }
                    //Segunda fila botones 4, 5 y 6
                    Row (
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    ){
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .background(Color.Yellow)
                                .size(60.dp)
                        ) {
                            Text("4")
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .background(Color.Yellow)
                                .size(60.dp)
                        ) {
                            Text("5")
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .background(Color.Yellow)
                                .size(60.dp)
                        ) {
                            Text("6")
                        }
                    }
                    //Tercera fila para los botones 7, 8 y 9
                    Row (
                        modifier = Modifier
                            .align(Alignment.End)
                    ){
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .background(Color.White)
                                .size(60.dp)
                        ) {
                            Text("7")
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .background(Color.White)
                                .size(60.dp)
                        ) {
                            Text("8")
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .background(Color.White)
                                .size(60.dp)
                        ) {
                            Text("9")
                        }
                    }
                }
            }
        }
    }
}