package com.example.a513_lablearnandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a513_lablearnandroid.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {

            // This Column now wraps everything
            Column(
                modifier = Modifier.fillMaxSize().background(color = Color.Gray).padding(32.dp)
            ) {

                // HP Bar
                Box(
                    modifier = Modifier.height(32.dp).background(color = Color.White).fillMaxWidth()
                ) {
                    Text(
                        text = "HP",
                        modifier = Modifier
                            .align(alignment = Alignment.CenterStart)
                            .fillMaxWidth(fraction = 0.10f)
                            .background(color = Color.Red)
                            .padding(8.dp)
                    )
                }

                // Image
                Image(
                    painter = painterResource(id = R.drawable.duke),
                    contentDescription = "profile",
                    modifier = Modifier.size(300.dp).align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 16.dp)
                        .clickable {
                            startActivity(Intent(this@MainActivity,ListActivity::class.java))
                        }
                )


                val str = remember { mutableStateOf(8) }
                val agi = remember { mutableStateOf(10) }
                val intStat = remember { mutableStateOf(10) }

// Status Row
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {

                    // STR
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .weight(1f)
                            .padding(4.dp)
                            .height(180.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("STR", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                            Text(str.value.toString(), fontSize = 32.sp)

                            Button(onClick = { str.value++ }) {
                                Text("+")
                            }
                            Button(onClick = {str.value--}){
                                Text("-")
                            }
                        }
                    }

                    // AGI
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .weight(1f)
                            .padding(4.dp)
                            .height(180.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("AGI", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                            Text(agi.value.toString(), fontSize = 32.sp)
                            Button(onClick = { agi.value++ }) {
                                Text("+")

                            }
                            Button(onClick = {str.value--}){
                                Text("-")
                            }
                        }
                    }

                    // INT
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .weight(1f)
                            .padding(4.dp)
                            .height(180.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("INT", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                            Text(intStat.value.toString(), fontSize = 32.sp)
                            Button(onClick = { intStat.value++ }) {
                                Text("+")
                            }
                            Button(onClick = {str.value--}){
                                Text("-")
                            }
                        }
                    }
                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle", "MainActivity : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "MainActivity : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle", "MainActivity : onPause")
    }
}