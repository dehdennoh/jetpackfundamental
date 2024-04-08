package com.example.dennisapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dennisapplication.ui.theme.DennisApplicationTheme

class layoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun layout(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title = { Text(text = "HomeScreen", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {
                         mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription = "Arrowback", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share ,
                        contentDescription = "share", tint = Color.White)
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings ,
                        contentDescription = "settings", tint = Color.White)
                }
            }
        )
        //End of TopUpBar

        Text(
            text = "Destinations",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive,
        )

        //First Row
        Row {
            Image(painter = painterResource(id = R.drawable.china) ,
                contentDescription = "China",
                modifier = Modifier.size(width = 200.dp, height = 160.dp))
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "China", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                Text(text = "40 beautiful places to visit in China | CNN\n" +
                        "Almost all of us are familiar with the great man-made attractions in China:  ")
            }
        }
        //End of Row

        //Second Row
        Row {
            Image(painter = painterResource(id = R.drawable.falls) ,
                contentDescription = "falls",
                modifier = Modifier.size(width = 200.dp, height = 160.dp))
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "Falls", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                Text(text = "40 beautiful places to visit in Falls | CNN\n" +
                        "Almost all of us are familiar with the great man-made attractions in Falls:  ")
            }
        }
        //End of Second Row

        Button(onClick = {
            mContext.startActivity(Intent(mContext,LottieActivity::class.java))
        },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = CircleShape
        ) {
            Text(text = "NEXT")

        }


        Spacer(modifier = Modifier.height(110.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,IntensActivity::class.java))

        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp))
        {
            Text(text = "Next", fontSize = 25.sp)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    layout()
}