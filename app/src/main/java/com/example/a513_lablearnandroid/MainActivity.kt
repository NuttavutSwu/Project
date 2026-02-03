package com.example.a513_lablearnandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
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
            Column (modifier = Modifier.fillMaxSize().background(color = Color.Gray).padding(32.dp)){
                // hp
                Box(modifier = Modifier
                    .height(32.dp)
                    .background(color = Color.White)
                    .fillMaxWidth()


                ){
                    Text(
                        text = "HP",
                        modifier = Modifier
                            .align(alignment = Alignment.CenterStart)
                            .fillMaxWidth(fraction = 0.10f)
                            .background(color =  Color.Red)
                            .padding(8.dp)
                    )
                }
                // image
                 Image(
                     painter = painterResource(id = R.drawable.duke),
                     contentDescription = "profile",
                     modifier = Modifier.size(300.dp).align(alignment = Alignment.CenterHorizontally).padding(top = 16.dp)

                 )
                //status
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                    ){
                    Column {
                        Text(text = "str", fontSize = 32.sp)
                        Text(text = "60", fontSize = 32.sp)
                        Text(text = "Agi", fontSize = 32.sp)
                        Text(text = "25", fontSize = 32.sp)


                    }

                }
            }
        }
    }
}